import java.util.Scanner;
public class pattern7 {public static void main(String args []) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row ");
    int row = sc.nextInt();
    System.out.println("Enter the column ");
    int col = sc.nextInt();
    for(int i=1; i<=row;i++) {
        for (int j = i; j <row; j++)
            System.out.print(" ");

        for (int j = 1; j <= col; j++)
            System.out.print("*");
        System.out.println();


    }


}

}
