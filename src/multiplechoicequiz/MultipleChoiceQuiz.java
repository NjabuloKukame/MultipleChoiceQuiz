/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplechoicequiz;

//import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tikkun
 */
public class MultipleChoiceQuiz {

    static String[] correctResponses = {"A", "B", "C", "D"};
    static int score = 0;
    static Scanner sc = new Scanner(System.in);
    static final int MAX_QUESTIONS = 25;
    static final int MIN_QUESTIONS = 5;
    static String userAnswer = "";

    public static void main(String[] args) {
        runQuiz();
    }

    public static void runQuiz() {
        AllQuestions allQ = new AllQuestions();

        // We Retrieve The List of Questions
        List<AllQuestions.Question> allQuestions = allQ.getQuestions();

        System.out.println("Welcome To Our Quiz App");

        boolean validInput = false;
        int numQuestions = 0;
        
        while (!validInput) {
            // Asking the user how many questions they want to answer
            System.out.print("\nHow many questions do you want to answer? (Min - " + MIN_QUESTIONS + "; Max - " + MAX_QUESTIONS + "): ");
            
            try {
                numQuestions = sc.nextInt();
                sc.nextLine(); // Consume newline left-over

                if (numQuestions > MAX_QUESTIONS) {
                    System.out.println("You Can't Answer More Than " + MAX_QUESTIONS + " Questions");
                } else if (numQuestions < MIN_QUESTIONS) {
                    System.out.println("You Can't Answer Less Than " + MIN_QUESTIONS + " Questions");
                }else{
                    validInput = true;
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Please Enter A Valid Numeric Value.");
                sc.nextLine(); // Consume invalid input
            }

        }

        for (int i = 0; i < numQuestions; i++) {
            AllQuestions.Question question = allQuestions.get(i);

            System.out.println("\nQuestion " + (i + 1) + ": " + question.getQuestion());
            System.out.println(question.getOption1());
            System.out.println(question.getOption2());
            System.out.println(question.getOption3());
            System.out.println(question.getOption4());

            boolean validResponse = false;

            while (!validResponse) {
                System.out.print("Your Answer: ");
                userAnswer = sc.nextLine().toUpperCase();

                // Check if the response is valid
                for (String response : correctResponses) {
                    if (response.equals(userAnswer)) {
                        validResponse = true;
                        break;
                    }
                }

                if (!validResponse) {
                    System.out.println("Invalid response. Please enter A, B, C, or D.");
                }
            }

            // We check if the user's answer is correct
            if (userAnswer.equals(question.getAnswer())) {
                score++; // Increment score if the answer is correct
            }

            // We added a newline for readability
            System.out.println();
        }

        // Prints the final score
        System.out.println("Quiz completed! Your score is: " + score + "/" + numQuestions);
        
        //Corrections
        System.out.println("\nDo You Want To See The Corrections? (Yes or No)");
        String corrections = sc.nextLine();
        
        if (corrections.equalsIgnoreCase("Yes")) {
            
            System.out.println("\nCorrect Answers");
            for (int i = 0; i < numQuestions; i++) {
                AllQuestions.Question question = allQuestions.get(i);
                System.out.println("\nQuestion " + (i +1) + ": "+ question.getQuestion());
                System.out.println("Correct Answer: " + question.getFullAnswer());
            }
        }else{
            System.out.println("Thank You For Playing");
        }

        // Close the scanner
        sc.close();
    }

}
