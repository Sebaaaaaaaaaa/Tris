package tris;

import java.util.ArrayList;
import java.util.Random;

public class MediumAlgorithm implements Algorithm {
    
    private final TrisBoard playingTrisBoard;
    private final Random randomEngine = new Random();
    
    public MediumAlgorithm(TrisBoard playingTrisBoard) {
        this.playingTrisBoard = playingTrisBoard;
    }

    @Override
    public Box thinkMove(SuperRobot superRobot) {
        
        for (Box box : getPossibleMoves(playingTrisBoard)) {
            TrisBoard testTrisBoard = new TrisBoard(playingTrisBoard);
            testTrisBoard.getBox(box.getRow(), box.getCol()).setSymbol(Symbol.O);
            if (testTrisBoard.checkWin()) return box;
        }

        for (Box box : getPossibleMoves(playingTrisBoard)) {
            TrisBoard testTrisBoard = new TrisBoard(playingTrisBoard);
            testTrisBoard.getBox(box.getRow(), box.getCol()).setSymbol(Symbol.X);
            if (testTrisBoard.checkWin()) return box;
        }
        
        int row;
        int col;
        
        do{
            row = randomEngine.nextInt(3);
            col = randomEngine.nextInt(3);
        } while(!playingTrisBoard.isEmpty(row, col));
        
        return playingTrisBoard.getBox(row, col);
        
    }
    
    private ArrayList<Box> getPossibleMoves(TrisBoard board) {
        ArrayList<Box> possibleMoves = new ArrayList<>();
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board.isEmpty(r, c)) {
                    possibleMoves.add(board.getBox(r, c));
                }
            }
        }
        return possibleMoves;
    }
}
