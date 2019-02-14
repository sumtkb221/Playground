import java.util.*;
class Main{
     public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int index=0; index<arr_size; index++)
        {
            arr[index]=in.nextInt();
        }
        int temp=1;
        int count=0;
        for(int index=0; index<arr_size; index++)
        {
            for(int index1=0; index1<arr_size; index1++)
            {
                if(temp!=arr[index1])
                  {
                    count++;  
                  }
            }
            if(count==arr_size)
               break;
            else
               temp++;
            
            count=0;   
        }
        System.out.print(temp);
     }
}