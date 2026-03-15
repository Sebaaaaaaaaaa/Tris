package tris;

import gui.TrisBoardDialog;

public class Game {
    private TrisBoard board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private TrisBoardDialog inputBoard;
    private PvPTableModel playerDataHandler;

    public Game(Player p1, Player p2, java.awt.Frame p, PvPTableModel m) {
        board = new TrisBoard();
        playerDataHandler = m;
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
                playerDataHandler.addDraw(player1.getName(), player2.getName());
                System.out.println("Draw");
            } else {
                playerDataHandler.addWinner(currentPlayer.getName(), ((currentPlayer == player1) ? player2 : player1).getName());
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
        return board.checkDraw() || board.checkWin();
    }
    
    public Symbol getCurrentSymbol() {
        return currentPlayer.getSymbol();
    }
}
