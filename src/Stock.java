public class Stock {
    private Category cat;
    private String name;
    private double price;
    private double deliveryCost;
    private double vat;
    private String size;
    private boolean isSold;

    public Stock(Category cat, String name, double price, String size) {
        this.cat = cat;
        this.name = name;
        this.price = price;
        this.size = size;
        calcDeliveryCost();
        isSold = false;
    }

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

    public double getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public void calcDeliveryCost() {
        if(getSize().equalsIgnoreCase("Large")) {
            setDeliveryCost(22.00);
        }else if(getSize().equalsIgnoreCase("Medium")) {
            setDeliveryCost(11.00);
        }else if(getSize().equalsIgnoreCase("Small")) {
            setDeliveryCost(5.50);
        }
    }

    @Override
    public String toString() {
        return "Stock{" +
                cat.toString() +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", deliveryCost=" + deliveryCost +
                ", size='" + size + '\'' +
                ", isSold=" + isSold +
                '}';
    }
}