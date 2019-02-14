import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int i=0;i<arr_size;i++)
        {
          arr[i]=in.nextInt();
        }
        int i=0;
        while(arr[i]!=0){
          i++;
        }
       System.out.print(i);
    }
}