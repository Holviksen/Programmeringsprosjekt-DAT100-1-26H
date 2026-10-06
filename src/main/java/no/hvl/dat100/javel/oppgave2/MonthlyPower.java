package no.hvl.dat100.javel.oppgave2;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
        int day = 1;
        for(double[] dd : usage){
            System.out.println("Day "+ day++ + ": ");
            for(double d : dd){
                System.out.print(d + " kWh ");
            }
            System.out.println();
        }

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        int day = 1;
        for(double[] dd : prices){
            System.out.println("Day "+ day++ + ": ");
            for(double d : dd){
                System.out.print(d + " NOK ");
            }
            System.out.println();
        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for(double[] dd : usage){
            for(double d : dd){
                sum+= d;
            }
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        int i = 0;

        while (i < powerusage.length && usage <= threshold) {
            int j = 0;

            while (j < powerusage[i].length && usage <= threshold) {
                usage += powerusage[i][j];
                j++;
            }

            i++;
        }

        if(usage > threshold){
            exceeded = true;
        }

        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for(int i = 0; i < usage.length; i++){
            for(int j = 0; j < usage[i].length; j++){
                price += usage[i][j] * prices[i][j];
            }
        }

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

            for(int i = 0; i < usage.length; i++){
                for(int j = 0; j < usage[i].length; j++){
                    if(prices[i][j] > 0.9375){
                        support += usage[i][j] * (prices[i][j] - 0.9375) * 0.9;
                    }
                }
            }

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        for(double[] dd : usage){
            for(double d : dd){
                price+= d * 0.5;
            }
        }

        return price;
    }
}
