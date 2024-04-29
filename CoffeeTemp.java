public class CoffeeTemp {
    public static void main(String[] args) {


        int coffeeTempInCelsius =80;

        if (coffeeTempInCelsius <= 60) {
            System.out.println("Coffee temperature is too low.");
        } else if (coffeeTempInCelsius > 60 && coffeeTempInCelsius <= 75) {
            System.out.println("Coffee temperature is optimal.");
        } else {
            System.out.println("Coffee temperature is too high.");
        }
    }
}
