import java.util.*;
 class Main
{
   public static void main(String args[])
   {
      String str, rev = "";
      Scanner in = new Scanner(System.in);
    
      str = in.nextLine();
     
      int str_len = str.length();
     
      for (int i = str_len - 1; i >= 0; i--)
         rev = rev + str.charAt(i);
         
      if (str.equals(rev))
         System.out.println("Yes");
      else
         System.out.println("No");
         
   }
}      