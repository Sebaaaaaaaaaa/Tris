package tris;

public class SuperRobot implements Player {

    private Box selectedBox;
    private final Algorithm algorithm;

    public SuperRobot(Algorithm algorithm) {
        this.algorithm = algorithm;
    }
    
    @Override
    public String getName() {
        return "SUPER_ROBOT";
    }

    @Override
    public Symbol getSymbol() {
        return Symbol.O;
    }

    public Box getSelectedBox() {
        return selectedBox;
    }
    
    public void play() {
        selectedBox = algorithm.thinkMove(this);
    }
}
