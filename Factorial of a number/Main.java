import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
       Scanner in = new Scanner(System.in);
       int num = in.nextInt();
       int factorial=1;
       for(int i = num; i>0; i--)
       {
         factorial=num*factorial;
         num=num-1;
       }
      System.out.println(factorial);
	}
}