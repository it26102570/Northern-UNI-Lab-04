
import java.util.Scanner;

public class IT26102570Lab4Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double examMarks, labMarks;
        double examPercentage, labPercentage;
        double finalMarks;

        System.out.print("Enter exam marks (0-100): ");
        examMarks = input.nextDouble();

        System.out.print("Enter lab submission marks (0-100): ");
        labMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100 ||
            labMarks < 0 || labMarks > 100) {

            System.out.println("Invalid marks. Marks must be between 0 and 100.");

        } else {

            System.out.print("Enter exam percentage: ");
            examPercentage = input.nextDouble();

            System.out.print("Enter lab submission percentage: ");
            labPercentage = input.nextDouble();

            if (examPercentage + labPercentage != 100) {

                System.out.println("Invalid percentages. The percentages must add up to 100.");

            } else {

                finalMarks = (examMarks * examPercentage / 100)
                           + (labMarks * labPercentage / 100);

                System.out.println("Final marks: " + finalMarks);
            }
        }

        input.close();
    }
}
