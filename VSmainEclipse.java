import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/* open castList
 * extract text from castList
 *  groups will have one number
 *  the rest of the data will follow in their own indexes
 * sort
 *  >by last name
 *  >by first name
 *  >by scene
 *  >by grade
 */

public class VSmainEclipse 
{
 public static void main(String[] args) throws IOException
 {
  //have you created a file?
  Scanner kb = new Scanner(System.in);
  System.out.println("Have you previously created a file? (Y/N)");
  String fileYN = new String(kb.nextLine());
  String filename = new String("");
  //>yes: please enter filename here, open that file, extract existing info
  if (fileYN.equals("Y"))
  {
   System.out.println("Please enter file name:");
   filename = kb.nextLine();
  }
  //>no: please enter filename here, create that file, open it, write default info
  else if (fileYN.equals("N"))
  {
   System.out.println("Please enter a file name:");
   filename = kb.nextLine();
   File file = new File(filename+".txt");
   file.createNewFile();
  }
  FileReader fr = new FileReader(filename+".txt");
  BufferedReader textReader = new BufferedReader(fr);
  String textData = new String();
  textData = textReader.readLine();
  textReader.close();
  //one filename, one filewriter, one filereader
  System.out.println(textData);
  
  //here's where i start doing weird things
  ArrayList<String[]> castList = new ArrayList<String[]>();
  String[] actorDataOne = new String[8];
  castList.add(actorDataOne);
  System.out.println("What would you like to do? (ADD ACTOR)");
  String action = kb.nextLine();
  if (action.equals("add actor"))
  {   
   //only works if the ArrayList is empty
   System.out.println("Actor name:");
   castList.get(0)[0]=kb.nextLine();
   System.out.println("Actor scene:");
   castList.get(0)[1]=kb.nextLine();
   System.out.println("Actor role:");
   castList.get(0)[2]=kb.nextLine();
   System.out.println("Actor grade:");
   castList.get(0)[3]=kb.nextLine();
   System.out.println("Actor height:");
   castList.get(0)[4]=kb.nextLine();
   System.out.println("Actor weight:");
   castList.get(0)[5]=kb.nextLine();
   System.out.println("Actor measurements:");
   castList.get(0)[6]=kb.nextLine();
   System.out.println("Actor notes:");
   castList.get(0)[7]=kb.nextLine();
  }
  String output = new String("");
  for (String element:castList.get(0))
  {
   output+=element;
  }
  System.out.println(output);
  
  //this part of code should be going back to the loop
  System.out.println("What would you like to do? (SAVE)");
  action = kb.nextLine();
  if (action.equals("save"))
  {
   
  }
 }
}
