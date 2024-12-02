package controllers;

import models.Showtime;
import services.ShowtimeService;

import java.util.List;

public class ShowtimeController {
    private ShowtimeService showtimeService;

    public ShowtimeController(ShowtimeService showtimeService) {
        this.showtimeService = showtimeService;
    }

    public void addShowtime(Showtime showtime) {
        showtimeService.addShowtime(showtime);
        System.out.println("Showtime successfully added: " + showtime.getStartTime());
    }

    public void updateShowtime(String showtimeID, Showtime updatedShowtime) {
        showtimeService.updateShowtime(showtimeID, updatedShowtime);
    }

    public void removeShowtime(String showtimeID) {
        showtimeService.removeShowtime(showtimeID);
        System.out.println("Showtime successfully removed with ID: " + showtimeID);
    }

    public void displayAllShowtimes() {
        List<Showtime> showtimes = showtimeService.getAllShowtimes();
        for (Showtime showtime : showtimes) {
            System.out.println("Showtime ID: " + showtime.getShowtimeID() + ", Start Time: " + showtime.getStartTime());
        }
    }
}
