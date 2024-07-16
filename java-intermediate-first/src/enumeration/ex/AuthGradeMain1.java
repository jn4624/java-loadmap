package enumeration.ex;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade authGrade : values) {
            printAuthGrade(authGrade);
        }
    }

    private static void printAuthGrade(AuthGrade authGrade) {
        System.out.println("grade = " + authGrade.name() + ", level = " + authGrade.getLevel() + ", 설명 = " + authGrade.getDescription());
    }
}
