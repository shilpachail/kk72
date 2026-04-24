import java.util.Scanner;
public class noofdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the month: ");
        int month = sc.nextInt();
        System.out.print("enter the year : ");
        int year = sc.nextInt();
        if((month==2 )&&((year%4==0) ||((year%100!=0) && (year%400==0)))) {
            System.out.println("29 days");
        }
        else if(month==2){
            System.out.println("28 days");
        }
        else if(month==1||month==3||month==7||month==8||month==10||month==12){
            System.out.println("31 days");
        }
        else{
            System.out.println("30 days");
        }
    }
}
