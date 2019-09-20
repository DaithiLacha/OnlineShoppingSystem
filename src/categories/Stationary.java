package categories;

public class Stationary extends Category{
    public double calcVAT() {
        return .09;
    }

    @Override
    public String toString() {
        return "Category: Stationary\nVAT: " + (calcVAT() * 100) + "%\n";
    }
}