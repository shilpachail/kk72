import java.util.Scanner;
import java.util.Arrays;
public class checkstringsareanagramsornot {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str1 = sc.nextLine();
        System.out.println("Enter the string ");
        String str2 = sc.nextLine();
        if(str1.length()!= str2.length()){
            System.out.println("not an anagram");
        }
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("it is a anargam");
        }
        else{
            System.out.println("it is not a anargam");
        }
    }
}
