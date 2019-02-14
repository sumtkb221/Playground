import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int mid = (rows + (rows-1))/2;

    for(int i=0;i<rows;++i)
    {
        for(int j=0;j<rows+(rows-1);++j)
        {
            if(j>=mid-i && j<=mid+i)
            {
                System.out.print(""); 
                System.out.print("*");
            }
           else
            {  
                System.out.print(" ");
            }
          
        }
        System.out.print("\n");
      }  
	}
}