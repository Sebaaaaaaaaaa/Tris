package tris;

import java.util.ArrayList;

public class HardAlgorithm implements Algorithm {

    private final TrisBoard playingBoard;

    public HardAlgorithm(TrisBoard playingTrisBoard) {
        this.playingBoard = playingTrisBoard;
    }

    @Override
    public Box thinkMove(SuperRobot superRobot) {
        int bestValue = -255;
        Box bestMove = null;

        for (Box box : getPossibleMoves(playingBoard)) {

            TrisBoard testBoard = new TrisBoard(playingBoard);
            testBoard.getBox(box.getRow(), box.getCol()).setSymbol(Symbol.O);

            int value = minimax(testBoard, false);

            if (value > bestValue) {
                bestValue = value;
                bestMove = box;
            }
        }

        return bestMove;
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

    private int evaluateBoard(TrisBoard board) {
            if (board.checkWin()) {
               Symbol winner = board.getWinnerSymbol();
               return (winner == Symbol.O) ? 1 : -1;
           }
           return 0;
    }

    private int minimax(TrisBoard board, boolean isSuperRobotTurn) {
        
        int score = evaluateBoard(board);
        
        if (score != 0) return score;
        
        if (board.checkDraw()) return 0;

        if (isSuperRobotTurn) {
            int best = -255;
            for (Box box : getPossibleMoves(board)) {
                TrisBoard newBoard = new TrisBoard(board);
                newBoard.getBox(box.getRow(), box.getCol()).setSymbol(Symbol.O);
                int value = minimax(newBoard, false);
                best = Math.max(best, value);
            }
            return best;
        } else {
            int best = 255;
            for (Box box : getPossibleMoves(board)) {
                TrisBoard newBoard = new TrisBoard(board);
                newBoard.getBox(box.getRow(), box.getCol()).setSymbol(Symbol.X);
                int value = minimax(newBoard, true);
                best = Math.min(best, value);
            }
            return best;
        }
    }
}