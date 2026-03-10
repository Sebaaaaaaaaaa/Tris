package tris;

import gui.TrisBoardDialog;

public class Human implements Player{
    private Symbol symbol;
    private TrisBoardDialog inputBoard;
    
    public Human(Symbol s, TrisBoardDialog b) {
        symbol = s;
        inputBoard = b;
    }

    @Override
    public Integer[] play() {
        
        return null;
        
    }

    @Override
    public Symbol getSymbol() {
        return symbol;
    }
}
