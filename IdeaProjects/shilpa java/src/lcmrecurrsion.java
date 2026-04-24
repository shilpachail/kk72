import java.util.Scanner;
public class lcmrecurrsion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the 1no: ");
        int num = sc.nextInt();
        System.out.print("enter the 2no: ");
        int temp= sc.nextInt();
        int Hcf =hcf(num , temp );
        int lcm =(num*temp)/Hcf;
        System.out.println(lcm);

    }
    public static int hcf(int num,int num2){
        if(num2==0)
            return num;

        return hcf(num2 , num%num2);
    }


}
