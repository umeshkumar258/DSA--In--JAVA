
import java.util.*;

public class question_answer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pen + pencil + eraser;

        // Calculate 18% discount
        float actual_amount = total - (total * 18 / 100);

        System.out.println("Total amount: " + total);
        System.out.println("Amount after 18% discount: " + actual_amount);

        sc.close();
    }
}
