//---------------------------------------------------------------
// Kevin Flores (kerflore)
// ID#: 1340020
// Due: 01/15/2018
// HelloUser2.java
// Prints a different greeting to stdout, then prints out some nonsense.
//---------------------------------------------------------------

class HelloUser2{
  public static void main( String[] args ){
    String userName = System.getProperty("user.name");
    String bird = "bird is the word!!!";
    System.out.println( "Hola " + userName + " Buen Senor");
    System.out.println( bird );
  }
}
