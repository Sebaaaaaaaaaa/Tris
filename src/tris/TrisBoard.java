package tris;

public class TrisBoard {
    
    private final Box[][] trisBoard = new Box[3][3];
    private Boolean draw = false;
    
    public TrisBoard() {
        for(int row = 0; row < 3; row++) {
            for(int col = 0; col < 3; col++) {
                trisBoard[row][col] = new Box();
            }
        }
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
                    && trisBoard[row][1].getSymbol() == trisBoard[row][2].getSymbol()) return true;
        }
        
        for(int col = 0; col < 3; col++) {
            if(!trisBoard[0][col].isEmpty() && trisBoard[0][col].getSymbol() == trisBoard[1][col].getSymbol() 
                    && trisBoard[1][col].getSymbol() == trisBoard[2][col].getSymbol()) return true;
        }
        
        if(!trisBoard[0][0].isEmpty() && trisBoard[0][0].getSymbol() == trisBoard[1][1].getSymbol() 
                    && trisBoard[1][1].getSymbol() == trisBoard[2][2].getSymbol()) return true;
        
        return !trisBoard[2][0].isEmpty() && trisBoard[2][0].getSymbol() == trisBoard[1][1].getSymbol() 
                && trisBoard[1][1].getSymbol() == trisBoard[0][2].getSymbol();
    }

    public void reset() {
        for(Box[] row : trisBoard)
            for(Box box : row)
                box.clear();
    }
}
