package incorrect_app_first;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Object[][] studentScores = {
                {"Alice", 90},
                {"Bob", 85},
                {"Charlie", 78}
        };

        int i = 0;
        int j = 0;
        for (i = 0; i < studentScores.length; i++) {
            for (j = 0; j < studentScores[i].length - 1; j++) {
                System.out.println("Student: " + studentScores[i][j] + ", Score: " + studentScores[i][j + 1]);
            }
        }

        System.out.print("Enter student index (1-3): ");
        int index = scanner.nextInt();

        if (index >= 1 && index <= 3) {
            System.out.println("Student: " + studentScores[index - 1][0] + ", Score: " + studentScores[index - 1][1]);
        } else {
            System.out.println("Invalid index!");
        }

        char grade = 0;
        int studentGrade = (int) studentScores[index - 1][1];
        if (studentGrade >=90) {
            grade = 'A';
        } else if (studentGrade < 90) {
            grade = 'B';
        } else if (studentGrade < 80) {
            grade = 'C';
        } else if (studentGrade < 70) {
            grade = 'D';
        }

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Average.");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
                break;
        }


        scanner.close();
    }
}
