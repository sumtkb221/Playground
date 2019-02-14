import java.util.*;
class Main{
     public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int index=0; index<n; index++)
        {
            a[index]=in.nextInt();
        }
        int k = in.nextInt();
        int t=0;
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]<a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.print(a[k-1]);
     }
}