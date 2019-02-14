import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    int copy_list[] = new int[n];
    int t;
    int index;
    for(index = 0; index < n; index++)
    {
      list[index] = in.nextInt();
      copy_list[index] = list[index];
    }
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n-1-i; j++)
        {
            if(list[j]<list[j+1])
            {
                t=list[j];
                list[j]=list[j+1];
                list[j+1]=t;
            }
        }
    }
    for(int i=0; i<n ; i++)
    {
        if(copy_list[i]==list[0])
          {
              index=i;
              break;
          }
    }
    System.out.println(index);
  }
}