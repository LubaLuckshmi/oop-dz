import java.util.ArrayList;
import java.util.List;

public class CoffeeVendingMachine {
    private List<Drink> coffeeMachine = new ArrayList<>();
    private double cash = 0;

    public CoffeeVendingMachine addDrink(Drink drink) {
        coffeeMachine.add(drink);
        return this;
    }

    public List<Drink> getCoffeeMachine() {
        return coffeeMachine;
    }

    public Drink findDrink(String name) {
        for (Drink drink : coffeeMachine) {
            if (name.equals(drink.getDrinkName())) {
                return drink;
            }
        }
        return null;
    }

    public double getCash() {
        return cash;
    }
    public Drink saleDrink(String nameDrink) {
        Drink founded = findDrink(nameDrink);
        if (founded != null) {
            cash = cash + founded.getPrice();
            coffeeMachine.remove(founded);
        }
        return founded;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Денег в автомате: ").append(cash).append("\n");
        for (Drink drink: coffeeMachine) {
            builder.append(drink).append("\n");
        }
        return builder.toString();
    }
}
