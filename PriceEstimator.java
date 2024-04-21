public class PriceEstimator {
    public static void main(String[] args){

        float espresso = 2.99f;
        float latte = 3.49f;
        float cappuccino = 3.79f;
        float americano = 2.29f;

        float orderedEspressos = 104 * espresso;
        float orderedLattes = 100 * latte;
        float orderedCappuccino = 4 * cappuccino;
        float orderedAmericanos = 8 * americano;

        float totalPrice = orderedEspressos + orderedLattes + orderedCappuccino + orderedAmericanos;

        // add a method to set the float to 2 decimals used AI to find method
        // "%.2f" is a format specifier used to format a floating-point number with two decimal places.
        // The '%' character marks the place where the value to be formatted will be inserted into the string.
        // '.2' specifies the precision, indicating that two decimal places should be displayed.
        // 'f' is the conversion character indicating that the argument is a floating-point number.

        String decimalPrice = String.format("%.2f", totalPrice);

        System.out.println("Your bill is €" + decimalPrice);


    }
}
