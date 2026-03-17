package tris;

import gui.TrisBoardDialog;
import javax.swing.JOptionPane;

public class PvPGame implements Game {
    private final TrisBoard board;
    private final Player player1;
    private final Player player2;
    private Player currentPlayer;
    private TrisBoardDialog inputBoard;
    private final PvPTableModel playerDataHandler;
    private final java.awt.Frame parentFrame;

    public PvPGame(Player player1, Player player2, java.awt.Frame parentFrame, PvPTableModel playerDataHandler) {
        board = new TrisBoard();
        
        this.playerDataHandler = playerDataHandler;
        
        this.player1 = player1;
        this.player2 = player2;
        currentPlayer = this.player1;
        
        this.parentFrame = parentFrame;
        
        this.parentFrame.setVisible(false);
        inputBoard = new TrisBoardDialog(this.parentFrame, false, this);
        inputBoard.setVisible(true);
    }
    
    @Override
    public void nextTurn() {
        if (board.checkWin()) {
            playerDataHandler.addWinner(currentPlayer.getName(), ((currentPlayer == player1) ? player2 : player1).getName());
            JOptionPane.showMessageDialog(
                inputBoard,
                currentPlayer.getName() + " has WON!!!",
                "WINNER",
                JOptionPane.INFORMATION_MESSAGE
            );
            tryContinuingGame();
        } else if (board.checkDraw()) {
            playerDataHandler.addDraw(player1.getName(), player2.getName());
            JOptionPane.showMessageDialog(
                inputBoard,
                "It's a DRAW!!!",
                "DRAW",
                JOptionPane.INFORMATION_MESSAGE
            );
            tryContinuingGame();
        } else {
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
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
    
    private void tryContinuingGame() {
        int choice = JOptionPane.showConfirmDialog(
                inputBoard,
                "Want to continue playing?",
                "Game",
                JOptionPane.YES_NO_OPTION
        );
        if (choice == JOptionPane.YES_OPTION) {
            board.reset();
            currentPlayer = player1;
            inputBoard.dispose();
            inputBoard = new TrisBoardDialog(parentFrame, false, this);
            inputBoard.setVisible(true);
        } else {
            inputBoard.dispose();
            parentFrame.setVisible(true);
        }
    }
    
    @Override
    public Symbol getCurrentSymbol() {
        return currentPlayer.getSymbol();
    }
}
