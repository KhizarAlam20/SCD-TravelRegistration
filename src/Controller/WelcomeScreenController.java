package Controller;

import View.WelcomeScreenView;
import View.verifyAdminView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.LoginView;

public class WelcomeScreenController {
    private WelcomeScreenView view;

    public WelcomeScreenController(WelcomeScreenView view) {
        this.view = view;

        // Attach listeners to the buttons
        view.login.addActionListener(new LoginButtonListener());
        view.loginUser.addActionListener(new AdminButtonListener());
        view.exit.addActionListener(new ExitButtonListener());
    }

    // Action listener for the "User" button
    private class LoginButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            new LoginView();
        }
    }

    // Action listener for the "Admin" button
    private class AdminButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            view.setVisible(false);
            new verifyAdminView();
        }
    }

    // Action listener for the "Quit" button
    private class ExitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            view.setVisible(false);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            WelcomeScreenView welcomeScreenView = new WelcomeScreenView();
            new WelcomeScreenController(welcomeScreenView);
        });
    }
}
