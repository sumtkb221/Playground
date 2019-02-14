import java.util.*;
class Main
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String sub_str = in.nextLine();
      
      int str_len = str.length();
      int sub_str_len = sub_str.length();
      
      int count=0; int sub_str_count = 0;
      int k=0;
      for(int i=0 ; i<(str_len-sub_str_len+1); i++)
      {
          for(int j=i ; j<sub_str_len+i; j++)
          {
             if(str.charAt(j)==sub_str.charAt(k))
             {
                count++;
             }
            k++;
          }
          if(count==sub_str_len)
          {
              sub_str_count++;
          }
          k=0;count=0;
      }         
      System.out.print(sub_str_count);
   }
}      