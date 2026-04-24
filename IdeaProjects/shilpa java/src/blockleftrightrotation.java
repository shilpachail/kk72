import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class blockleftrightrotation {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        ArrayList<Integer>original= new ArrayList<>();
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            original.add(sc.nextInt());
        }
        System.out.println("enter the rotation");
        int r=sc.nextInt();

        ArrayList<Integer> leftList = new ArrayList<>(original);
        for(int i=0;i<r;i++){
            int first =leftList.remove(0);
            leftList.add(first);
        }

        ArrayList<Integer> rightList = new ArrayList<>(original);
        for(int i=0;i<r;i++) {
            int last = rightList.remove(n - 1);
            rightList.add(0, last);
        }

        System.out.println("right array");
        for(int val:rightList){
            System.out.println(val);
        }
        System.out.println("left array");
        for(int val:leftList){
            System.out.println(val);
        }
    }

}
