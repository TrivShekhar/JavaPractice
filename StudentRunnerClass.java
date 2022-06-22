import java.util.Scanner;
public class StudentRunnerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.nextLine();
        System.out.println("Enter Maths Marks");
        int mm = sc.nextInt();
        System.out.println("Enter Science Marks");
        int sm = sc.nextInt();
        System.out.println("Enter Computer Marks");
        int cm = sc.nextInt();
        sc.close();
        Student student = new Student(name, mm, sm, cm);
        student.display();
    }
}
