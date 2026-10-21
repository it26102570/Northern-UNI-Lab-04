
import java.util.Scanner;

public class IT26102570Lab4Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        String result;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        result = (number > 0)
                ? "Positive"
                : (number < 0)
                    ? "Negative"
                    : "Zero";

        System.out.println("The number is " + result + ".");

        input.close();
    }
}
