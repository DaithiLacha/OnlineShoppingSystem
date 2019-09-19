import java.util.Date;

public class Sale {
    private Customer customer;
    private long saleNumber;
    private Date dateOfSale;
    private Stock stockItem;

    public Sale(Customer customer, double totalCost, long saleNumber, Stock stockItem) {
        this.customer = customer;
        this.saleNumber = saleNumber;
        dateOfSale = new Date();
        this.stockItem = stockItem;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public long getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(long saleNumber) {
        this.saleNumber = saleNumber;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public Stock getStockItem() {
        return stockItem;
    }

    public void setStockItem(Stock stockItem) {
        this.stockItem = stockItem;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "customer=" + customer +
                ", saleNumber=" + saleNumber +
                ", dateOfSale=" + dateOfSale +
                ", stockItems=" + stockItem +
                '}';
    }
}