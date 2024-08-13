/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seating_app;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TheaterSeating {
    private static final int ROWS = 5;
    private static final int COLUMNS = 5;
    private Seat[][] seats;
    private ArrayList<Seat> bookedSeats;

    public TheaterSeating() {
        seats = new Seat[ROWS][COLUMNS];
        bookedSeats = new ArrayList<>();

        // Initialize the seats array
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                seats[i][j] = new Seat(i, j, SeatStatus.AVAILABLE);
            }
        }
    }

    public void displaySeatingArrangement() {
        StringBuilder seating = new StringBuilder("Seating Arrangement:\n");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                seating.append(seats[i][j].status == SeatStatus.AVAILABLE ? "A " : "B ");
            }
            seating.append("\n");
        }
        JOptionPane.showMessageDialog(null, seating.toString());
    }

    public void bookSeat(int row, int column) {
        if (row < 0 || row >= ROWS || column < 0 || column >= COLUMNS) {
            JOptionPane.showMessageDialog(null, "Invalid seat number.");
            return;
        }

        if (seats[row][column].status == SeatStatus.BOOKED) {
            JOptionPane.showMessageDialog(null, "Seat already booked.");
        } else {
            seats[row][column].status = SeatStatus.BOOKED;
            bookedSeats.add(seats[row][column]);
            JOptionPane.showMessageDialog(null, "Seat booked successfully.");
        }
    }

 public void displayBookedSeats() {
        StringBuilder booked = new StringBuilder("Booked Seats Layout:\n");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                booked.append(seats[i][j].status == SeatStatus.BOOKED ? "B " : "A ");
            }
            booked.append("\n");
        }
        JOptionPane.showMessageDialog(null, booked.toString());
    }
}

