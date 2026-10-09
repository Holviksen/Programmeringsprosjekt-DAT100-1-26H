package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customer customer1 = new Customer("1", "1", 1, PowerAgreementType.NORGESPRICE);
        Customer customer2 = new Customer("2", "2", 2, PowerAgreementType.NORGESPRICE);

        Customers customers = new Customers(10);

        if(customers.addCustomer(customer1)){
            System.out.println("Successfully added customer");
        }

        if(customers.addCustomer(customer2)){
            System.out.println("Successfully added customer");
        }

        System.out.println(customers.countNonNull());

        if(customers.getCustomer(customer1.getID()) == customer1){
            System.out.println("Successfully found customer");
        }

        if(customers.getCustomer(customer2.getID()) == customer2){
            System.out.println("Successfully found customer");
        }

        Customer[] _customers = customers.getCustomers();

        for(Customer c : _customers){
            System.out.println(c.toString());
        }

        if(customers.removeCustomer(customer1.getID()) == customer1){
            System.out.println("Successfully removed customer");
        }

        if(customers.removeCustomer(customer2.getID()) == customer2){
            System.out.println("Successfully removed customer");
        }

        System.out.println(customers.countNonNull());

    }
}
