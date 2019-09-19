package memberships;

public class Standard extends Membership {
    public int calcTimeForDelivery() {
        return (int)(5 + Math.random() * 3);
    }
}