//Brianna-Marie Hollister
//Feb. 5, 2014
//Variety Show Manager (Start Up)

import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VSstartup
{
  public static void isCorrectFile(String fileName)throws IOException
  {
    /*checks if the file loading is the correct file to load.
     * if incorrect, moves to select another file or create new file.
     */
    Scanner kb1 = new Scanner(System.in);
    System.out.println(fileName+".txt will load. Is this the correct file? (Y/N)");
    String correctFile = new String(kb1.nextLine());
    if (correctFile.equals("N"))
    {
      selectOtherFile();
    }
    else openFile(fileName);
  }
  
  public static void selectOtherFile()throws IOException
  {  
    /*(!!)HAVE NOT FIGURED OUT HOW TO SEARCH FOR A FILE BY NAME
     * select between choices using "1" or "2".
     */
    Scanner kb2 = new Scanner(System.in);
    System.out.println("Would you like to (1) select other, or (2) create new?");
    String wantOtherFile = new String(kb2.nextLine());
    if (wantOtherFile.equals("1"))
    {
      System.out.println("Please select Y. This has not been figured out yet.");//!!!
    }
    //can create new file
    else if (wantOtherFile.equals("2"))
    {
      createOtherFile();
    }
  }
  
  public static void createOtherFile()throws IOException
  {
    Scanner kb3 = new Scanner(System.in);
    System.out.println("Enter file name:");
    File file = new File(kb3.nextLine()+".txt");
    file.createNewFile();
    FileWriter writer = new FileWriter(file);
  }
  
  public static String openFile(String fileName)throws IOException
  {
    FileReader fr = new FileReader(fileName+".txt"); 
    BufferedReader textReader = new BufferedReader(fr);
    String textData = new String();
    textData = textReader.readLine();
    textReader.close();
    return textData;
  }
  
  public static void writeToFile(FileWriter writer)throws IOException
  {
    writer.write("hi"); 
    writer.flush();
    writer.close();
  }
}