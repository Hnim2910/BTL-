package models;

public class Ticket {
    private String ticketID;
    private float price;
    private Seat seat;

    public Ticket(String ticketID, float price, Seat seat) {
        this.ticketID = ticketID;
        this.price = price;
        this.seat = seat;
    }

    public String getTicketID() {
        return ticketID;
    }

    public float getPrice() {
        return price;
    }

    public Seat getSeat() {
        return seat;
    }
}
