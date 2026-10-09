package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {

        customers = new Customer[size];

    }

    // b) count number of non-null references
    public int countNonNull() {


        int count = 0;

        for(Customer cus : customers){
            if(cus != null){
                count++;
            }
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        Customer c = null;

        for(Customer cus : customers){
            if(cus != null && cus.getID() == customer_id){
                c = cus;
            }
        }

        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        for(int i = 0; i < customers.length; i++){
            if(customers[i] == null){
                customers[i] = c;
                return true;
            }
        }

        return false;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        Customer c = null;

        for(int i = 0; i < customers.length; i++){
            if(customers[i] != null && customers[i].getID() == customer_id){
                c = customers[i];
                customers[i] = null;
            }
        }

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] _customers = new Customer[countNonNull()];
        
        int i = 0;

        for(Customer c : customers){
            if(c != null){
                _customers[i] = c;
                i++;
            }
        }

        return _customers;
    }
}