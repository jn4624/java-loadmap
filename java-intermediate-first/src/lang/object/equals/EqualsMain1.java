package lang.object.equals;

public class EqualsMain1 {
    public static void main(String[] args) {
        User1 user1 = new User1("id-100");
        User1 user2 = new User1("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + user1.equals(user2));
    }
}
