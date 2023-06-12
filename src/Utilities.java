import javax.swing.*;
import java.sql.SQLException;

public interface Utilities {
    public String typeDecider(String ID);
    public String checkStock(int Quantity);
    public void resetTable(JTable table);
    public void updateTableList(JTable table) throws SQLException;
    Integer calculateExpectedPrice(int karat, int weight, int profitPercentage);
}
