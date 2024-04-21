public class CoffeeTime {
    public static void main(String[] args) {

        //input of the coffee
        String selectedCoffee = "latte";

        //add method to variable to make it lowercase, in case of case sensitivity
        selectedCoffee = selectedCoffee.toLowerCase();

        //
        System.out.println("You have selected " + selectedCoffee);

        if (selectedCoffee.equals("espresso")) {
            System.out.println("That's strong ☕!");
        } else if (selectedCoffee.equals("americano")) {
            System.out.println(("That's a classic ☕"));
        } else if (selectedCoffee.equals("latte")) {
            System.out.println(("Nice and creamy ☕"));
        } else {
            System.out.println(("Please select a Coffee"));
        }
    }
}