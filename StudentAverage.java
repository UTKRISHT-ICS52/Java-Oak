import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input student name
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        // Input marks
        System.out.print("Enter marks in 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        // Calculate total and average
        int total = m1 + m2 + m3;
        double average = total / 3.0;

        // Using Math class
        int maxMarks = Math.max(m1, Math.max(m2, m3));

        // Output
        System.out.println("\n--- Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Highest Marks: " + maxMarks);

        sc.close();
    }
}
