//Brianna-Marie Hollister
//Feb. 5, 2014
//Variety Show Manager (Start Up)

import java.util.Scanner;
import java.io.*;

public class VSstartup
{
  public void isCorrectFile(String fileName)throws IOException
  {
    /*checks if the file loading is the correct file to load.
     * if incorrect, moves to select another file or create new file.
     */
    Scanner kb1 = new Scanner(System.in);
    System.out.println(fileName+" will load. Is this the correct file? (Y/N)");
    String correctFile = new String(kb1.nextLine());
    if (correctFile.equals("N"))
    {
      selectOtherFile();
    }
  }
  
  public void selectOtherFile()throws IOException
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
  public void createOtherFile()throws IOException
  {
    Scanner kb3 = new Scanner(System.in);
    System.out.println("Enter file name:");
    File file = new File(kb3.nextLine()+".txt");
    file.createNewFile();
    FileWriter writer = new FileWriter(file);
  }
}