package no.hvl.dat100.javel.oppgave2;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();
    
        MonthlyPower.print_PowerUsage(power_usage_month);
        MonthlyPower.print_PowerPrices(power_prices_month);

        System.out.println(MonthlyPower.computePowerUsage(power_usage_month));
        System.out.println(MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month));
        System.out.println(MonthlyPower.computePowerSupport(power_usage_month, power_prices_month));
        System.out.println(MonthlyPower.computeNorgesPrice(power_usage_month));
    }
}