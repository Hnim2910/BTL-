package src;

import controllers.*;
import models.*;
import services.*;
import repositories.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Tạo các repository
        MovieRepository movieRepository = new MovieRepository();
        ShowtimeRepository showtimeRepository = new ShowtimeRepository();
        TicketRepository ticketRepository = new TicketRepository();
        SeatRepository seatRepository = new SeatRepository();
        CustomerRepository customerRepository = new CustomerRepository();

        // Tạo các service
        MovieService movieService = new MovieService();
        ShowtimeService showtimeService = new ShowtimeService();
        TicketService ticketService = new TicketService();
        SeatService seatService = new SeatService();
        CustomerService customerService = new CustomerService();

        // Tạo các controller
        MovieController movieController = new MovieController(movieService);
        ShowtimeController showtimeController = new ShowtimeController(showtimeService);
        TicketController ticketController = new TicketController(ticketService);
        SeatController seatController = new SeatController(seatService);
        CustomerController customerController = new CustomerController(customerService);

        // **Thao tác với Movies**
        System.out.println("=== Movie Management ===");
        Movie movie1 = new Movie("M001", "Avengers: Endgame", "Action", "Russo Brothers", 
                                  "Robert Downey Jr., Chris Evans", new Date(), 8.4f, 181);
        Movie movie2 = new Movie("M002", "Inception", "Sci-fi", "Christopher Nolan", 
                                  "Leonardo DiCaprio", new Date(), 9.0f, 148);

        movieController.addMovie(movie1);
        movieController.addMovie(movie2);

        movieController.displayAllMovies();

        // **Thao tác với Showtime**
        System.out.println("\n=== Showtime Management ===");
        Showtime showtime1 = new Showtime("S001", "2024-12-10 18:30");
        Showtime showtime2 = new Showtime("S002", "2024-12-10 20:30");

        showtimeController.addShowtime(showtime1);
        showtimeController.addShowtime(showtime2);

        showtimeController.displayAllShowtimes();

        // **Thao tác với Seat**
        System.out.println("\n=== Seat Management ===");
        Seat seat1 = new Seat("A1", "A", "1", true);
        Seat seat2 = new Seat("A2", "A", "2", true);

        seatController.addSeat(seat1);
        seatController.addSeat(seat2);

        seatController.reserveSeat("A1");
        seatController.cancelReservation("A1");
        seatController.displayAllSeats();

        // **Thao tác với Tickets**
        System.out.println("\n=== Ticket Management ===");
        Ticket ticket1 = new Ticket("T001", 10.5f, seat1);
        Ticket ticket2 = new Ticket("T002", 12.0f, seat2);

        ticketController.createTicket("T001", 10.5f, seat1);
        ticketController.createTicket("T002", 12.0f, seat2);
        ticketController.displayAllTickets();

        ticketController.cancelTicket("T002");
        ticketController.displayAllTickets();

        // **Thao tác với Customer**
        System.out.println("\n=== Customer Management ===");
        Customer customer1 = new Customer(1, "John Doe", "john.doe@example.com", "1234567890");

        customerController.addCustomer(customer1);
        customerController.displayAllCustomers();

        customerController.bookTicket(1, ticket1);
        customerController.findCustomerByID(1);
    }
}
