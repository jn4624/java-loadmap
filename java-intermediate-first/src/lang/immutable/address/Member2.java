package lang.immutable.address;

/**
 * 불변(Immutable) 객체
 */
public class Member2 {
    private String name;
    private ImmutableAddress address;

    public Member2(String name, ImmutableAddress address) {
        this.name = name;
        this.address = address;
    }

    public ImmutableAddress getAddress() {
        return address;
    }

    public void setAddress(ImmutableAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Member1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
