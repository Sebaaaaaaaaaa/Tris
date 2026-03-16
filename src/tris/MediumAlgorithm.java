package tris;

import java.util.Random;

public class MediumAlgorithm implements Algorithm {
    
    private final TrisBoard board;
    private final Random randomEngine = new Random();
    
    public MediumAlgorithm(TrisBoard board) {
        this.board = board;
    }

    @Override
    public void thinkMove(SuperRobot superRobot) {
        
        for (int row = 0; row < 3; row++) {
           for (int col = 0; col < 3; col++) {
               if (board.isEmpty(row, col)) {
                   Box box = board.getBox(row, col);
                   box.setSymbol(Symbol.X);
                   if (board.checkWin() || board.checkDraw()) {
                       superRobot.setSelectedRow(row);
                       superRobot.setSelectedCol(col);
                       box.clear();
                       return;
                   }
                   box.clear();
               }
           }
        }
        
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
