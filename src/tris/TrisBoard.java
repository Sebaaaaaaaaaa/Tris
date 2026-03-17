package tris;

public class TrisBoard {
    
    private final Box[][] trisBoard;
    private Boolean draw = false;
    private Symbol winningSymbol = null;
    
    public TrisBoard() {
        trisBoard = new Box[3][3];
        for(int row = 0; row < 3; row++) {
            for(int col = 0; col < 3; col++) {
                trisBoard[row][col] = new Box(row, col);
            }
        }
    }
    
    public TrisBoard(TrisBoard trisBoard) {
        this.trisBoard = new Box[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                this.trisBoard[row][col] = new Box(trisBoard.getTrisBoard()[row][col]);
            }
        }
    }
    
    public Box[][] getTrisBoard() {
        return trisBoard;
    }
    
    public Box getBox(int row, int col) {
        return trisBoard[row][col];
    }
    
    public boolean checkDraw() {
        for(Box[] row : trisBoard)
            for(Box box : row)
                if(box.isEmpty()) return draw;
        draw = true;
        return draw;
    }
    
    public Boolean isDraw() {
        return draw;
    }
    
    public boolean checkWin() {
        for(int row = 0; row < 3; row++) {
            if(!trisBoard[row][0].isEmpty() && trisBoard[row][0].getSymbol() == trisBoard[row][1].getSymbol() 
                    && trisBoard[row][1].getSymbol() == trisBoard[row][2].getSymbol()) {
                winningSymbol = trisBoard[row][0].getSymbol();
                return true;
            }
        }
        
        for(int col = 0; col < 3; col++) {
            if(!trisBoard[0][col].isEmpty() && trisBoard[0][col].getSymbol() == trisBoard[1][col].getSymbol() 
                    && trisBoard[1][col].getSymbol() == trisBoard[2][col].getSymbol()) {
                winningSymbol = trisBoard[0][col].getSymbol();
                return true;
            }
        }
        
        if(!trisBoard[0][0].isEmpty() && trisBoard[0][0].getSymbol() == trisBoard[1][1].getSymbol() 
                    && trisBoard[1][1].getSymbol() == trisBoard[2][2].getSymbol()) {
            winningSymbol = trisBoard[1][1].getSymbol();
            return true;
        }
        
        if (!trisBoard[2][0].isEmpty() && trisBoard[2][0].getSymbol() == trisBoard[1][1].getSymbol() 
                && trisBoard[1][1].getSymbol() == trisBoard[0][2].getSymbol()) {
            winningSymbol = trisBoard[1][1].getSymbol();
            return true;
        }
        return false;
    }

    public void reset() {
        this.winningSymbol = null;
        this.draw = false;
        for(Box[] row : trisBoard)
            for(Box box : row)
                box.clear();
    }
    
    public Boolean isEmpty(int row, int col) {
        return (this.getBox(row, col).getSymbol() == Symbol.EMPTY);
    }
    
    public Symbol getWinnerSymbol() {
        return winningSymbol;
    }
}