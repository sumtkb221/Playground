import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int num1=num;
        int factorial=1;
        int factorial1=0;
        while(num!=0)
        {
          int digit = num%10;
          for(int i = digit; i>0; i--)
          {
            factorial=digit*factorial;
            digit=digit-1;
          }
          factorial1=factorial+factorial1;
          factorial=1;
          num=num/10;
          
        }
      if(factorial1==num1)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}