//Brianna-Marie Hollister
//Feb. 13, 2014
//Variety Show Manager (Writer)

import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class VSwriter
{
  public static void writeToFile(FileWriter writer, String str)throws IOException
  {
    writer.write(str); 
    writer.flush();
    writer.close();
  }
  
  public static void addActor(FileWriter writer)throws IOException
  {
    
  }
}