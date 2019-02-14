import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        int odd_pos[] = new int[arr_size];
        int copy_odd[] = new int[arr_size];
        int even_pos[] = new int[arr_size];
        int i; int j=0; int k=0;
        
        for(i=0;i<arr_size;i++)
        {
          arr[i] = in.nextInt();
        }
        int no_of_rotation = in.nextInt();
        
        for(i=0;i<arr_size;i++)
        {
          if(i%2==0)
          {
            odd_pos[j] = arr[i];
            copy_odd[j] = arr[i];
            j++;
          }
          else
          {
            even_pos[k] = arr[i];
            k++;
          }
        }
        
        int temp = 0;
        for(i=1;i<=no_of_rotation;i++)
        {
         temp = odd_pos[j-1]; 
         for(int index=1;index<j;index++)
         {
             odd_pos[index]=copy_odd[index-1];
         }
         odd_pos[0] = temp;
         for(int index=0;index<j;index++)
         {
             copy_odd[index] = odd_pos[index];
         }
        }
        for(i=1;i<=no_of_rotation;i++)
        {
         temp = even_pos[0]; 
         for(int index=1;index<=k;index++)
         {
             even_pos[index-1]= even_pos[index];
         }
         even_pos[--k] = temp;
         ++k;
        }
        j=0;k=0;
        for(i=0;i<arr_size;i++)
        {
            if(i%2==0)
            {
                arr[i]=odd_pos[j];
                j++;
            }
            else
            {
                arr[i]=even_pos[k];
                k++;
            }
        }
        for(i=0;i<arr_size;i++)
        {
            System.out.print(arr[i] + " ");
        }
  	}
}