/**
 * Name:Processing Task 6
 * Purpose: Using methods to set multiple parameters whilist drawing objects
 * Author: Cavan Chung
 * Created:2022/04/10
 */
import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
    size(400, 400);
  }
  
  public void setup() {
    background(255);
  }

  public void draw() {
    //Enter dimensions/location to get a returned value of the center width
    int intCenter = intCenterCalc(120, 120);

    //Draw Level 4 Mark Flower, using the returned value (Location) 
    intDrawFlower1(intCenter);
    
    //Draw Level 3 Mark Flower (Location, size, colour)
    intDrawFlower2(50, 50, 200, 200, 225);

    //Draw Level 2 Mark Flower
    intDrawFlower3(120, 120);
    
    }  
  


  // Return the value of intWidth and intHeight
  private int intCenterCalc(int intWidth, int intHeight) {

    int intX = width/2;
    return intX;
    }  

  // Set Flower 1 Parameters, (location using return)
  private void intDrawFlower1(int intCenter) {

    stroke(0);
    translate(200, 200);
    
    for (int i = 0; i <= 8; i += 1) {
      rotate(radians(45));
      fill(0, 0, 0);
      ellipse(0, 0, width/20, height/3);  
    }
      fill(0, 0, 0);
      ellipse(0, 0, width/6, height/6);
    }  
  
// Set Flower 2 Parameters, (location, size, and colour (black,white or gray))
  private void intDrawFlower2(int intWidth, int intHeight, int intSizeX, int intSizeY, int intColour) {

    stroke(0);
    translate(intWidth, intHeight);
    
    for (int i = 0; i <= 8; i += 1) {
      rotate(radians(45));
      fill(intColour);
      ellipse(0, 0, intSizeX/20, intSizeY/3);  
    }
      fill(intColour);
      ellipse(0, 0, intSizeX/6, intSizeY/6);
    }    


  // Set Flower 3 Parameters, (location)
  private void intDrawFlower3(int intTransX, int intTransY) {

    stroke(0);
    translate(intTransX / 2.1f + intTransX / 4.1f, intTransY / 2.1f + intTransY / 4.1f);
    
    for (int i = 0; i <= 8; i += 1) {
      rotate(radians(45));
      fill(0, 0, 0);
      ellipse(0, 0, width/20, height/3);  
    }
      fill(0, 0, 0);
      ellipse(0, 0, width/6, height/6);
    }   
  
}


