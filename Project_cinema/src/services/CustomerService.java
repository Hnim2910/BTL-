package services;

import models.Customer;
import models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customers;

    public CustomerService() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added: " + customer.getName());
    }

    public Customer findCustomerByID(int customerID) {
        for (Customer customer : customers) {
            if (customer.getCustomerID() == customerID) {
                return customer;
            }
        }
        System.out.println("Customer not found with ID: " + customerID);
        return null;
    }

    public void bookTicket(int customerID, Ticket ticket) {
        Customer customer = findCustomerByID(customerID);
        if (customer != null) {
            customer.addTicket(ticket);
            System.out.println("Ticket booked for customer: " + customer.getName());
        }
    }
}
