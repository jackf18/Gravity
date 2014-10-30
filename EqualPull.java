/**
* 
* Determines the distance at which the pulling force between two
* bodies is exactly equal.  
*
* Takes as input the mass of one body, the mass of the other, and
* the distance between the two bodies.
*
* @author <Jack Flaherty>
*/

import java.util.Scanner;

   public class EqualPull {
      public static void main(String[] args){
      
      Scanner scnr = new Scanner(System.in);
     
      double distRatio1 = 0.0;
      double distRatio2 = 0.0;
      double distance1 = 0.0;
      double distance2 = 0.0;
      double dist1 = 0.0;
      double dist2 = 0.0;
      double fdist1 = 0.0;
      double fdist2 = 0.0;
      double finalDist1 = 0.0;
      double finalDist2 = 0.0;
      double finalDist = 0.0;
      System.out.println("Enter the mass of the larger celestial body (kg):"); 
      double Mass1 = scnr.nextDouble();
      System.out.println("Enter the mass of the smaller celestial body (kg):"); 
      double Mass2 = scnr.nextDouble();
      System.out.println("Enter the distance between the two celestial bodies (in meters):"); 
     double distBodies = scnr.nextDouble();
      distRatio1 = Mass1 / (Mass1 + Mass2);
      distRatio2 = Mass2 / (Mass1 + Mass2);
      distance1 = distRatio1 * distBodies;
      distance2 = distRatio2 * distBodies;
      dist1 = (Math.sqrt(distance1));
      dist2 = (Math.sqrt(distance2));
      fdist1 = (dist1) / (dist1 + dist2);
      fdist2 = (dist2) / (dist1 + dist2);
      finalDist1 = fdist1 * distBodies;
      finalDist2 = fdist2 * distBodies;
      
      System.out.println("A spaceship between the two celestial bodies will experience an equal ");
      System.out.println("gravitational pull from each body when it is ");
      System.out.println(finalDist1 + " meters from the larger body and " + finalDist2 + " meters from the smaller body.");
      
      
      return;
   }
}
