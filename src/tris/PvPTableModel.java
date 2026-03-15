package tris;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class PvPTableModel extends AbstractTableModel{
    
    private final ArrayList<PlayerStats> playersList;
    private static final String[] LIST_HEADER = {"Name", "Games played", "Wins", "Losses", "Draws"};
    
    public PvPTableModel() {
        this.playersList = new ArrayList<>();
        playersList.add(new PlayerStats("PLAYER"));
        playersList.add(new PlayerStats("SUPER_ROBOT"));
    }
    
    @Override
    public int getRowCount() {
        return playersList.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int r, int c) {
        PlayerStats p = playersList.get(r);
        switch (c) {
            case 0 -> {
                return p.getName();
            }
            case 1 -> {
                return p.getGamesPlayed();
            }
            case 2 -> {
                return p.getWins();
            }
            case 3 -> {
                return p.getLosses();
            }
            case 4 -> {
                return p.getDraws();
            }
            default -> throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int c) {
        return LIST_HEADER[c];
    }
    
    private PlayerStats findPlayerStats(String n) {
        for (PlayerStats p : playersList) {
            if (p.getName().equals(n)) return p;
        }
        PlayerStats newPlayerStats = new PlayerStats(n);
        playersList.add(newPlayerStats);
        return newPlayerStats;
    }
    
    public void addWinner(String w, String l) {
        PlayerStats winner = findPlayerStats(w);
        PlayerStats loser = findPlayerStats(l);
        winner.addWin();
        loser.addLoss();
    }
    
    public void addDraw(String p1, String p2) {
        PlayerStats player1 = findPlayerStats(p1);
        PlayerStats player2 = findPlayerStats(p2);
        player1.addDraw();
        player2.addDraw();
    }
}