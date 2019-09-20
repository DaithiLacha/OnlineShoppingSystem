import memberships.Premium;
import memberships.Standard;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    private Customer cust = new Customer();

    @BeforeEach
    void beforeAll() {
        cust.setName("David Davidson");
        cust.setAddress("Around");
        cust.setDob(new GregorianCalendar(1960, 01, 01).getTime());
        cust.setMembership(new Premium());
    }

    @Test
    void testMembership() {
        assertEquals(2, cust.getMembership().calcTimeForDelivery());
    }

    @Test
    void testSetMembership() {
        cust.setMembership(new Standard());
        assertEquals(7, cust.getMembership().calcTimeForDelivery());
    }

    @Test
    void testGetName() {
        assertEquals("David Davidson", cust.getName());
    }

    @Test
    void testSetName() {
        cust.setName("Bob");
        assertEquals("Bob", cust.getName());
    }

    @Test
    void testGetAddress() {
        assertEquals("Around", cust.getAddress());
    }

    @Test
    void testSetAddress() {
        cust.setAddress("Not here");
        assertEquals("Not here", cust.getAddress());
    }

    @Test
    void testGetWalletBalance() {
        assertEquals(0.00, cust.getWalletBalance());
    }

    @Test
    void testSetWalletBalance() {
        cust.setWalletBalance(50.00);
        assertEquals(50.00, cust.getWalletBalance());
    }

    @Test
    void testGetDob() {
        Date testDate = new GregorianCalendar(1960, 01, 01).getTime();
        assertTrue(testDate.equals(cust.getDob()));
    }

    @Test
    void testSetDob() {
        Date testDate = new GregorianCalendar(1990, 01, 01).getTime();
        cust.setDob(testDate);
        assertTrue(testDate.equals(cust.getDob()));
    }

    @Test
    void testAddToWallet() {
        cust.addToWallet(20);
        assertEquals(20, cust.getWalletBalance());
    }

    @Test
    void testSubFromWallet() throws Exception{
        cust.addToWallet(10);
        cust.subFromWallet(5);
        assertEquals(5, cust.getWalletBalance());
    }

    @Test
    void testSubFromWallet2() throws Exception {
        assertThrows(Exception.class, () -> cust.subFromWallet(20));
    }
}