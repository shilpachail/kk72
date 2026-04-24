import java.util.Scanner;
public class sumofnoinarange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("enter the ending number: ");
        int num = sc.nextInt();
        int sum =0;
        for(int i=start; i<=num ; i++){
            sum = sum+i;
        }
        System.out.print("sum of first n natural number is: ");
        System.out.println(sum);
    }
}
