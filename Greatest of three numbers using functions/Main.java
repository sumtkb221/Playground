import java.util.Scanner;
class Main{
    public static void greatest_of_three_numbers(int num1, int num2, int num3)
    {
      if((num1>num2)&&(num1>num3))
        System.out.println(num1);
      else if((num2>num1)&&(num2>num3))
        System.out.println(num2);
      else
        System.out.println(num3);
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      greatest_of_three_numbers(n1,n2,n3);
	}
}