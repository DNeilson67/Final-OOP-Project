import javax.swing.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        com.formdev.flatlaf.FlatLightLaf.install();
        LoginMenu login = new LoginMenu();
    }
}