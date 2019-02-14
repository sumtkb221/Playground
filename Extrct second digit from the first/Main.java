import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1=n;
        int count = 0;
        int Second_digit;
      while( n != 0)
      {
        n=n/10;
        count++;
      }
      int temp =1;
      while(temp < count-1)
      {
        n1=n1/10;
        temp++;
      }
      Second_digit = n1%10;
      
      System.out.println(Second_digit);
                                 
	}
}