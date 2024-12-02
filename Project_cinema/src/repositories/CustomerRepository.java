package repositories;

import models.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private List<Customer> customers;

    public CustomerRepository() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(int customerID) {
        customers.removeIf(customer -> customer.getCustomerID() == customerID);
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer findCustomerByID(int customerID) {
        for (Customer customer : customers) {
            if (customer.getCustomerID() == customerID) {
                return customer;
            }
        }
        return null;
    }
}
