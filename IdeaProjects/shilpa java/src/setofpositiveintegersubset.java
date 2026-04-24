import java.util.ArrayList;
import java.util.Scanner;
public class setofpositiveintegersubset {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }
        ArrayList<Integer>current = new ArrayList<>();
        subset(arr,0, current);
    }
    public static void subset(int[] arr, int index ,ArrayList<Integer> current){
        if(index==arr.length){
            System.out.println(current);
            return ;
        }
        current.add(arr[index]); //write the number
        subset(arr,index+1,  current);//go forward
        current.remove(current.size()-1);//erase it before trying the next path
        subset(arr, index+1,current);
    }
}
