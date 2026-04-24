import java.util.Scanner;
public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the  first no: ");
        int x = sc.nextInt();
        System.out.print("enter the  second no: ");
        int y = sc.nextInt();
        if(x>0&& y>0){
            System.out.println("lies in the first quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("lies in the second quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("lies in the third quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("lies in the fourth quadrant");
        }
        else if(x==0 && y==0){
            System.out.println("lies in the orgin");
        }
    }
}

