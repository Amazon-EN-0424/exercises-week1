import java.util.ArrayList;

public class PriceEstimator {
    public static void main(String[] args){

        //combined exercise 4 & 5 to one exercise

        float espresso = 2.99f;
        float latte = 3.49f;
        float cappuccino = 3.79f;
        float americano = 2.29f;

        int orderedEspressos = 3;
        int orderedLattes = 7;
        int orderedCappuccino = 4;
        int orderedAmericanos = 8;

        float totalPriceEspresso = espresso * orderedEspressos;
        float totalPriceLattes = latte * orderedLattes;
        float totalPriceCappuccino = cappuccino * orderedCappuccino;
        float totalPriceAmericanos = americano * orderedAmericanos;

        float totalPrice = totalPriceEspresso + totalPriceLattes + totalPriceCappuccino + totalPriceAmericanos;

        // add a method to set the float to 2 decimals used AI to find method
        // "%.2f" is a format specifier used to format a floating-point number with two decimal places.
        // The '%' character marks the place where the value to be formatted will be inserted into the string.
        // '.2' specifies the precision, indicating that two decimal places should be displayed.
        // 'f' is the conversion character indicating that the argument is a floating-point number.

        String decimalPrice = String.format("%.2f", totalPrice);

        //used AI to find a method like in javascript similar to push method, but then for java, had to add a utility to make it work.

        ArrayList<String> coffeeOrderList = new ArrayList<String>();

        String espressoCup = "espresso";
        String latteCup = "latte";
        String cappuccinoCup = "cappuccino";
        String americanoCup = "americano";

        for (int i = 1; i <= orderedEspressos; i++) {
            coffeeOrderList.add(espressoCup);
        }

        for (int i = 1; i <= orderedAmericanos; i++) {
            coffeeOrderList.add(americanoCup);
        }

        for (int i = 1; i <= orderedLattes; i++) {
            coffeeOrderList.add(latteCup);
        }

        for (int i = 1; i <= orderedCappuccino; i++) {
            coffeeOrderList.add(cappuccinoCup);
        }

        System.out.println("\nYou have ordered the following:\n");
        System.out.println(coffeeOrderList);
        System.out.println("\n\nTotal espresso's ☕: " + orderedEspressos);
        System.out.println("Total latte's ☕: " + orderedLattes);
        System.out.println("Total americano's ☕: " + orderedAmericanos);
        System.out.println("Total cappuccino's ☕: " + orderedCappuccino);
        System.out.println("\n=================================================================");
        System.out.println("Your bill is €" + decimalPrice + "\uD83D\uDCB0");
        System.out.println("=================================================================\n");
    }
}



