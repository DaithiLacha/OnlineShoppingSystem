import categories.OtherCategory;
import categories.Stationary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sizes.LargeItem;
import sizes.SmallItem;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {
    private Stock notepad;

    @BeforeEach
    void before() {
        notepad = new Stock();
        notepad.setCat(new Stationary());
        notepad.setSize(new SmallItem());
        notepad.setPrice(10);
        notepad.setName("A4 Refill Pad");
    }

    @Test
    void getCat() {
        assertEquals(.09, notepad.getCat().calcVAT());
    }

    @Test
    void setCat() {
        notepad.setCat(new OtherCategory());
        assertEquals(.23, notepad.getCat().calcVAT());
    }

    @Test
    void getName() {
        assertEquals("A4 Refill Pad", notepad.getName());
    }

    @Test
    void setName() {
        notepad.setName("A3 Refill Pad");
        assertEquals("A3 Refill Pad", notepad.getName());
    }

    @Test
    void getPrice() {
        assertEquals(10, notepad.getPrice());
    }

    @Test
    void setPrice() {
        notepad.setPrice(12);
        assertEquals(12, notepad.getPrice());;
    }

    @Test
    void getSize() {
        assertEquals(5.50, notepad.getSize().calcDeliveryCost());
    }

    @Test
    void setSize() {
        notepad.setSize(new LargeItem());
        assertEquals(22, notepad.getSize().calcDeliveryCost());
    }

    @Test
    void isSold() {
        assertFalse(notepad.isSold());
    }

    @Test
    void setSold() {
        notepad.setSold(true);
        assertTrue(notepad.isSold());
    }

    @Test
    void calcNetPrice() {
        double testValue = 10 + 10 * .09 + 5.50;
        assertEquals(testValue, notepad.calcNetPrice());
    }

}