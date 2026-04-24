import java.util.Scanner;
public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int num = sc.nextInt();
        for (int i=1; i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}

