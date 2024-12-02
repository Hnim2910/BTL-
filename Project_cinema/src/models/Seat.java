package models;

public class Seat {
    private String seatID;
    private String row;
    private String column;
    private boolean isAvailable;

    public Seat(String seatID, String row, String column, boolean isAvailable) {
        this.seatID = seatID;
        this.row = row;
        this.column = column;
        this.isAvailable = isAvailable;
    }

    public String getSeatID() {
        return seatID;
    }

    public String getRow() {
        return row;
    }

    public String getColumn() {
        return column;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void reserveSeat() {
        this.isAvailable = false;
    }

    public void cancelReservation() {
        this.isAvailable = true;
    }
}
