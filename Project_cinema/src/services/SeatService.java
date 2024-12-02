package services;

import models.Seat;

import java.util.ArrayList;
import java.util.List;

public class SeatService {
    private List<Seat> seats;

    public SeatService() {
        this.seats = new ArrayList<>();
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
        System.out.println("Seat added: " + seat.getSeatID());
    }

    public void reserveSeat(String seatID) {
        for (Seat seat : seats) {
            if (seat.getSeatID().equals(seatID)) {
                if (seat.isAvailable()) {
                    seat.reserveSeat();
                    System.out.println("Seat reserved: " + seatID);
                } else {
                    System.out.println("Seat is already reserved: " + seatID);
                }
                return;
            }
        }
        System.out.println("Seat not found with ID: " + seatID);
    }

    public void cancelReservation(String seatID) {
        for (Seat seat : seats) {
            if (seat.getSeatID().equals(seatID)) {
                if (!seat.isAvailable()) {
                    seat.cancelReservation();
                    System.out.println("Seat reservation cancelled: " + seatID);
                } else {
                    System.out.println("Seat is not reserved: " + seatID);
                }
                return;
            }
        }
        System.out.println("Seat not found with ID: " + seatID);
    }
}
