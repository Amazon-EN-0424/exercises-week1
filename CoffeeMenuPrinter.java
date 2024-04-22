public class CoffeeMenuPrinter {
    public static void main(String[] args){

        // Exercise says a do while loop?
        String[] coffeeArray = {"Espresso", "Latte", "Cappuccino", "Americano"};

        int coffeeCount = coffeeArray.length - 1;

        do {
            System.out.println(coffeeArray[coffeeCount]);
            coffeeCount--;
        } while (coffeeCount >=0 );

    }
}//
