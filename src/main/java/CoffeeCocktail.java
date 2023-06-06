public class CoffeeCocktail extends Drink{
    private String special;
    private int calories;

    public CoffeeCocktail(String drinkName, int volume, double price, boolean isHot, String special, int calories) {
        super(drinkName, volume, price, isHot);
        this.special = special;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return String.format("Коктейль: %s, Добавка: %s, Калории: %d", super.toString(), special, calories);
    }
}
