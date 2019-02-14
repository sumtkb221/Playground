import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int idx=0; idx<arr_size; idx++)
        {
          arr[idx] = in.nextInt();
        }
        int search_elem_1 = in.nextInt();
        int search_elem_2 = in.nextInt();
        int is_present_1=0;
        int is_present_2=0;
        int idx;
        for(idx = 0; idx<arr_size; idx++)
        {
          if(search_elem_1 == arr[idx])
          {
            is_present_1=1;
            break;
          }
        }
      if(is_present_1==1)
        System.out.println(idx);
      else
        System.out.println("-1");
      for(idx = 0; idx<arr_size; idx++)
        {
          if(search_elem_2 == arr[idx])
          {
            is_present_2 = 1;
            break;
          }
        }
      if(is_present_2==1)
        System.out.println(idx);
      else
        System.out.println("-1");
    }
}