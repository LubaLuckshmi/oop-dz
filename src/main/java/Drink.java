public class Drink {
    private String drinkName;
    private int volume;
    private double price;
    private boolean isHot;
    public Drink(String drinkName, int volume, double price, boolean isHot) {
        this.drinkName = drinkName;
        this.volume = volume;
        this.price = price;
        this.isHot = isHot;
    }

    @Override
    public String toString() {
        return String.format("Напиток: %s,  Объем: %d, Цена: %f", drinkName, volume, price);
    }
    public String getDrinkName() {
        return drinkName;
    }

    public double getPrice() {
        return price;
    }
}
