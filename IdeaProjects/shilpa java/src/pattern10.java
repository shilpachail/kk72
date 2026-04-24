import java.util.Scanner;
public class pattern10 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no ");
        int n = sc.nextInt();
        int i;
        for(i=0; i<n;i++) {
            for (int j = i; j < n-1 ; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(2*i+1); j++){
                if(j==0|| j==2*i||i==n-1)
                System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();

        }
    }

}

