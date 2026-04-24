import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the year: ");
        int year = sc.nextInt();
        if(year%400==0){
            System.out.println("yes it is a leap year");
        }
        else if((year%4==0) && (year%100!=0)){
            System.out.println("yes it is a lepa year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}

