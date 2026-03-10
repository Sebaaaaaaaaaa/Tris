package tris;

import gui.TrisBoardDialog;

public class Game {
    private TrisBoard board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private TrisBoardDialog inputBoard;

    public Game(Player p1, Player p2, TrisBoardDialog b) {
        board = new TrisBoard();
        inputBoard = b;
        player1 = p1;
        player2 = p2;
        currentPlayer = player1;
    }

    public void start() {
        
        inputBoard.setVisible(true);
        
        do {
            
            currentPlayer.play();
            makeMove(0, 0);
            
            nextTurn();
               
        } while(isGameOver());
        
        if(board.isDraw()) {
            // TODO
        } else {
            // TODO
        }
    }
    
    public void nextTurn() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public void makeMove(int row, int col) {
        Box box = board.getBox(row, col);
        if(box.isEmpty()) {
            box.setSymbol(currentPlayer.getSymbol());
        }
    }

    public boolean isGameOver() {
        return board.checkWin() || board.checkDraw();
    }

    public Player getCurrentPlayer() { return currentPlayer; }
}
