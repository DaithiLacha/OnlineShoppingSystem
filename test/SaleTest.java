import categories.Stationary;
import memberships.Premium;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sizes.LargeItem;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class SaleTest {
    private Stock television = new Stock();
    private Customer dave = new Customer();
    private Sale davesTV;


    @BeforeEach
    void before() {
        television.setCat(new Stationary());
        television.setName("Samsung 50 inch");
        television.setPrice(300);
        television.setSize(new LargeItem());
        dave.setName("David Davidson");
        dave.setAddress("Around");
        dave.setDob(new GregorianCalendar(01, 01, 1960).getTime());
        dave.setMembership(new Premium());
        davesTV = new Sale(dave, 01234, television);
    }

    @Test
    void getSaleNumber() {
    }

    @Test
    void setSaleNumber() {
    }

    @Test
    void getDateOfSale() {
    }

    @Test
    void setDateOfSale() {
    }

    @Test
    void getStockItem() {
    }

    @Test
    void setStockItem() {
    }

}