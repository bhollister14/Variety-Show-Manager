//http://www.tutorialspoint.com/java/java_filewriter_class.htm
//a lot of code was from this website (writing to and reading from text files

import java.io.*;
import java.util.Scanner;

public class FileRead{
   public static void main(String args[])throws IOException{
//CREATE THE FILE
      File file = new File("castList.txt");
      // creates the file
      file.createNewFile();
      // creates a FileWriter Object
      FileWriter writer = new FileWriter(file); 
      // Writes the content to the file
      Scanner kb = new Scanner(System.in);
//WRITE TO THE FILE
      if (kb.nextLine().equals("add person"))
      {
      writer.write(kb.nextLine()); 
      writer.flush();
      writer.close();
      }
//READ THE FILE
      //Creates a FileReader Object
      FileReader fr = new FileReader(file); 
      char [] a = new char[50];
      fr.read(a); // reads the content to the array
      for(char c : a)
          System.out.print(c); //prints the characters one by one
      fr.close();
   }
}