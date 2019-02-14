import java.util.*;
class Main{
     public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int index=0; index<n; index++)
        {
            a[index]=in.nextInt();
        }
        int count=0;
        for(int i=1;i<=k;i++)
        {
          for(int j=0;j<n;j++)
          {
            if(i==a[j])
            {
               count++;    
            }
          }
          System.out.println(i+" "+count);
          count=0;
        }
     }
}