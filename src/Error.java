import javax.swing.*;

abstract class Error extends JOptionPane implements ErrorInterface {
    public abstract void error();
}

class NoConnection extends Error{
    @Override
    public void error() {
        showConfirmDialog(null, "Lost Connection.","Error",JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
    }
}

class LoginFailed extends Error{
    @Override
    public void error() {
        showConfirmDialog(null, "Login Failed. Invalid Login Credentials.","Error",JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
    }
}

class LoginFailed2 extends Error{
    @Override
    public void error() {
        showConfirmDialog(null, "Login Failed. This account is prohibited to use the app.","Error",JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
    }
}

