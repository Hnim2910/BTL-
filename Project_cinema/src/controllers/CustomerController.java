package controllers;

import models.Customer;
import models.Ticket;
import services.CustomerService;

import java.util.List;

public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void addCustomer(Customer customer) {
        customerService.addCustomer(customer);
        System.out.println("Customer added: " + customer.getName());
    }

    public void displayAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        for (Customer customer : customers) {
            System.out.println("Customer ID: " + customer.getCustomerID() + ", Name: " + customer.getName());
        }
    }

    public void bookTicket(int customerID, Ticket ticket) {
        customerService.bookTicket(customerID, ticket);
    }

    public void findCustomerByID(int customerID) {
        Customer customer = customerService.findCustomerByID(customerID);
        if (customer != null) {
            System.out.println("Customer found: " + customer.getName());
        } else {
            System.out.println("Customer not found with ID: " + customerID);
        }
    }
}
