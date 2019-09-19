public class MediumItem extends ItemSize {
    public double calcDeliveryCost() {
        return 11.00;
    }

    @Override
    public String toString() {
        return "Size: Medium\n Delivery Cost: €" + calcDeliveryCost();
    }
}