//---------------------------------------------------------------
// Kevin Flores (kerflore)
// ID#: 1340020
// Due: 01/19/2018
// Recursion.java
// A series of different methods that call on themselves
//---------------------------------------------------------------

public class Recursion{

  // reverses the order of the array by moving down the array from right to left
  static void reverseArray1(int[] X, int n, int[] Y){
    if( n > 0){
      Y[X.length - n] = X[n-1]; //sets the rightmost element of X equal to the leftmost element of Y
      reverseArray1(X, n-1, Y); //calls on itself to get the next rightmost
    }
  }

  //reverse the order of the array by moving down the array from left to right
  static void reverseArray2(int[] X, int n, int[] Y){
    if( n > 0){
      reverseArray2(X, n-1, Y); //calls on itself to get the next leftmost
      Y[n -1] = X[X.length-n];//sets the leftmost element of X equal to the rightmost element of Y
    }
  }

  // reverse array but simply swapping the outermost elements and working towards the middle
  static void reverseArray3(int[] X, int i, int j){
    int x; //initialize a place holdeer
    if( i< j-i){
      x = X[i]; //set leftmost element in a placeholder
      X[i] = X[j-i]; //replace rightmost element with leftmost element
      X[j-i] = x; //set placeholder in the rightmost element
      reverseArray3(X, i+1, j);
    }
  }

  static int maxArrayIndex(int[] X, int p, int r){
    int q;
    int max;
    if (p < r){
      q = (p + r)/2;
      int max1 = maxArrayIndex(X, p, q);
      int max2 = maxArrayIndex(X, q+1, r);
      if(X[max1] > X[max2]){
        max = max1;
      } else{
        max = max2;
      }
      return max;
    } else{
      return max=p;
    }
  }

  static int minArrayIndex(int[] X, int p, int r){
    int q;
    int min;
    if (p < r){
      q = ( p + r)/2;
      int min1 = minArrayIndex(X, p, q);
      int min2 = minArrayIndex(X, q+1, r);
      if (X[min1] < X[min2]){
        min = min1;
      } else{
        min = min2;
      }
      return min;
    } else{
      return min = p;
    }
  }


  public static void main(String[] args){

    int[] A = {-1, 2, 6, 12, 9, 2, -5, -2, 8, 5, 7};
    int[] B = new int[A.length];
    int[] C = new int[A.length];
    int minIndex = minArrayIndex(A, 0, A.length-1);
    int maxIndex = maxArrayIndex(A, 0, A.length-1);

    for(int x: A) System.out.print(x + " ");
    System.out.println();

    System.out.println( "minIndex = " + minIndex );
    System.out.println( "maxIndex = " + maxIndex );

    reverseArray1(A, A.length, B);
    for(int x: B) System.out.print(x + " ");
    System.out.println();

    reverseArray2(A, A.length, C);
    for(int x: C) System.out.print(x + " ");
    System.out.println();

    reverseArray3(A, 0, A.length-1);
    for(int x: A) System.out.print(x + " ");
    System.out.println();
  }

}
