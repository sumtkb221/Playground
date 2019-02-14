import java.util.Scanner;
class Main
{
  public static void check_list(int list[], int n)
  {
    int count = n/3; int temp=1; int sum = 0; int c=0; int s=0;
    int a[] = new int[count];
    for(int i=0; i<count; i++)
    {
      for(int j=(3*temp)-3;j<3*temp;j++)
      {
        sum = sum + list[j];
        s=sum;
      }
      a[i]=sum;
      
      sum=0;
      temp++;
    }
    for(int k=0; k<count; k++)
    {
      if(a[k]==s)
        c++;
    }
    if(c==count)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int index = 0; index < n; index++)
    {
      list[index] = in.nextInt();
    }
    check_list(list, n);
  }
}