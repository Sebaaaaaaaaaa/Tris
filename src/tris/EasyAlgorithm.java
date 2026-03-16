package tris;

import java.util.Random;

public class EasyAlgorithm implements Algorithm {

    private final TrisBoard board;
    private final Random randomEngine = new Random();
    
    public EasyAlgorithm(TrisBoard board) {
        this.board = board;
    }

    @Override
    public void thinkMove(SuperRobot superRobot) {
        int row;
        int col;
        do{
            row = randomEngine.nextInt(3);
            col = randomEngine.nextInt(3);
        } while(!board.isEmpty(row, col));
        superRobot.setSelectedRow(row);
        superRobot.setSelectedCol(col);
    }
}
