/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translationapp;
import javax.swing.*;

public class TranslationApp {
    public static void main(String[] args) {
        // Array for English words
        String[] englishWords = {"sky", "run", "study", "music", "dog"};

        // 2D Array for translations in Dutch, French, and Italian
        String[][] translations = {
            {"hemel", "ciel", "cielo"},  // Translations for "sky"
            {"rennen", "courir", "correre"},  // Translations for "run"
            {"studie", "etude", "studia"},  // Translations for "study"
            {"muziek", "musique", "musica"},  // Translations for "music"
            {"hond", "chien", "cane"}  // Translations for "dog"
        };

        // Create the header
        StringBuilder output = new StringBuilder();
        output.append(String.format("%-15s %-15s %-15s %-15s\n", "WORD IN ENGLISH", "DUTCH", "FRENCH", "ITALIAN"));
        output.append("---------------------------------------------------------------\n");

        // Add each word with its translations
        for (int i = 0; i < englishWords.length; i++) {
            output.append(String.format("%-15s %-15s %-15s %-15s\n",
                    capitalize(englishWords[i]),
                    translations[i][0],
                    translations[i][1],
                    translations[i][2]));
        }

        // Display the output using JOptionPane
        JOptionPane.showMessageDialog(null, output.toString(), "Translations", JOptionPane.INFORMATION_MESSAGE);
    }

    // Helper method to capitalize the first letter of a word
    private static String capitalize(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
