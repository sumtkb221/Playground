import java.util.Scanner;
public class Main{
    public static void gcd(int num1, int num2, int num3)
    { 
      int min,g_c_d=1;
      if((num1>num2)&&(num1>num3))
        min=num1;
      else if((num2>num1)&&(num2>num3))
        min=num2;
      else
        min=num3;
      while(min!=0)
      {
        if((num1%min==0)&&(num2%min==0)&&(num3%min==0))
        { 
          g_c_d=min;
          break;
        }
        min--;
      }
      System.out.println(g_c_d);
    }
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        gcd(n1,n2,n3);
	}
}