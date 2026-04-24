import java.util.Scanner;
public class stringlengthrecurrsion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the 1no: ");
        String len1 = sc.nextLine();
        System.out.println(length(len1));
    }
    public static int length(String len1 ){
        if(len1.equals("")){
            return 0;
        }
        return 1 + length(len1.substring(1));
    }
}