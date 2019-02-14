import java.util.Scanner;
class Main
{
    public static int square_of_number(int m)
    {
      return m*m;
    }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int sq_of_num = square_of_number(num);
      System.out.println(sq_of_num);
	} 
}