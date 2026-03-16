package tris;

import gui.TrisBoardDialog;
import javax.swing.JOptionPane;

public class PvEGame implements Game {
    private final TrisBoard board;
    private final Player player;
    private SuperRobot superRobot;
    private final TrisBoardDialog inputBoard;
    private final PvPTableModel playerDataHandler;
    private Player currentPlayer;

    public PvEGame(java.awt.Frame parentFrame, PvPTableModel playerDataHandler, Integer difficulty, Boolean isPlayerStarting) {
        board = new TrisBoard();
        
        switch (difficulty) {
            case 1:
                superRobot = new SuperRobot(new EasyAlgorithm(board));
                break;
            case 2:  
                superRobot = new SuperRobot(new MediumAlgorithm(board));
                break;
            case 3:
                // superRobot = new SuperRobot();
                break;
            default:
                superRobot = new SuperRobot(new EasyAlgorithm(board));
        }
        player = new Human(Symbol.X, "PLAYER");
        
        this.playerDataHandler = playerDataHandler;
        
        inputBoard = new TrisBoardDialog(parentFrame, false, this);
        inputBoard.setVisible(true);
        
        if (!isPlayerStarting) startSuperRobot();
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
        Integer row = superRobot.getSelectedRow();
        Integer col = superRobot.getSelectedCol();
        Box box = board.getBox(row, col);
        if(box.isEmpty()) {
            box.setSymbol(this.getCurrentSymbol());
        }
        inputBoard.setCorrespondingBox(row, col);
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
            inputBoard.dispose();
        } else if (board.checkDraw()) {
            playerDataHandler.addDraw(player.getName(), superRobot.getName());
            JOptionPane.showMessageDialog(
                inputBoard,
                "It's a DRAW!!!",
                "DRAW",
                JOptionPane.INFORMATION_MESSAGE
            );
            inputBoard.dispose();
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
}
