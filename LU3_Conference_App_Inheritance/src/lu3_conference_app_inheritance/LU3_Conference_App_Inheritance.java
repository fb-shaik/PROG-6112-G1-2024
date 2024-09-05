/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lu3_conference_app_inheritance;
// Main class to handle and store different session types

import javax.swing.JOptionPane;

public class LU3_Conference_App_Inheritance {
    public static void main(String[] args) {
        java.util.ArrayList<Session> sessions = new java.util.ArrayList<>(); // Dynamic list to hold sessions
        String[] options = {"Add Session", "View All Sessions", "Quit"}; // Options for user interaction

        while (true) {
            int choice = JOptionPane.showOptionDialog(null, "Select an option:", "Conference Management Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0: // Add Session
                    String type = JOptionPane.showInputDialog("Enter session type (Workshop, Keynote, Panel):");
                    String title = JOptionPane.showInputDialog("Enter the title of the " + type + ":");
                    String speaker = JOptionPane.showInputDialog("Enter the speaker for the " + type + ":");
                    int duration = Integer.parseInt(JOptionPane.showInputDialog("Enter the duration (in minutes) for the " + type + ":"));

                    switch (type.toLowerCase()) {
                        case "workshop":
                            sessions.add(new Workshop(title, speaker, duration));
                            break;
                        case "keynote":
                            sessions.add(new Keynote(title, speaker, duration));
                            break;
                        case "panel":
                            sessions.add(new PanelDiscussion(title, speaker, duration));
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Invalid session type entered.");
                            break;
                    }
                    break;

                case 1: // View All Sessions
                    StringBuilder sessionDetails = new StringBuilder();
                    for (Session session : sessions) {
                        sessionDetails.append(session.toString()).append("\n");
                    }
                    if (sessionDetails.length() == 0) {
                        JOptionPane.showMessageDialog(null, "No sessions available.");
                    } else {
                        JOptionPane.showMessageDialog(null, sessionDetails.toString());
                    }
                    break;

                case 2: // Quit
                    return;

                default:
                    // Handle unexpected input
                    JOptionPane.showMessageDialog(null, "Invalid option, please choose again.");
                    break;
            }
        }
    }
}