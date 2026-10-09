package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customer customer1 = new Customer("1", "1", 1, PowerAgreementType.NORGESPRICE);
        Customer customer2 = new Customer("2", "2", 2, PowerAgreementType.SPOTPRICE);
        Customer customer3 = new Customer("3", "3", 3, PowerAgreementType.POWERSUPPORT);

        Invoice invoice1 = new Invoice(customer1, "January", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);
        Invoice invoice2 = new Invoice(customer2, "January", CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);
        Invoice invoice3 = new Invoice(customer3, "January", CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month);

        Invoice[] invoices = {invoice1, invoice2, invoice3};

        Invoices.processInvoices(invoices);

    }
}
