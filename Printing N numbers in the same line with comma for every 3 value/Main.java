import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int num_count = 1; num_count <= n; num_count++)
    {
      System.out.print(num_count);
      if((num_count % 3 == 0) && (num_count != n))
        System.out.print(",");
    }
  }
}