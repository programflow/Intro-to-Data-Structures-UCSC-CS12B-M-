//---------------------------------------------------------------
// Kevin Flores (kerflore)
// ID#: 1340020
// Due: 01/23/2018
// FileReverse.java
// Takes a file and reverse all the words in the file and
// saves them on to a new file.
//---------------------------------------------------------------
import java.io.*;
import java.util.Scanner;

class FileReverse{
  //Recursive method for reversing Strings or string arrasy
  public static String stringReverse(String s, int n){
    if(n < 1){
      return "";
    }
    //create a new string since they are immutable arrays
    char letter = s.charAt(n-1); //charAt calls string element at n-1 at sets it to letter
    return letter + stringReverse(s, n-1); //calls on itself to attach 2nd to last char to new string

  }
  public static void main(String[] args) throws IOException{

    Scanner in = null;
    PrintWriter out = null;
    String line = null;
    String[] token = null;
    int i, n, lineNumber =0;
    // check number of command line arguments is at least 2
    if(args.length < 2){
      System.out.println("Usage: FileCopy <input file> <output file>");
      System.exit(1);
    }
    // open files
    in = new Scanner(new File(args[0]));
    out = new PrintWriter(new FileWriter(args[1]));

    while( in.hasNextLine() ){
      lineNumber++;
      // trim leading and trailing spaces,
      // then add one trailing space so
      // split works on blank lines
      line = in.nextLine().trim() + " ";

      // split line around white space
      token = line.split("\\s+");

      // print out tokens in reverse
      n = token.length;
      for(i=0; i<n; i++){

        out.println(" " + stringReverse(token[i], token[i].length() ) );
      }
    }
    // close files
    in.close();
    out.close();
  }
}
