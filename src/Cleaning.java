public class Cleaning extends Category{
    public double calcVAT() {
        return .13;
    }

    @Override
    public String toString() {
        return "Category: Stationary\n VAT: " + calcVAT() + "%";
    }
}