package models;

public class Showtime {
    private String showtimeID;
    private String startTime;

    public Showtime(String showtimeID, String startTime) {
        this.showtimeID = showtimeID;
        this.startTime = startTime;
    }

    public String getShowtimeID() {
        return showtimeID;
    }

    public String getStartTime() {
        return startTime;
    }
}
