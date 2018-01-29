package MyPackage;

public class TestClass{
  static public void main(String[] args) {
    SimpleSphere ball;
    ball = new SimpleSphere(19.1);
    System.out.println("The volume of a sphere of radius "
      + ball.getRadius() + " inches is "
      + (float)ball.getVolume()
      + "cubic inches\n");
  } //end main
} //end TestClass
