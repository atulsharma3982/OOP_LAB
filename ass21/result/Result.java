package result;

public class Result {
    private final int marks1;
    private final int marks2;
    private final int marks3;

    public Result(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    int totalMarks() {
        return marks1 + marks2 + marks3;
    }

    double percentage() {
        return totalMarks() / 3.0;
    }

    boolean finalResult() {
        return percentage() >= 40;
    }

    public void displayResult() {
        System.out.println("Total Marks: " + totalMarks());
        System.out.printf("Percentage: %.2f\n" , percentage());
        if (finalResult()) {
            System.out.println("Result: Pass");
        }
        else {
            System.out.println("Result: Fail");
        }
    }
}
