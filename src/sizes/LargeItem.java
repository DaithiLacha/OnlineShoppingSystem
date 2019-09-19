package sizes;

public class LargeItem extends ItemSize {
    public double calcDeliveryCost() {
        return 22.00;
    }

    @Override
    public String toString() {
        return "Size: Large\n Delivery Cost: €" + calcDeliveryCost();
    }
}