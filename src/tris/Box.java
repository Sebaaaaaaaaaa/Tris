package tris;

public class Box {
   private Symbol symbol = Symbol.EMPTY;
   private final int row;
   private final int col;
   
   public Box(int row, int col) {
       this.row = row;
       this.col = col;
   }
   
   public Box(Box box) {
       this.symbol = box.getSymbol();
       this.row = box.getRow();
       this.col = box.getCol();
   }
   
   public void setSymbol(Symbol s) {
       symbol = s;
   }
   
   public Symbol getSymbol() {
       return symbol;
   }
   
   public void clear() {
       symbol = Symbol.EMPTY;
   }
   
   public Boolean isEmpty() {
       return (symbol == Symbol.EMPTY);
   }
   
   public int getRow() {
       return row;
   }
   
   public int getCol() {
       return col;
   }
}
