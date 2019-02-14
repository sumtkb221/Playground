import java.util.Scanner;
class Main{
    public static void prime_number(int m){
      int temp=1; int factors=0;
      while(temp<=m)
      {
        if(m%temp==0)
        {
          factors=factors+1;
        }
        temp++;
      }
      if(factors==2)
        System.out.println(m);
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int start_num=1;
        while(start_num<=num)
        {
          prime_number(start_num);
          start_num++;
        }
      
	}
}