package areaclass;

import java.util.Scanner;
import java.lang.Math;
public class Area {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double PI = Math.PI;
    System.out.println("What is the radius of the circle?");
    double radius = input.nextDouble();
    double area = fuckthisstudio.fuckingcircle.getArea(radius);
    System.out.println("The area of a circle with radius " + radius + " is " + area + ".");
  }
}
