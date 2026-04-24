import java.util.Scanner;

public class ArithmeticOperationsInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 integers for expression a:");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int resultA = a1 + a2 * a3;

        System.out.println("Enter 2 integers for expression b:");
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int resultB = (b1 + b2) % b2;

        System.out.println("Enter 4 integers for expression c:");
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int c4 = sc.nextInt();
        int resultC = c1 + c2 * c3 / c4;

        System.out.println("Enter 6 integers for expression d:");
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();
        int d4 = sc.nextInt();
        int d5 = sc.nextInt();
        int d6 = sc.nextInt();
        int resultD = d1 + d2 / d3 * d4 - d5 % d6;

        sc.close();

        System.out.println("\n--- Results ---");
        System.out.println("a. " + resultA);
        System.out.println("b. " + resultB);
        System.out.println("c. " + resultC);
        System.out.println("d. " + resultD);
    }
}
