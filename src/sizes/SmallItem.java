package sizes;

public class SmallItem extends ItemSize {
    public double calcDeliveryCost() {
        return 5.50;
    }

    @Override
    public String toString() {
        return "Size: Small\nDelivery Cost: €" + calcDeliveryCost();
    }
}