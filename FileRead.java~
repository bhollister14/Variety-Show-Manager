//http://www.tutorialspoint.com/java/java_filewriter_class.htm
//a lot of code was from this website (writing to and reading from text files

import java.io.*;
import java.util.Scanner;

public class FileRead{
  //public static void main(String args[])throws IOException{
  public static void createNewFile(String fileName)throws IOException{
//CREATE THE FILE
    File file = new File(fileName+".txt");
    // creates the file
    file.createNewFile();
    // creates a FileWriter Object
    FileWriter writer = new FileWriter(file); 
    // Writes the content to the file
  }
  public void writeToFile(FileWriter writer)throws IOException{
//WRITE TO THE FILE
    Scanner keyb = new Scanner(System.in);
    if (keyb.nextLine().equals("add person"))
    {
      writer.write(keyb.nextLine()); 
      writer.flush();
      writer.close();
    }
  }
  public void readFile(File file)throws IOException{
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