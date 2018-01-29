// ReverseCommandLineArguments.java

class ReverseCommandLineArguments{
  public static void main(String[] args){
    int n = args.length;
    System.out.println("args.length = " + n);
    for(int i = args.length -1 ; i >= 0; i-- ) System.out.println(args[i]);
  }
}
