package tris;

public class PlayerStats {
    
    private final String name;
    private Integer wins;
    private Integer losses;
    private Integer draws;
    
    public PlayerStats(String n) {
        name = n;
        wins = 0;
        losses = 0;
        draws = 0;
    }

    public String getName() {
        return name;
    }

    public Integer getWins() {
        return wins;
    }

    public void addWin() {
        wins++;
    }

    public Integer getLosses() {
        return losses;
    }

    public void addLoss() {
        losses++;
    }

    public Integer getDraws() {
        return draws;
    }

    public void addDraw() {
        draws++;
    }

    public Integer getGamesPlayed() {
        return (wins + losses + draws);
    }
}
