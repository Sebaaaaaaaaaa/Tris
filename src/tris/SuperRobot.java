package tris;

public class SuperRobot implements Player {

    private Integer selectedRow;
    private Integer selectedCol;
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

    public Integer getSelectedRow() {
        return selectedRow;
    }

    public Integer getSelectedCol() {
        return selectedCol;
    }
    
    public void setSelectedRow(Integer selectedRow) {
        this.selectedRow = selectedRow;
    }
    
    public void setSelectedCol(Integer selectedCol) {
        this.selectedCol = selectedCol;
    }
    
    public void play() {
        algorithm.thinkMove(this);
    }
}
