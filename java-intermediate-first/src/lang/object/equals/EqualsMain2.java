package lang.object.equals;

public class EqualsMain2 {
    public static void main(String[] args) {
        User2 user1 = new User2("id-100");
        User2 user2 = new User2("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + user1.equals(user2));
    }
}
