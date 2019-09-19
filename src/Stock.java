public class Stock {
    private String category;
    private String name;
    private double price;
    private double deliveryCost;
    private double vat;
    private String size;
    private boolean isSold;

    public Stock(String category, String name, double price, String size) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.size = size;
        calcVat();
        calcDeliveryCost();
        isSold = false;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public void calcVat() {
        if(getCategory().equalsIgnoreCase("Cleaning")) {
            setVat(.135);
        }else if(getCategory().equalsIgnoreCase("Stationary")) {
            setVat(.09);
        }else {
            setVat(.23);
        }
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
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", deliveryCost=" + deliveryCost +
                ", vat=" + vat +
                ", size='" + size + '\'' +
                ", isSold=" + isSold +
                '}';
    }
}