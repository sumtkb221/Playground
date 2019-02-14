import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      int arr1[] = new int[arr_size];
      int i,j;
      for(i=0;i<arr_size;i++)
      {
        arr[i] = in.nextInt();
      }
     
      j=0;
      for(i=0;i<arr_size;i++)
      {
        if(arr[i]!=0){
        arr1[j]=arr[i];
        j++;
        }
      }
      
      for(i=0;i<arr_size;i++){
        System.out.print(arr1[i] + " ");
      }
  }
}