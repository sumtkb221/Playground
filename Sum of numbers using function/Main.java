import java.util.Scanner;
class Main{
    public static int sum_of_numbers(int m)
    {
      int sum = 0;
      while(m>0){
      sum = sum + m;
      m=m-1;  
      }
      return sum;
    }
	public static void main (String[] args){
	    // Type your code here
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum_of_num = sum_of_numbers(num);
        System.out.println(sum_of_num);
	}
}