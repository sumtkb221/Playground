import java.util.*;
class Main
{
  public static int power(int bse, int exp)
  {
    int pow=1;
    while(exp>0)
    {
      pow = pow*bse;
      exp=exp-1;
    }
    return pow;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int base=in.nextInt();
    int exponent=in.nextInt();
    int power_of_number=power(base,exponent);
    System.out.println(power_of_number);
  }
}
