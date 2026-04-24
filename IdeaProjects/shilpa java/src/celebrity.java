import java.util.*;
public class celebrity {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Stack<Integer> v= new Stack<>();

        for(int i=0; i<n;i++) {
            v.push(i);
        }
            while(v.size()>=2){
              int i=  v.pop();
              int j=  v.pop();

              if(arr[i][j]==1){
                 // if i kknow j then i is not celebriyt
                  v.push(j);
              }
              else{
                  v.push(i);
              }

              int pot=v.pop();
              for(int p =0 ; i<n  ;i++){
                  if(p!=pot){
                      if(arr[p][pot]==0 || arr[pot][p]==1){
                          System.out.println("none");
                          return;
                      }
                  }
              }
                System.out.println(pot);
            }



    }
}