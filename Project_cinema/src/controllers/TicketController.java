package controllers;

import models.Seat;
import models.Ticket;
import services.TicketService;

import java.util.List;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public void createTicket(String ticketID, float price, Seat seat) {
        Ticket ticket = ticketService.createTicket(ticketID, price, seat);
        System.out.println("Ticket created with ID: " + ticket.getTicketID());
    }

    public void cancelTicket(String ticketID) {
        ticketService.cancelTicket(ticketID);
        System.out.println("Ticket successfully cancelled with ID: " + ticketID);
    }

    public void displayAllTickets() {
        List<Ticket> tickets = ticketService.getAllTickets();
        for (Ticket ticket : tickets) {
            System.out.println("Ticket ID: " + ticket.getTicketID() + ", Price: " + ticket.getPrice());
        }
    }
}
