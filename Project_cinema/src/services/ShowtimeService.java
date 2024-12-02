package services;

import models.Showtime;

import java.util.ArrayList;
import java.util.List;

public class ShowtimeService {
    private List<Showtime> showtimes;

    public ShowtimeService() {
        this.showtimes = new ArrayList<>();
    }

    public void addShowtime(Showtime showtime) {
        showtimes.add(showtime);
        System.out.println("Showtime added: " + showtime.getStartTime());
    }

    public void updateShowtime(String showtimeID, Showtime updatedShowtime) {
        for (int i = 0; i < showtimes.size(); i++) {
            if (showtimes.get(i).getShowtimeID().equals(showtimeID)) {
                showtimes.set(i, updatedShowtime);
                System.out.println("Showtime updated: " + updatedShowtime.getStartTime());
                return;
            }
        }
        System.out.println("Showtime not found with ID: " + showtimeID);
    }

    public void removeShowtime(String showtimeID) {
        showtimes.removeIf(showtime -> showtime.getShowtimeID().equals(showtimeID));
        System.out.println("Showtime removed with ID: " + showtimeID);
    }

    public List<Showtime> getAllShowtimes() {
        return showtimes;
    }
}
