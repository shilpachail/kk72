import java.util.Scanner;
public class hexadecimaltodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the  no: ");
        String num = sc.nextLine();
        int sum=0;
        int power=0;
        for(int i =num.length()-1; i>=0 ; i--){
            char ch = num.charAt(i);
            int value= Character.getNumericValue(ch);
            sum += value * Math.pow(16,power);
            power++;


        }
        System.out.println(sum);

    }
}
