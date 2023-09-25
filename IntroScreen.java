/**
 *This program displays the intro screen after the splashscreen. 
 *
 *<h2>Course Info:<h2>
 *ICS4UO/P-1 Ms. Krasteva
 *
 *@date May 24, 2023
 *@author Eathan Rajendram & Ma'ayan Shai
 */
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*; 
import java.awt.Color.*; 

public class IntroScreen
{
   /**Stores coordinates of user's cursor*/
   private int x1,y1,x2,y2;   
   /**References image file Logo to Image object logo*/
   private final Image logo = DisplayImage.readImage("img/Logo.jpeg"); 
   /**Creates new Drawing object for graphics*/ 
   private Drawing draw = new Drawing();
   /**Creates new frame titled How to survive a hot country*/
   JFrame frame = new JFrame("How to survive a hot country");
   /**
    * {@link IntroScreen} constructor.
    * Creates frame, sets frame size, adds a mouse listener to recognize cursor movements and the Drawing object draw for graphics, and makes frame visible to user
    *
    */
    
   public IntroScreen()
   {
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(800,500);
      draw.addMouseListener(new ClickHandler());
      frame.add(draw);
      frame.setVisible(true);
   }
   
   class ClickHandler extends MouseAdapter
   {
      /**
       *Recognizes when user presses their mouse and sets coordinates to x1 and y1
       *      
       *@param e Object that handles user interactivity with a mouse
       *@return void
       */
       
      public void mousePressed(MouseEvent e)
      {
         x1 = e.getX();
         y1 = e.getY();
      }
      
      /**
       *Recognizes when user releases their mouse and sets coordinates to x1 and y1
       *      
       *@param e Object that handles user interactivity with a mouse
       *@return void
       */

      public void mouseReleased(MouseEvent e)
      {
         x1 = e.getX();
         y1 = e.getY();
         draw.repaint();
      }
   }
   
   class Drawing extends JComponent
   {
      
      /**
       *Displays graphics for intro screen
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */

      public void paint (Graphics g)
      {                 
          /**Sky*/
          g.setColor(new Color (89,194,240));
          g.fillRect(0,0,800,500);
          /**Grass*/
          g.setColor(new Color (64,158,22));
          g.fillRect(0,250,800,250);
          /**Sun*/
	       g.setColor (new Color (255, 237, 77));
	       g.fillOval (100, 55, 80, 80);
	       /**Triangle in top center*/
	       int[] sunX1 = {130, 140, 150};
	       int[] sunY1 = {50, 30, 50};
	       int numOfPoints1 = 3;
	       g.fillPolygon (sunX1, sunY1, numOfPoints1);
	       /**Triangle and 2 o'clock (top right)*/
	       int[] sunX2 = {182, 190, 170};
	       int[] sunY2 = {75, 55, 60};
	       int numOfPoints2 = 3;
	       g.fillPolygon (sunX2, sunY2, numOfPoints2);
	       /**Right triangle (3 o'clock)*/
	       int[] sunX3 = {185, 205, 185};
	       int[] sunY3 = {85, 95, 105};
	       int numOfPoints3 = 3;
	       g.fillPolygon (sunX3, sunY3, numOfPoints3);
	       /**Right bottom triangle (4:30 o'clock)*/
	       int[] sunX4 = {180, 190, 170};
	       int[] sunY4 = {120, 140, 130};
	       int numOfPoints4 = 3;
	       g.fillPolygon (sunX4, sunY4, numOfPoints4);
	       /**Bottom trangle (6 o'clock)*/
	       int[] sunX5 = {130, 140, 150};
	       int[] sunY5 = {140, 160, 140};
	       int numOfPoints5 = 3;
	       g.fillPolygon (sunX5, sunY5, numOfPoints5);
	       /**Bottom trangle (7 o'clock)*/
   	    int[] sunX6 = {95, 85, 105};
	       int[] sunY6 = {120, 140, 130};
      	 int numOfPoints6 = 3;
      	 g.fillPolygon (sunX6, sunY6, numOfPoints6);    
      	 /**Left trangle (9 o'clock)*/
      	 int[] sunX7 = {95, 75, 95};
      	 int[] sunY7 = {85, 95, 105};
      	 int numOfPoints7 = 3;
      	 g.fillPolygon (sunX7, sunY7, numOfPoints7);
      	 /**Top left trangle (10:30 o'clock)*/
      	 int[] sunX8 = {95, 85, 105};
      	 int[] sunY8 = {75, 55, 60};
      	 int numOfPoints8 = 3;
      	 g.fillPolygon (sunX8, sunY8, numOfPoints8);
          /**Font*/
          Font intro = new Font("Serif", Font.BOLD, 40);
          g.setFont(intro);
          g.setColor(Color.black);
          /**Text*/
          g.drawString("HOT TOPICS! Surviving a" , 250, 100);
          g.drawString("foreign country",250,150);
          /**Person's head*/
          g.setColor(new Color(255,242,204));
          g.fillOval(580,150,100,100);
          /**Person's sweat*/
          g.setColor(new Color(111,168,220));
          g.fillOval(600,165,10,10);
          int[] sX1 = {611, 606, 601};
      	 int[] sY1 = {170, 163, 170};
      	 g.fillPolygon (sX1, sY1, 3);
          g.fillOval(590,190,10,10);
          int[] sX2 = {600, 595, 590};
      	 int[] sY2 = {197, 187, 197};
      	 g.fillPolygon (sX2, sY2, 3);
          g.fillOval(640,165,10,10);
          int[] sX3 = {650, 645, 640};
      	 int[] sY3 = {172, 162, 172};
      	 g.fillPolygon (sX3, sY3, 3);
          g.fillOval(620,170,10,10);
          int[] sX4 = {630, 625, 625};
      	 int[] sY4 = {177, 167, 177};
      	 g.fillPolygon (sX4, sY4, 3);
          g.fillOval(660,185,10,10);
          int[] sX5 = {670, 665, 660};
      	 int[] sY5 = {192, 182, 192};
          g.fillPolygon (sX5, sY5, 3);
          /**Person's eyes*/
          g.setColor(Color.black);
          g.fillOval(610,190,10,10);
          g.fillOval(640,190,10,10);
          /**Person's mouth*/
          for(int i = 0; i < 5; i++)
          {
             g.drawLine(615,220+i,630,230+i);
             g.drawLine(630,230+i,645,220+i);
          }
          /**Person's shirt*/
          g.setColor(new Color(118,61,125));
          g.fillRect(605,250,50,100);
          int[] rX1 = {555,605,625,575};
          int[] rY1 = {300,250,280,330};
          g.fillPolygon(rX1,rY1,4);
          int[] rX2 = {650,700,700,650};
          int[] rY2 = {250,280,320,290};
          g.fillPolygon(rX2, rY2, 4);
          /**Person's pants*/
          g.fillRect(605,350,20,60);
          g.fillRect(635,350,20,60);
          /**Logo*/       
          g.drawImage(logo,430,390,null);
          /**Text*/
          Font smallFont = new Font("Monospaced",Font.BOLD,20);
          g.setColor(Color.black);
          g.setFont(smallFont);
          g.drawString("Click here to exit",10,450);
          g.drawString("By: EduME",300,450);
          g.drawString("Click here to start",550,450);
          if(x1 >  10 && x1 < 230 && y1 > 430 && y1 < 470)
          {
            new ExitScreen();
            frame.dispose();
          }
          if(x1 > 550 && x1 < 790 && y1 > 430 && y1 < 470)
          {
            g.setColor(new Color (64,158,22));
            g.fillRect(550,410,250,50);
            new MainMenu();
            frame.dispose();
          }
       }
   }
}