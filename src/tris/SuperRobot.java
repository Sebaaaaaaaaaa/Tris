package tris;

public class SuperRobot implements Player {

    @Override
    public String getName() {
        return "SuperRobot";
    }

    

    @Override
    public Symbol getSymbol() {
        return Symbol.O;
    }
    
}
