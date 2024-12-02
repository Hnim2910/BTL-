package controllers;

import java.util.List;

import models.Seat;
import services.SeatService;

public class SeatController {
    private SeatService seatService;

    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    public void addSeat(Seat seat) {
        seatService.addSeat(seat);
        System.out.println("Seat added: " + seat.getSeatID());
    }

    public void reserveSeat(String seatID) {
        seatService.reserveSeat(seatID);
    }

    public void cancelReservation(String seatID) {
        seatService.cancelReservation(seatID);
    }

    public void displayAllSeats() {
        List<Seat> seats = seatService.getAllSeats();
        for (Seat seat : seats) {
            System.out.println("Seat ID: " + seat.getSeatID() + ", Available: " + seat.isAvailable());
        }
    }
}
