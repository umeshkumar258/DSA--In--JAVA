public class return1 {
    static String getGrade(int marks) {
    if (marks >= 90) {
        return "A";
    } else if (marks >= 75) {
        return "B";
    } else if (marks >= 40) {
        return "C";
    } else {
        return "Fail";
    }
}
public static void main(String[] args) {
    System.out.println(getGrade(44));
}
}
