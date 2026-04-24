import java.util.Scanner;
public class perfectno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int num = sc.nextInt();
        int temp= num;
        int ans=0;
        for (int i=1; i<num;i++){
            if(num%i==0){
               ans = ans +i;
            }
        }
        if(ans==temp){
            System.out.println("it is a perfect number");
        }
        else{
            System.out.println("not a perfect no");
        }
    }
}
