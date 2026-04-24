import java.util.Scanner;
public class stringduplicaterecurrsion {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        String n = sc.nextLine();
        String result= removeduplicate(n,0);
        System.out.println(result);
    }
    public static String removeduplicate(String s , int index){
        if(s.length() <= 1 || index >= s.length() - 1){
            return s;
        }
        if(s.charAt(index)== s.charAt(index+1)){
            String remaning= s.substring(0,index)+s.substring(index+2);
            return removeduplicate(remaning, Math.max(0,index-1));
        }
        return removeduplicate(s, index+1);

    }
}


