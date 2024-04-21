public class CoffeeStrengthCalc {
    public static void main(String[] args){

        //add coffee in grams
        int coffeeInGrams = 200;

        // for example if you input 3, it is 1 part coffee to 3 parts water
        int waterRatio = 1;

        System.out.println("You have added " + Integer.toString(coffeeInGrams) + " grams of coffee and your ratio is " + Integer.toString(waterRatio) + ".");

        int waterRequirement = coffeeInGrams * waterRatio;

        System.out.println("This means you should add " + Integer.toString(waterRequirement) + " Ml of water.");

        int calculatedStrengthResult = coffeeInGrams / waterRatio;

        if (calculatedStrengthResult < 50) {
            System.out.println("Weak coffee!");
        } else if (calculatedStrengthResult >= 50 && calculatedStrengthResult <= 100) {
            System.out.println("Medium coffee");
        } else {
            System.out.println("Strong coffee!");
        }

    }
}
