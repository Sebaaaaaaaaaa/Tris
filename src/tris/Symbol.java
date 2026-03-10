package tris;

public enum Symbol {
    EMPTY,
    X,
    O;
    
    public Symbol getOpposite() {
        if(this == X) {
            return O;
        } else {
            return X;
        }
    }
}
