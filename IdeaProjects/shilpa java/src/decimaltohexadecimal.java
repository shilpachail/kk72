import java.util.Scanner;
public class decimaltohexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the  no: ");
        int num = sc.nextInt();
        int i=0;
        char [] hex = new char[20];
        for( i=0; num>0 ; i++){
            int rem= num%16;
            if(rem<10){
                hex[i]=(char)(rem+'0');
            }
            else{
                hex[i]=(char)(rem-10 + 'A');
            }

            num/=16;
        }
        for (int j =i-1; j>=0; j--){
            System.out.print(hex[j]);

        }

    }
}
