import java.util.Scanner;
public class nbit1s0s {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        generatebinary(n,0,0,"");
    }
    public static void generatebinary(int n , int ones , int zeros, String result){
        if(result.length()==n){
            System.out.println(result);
            return;
        }
        generatebinary(n,ones+1 ,zeros,result+"1");
        if(zeros<ones){
            generatebinary(n,ones, zeros+1,result+"0");

        }
    }
}
