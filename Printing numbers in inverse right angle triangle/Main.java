import java.util.*;
public class Main{

     public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp1=n;
        int temp2=n;
        for(int row_no=1; row_no<=n; row_no++)
        {
            for(int col_no=1; col_no<=(n-(row_no-1)); col_no++)
            {
                 System.out.print(temp1--);
            }
            temp1=--temp2;
            System.out.print("\n");
        }
     }
}