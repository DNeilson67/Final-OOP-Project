import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Arrays;
import java.util.Objects;

public class LoginMenu extends JFrame{
    private JPanel panel1;
    private JTextField userName;
    private JPasswordField passWord;
    private JButton loginButton;
    private JCheckBox stayLoginCheckBox;
    private JCheckBox userModeCheckBox;
    private JLabel status;
    private JLabel connection;
    private JPanel welcomePanel;

    public LoginMenu() throws SQLException {
        // Calling Error Class (Polymorphism)
        setVisible(true);
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login Menu");
        setSize(new Dimension(800,600));
        setResizable(false);
        statusConnection();

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (statusConnection()) {
                    String username = userName.getText();
                    char[] passwordArray = passWord.getPassword();
                    StringBuilder password = new StringBuilder();
                    for (char i : passwordArray) {
                        password.append(i);
                    }
                    try {
                        if (verifyUser(username, password.toString())) {
                            dispose();
                            /* Create and display the form */
                            java.awt.EventQueue.invokeLater(new Runnable() {
                                public void run() {
                                    try {
                                        new Dashboard().setVisible(true);
                                    } catch (SQLException ex) {
                                        throw new RuntimeException(ex);
                                    }
                                }
                            });
                        }
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                else {
                  new NoConnection().error();
                }
            }
        });
    }
    private Boolean verifyUser(String name, String pass) throws SQLException {
        Connection con = Configuration.configDB();
        Statement statement = con.createStatement();
        String sql = "SELECT * FROM `userdata`";
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()){
            if (Objects.equals(rs.getString("username"), name) && Objects.equals(rs.getString("password"),pass)){
                if (!userModeCheckBox.isSelected()) {
                    if (Objects.equals(rs.getString("role"), "ADMIN")) {
                        return true;
                    }
                    else{
                        new LoginFailed2().error();
                        return false;
                    }
                }
                else{
                    return true;
                }
            }
        }
        new LoginFailed().error();
        return false;
    }


    private boolean statusConnection(){
        try{
            Connection con = Configuration.configDB();
            status.setText("ACTIVE");
            status.setForeground(Color.green);
            return true;
        }
        catch(SQLException e){
            status.setText("INACTIVE");
            status.setForeground(Color.red);
            return false;
        }
    }
}
