package model;

public class Equipment {
    public String name;
    public Double price;
    public Double sellPrice;
    public Integer level;

    public Equipment(String name, Double price, Integer level) {
        this.name = name;
        this.price = price;
        this.sellPrice = 0.5 * price;
        this.level = level;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.price);
        System.out.println(this.sellPrice);
        System.out.println(this.level);
    }
}
