public class methodoverding2 {
    static void display(int number) {
    System.out.println("Integer: " + number);
}

static void display(String text) {
    System.out.println("Text: " + text);
}

static void display(boolean value) {
    System.out.println("Boolean: " + value);
}
public static void main(String[] args) {
    display(false);
    display("umesh");
    display(33);
}
}
