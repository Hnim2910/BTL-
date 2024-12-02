package repositories;

import models.Ticket;
import java.util.ArrayList;
import java.util.List;

public class TicketRepository {
    private List<Ticket> tickets;

    public TicketRepository() {
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void removeTicket(String ticketID) {
        tickets.removeIf(ticket -> ticket.getTicketID().equals(ticketID));
    }

    public List<Ticket> getAllTickets() {
        return tickets;
    }

    public Ticket findTicketByID(String ticketID) {
        for (Ticket ticket : tickets) {
            if (ticket.getTicketID().equals(ticketID)) {
                return ticket;
            }
        }
        return null;
    }
}
