package tris;

import java.util.Random;

public class EasyAlgorithm implements Algorithm {

    private final TrisBoard playingTrisBoard;
    private final Random randomEngine = new Random();
    
    public EasyAlgorithm(TrisBoard playingTrisBoard) {
        this.playingTrisBoard = playingTrisBoard;
    }

    @Override
    public Box thinkMove(SuperRobot superRobot) {
        int row;
        int col;
        
        do{
            row = randomEngine.nextInt(3);
            col = randomEngine.nextInt(3);
        } while(!playingTrisBoard.isEmpty(row, col));
        
        return playingTrisBoard.getBox(row, col);
    }
}
