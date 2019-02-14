import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1=n;
        int count = 0;
        int last_digit = n%10;
      while( n != 0)
      {
        n=n/10;
        count++;
      }
      int temp =1;
      while(temp < count)
      {
        n1=n1/10;
        temp++;
      }
      
      int sum = n1+last_digit;
      System.out.println(sum);
                                 
	}
}