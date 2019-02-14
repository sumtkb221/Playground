import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(); int n1;
    if(n<0)
    {
        n1=(-1)*n;
    }
    else
    {
        n1=n;
    }
    int temp = n1;
    int count = 0;
    while(n1 > 0)
    {
        count++;
        n1 = n1/10;
    }
    char str[] = new char[count];
    count = count - 1;
    while(temp > 0)
    {
      char ch = (char)((temp % 10) + '0');
      str[count] = ch;
      temp /= 10;
      --count;   
    }
    if(n>0)
        System.out.print(str);
    else
    {
        System.out.print('-');
        System.out.print(str);
    }
  }
}