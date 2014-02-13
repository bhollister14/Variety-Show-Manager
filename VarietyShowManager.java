//Brianna-Marie Hollister
//Feb. 5, 2014
//Variety Show Manager (File Writing Practice)

import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VarietyShowManager
{
  public static void main(String args[])throws IOException
  {
    Scanner kb = new Scanner(System.in);
    System.out.println("Please type the name of the file you wish to open.  If there is none, type 'none'.");
    String fileName = new String(kb.nextLine());
    if (fileName.equals("none"))
    {
      System.out.println("Enter file name:");
      fileName = kb.nextLine();
      File file = new File(fileName+".txt");
      file.createNewFile();
      FileWriter writer = new FileWriter(file);
      VSstartup.writeToFile(writer);
    }
    VSstartup.isCorrectFile(fileName);
    System.out.println(VSstartup.openFile(fileName));
  }
}