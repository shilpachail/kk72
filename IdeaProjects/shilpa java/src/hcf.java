import java.util.Scanner;
public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first no: ");
        int num = sc.nextInt();
        System.out.print("enter the  second no: ");
        int num2 = sc.nextInt();
        int hcf=1;
        for(int i =1; i<= num|| i<=num2;i++){
            if(num%i==0 && num2%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf);


    }
}
