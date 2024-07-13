package lang.immutable.address;

/**
 * 가변(Mutable) 객체
 */
public class Member1 {
    private String name;
    private Address address;

    public Member1(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
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
