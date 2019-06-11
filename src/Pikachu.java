import java.awt.Color;
import acm.program.*;
import acm.graphics.*;

public class Pikachu extends GraphicsProgram {
  
   // class fields

   private GPen pen;
  
   public final int APPLET_WIDTH = 367;
   public final int APPLET_HEIGHT = 384;
  
   public final Color BROWN = new Color(108, 61, 6); // I hope this is brown, really hard for me to tell.
  
     // set up the state of the window
   public void init() {
      
       setSize(APPLET_WIDTH, APPLET_HEIGHT);    // set the initial window size
   }
  
   public void run() {
        
       // declare a variable for our GPen
       // and initialized to a new GPen object
      
       pen = new GPen();
       add(pen); // adds the pen object to our applet
            
       // background color
       pen.setFillColor(Color.GREEN); // set the background color to orange
       pen.startFilledRegion(); // start the background fill
       
       pen.drawLine(0, 0);
       pen.drawLine(367, 0);
       pen.drawLine(0, 384);
       pen.drawLine(-367, 0);
       pen.endFilledRegion(); // end the background fill
      
      
       pen.setLocation(1, 94); // This will change the x,y location of the entire drawing
      
      
       // Pikachu tail
       pen.setFillColor(Color.YELLOW); // make the mask white
       pen.startFilledRegion();
       pen.drawLine(0,78);
       pen.drawLine(26,24);
       pen.drawLine(-10,7);
       pen.drawLine(0,8);
       pen.drawLine(33,31);
       pen.drawLine(-9,8);
       pen.drawLine(15,15);
       pen.drawLine(9,0);
       pen.drawLine(7,8);
       pen.drawLine(7,0);
       pen.drawLine(0,-54);
       pen.drawLine(-7,0);
       pen.drawLine(-15,-16);
       pen.drawLine(22,-23);
       pen.drawLine(0,-8);
       pen.endFilledRegion();
       
       
       // Pikachu body
       pen.setLocation(43, 41);
       
       pen.startFilledRegion();
       pen.drawLine(0,15);
       pen.drawLine(21,23);
       pen.drawLine(9,0);
       pen.drawLine(7,8);
       pen.drawLine(8,0);
       pen.drawLine(8,7);
       pen.drawLine(0,8);
       pen.drawLine(-7,7);
       pen.drawLine(0,17);
       pen.drawLine(-10,6);
       pen.drawLine(0,33);
       pen.drawLine(9,0);
       pen.drawLine(0,8);
       pen.drawLine(8,6);
       pen.drawLine(-9,8);
       pen.drawLine(2,18);
       pen.drawLine(-10,5);
       pen.drawLine(0,62);
       pen.drawLine(10,0);
       pen.drawLine(0,9);
       pen.drawLine(15,15);
       pen.drawLine(-8,8);
       pen.drawLine(0,8);
       pen.drawLine(31,0);
       pen.drawLine(0,-7);
       pen.drawLine(15,0);
       pen.drawLine(0,-8);
       pen.drawLine(54,0);
       pen.drawLine(0,7);
       pen.drawLine(16,0);
       pen.drawLine(0,8);
       pen.drawLine(31,0);
       pen.drawLine(0,-7);
       pen.drawLine(-8,-8);
       pen.drawLine(24,-24);
       pen.drawLine(0,-8);
       pen.drawLine(7,-8);
       pen.drawLine(0,-38);
       pen.drawLine(-8,-8);
       pen.drawLine(0,-24);
       pen.drawLine(-8,-7);
       pen.drawLine(9,-8);
       pen.drawLine(0,-8);
       pen.drawLine(7,-8);
       pen.drawLine(0,-23);
       pen.drawLine(-8,-7);
       pen.drawLine(0,-16);
       pen.drawLine(-7,-7);
       pen.drawLine(0,-17);
       pen.drawLine(23,-23);
       pen.drawLine(-1,-30);
       pen.drawLine(-23,0);
       pen.drawLine(-22,22);
       pen.drawLine(-9,0);
       pen.drawLine(-7,9);
       pen.drawLine(-8,-8);
       pen.drawLine(-62,0);
       pen.drawLine(-8,8);
       pen.drawLine(-7,-9);
       pen.drawLine(-24,0);
       pen.drawLine(-8,-7);
       pen.drawLine(-23,0);
       pen.drawLine(-7,-8);
       pen.endFilledRegion();
      
       
       // Pikachu inner lines - nose, lips, ears etc..
       pen.setLocation(96,94);
       pen.drawLine(8, -8);
       pen.setLocation(251,86);
       pen.drawLine(-8, -8);
       pen.setLocation(180,133);
       pen.drawLine(10, 0);
       
       pen.setLocation(157,148);
       pen.drawLine(8,8);
       pen.drawLine(8,0);
       pen.drawLine(7,-8);
       pen.drawLine(10,0);
       pen.drawLine(6,9);
       pen.drawLine(9,0);
       pen.drawLine(7,-9);
       
       pen.setLocation(119,211);
       pen.drawLine(0,9);
       pen.drawLine(7,7);
       pen.drawLine(0,8);
       pen.drawLine(16,15);
       pen.drawLine(7,0);
       pen.drawLine(9,-8);
       pen.drawLine(0,-24);
       pen.drawLine(-8,-6);
       pen.drawLine(0,-8);
       
       pen.setLocation(211,203);
       pen.drawLine(0,7);
       pen.drawLine(-7,9);
       pen.drawLine(0,23);
       pen.drawLine(8,8);
       pen.drawLine(8,0);
       pen.drawLine(15,-15);
       pen.drawLine(0,-8);
       pen.drawLine(8,-8);
       pen.drawLine(-1,-8);
       
       // Pikachu eyes
       pen.setLocation(126,102);
       pen.setFillColor(Color.BLACK);
       pen.startFilledRegion();
       pen.drawLine(-8,8);
       pen.drawLine(0,8);
       pen.drawLine(8,8);
       pen.drawLine(8,0);
       pen.drawLine(8,-8);
       pen.drawLine(0,-8);
       pen.drawLine(-8,-8);
       pen.drawLine(-8,0);
       pen.endFilledRegion();
       
       pen.setLocation(220,102);
       
       pen.startFilledRegion();
       pen.drawLine(-8,8);
       pen.drawLine(0,8);
       pen.drawLine(8,8);
       pen.drawLine(8,0);
       pen.drawLine(8,-8);
       pen.drawLine(0,-8);
       pen.drawLine(-8,-8);
       pen.drawLine(-8,0);
       pen.endFilledRegion();
       
       // Pikachu cheeks
       pen.setFillColor(Color.RED);
       
       pen.setLocation(103,133);
       
       pen.startFilledRegion();
       pen.drawLine(-8,8);
       pen.drawLine(0,8);
       pen.drawLine(8,8);
       pen.drawLine(8,0);
       pen.drawLine(8,-8);
       pen.drawLine(0,-8);
       pen.drawLine(-8,-8);
       pen.drawLine(-8,0);
       pen.endFilledRegion();
       
       pen.setLocation(242,133);
       
       pen.startFilledRegion();
       pen.drawLine(-8,8);
       pen.drawLine(0,8);
       pen.drawLine(8,8);
       pen.drawLine(8,0);
       pen.drawLine(8,-8);
       pen.drawLine(0,-8);
       pen.drawLine(-8,-8);
       pen.drawLine(-8,0);
       pen.endFilledRegion();
       
       // Pikachu eye balls
       pen.setFillColor(Color.WHITE);
       
       pen.setLocation(133,109);
       
       pen.startFilledRegion();
       pen.drawLine(0, 7);
       pen.drawLine(7, 0);
       pen.drawLine(0, -7);
       pen.endFilledRegion();
       
       pen.setLocation(226,109);
       
       pen.startFilledRegion();
       pen.drawLine(0, 7);
       pen.drawLine(7, 0);
       pen.drawLine(0, -7);
       pen.endFilledRegion();
       
       //	Pikachu ears
       pen.setFillColor(Color.BLACK);
       
       pen.setLocation(250,32);
       
       pen.startFilledRegion();
       pen.drawLine(23,0);
       pen.drawLine(0,23);
       pen.drawLine(10,-7);
       pen.drawLine(0,-8);
       pen.drawLine(7,-7);
       pen.drawLine(0,-9);
       pen.drawLine(7,-7);
       pen.drawLine(0,-8);
       pen.drawLine(-15,0);
       pen.drawLine(-15,15);
       pen.drawLine(-10,0);
       pen.endFilledRegion();
       
       pen.setLocation(43,41);
       
       pen.startFilledRegion();
       pen.drawLine(-18, 0);
       pen.drawLine(0, 7);
       pen.drawLine(24, 23);
       pen.drawLine(8, 0);
       pen.endFilledRegion();


                
   } // end of run()
  
} // end class
