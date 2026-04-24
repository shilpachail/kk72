import java.util.ArrayList;
import java.util.Scanner;
public class pascaltrianglerecurrsion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row: ");
        int num = sc.nextInt();
        ArrayList<Integer> row= getrow(num);
        for(int i=0; i<row.size() ; i++){
            if(i==row.size()-1){
                System.out.println(row.get(i));
            }
            else{
                System.out.print(row.get(i)+ " ,");
            }
        }


    }
    public static ArrayList<Integer> getrow(int index){
        ArrayList<Integer> currow = new ArrayList<>();
        currow.add(1);
        if(index==0){
            return currow;
        }
        ArrayList<Integer>prev= getrow(index-1);
        for(int i=1; i<prev.size();i++){
            int curr = prev.get(i-1)+prev.get(i);
            currow.add(curr);
        }
        currow.add(1);
        return currow;
    }
}
