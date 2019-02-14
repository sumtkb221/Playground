import java.util.*;
class Main{

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int row_no=1; row_no<=((n/2)+1); row_no++)
        {
            for(int space=1; space<=(row_no-1); space++)
            {
                System.out.print(" ");
            }
            for(int col_no=1; col_no<=(n-2*(row_no-1)); col_no++)
            {
                if((col_no>1) && (col_no<(n-2*(row_no-1))))
                    System.out.print(" ");
                else
                     System.out.print("*");
            }
         System.out.print("\n");
        }
        for(int row_no=1; row_no<=(n/2); row_no++)
        {
            for(int space=1; space<=((n/2)-row_no); space++)
            {
                System.out.print(" ");
            }
            for(int col_no=1; col_no<=((2*row_no)+1); col_no++)
            {
                if((col_no>1) && (col_no<((2*row_no)+1)))
                    System.out.print(" ");
                else
                     System.out.print("*");
            }
         System.out.print("\n");
        }
     }
}