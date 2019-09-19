package categories;

public class Cleaning extends Category{
    public double calcVAT() {
        return .13;
    }

    @Override
    public String toString() {
        return "categories.Category: categories.Stationary\n VAT: " + calcVAT() + "%";
    }
}