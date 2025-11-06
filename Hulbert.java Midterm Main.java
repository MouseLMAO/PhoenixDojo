//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students?");
        int numStu = sc.nextInt();
        sc.nextLine();
        int count = 1;

        while(count <= numStu)
        {
            System.out.println("Enter name for student " + count + ": ");
            String name = sc.nextLine();

            Student s = new Student(name);
            System.out.println("Enter assignment score: ");
            s.score[0] = sc.nextDouble();
            System.out.println("Enter midterm score: ");
            s.score[1] = sc.nextDouble();
            System.out.println("Enter final score: ");
            s.score[2] = sc.nextDouble();
            s.printInfo();
            s.checkPass();
            sc.nextLine();
            count++;
        }
    }
}