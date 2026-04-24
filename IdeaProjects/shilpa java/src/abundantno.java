import java.util.Scanner;
public class abundantno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int num = sc.nextInt();
        int temp=num;
        int sum =0;
        for (int i=1; i<num;i++){
            if(num%i==0){
                sum = sum +i;
            }
        }
        if(sum>temp){
            System.out.println("it is a abbundant no");
        }
        else{
            System.out.println("it is not a abundant no");
        }
    }
}
