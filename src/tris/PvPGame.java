package tris;

import gui.TrisBoardDialog;
import javax.swing.JOptionPane;

public class PvPGame {
    private final TrisBoard board;
    private final Player player1;
    private final Player player2;
    private Player currentPlayer;
    private final TrisBoardDialog inputBoard;
    private final PvPTableModel playerDataHandler;

    public PvPGame(Player player1, Player player2, java.awt.Frame parentFrame, PvPTableModel playerDataHandler) {
        board = new TrisBoard();
        
        this.playerDataHandler = playerDataHandler;
        
        this.player1 = player1;
        this.player2 = player2;
        currentPlayer = this.player1;
        
        inputBoard = new TrisBoardDialog(parentFrame, false, this);
        inputBoard.setVisible(true);
    }
    
    private void nextTurn() {
        if (board.checkWin()) {
            playerDataHandler.addWinner(currentPlayer.getName(), ((currentPlayer == player1) ? player2 : player1).getName());
            JOptionPane.showMessageDialog(
                inputBoard,
                currentPlayer.getName() + " has WON!!!",
                "WINNER",
                JOptionPane.INFORMATION_MESSAGE
            );
            inputBoard.dispose();
        } else if (board.checkDraw()) {
            playerDataHandler.addDraw(player1.getName(), player2.getName());
            JOptionPane.showMessageDialog(
                inputBoard,
                "It's a DRAW!!!",
                "DRAW",
                JOptionPane.INFORMATION_MESSAGE
            );
            inputBoard.dispose();
        } else {
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }

    public void makeMove(int row, int col) {
        Box box = board.getBox(row, col);
        if(box.isEmpty()) {
            box.setSymbol(this.getCurrentSymbol());
        }
        nextTurn();
    }
    
    public Symbol getCurrentSymbol() {
        return currentPlayer.getSymbol();
    }
}
