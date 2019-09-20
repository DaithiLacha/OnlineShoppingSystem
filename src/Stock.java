import categories.Category;
import sizes.ItemSize;

public class Stock {
    private Category cat;
    private String name;
    private double price;
    private ItemSize size;
    private boolean isSold;

    public Category getCat() {
        return cat;
    }

    public void setCat(Category cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ItemSize getSize() {
        return size;
    }

    public void setSize(ItemSize size) {
        this.size = size;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public double calcNetPrice() {
        return (price + (price * cat.calcVAT()) + (size.calcDeliveryCost()));
    }


    @Override
    public String toString() {
        return cat.toString() +
                "Name: " + name + "\n" +
                "Price: " + price + "\n" +
                size.toString() + "\n" +
                "Final cost: €" + String.format("%.2f", calcNetPrice()) + "\n" +
                "Is Sold: " + isSold;
    }
}