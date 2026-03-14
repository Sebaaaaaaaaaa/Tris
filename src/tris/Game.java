package tris;

import gui.TrisBoardDialog;

public class Game {
    private TrisBoard board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private TrisBoardDialog inputBoard;

    public Game(Player p1, Player p2, java.awt.Frame p) {
        board = new TrisBoard();
        player1 = p1;
        player2 = p2;
        currentPlayer = player1;
        inputBoard = new TrisBoardDialog(p, false, this);
        inputBoard.setVisible(true);
    }
    
    private void nextTurn() {
        if(isGameOver()) {
            inputBoard.dispose();
            if(board.isDraw()) {
                System.out.println("Draw");
            } else {
                System.out.println(currentPlayer.getName());
            }
        }
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public void makeMove(int row, int col) {
        Box box = board.getBox(row, col);
        if(box.isEmpty()) {
            box.setSymbol(currentPlayer.getSymbol());
        }
        nextTurn();
    }

    private boolean isGameOver() {
        return board.checkWin() || board.checkDraw();
    }
    
    public Symbol getCurrentSymbol() {
        return currentPlayer.getSymbol();
    }
}
