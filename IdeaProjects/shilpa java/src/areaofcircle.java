import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no : ");
        int r = sc.nextInt();
        double pi=3.14;
        double area= pi*r*r;
        System.out.println(area);
}
}
