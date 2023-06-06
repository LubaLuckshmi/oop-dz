public class Main {
    public static void main(String[] args) {
        CoffeeVendingMachine machine = new CoffeeVendingMachine();
        machine.addDrink(new Drink("Espresso", 30, 150, true))
                .addDrink(new Drink("Capucine", 200, 300, true))
                .addDrink(new Drink("Latte", 300, 350, true))
                .addDrink(new Drink("Water", 500, 100, false))
                .addDrink(new CoffeeCocktail("Glace", 300, 400, false, "ice cream", 350))
                .addDrink(new CoffeeCocktail("Irish", 300, 450, true, "whiskey", 450));
        System.out.println(machine);

        System.out.println("+++++++++++++++");
        Drink foundDrink = machine.findDrink("Water");
        System.out.println(foundDrink);

        System.out.println("+++++++++++++");
        Drink saleDrink = machine.saleDrink("Irish");
        System.out.println(saleDrink);
        Drink saleDrink2 = machine.saleDrink("Latte");
        System.out.println(saleDrink2);
        System.out.println("Осталось денег");
        System.out.println(machine.getCash());
        System.out.println();
        System.out.println(machine);
    }

}
