package tris;

import gui.TrisBoardDialog;
import javax.swing.JOptionPane;

public class PvEGame implements Game {
    private final TrisBoard board;
    private final Player player;
    private final SuperRobot superRobot;
    private TrisBoardDialog inputBoard;
    private final PvPTableModel playerDataHandler;
    private Player currentPlayer;
    private final Boolean isPlayerStarting;
    private final java.awt.Frame parentFrame;

    public PvEGame(java.awt.Frame parentFrame, PvPTableModel playerDataHandler, Integer difficulty, Boolean isPlayerStarting) {
        board = new TrisBoard();
        
        superRobot = switch (difficulty) {
            case 1 -> new SuperRobot(new EasyAlgorithm(board));
            case 2 -> new SuperRobot(new MediumAlgorithm(board));
            case 3 -> new SuperRobot(new HardAlgorithm(board));
            default -> new SuperRobot(new EasyAlgorithm(board));
        };
        player = new Human(Symbol.X, "PLAYER");
        
        this.playerDataHandler = playerDataHandler;
        
        this.parentFrame = parentFrame;
        
        inputBoard = new TrisBoardDialog(this.parentFrame, false, this);
        inputBoard.setVisible(true);
        
        this.isPlayerStarting = isPlayerStarting;
        
        if (!this.isPlayerStarting) startSuperRobot();
        else currentPlayer = player;
        
    }
    
    private void startSuperRobot() {
        currentPlayer = superRobot;
        Box box = board.getBox(1, 1);
        if(box.isEmpty()) {
            box.setSymbol(this.getCurrentSymbol());
        }
        inputBoard.setCorrespondingBox(1, 1);
        nextTurn();
    }
    
    private void makeSuperobotMove() {
        superRobot.play();
        Box box = superRobot.getSelectedBox();
        if(box.isEmpty()) {
            box.setSymbol(this.getCurrentSymbol());
        }
        inputBoard.setCorrespondingBox(box.getRow(), box.getCol());
        nextTurn();
    }
    
    @Override
    public void nextTurn() {
        if (board.checkWin()) {
            playerDataHandler.addWinner(currentPlayer.getName(), ((currentPlayer == player) ? superRobot: player).getName());
            JOptionPane.showMessageDialog(
                inputBoard,
                currentPlayer.getName() + " has WON!!!",
                "WINNER",
                JOptionPane.INFORMATION_MESSAGE
            );
            tryContinuingGame();
        } else if (board.checkDraw()) {
            playerDataHandler.addDraw(player.getName(), superRobot.getName());
            JOptionPane.showMessageDialog(
                inputBoard,
                "It's a DRAW!!!",
                "DRAW",
                JOptionPane.INFORMATION_MESSAGE
            );
            tryContinuingGame();
        } else {
            currentPlayer = (currentPlayer == player) ? superRobot : player;
            if (currentPlayer == superRobot) makeSuperobotMove();
        }
    }

    @Override
    public void makePlayerMove(int row, int col) {
        Box box = board.getBox(row, col);
        if(box.isEmpty()) {
            box.setSymbol(this.getCurrentSymbol());
        }
        nextTurn();
    }

    @Override 
    public Symbol getCurrentSymbol() {
        return currentPlayer.getSymbol();
    }
    
    private void tryContinuingGame() {
        int choice = JOptionPane.showConfirmDialog(
                inputBoard,
                "Want to continue playing?",
                "Game",
                JOptionPane.YES_NO_OPTION
        );
        if (choice == JOptionPane.YES_OPTION) {
            board.reset();
            inputBoard.dispose();
            inputBoard = new TrisBoardDialog(parentFrame, false, this);
            inputBoard.setVisible(true);
            if (!isPlayerStarting) startSuperRobot();
            else currentPlayer = player;
        } else {
            inputBoard.dispose();
            parentFrame.setVisible(true);
        }
    }
}
