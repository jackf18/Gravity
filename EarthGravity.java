/**
* 
* Determines the acceleration due to gravity at some distance
* from the center of the earth.  The distance is read as input
* from the user.
*
* @author <Jack Flaherty>
*/

import java.util.Scanner;

public class EarthGravity{

   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      double G      = 6.673e-11;
      double M      = 5.972e24;
      double accelerationGravity = 0.0;
      
      System.out.println("What is the distace from the center of the earth to the surface (meters)?");
      double distanceCenter = scnr.nextDouble();
      accelerationGravity = (G * M) / (distanceCenter * distanceCenter);
      System.out.println("The acceleration of gravity is " + accelerationGravity +" m/s/s");
      
      
      
      
      }
      
}