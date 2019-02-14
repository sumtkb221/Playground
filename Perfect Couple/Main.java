import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      int i,j;
      for(i=0;i<arr_size;i++)
      {
        arr[i] = in.nextInt();
      }
      int value = in.nextInt();
      for(i=0;i<arr_size-1;i++)
      {
        for(j=i+1;j<arr_size;j++)
        {
          if(arr[i]+arr[j]==value)
          {
            System.out.println(arr[i]+","+" "+arr[j]);
          }
        }
      }
    }
}