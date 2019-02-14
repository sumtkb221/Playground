import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int index=0; index<arr_size; index++)
        {
            arr[index]=in.nextInt();
        }
        int temp=arr_size-1;
        int count=0;
        for(int index=0; index<arr_size/2; index++)
        {
            if(arr[index]==arr[temp])
            {
                count++;
            }
            temp--;
        }
        if(count==(arr_size/2))
           System.out.print("Yes");
        else
           System.out.print("No");
    }
}