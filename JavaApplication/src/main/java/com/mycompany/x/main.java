/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.x;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class X {
    private static final List<RegisterClass> users = new ArrayList<>();

    public static void main(String[] args) {
        setUIManager();
        starter();
    }

    private static void setUIManager() {
        UIManager.put("OptionPane.background", new Color(0, 128, 128));  // Teal
        UIManager.put("Panel.background", Color.CYAN);
    }

    private static void starter() {
        String[] options = {"Login", "Create Account", "Quit"};
        int selection = JOptionPane.showOptionDialog(
                null,
                "Select an option",
                "Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
        );
        switch (selection) {
            case 0:
                login();
                break;
            case 1:
                register();
                break;
            default:
                System.exit(0);
        }
    }

    public static void login() {
        // Login logic
        String userName = JOptionPane.showInputDialog("Please enter your username:");
        String password = JOptionPane.showInputDialog("Please enter your password:");

        for (RegisterClass user : users) {
            if (user.LOGINUser(userName, password)) {
                JOptionPane.showMessageDialog(null, "Danko Login successful!");
                // Perform further actions for logged-in user
                Report report = new Report();
                report.menus(); // Go to the menus() method
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Registration required first!");
        starter(); // Return to the main menu
    }

    public static void register() {
        String Fname, Surname, userName, password;

        Fname = JOptionPane.showInputDialog("Please enter your first name:");
        Surname = JOptionPane.showInputDialog("Please enter your last name:");

        RegisterClass registration = new RegisterClass(Fname, Surname);

        userName = JOptionPane.showInputDialog("Please enter your username:");
        JOptionPane.showMessageDialog(null, "Username successfully captured.");

        password = JOptionPane.showInputDialog("Please enter your password:");

        registration.setUserName(userName);
        registration.setPassword(password);

        users.add(registration);

        JOptionPane.showMessageDialog(null, "Welcome to our platform!");

        Report report = new Report();
        report.menus(); // Go to the menus() method
    }
}
