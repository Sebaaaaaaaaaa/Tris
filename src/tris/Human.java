package tris;

public class Human implements Player{
    private Symbol symbol;
    private String name;
    
    public Human(Symbol s, String n) {
        symbol = s;
        name = n;
    }

    @Override
    public Symbol getSymbol() {
        return symbol;
    }

    @Override
    public String getName() {
        return name;
    }
}
