package MyPackage;
import java.lang.Math;

public class SimpleSphere {
  private double radius;
  public static final double DEFAULT_RADIUS = 1.0;
  public SimpleSphere() {
    radius = DEFAULT_RADIUS;
  } // end default constructor
  public SimpleSphere(double initialRadius) {
    radius = initialRadius;
  } // end constructor
  public double getRadius() {
    return radius;
  } // end getRadius
  public double getVolume() {
  // Computes the volume of the shpere
    double radiusCubed = radius  * radius * radius;
    return 4 * Math.PI * radiusCubed / 3;
  } // end getVolume
} // end SimpleSphere
