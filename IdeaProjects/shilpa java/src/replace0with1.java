import java.util.Scanner;
public class replace0with1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no : ");
        int num = sc.nextInt();
        int place=1;
        int result=0;
        while(num!=0){

            int rem = num%10;
            if(rem==0){
                rem=1;
            }
            result += rem*place;
            place*=10;
            num/=10;

        }
        System.out.println(result);


    }
}
