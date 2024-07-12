package lang.object.equals;

import java.util.Objects;

public class User2 {
    private String id;

    public User2(String id) {
        this.id = id;
    }

    /**
     * 직접 구현
     */
//    @Override
//    public boolean equals(Object object) {
//        User2 user = (User2) object;
//        return id.equals(user.id);
//    }

    /**
     * IDE 활용 정확한 equals 구현
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        User2 user2 = (User2) object;
        return Objects.equals(id, user2.id);
    }
}
