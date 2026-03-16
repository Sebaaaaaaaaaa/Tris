package tris;

public interface Game {
    Symbol getCurrentSymbol();
    void makePlayerMove(int row, int col);
    void nextTurn();
}
