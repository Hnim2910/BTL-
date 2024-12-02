package repositories;

import models.Seat;
import java.util.ArrayList;
import java.util.List;

public class SeatRepository {
    private List<Seat> seats;

    public SeatRepository() {
        this.seats = new ArrayList<>();
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    public void updateSeat(String seatID, boolean isAvailable) {
        for (Seat seat : seats) {
            if (seat.getSeatID().equals(seatID)) {
                if (isAvailable) {
                    seat.cancelReservation();
                } else {
                    seat.reserveSeat();
                }
                return;
            }
        }
    }

    public List<Seat> getAllSeats() {
        return seats;
    }

    public Seat findSeatByID(String seatID) {
        for (Seat seat : seats) {
            if (seat.getSeatID().equals(seatID)) {
                return seat;
            }
        }
        return null;
    }
}
