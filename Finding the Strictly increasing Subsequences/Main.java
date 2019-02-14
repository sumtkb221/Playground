import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index < arr_size; index++)
       {
          arr[index] = sc.nextInt();
       }
       for(int index =0; index <arr_size-1; index++)
       {
         for(int index1 =index+1; index1 <arr_size; index1++)
         {
           if((arr[index1]>arr[index])&&(arr[index1]>arr[index1-1]))
           {
             System.out.println(arr[index]+","+arr[index1]);
           }
         }
       }
   }
}