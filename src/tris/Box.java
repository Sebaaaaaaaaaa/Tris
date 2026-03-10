package tris;

public class Box {
   private Symbol symbol = Symbol.EMPTY;
   
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
}
