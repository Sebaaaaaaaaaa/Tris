package tris;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;

public class PvPTableModel extends AbstractTableModel{
    private Vector<PlayerStats> playersList = new Vector<PlayerStats>();
    private static final String[] LIST_HEADER = {"Name", "Games played", "Wins", "Losses"};
    
    @Override
    public int getRowCount() {
        return playersList.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
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
            default -> throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int c) {
        return LIST_HEADER[c];
    }
}