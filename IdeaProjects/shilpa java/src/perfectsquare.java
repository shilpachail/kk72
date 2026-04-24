import java.util.Scanner;
public class perfectsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int num = sc.nextInt();
        int m = (int)Math.sqrt(num);
        if(num ==(m*m)){
            System.out.println("perfect square");
        }
        else{
            System.out.println("not a perfecct square");
        }
}
}


