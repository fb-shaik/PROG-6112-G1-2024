/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seating_app;


// Enum to represent seat status
enum SeatStatus {
    AVAILABLE, BOOKED
}

// Class to represent a Seat
class Seat {
    int row;
    int column;
    SeatStatus status;

    Seat(int row, int column, SeatStatus status) {
        this.row = row;
        this.column = column;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Seat(" + "row=" + row + ", column=" + column + ", status=" + status + ')';
    }
}