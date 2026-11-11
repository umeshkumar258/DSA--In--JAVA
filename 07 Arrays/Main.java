
public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int position = 2;
        int newValue = 25;

        for (int i = numbers.length - 1; i > position; i--) {
            numbers[i] = numbers[i - 1];
        }

        numbers[position] = newValue;

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
