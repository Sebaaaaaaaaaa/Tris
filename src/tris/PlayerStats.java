package tris;

public class PlayerStats {
    
    private String name;
    private Integer wins;
    private Integer losses;
    
    public PlayerStats(String n) {
        name = n;
        wins = 0;
        losses = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWins() {
        return wins;
    }

    public void addWin(Integer wins) {
        this.wins++;
    }

    public Integer getLosses() {
        return losses;
    }

    public void addLosses(Integer losses) {
        this.losses++;
    }

    public Integer getGamesPlayed() {
        return (wins + losses);
    }
}
