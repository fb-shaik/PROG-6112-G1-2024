/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lu3_conference_app_inheritance;

import javax.swing.*;

// Abstract class defining a generic session
abstract class Session {
    protected String title;
    protected String speaker;
    protected int duration; // Duration in minutes

    public Session(String title, String speaker, int duration) {
        this.title = title;
        this.speaker = speaker;
        this.duration = duration;
    }

    // Abstract method to conduct a session; specifics are defined in subclasses
    abstract void conduct();

    @Override
    public String toString() {
        // Overriding toString to provide meaningful output for session objects
        return "Session{" +
               "title='" + title + '\'' +
               ", speaker='" + speaker + '\'' +
               ", duration=" + duration + " mins" +
               '}';
    }
}

// Concrete classes for Workshops, Keynotes, and Panels
class Workshop extends Session {
    public Workshop(String title, String speaker, int duration) {
        super(title, speaker, duration);
    }

    @Override
    void conduct() {
        JOptionPane.showMessageDialog(null, "Conducting a workshop on " + title + " by " + speaker);
    }
}

class Keynote extends Session {
    public Keynote(String title, String speaker, int duration) {
        super(title, speaker, duration);
    }

    @Override
    void conduct() {
        JOptionPane.showMessageDialog(null, "Delivering a keynote: " + title + " by " + speaker);
    }
}

class PanelDiscussion extends Session {
    public PanelDiscussion(String title, String speaker, int duration) {
        super(title, speaker, duration);
    }

    @Override
    void conduct() {
        JOptionPane.showMessageDialog(null, "Starting a panel discussion on " + title + " with " + speaker);
    }
}