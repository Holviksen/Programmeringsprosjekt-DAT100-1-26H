package no.hvl.dat100.javel.oppgave3;

public class Customer {

    String name;
    String email;

    int customer_id;

    PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setID(int customer_id){
        this.customer_id = customer_id;
    }

    public int getID(){
        return this.customer_id;
    }

    public void setAgreement(PowerAgreementType agreement){
        this.agreement = agreement;
    }

    public PowerAgreementType getAgreement(){
        return agreement;
    }

    @Override
    public String toString(){

        return "```" + 
        "\nCustomer number: " + customer_id + 
        "\nName: " + name + 
        "\nEmail: " + email + 
        "\nAgreement: " + agreement + 
        "\n```";
    }

}
