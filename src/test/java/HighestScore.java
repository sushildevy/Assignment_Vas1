import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        while (true){
            Scanner input = new Scanner(System.in);

            int highestScore = 0;
            String highestScoreName = "";
            System.out.print("Enter the number of students: ");
            int numberOfStudents = input.nextInt();
            System.out.println("Enter each student’s name and score");
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.print(
                        "Student: " + (i + 1) + "\n\t Name: ");
                String name = input.next();
                System.out.print( "\t Score: ");

                int score = input.nextInt();

                // Test if score is higher than highest score
                if (score > highestScore)
                {
                    highestScore = score;
                    highestScoreName = name;
                }

            }

            // Display the name of the student with the highest score
            System.out.println("Student with the highest score: " + highestScoreName);

        }
    }
}
