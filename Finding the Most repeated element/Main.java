import java.util.*;
class Main{
     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int count=1;
        int i,j;
        int temp[] = new int[1];
        int max=0;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]-arr[j]==0)
                {
                    count++;
                }
                else
                {
                    count=count;
                }
            }
            if(count>max)
            {
                max=count;
                temp[0]=arr[i];
            }
            else
            {
                max=max;
            }
            count=1;
        }
        System.out.print(temp[0]);
     }
}