import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selections;

    public QuestionService() {
        selections = new String[questions.length];
        questions[0] = new Question(1, "size of int", "2", "4", "8", "12", "4");
        questions[1] = new Question(2, "size of short", "2", "4", "8", "16", "2");
        questions[2] = new Question(3, "Which keyword is used to define a class in Java?", "class", "struct", "interface", "function", "class");
        questions[3] = new Question(4, "Which operator is used for assignment?", "==", "=", ":=", "=>", "=");
        questions[4] = new Question(5, "Which data type stores true or false?", "int", "char", "boolean", "double", "boolean");
    }

    public void playQuiz() {
        System.out.println("\n========================================");
        System.out.println("        JAVA QUIZ STARTED");
        System.out.println("========================================\n");

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            System.out.println("Question " + q.getId() + ": " + q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());
            System.out.print("Your answer: ");
            selections[i] = sc.nextLine();
            System.out.println();
        }
    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            if (questions[i] != null && selections[i] != null
                    && selections[i].equalsIgnoreCase(questions[i].getAnswer())) {
                score++;
            }
        }

        System.out.println("========================================");
        System.out.println("           FINAL SCORE REPORT");
        System.out.println("========================================");
        System.out.println("Correct Answers: " + score + " / " + questions.length);
        System.out.println("========================================");
    }
}
