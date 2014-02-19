//Brianna-Marie Hollister
//Feb. 13, 2014
//Variety Show Manager (Start Up)

import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//NO WAY TO CHECK IF THE FILE EXISTS
//FEARED CRASH IF INPUT OF NONEXISTING FILE

public class VSstartup
{
  public static void isCorrectFile(String fileName)throws IOException
  {
    /*checks if the file loading is the correct file to load.
     * if incorrect, moves to select another file or create new file.
     */
    //asks if correct file
    Scanner kb1 = new Scanner(System.in);
    System.out.println(fileName+".txt will load. Is this the correct file? (Y/N)");
    //user inputs answer Y/N
    String correctFile = new String(kb1.nextLine());
    //if N, see selectOtherFile
    if (correctFile.equals("N"))
    {
      selectOtherFile();
    }
    //else, opens the file (openFile method at the bottom)
    else openFile(fileName);
  }
  
  public static void selectOtherFile()throws IOException
  {  
    //allows user to select a different file than the default
    Scanner kb2 = new Scanner(System.in);
    System.out.println("Would you like to (1) select other, or (2) create new?");
    //asks user for action, choose existing or make new
    String wantOtherFile = new String(kb2.nextLine());
    //confirms file from chooseFile
    if (wantOtherFile.equals("1"))
    {
      isCorrectFile(chooseFile());
    }
    //see createOtherFile
    else if (wantOtherFile.equals("2"))
    {
      createOtherFile();
    }
  }
  
  public static String chooseFile()throws IOException
  {
    //asks user for name of existing file
    Scanner kb4 = new Scanner(System.in);
    System.out.println("Please type the name of the file you wish to open (omit '.txt').  If there is none, type 'none'.");
    return kb4.nextLine();
    //returns the name of desired file
  }
  
  public static void createOtherFile()throws IOException
  {
    //creates a new file with name as entered by user
    Scanner kb3 = new Scanner(System.in);
    //user inputs desired name of new file
    System.out.println("Enter file name:");
    File file = new File(kb3.nextLine()+".txt");
    System.out.println(file+" will open.");
    //creation of a new file
    file.createNewFile();
  }
  
  public static String openFile(String fileName)throws IOException
  {
    //extracts the text from the file and returns it as a single string
    FileReader fr = new FileReader(fileName+".txt"); 
    BufferedReader textReader = new BufferedReader(fr);
    String textData = new String();
    //new string takes the value of all text in the file
    textData = textReader.readLine();
    textReader.close();
    return textData;
  }
}