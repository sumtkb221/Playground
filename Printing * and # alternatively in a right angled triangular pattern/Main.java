import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("*");
        System.out.println("#*");
        for(int i=3; i<=n; i++)
        {
          for(int j=1; j<=n; j++)
          {
            if(j<=i)
            {
              if((i%3 != 1) && (i%3 != 2))
              {
                if(j%2==0)
                  System.out.print("*");
                else
                  System.out.print("#");
              }
              else
              {
                if(j%2==0)
                  System.out.print("#");
                else
                  System.out.print("*");
              }
            }     
          }
          System.out.print("\n");
        }
	}
}
