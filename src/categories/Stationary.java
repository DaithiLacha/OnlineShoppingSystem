package categories;

public class Stationary extends Category{
    public double calcVAT() {
        return .09;
    }

    @Override
    public String toString() {
        return "categories.Category: categories.Stationary\n VAT: " + calcVAT() + "%";
    }
}