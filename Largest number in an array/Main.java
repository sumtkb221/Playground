import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        int i,j,temp;
        for(i=0;i<arr_size;i++)
        {
          arr[i]= in.nextInt();
        }
        for(i=0;i<arr_size;i++)
        {
          for(j=0;j<arr_size-1-i;j++)
          {
            if(arr[j]>arr[j+1])
            {
              temp=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
            }
          }
        }
      System.out.println(arr[arr_size-1]);
    }
}