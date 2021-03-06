//Brianna-Marie Hollister
//Feb. 13, 2014
//Variety Show Manager (File Writing Practice)

import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class VarietyShowManager
{
  int numActors;
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
      VSwriter.writeToFile(writer, "#name ~grade !scene %role &height *weight <measurements >notes");
    }
    VSstartup.isCorrectFile(fileName);
    String data = new String(VSstartup.openFile(fileName));
    // FOR TESTING System.out.println(VSstartup.openFile(fileName));
    
    int mainArray = 0;
    int subArray = 0;
    ArrayList<ArrayList<String>> cast = new ArrayList<ArrayList<String>>();
    String name = new String("");
    for (int i=0; i<data.length(); i++)
    {
      if (data.substring(i,i+1).equals("#"))
      {
        name = data.substring(i,name.indexOf("~"));
        cast.get(mainArray).add(name);
        mainArray++;
      }
    }
    String grade = new String("");
    for (int j=0; j<data.length(); j++)
    {
      if (data.substring(j,j+1).equals("~"))
      {
        grade = data.substring(j,grade.indexOf("!"));
        cast.get(mainArray).add(grade);
        mainArray++;
      }
    }
    //blah
    System.out.println(VSstartup.openFile(fileName));
  }
}