import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1=n;
        int n2=n1%10;
        int n3=n1/10;
        int count = 0;
        int Sum;
        int temp =1;
      while( n != 0)
      {
        n=n/10;
        count++;
      }
      while(temp < count)
      {
        
        n2= n2 + (n3%10);
        n3 = n3/10;
        temp++;
      }
      Sum = n2;
      System.out.println(Sum);
	}
}