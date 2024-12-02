package services;

import models.Ticket;
import models.Seat;

import java.util.ArrayList;
import java.util.List;

public class TicketService {
    private List<Ticket> tickets;

    public TicketService() {
        this.tickets = new ArrayList<>();
    }

    public Ticket createTicket(String ticketID, float price, Seat seat) {
        Ticket ticket = new Ticket(ticketID, price, seat);
        tickets.add(ticket);
        System.out.println("Ticket created with ID: " + ticketID);
        return ticket;
    }

    public void cancelTicket(String ticketID) {
        tickets.removeIf(ticket -> ticket.getTicketID().equals(ticketID));
        System.out.println("Ticket cancelled with ID: " + ticketID);
    }

    public List<Ticket> getAllTickets() {
        return tickets;
    }
}
