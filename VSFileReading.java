//Brianna-Marie Hollister
//January 30, 2014
//Variety Show Manager (File Writing Practice)

import java.util.Scanner;
import java.io.FileWriter;

public class VSFileReading
{
  public static void main(String[] args) 
  {
    Scanner kb = new Scanner(System.in);
    String command = new String(kb.nextLine());
    FileWriter out = new FileWriter("castList.txt");
    try
    {
      out = new FileWriter("test.txt", true);
      out.write(command, 0, command.length());
      out.close();
    }
    catch(IOException i)
    {
      System.out.println("Error: " + i.getMessage());
    }
  }
}