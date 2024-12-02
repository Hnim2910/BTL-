package repositories;

import models.Showtime;
import java.util.ArrayList;
import java.util.List;

public class ShowtimeRepository {
    private List<Showtime> showtimes;

    public ShowtimeRepository() {
        this.showtimes = new ArrayList<>();
    }

    public void addShowtime(Showtime showtime) {
        showtimes.add(showtime);
    }

    public void updateShowtime(String showtimeID, Showtime updatedShowtime) {
        for (int i = 0; i < showtimes.size(); i++) {
            if (showtimes.get(i).getShowtimeID().equals(showtimeID)) {
                showtimes.set(i, updatedShowtime);
                return;
            }
        }
    }

    public void removeShowtime(String showtimeID) {
        showtimes.removeIf(showtime -> showtime.getShowtimeID().equals(showtimeID));
    }

    public List<Showtime> getAllShowtimes() {
        return showtimes;
    }

    public Showtime findShowtimeByID(String showtimeID) {
        for (Showtime showtime : showtimes) {
            if (showtime.getShowtimeID().equals(showtimeID)) {
                return showtime;
            }
        }
        return null;
    }
}
