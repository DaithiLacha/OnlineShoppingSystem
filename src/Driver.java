import categories.OtherCategory;
import categories.Stationary;
import memberships.Premium;
import sizes.LargeItem;

import java.util.GregorianCalendar;

public class Driver{
    public static void main(String[] args) {
        Stock television = new Stock();
        television.setCat(new OtherCategory());
        television.setName("Samsung 50 inch");
        television.setPrice(300);
        television.setSize(new LargeItem());
        System.out.println(television.toString());

        Customer dave = new Customer();
        dave.setName("David Davidson");
        dave.setAddress("Around");
        dave.setDob(new GregorianCalendar(01, 01, 1960).getTime());
        dave.setMembership(new Premium());


        Sale davesTV = new Sale(dave, 01234, television);

        System.out.println("\n\n" + television.toString());
    }
}
