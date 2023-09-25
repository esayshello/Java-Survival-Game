/**
 *Main menu of the program where user can choose to play or exit. 
 *
 *<h2>Course Info:<h2>
 *ICS4UO/P-1 Ms. Krasteva
 *
 *@date May 18, 2023
 *@author Eathan Rajendram & Ma'ayan Shai
 */
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*; 
import java.awt.Color.*; 

public class MainMenu
{
   /**Stores coordinates of user's cursor*/
   private int x1,y1;
   /**References image file Logo to Image object logo*/
   private final Image logo = DisplayImage.readImage("img/Logo.jpeg"); 
   /**Creates new Drawing object for graphics*/ 
   private Drawing draw = new Drawing();
   /**Creates new frame titled How to survive a hot country*/
   JFrame frame = new JFrame("How to survive a hot country");
   
   /**
    * {@link MainMenu} constructor.
    * Creates frame, sets frame size, adds a mouse listener to recognize cursor movements and the Drawing object draw for graphics, and makes frame visible to user
    *
    */

   public MainMenu()
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
       *@param e Object that handles user interactivity with a mosue
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
       *Displays graphics for main menu screen
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */

      public void paint (Graphics g)
      {                 
          /**Sky*/
          g.setColor(new Color (109,158,235));
          g.fillRect(0,0,800,500);
          /**Font*/
          Font intro = new Font("Serif", Font.BOLD, 40);
          g.setFont(intro);
          g.setColor(Color.black);
          /**Text*/
          g.drawString("MAIN MENU!" , 270, 100);
          /**Font*/
          Font name = new Font("Monospaced", Font.BOLD,20);
          g.setFont(name);
          g.drawString("EduME",720,50);
          /**Play box*/
          g.setColor(new Color(207,226,243));
          g.fillRect(85,150,625,100);
          g.fillRect(85,300,625,100);
          g.setColor(Color.black);
          g.drawRect(85,150,625,100);
          g.drawRect(85,300,625,100);
          /**Sun on left*/
	       g.setColor (new Color (255, 237, 77));
	       g.fillOval (288, 177, 40, 40);
	       /**Triangle in top center*/
	       int[] sunX1 = {300, 310, 320};
	       int[] sunY1 = {175, 155, 175};
	       int numOfPoints1 = 3;
	       g.fillPolygon (sunX1, sunY1, numOfPoints1);
	       /**Triangle and 2 o'clock (top right)*/
	       int[] sunX2 = {337, 345, 325};
	       int[] sunY2 = {195, 175, 180};
	       int numOfPoints2 = 3;
	       g.fillPolygon (sunX2, sunY2, numOfPoints2);
	       /**Right triangle (3 o'clock)*/
	       int[] sunX3 = {335, 355, 335};
	       int[] sunY3 = {195, 205, 215};
	       int numOfPoints3 = 3;
	       g.fillPolygon (sunX3, sunY3, numOfPoints3);
	       /**Right bottom triangle (4:30 o'clock)*/
	       int[] sunX4 = {330, 340, 320};
	       int[] sunY4 = {210, 230, 220};
	       int numOfPoints4 = 3;
	       g.fillPolygon (sunX4, sunY4, numOfPoints4);
	       /**Bottom trangle (6 o'clock)*/
	       int[] sunX5 = {297, 307, 317};
	       int[] sunY5 = {220, 240, 220};
	       int numOfPoints5 = 3;
	       g.fillPolygon (sunX5, sunY5, numOfPoints5);
	       /**Bottom trangle (7 o'clock)*/
   	    int[] sunX6 = {285, 275, 295};
	       int[] sunY6 = {210, 230, 220};
      	 int numOfPoints6 = 3;
      	 g.fillPolygon (sunX6, sunY6, numOfPoints6);    
      	 /**Left trangle (9 o'clock)*/
      	 int[] sunX7 = {285, 265, 285};
      	 int[] sunY7 = {185, 195, 205};
      	 int numOfPoints7 = 3;
      	 g.fillPolygon (sunX7, sunY7, numOfPoints7);
      	 /**Top left trangle (10:30 o'clock)*/
      	 int[] sunX8 = {285, 275, 295};
      	 int[] sunY8 = {185, 165, 170};
      	 int numOfPoints8 = 3;
      	 g.fillPolygon (sunX8, sunY8, numOfPoints8);
          /**Sun on right*/
	       g.setColor (new Color (255, 237, 77));
	       g.fillOval (488, 177, 40, 40);
	       /**Triangle in top center*/
	       int[] sunX21 = {500, 510, 520};
	       int[] sunY21 = {175, 155, 175};
	       g.fillPolygon (sunX21, sunY21, numOfPoints1);
	       /**Triangle and 2 o'clock (top right)*/
	       int[] sunX22 = {537, 545, 525};
	       int[] sunY22 = {195, 175, 180};
	       g.fillPolygon (sunX22, sunY22, numOfPoints2);
	       /**Right triangle (3 o'clock)*/
	       int[] sunX23 = {535, 555, 535};
	       int[] sunY23 = {195, 205, 215};
	       g.fillPolygon (sunX23, sunY23, numOfPoints3);
	       /**Right bottom triangle (4:30 o'clock)*/
	       int[] sunX24 = {530, 540, 520};
	       int[] sunY24 = {210, 230, 220};
	       g.fillPolygon (sunX24, sunY24, numOfPoints4);
	       /**Bottom trangle (6 o'clock)*/
	       int[] sunX25 = {497, 507, 517};
	       int[] sunY25 = {220, 240, 220};
	       g.fillPolygon (sunX25, sunY25, numOfPoints5);
	       /**Bottom trangle (7 o'clock)*/
   	    int[] sunX26 = {485, 475, 495};
	       int[] sunY26 = {210, 230, 220};
      	 g.fillPolygon (sunX26, sunY26, numOfPoints6);    
      	 /**Left trangle (9 o'clock)*/
      	 int[] sunX27 = {485, 465, 485};
      	 int[] sunY27 = {185, 195, 205};
      	 g.fillPolygon (sunX27, sunY27, numOfPoints7);
      	 /**Top left trangle (10:30 o'clock)*/
      	 int[] sunX28 = {485, 475, 495};
      	 int[] sunY28 = {185, 165, 170};
      	 g.fillPolygon (sunX28, sunY28, numOfPoints8);
          /**Fire on left*/
          int[] fireX1 = {280,260,280,300,320,340,320};
          int[] fireY1 = {380,340,350,320,350,340,380};
          g.setColor(Color.red);
          g.fillPolygon(fireX1, fireY1, 7);
          int[] fireX2 = {280,270,280,300,320,330,320};
          int[] fireY2 = {375,350,360,340,360,350,375};
          g.setColor(Color.orange);
          g.fillPolygon(fireX2, fireY2, 7);
          /**Fire on right*/
          int[] fireX21 = {500,480,500,520,540,560,540};
          int[] fireY21 = {380,340,350,320,350,340,380};
          g.setColor(Color.red);
          g.fillPolygon(fireX21, fireY21, 7);
          int[] fireX22 = {500,490,500,520,540,550,540};
          int[] fireY22 = {375,350,360,340,360,350,375};
          g.setColor(Color.orange);
          g.fillPolygon(fireX22, fireY22, 7);
          /**Logo*/         
          g.drawImage(logo,10,390,null);
          /**Font*/
          Font title = new Font("Serif", Font.BOLD,40);
          g.setFont(title);
          g.setColor(Color.black);
          /**Text*/
          g.drawString("Play",370,210);
          g.drawString("Exit",370,360);
          if(x1 > 85 && x1 < 710 && y1 > 150 && y1 < 250)
          {
              new Levels();
              frame.dispose();
          }
          else if(x1 > 85 && x1 < 710 && y1 > 300 && y1 < 400)
          {
              new ExitScreen();
              frame.dispose();
          }
      }
   }
}