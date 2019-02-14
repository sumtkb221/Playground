import java.util.Scanner;
class Main{
    public static void main(String args[])
    { 
      	Scanner in = new Scanner(System.in);	
		String inputString = in.nextLine();
		String[] words = inputString.split("\\s");
		String outputString = "";
		for (int i = words.length-1; i >= 0; i--)
		{
			outputString = outputString + words[i] + " ";
		}
		System.out.println(outputString);
    }
}