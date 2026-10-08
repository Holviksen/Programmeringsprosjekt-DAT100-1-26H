package no.hvl.dat100.javel.oppgave3;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer customer1 = new Customer("Joe", "joe1@joe.com", 12, PowerAgreementType.SPOTPRICE);

        System.out.println(customer1.toString());

        customer1.setEmail("bob1@joe.com");
        customer1.setName("Bob");
        customer1.setID(6);
        customer1.setAgreement(PowerAgreementType.NORGESPRICE);

        System.out.println(customer1.toString());
    }
}
