import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int index = 0;index < n; index++)
    {
      list[index] = sc.nextInt();  
    }
    sort(n,list);
  }
 public static void sort(int n, int list[])
 {
   for(int i = 0; i <= (n/2)-2; i++)
   {
     for(int j = 0; j<= (n/2)-2-i; j++)
     {
       if(list[j] > list[j+1])
       {
         int temp = list[j];
         list[j] = list[j+1];
         list[j+1] = temp;
       }
     }
   }
   int k=0;
   for(int i = (n/2); i <=n-2; i++)
   {
     for(int j = (n/2); j <= n-2-k; j++)
     {
       if(list[j] < list[j+1])
       {
         int temp = list[j];
         list[j] = list[j+1];
         list[j+1] = temp;
       }
     }
     k++;
   }
   for(int i = 0; i < n; i++)
   System.out.print(list[i]+" ");
 }
}
