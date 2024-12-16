package controller;

import model.DatabaseHelper;
import view.Login;
import view.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginController {
    private Login view;

    public LoginController(Login view) {
        this.view = view;
        this.view.addLoginListener(new LoginListener());
    }

    class LoginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = view.getUsername();
            String password = view.getPassword();
            int userType = DatabaseHelper.getUserType(username, password);
            
            if (userType == 1) {
                JOptionPane.showMessageDialog(view, "Login Successful!");
                view.setVisible(false);
                new Menu().setVisible(true);
            } else if (userType == 0) {
                JOptionPane.showMessageDialog(view, "Login Successful!");
                Menu menu = new Menu();
                menu.getJButton4().setEnabled(false); // Disable button for user type 0
                view.setVisible(false);
                menu.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(view, "Invalid username or password.");
            }
        }
    }
}
