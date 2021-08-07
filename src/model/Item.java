package model;

public class Item {
    private int item_ID;
    private String name;
    private String brand;

    public Item(int item_ID, String name, String brand) {
        this.item_ID = item_ID;
        this.name = name;
        this.brand = brand;
    }

    public Item() {
    }

    public int getItem_ID() {
        return item_ID;
    }

    public void setItem_ID(int item_ID) {
        this.item_ID = item_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Item{" +
                "item_ID=" + item_ID +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
