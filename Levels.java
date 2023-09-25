/**
 *This program displays all levels so user can pick a level to try. 
 *
 *<h2>Course Info:<h2>
 *ICS4UO/P-1 Ms. Krasteva
 *
 *@date May 19, 2023
 *@author Eathan Rajendram & Ma'ayan Shai
 */
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*; 
import java.awt.Color.*; 

public class Levels
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
    * {@link Levels} constructor.
    * Creates frame, sets frame size, adds a mouse listener to recognize cursor movements and the Drawing object draw for graphics, and makes frame visible to user
    *
    */

   public Levels()
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
       *Displays graphics for levels screen 
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
          g.drawString("LEVELS" , 330, 100);
          /**Font*/
          Font name = new Font("Monospaced", Font.BOLD,20);
          g.setFont(name);
          g.drawString("EduME",720,50);
          /**Play box*/
          g.setColor(new Color(207,226,243));
          g.fillRect(85,150,625,80);
          g.fillRect(85,250,625,80);
          g.fillRect(85,350,625,80);
          g.setColor(Color.black);
          g.drawRect(85,150,625,80);
          g.drawRect(85,250,625,80);
          g.drawRect(85,350,625,80);
          /**Sun on left*/
	       g.setColor (new Color (255, 237, 77));
	       g.fillOval (238, 57, 40, 40);
	       /**Triangle in top center*/
	       int[] sunX1 = {250, 260, 270};
	       int[] sunY1 = {55, 35, 55};
	       int numOfPoints1 = 3;
	       g.fillPolygon (sunX1, sunY1, numOfPoints1);
	       /**Triangle and 2 o'clock (top right)*/
	       int[] sunX2 = {287, 295, 275};
	       int[] sunY2 = {75, 55, 60};
	       int numOfPoints2 = 3;
	       g.fillPolygon (sunX2, sunY2, numOfPoints2);
	       /**Right triangle (3 o'clock)*/
	       int[] sunX3 = {285, 305, 285};
	       int[] sunY3 = {75, 85, 95};
	       int numOfPoints3 = 3;
	       g.fillPolygon (sunX3, sunY3, numOfPoints3);
	       /**Right bottom triangle (4:30 o'clock)*/
	       int[] sunX4 = {280, 290, 270};
	       int[] sunY4 = {90, 110, 100};
	       int numOfPoints4 = 3;
	       g.fillPolygon (sunX4, sunY4, numOfPoints4);
	       /**Bottom trangle (6 o'clock)*/
	       int[] sunX5 = {247, 257, 267};
	       int[] sunY5 = {100, 120, 100};
	       int numOfPoints5 = 3;
	       g.fillPolygon (sunX5, sunY5, numOfPoints5);
	       /**Bottom trangle (7 o'clock)*/
   	    int[] sunX6 = {235, 225, 245};
	       int[] sunY6 = {90, 110, 100};
      	 int numOfPoints6 = 3;
      	 g.fillPolygon (sunX6, sunY6, numOfPoints6);    
      	 /**Left trangle (9 o'clock)*/
      	 int[] sunX7 = {235, 215, 235};
      	 int[] sunY7 = {65, 75, 85};
      	 int numOfPoints7 = 3;
      	 g.fillPolygon (sunX7, sunY7, numOfPoints7);
      	 /**Top left trangle (10:30 o'clock)*/
      	 int[] sunX8 = {235, 225, 245};
      	 int[] sunY8 = {65, 45, 50};
      	 int numOfPoints8 = 3;
      	 g.fillPolygon (sunX8, sunY8, numOfPoints8);
          /**Sun on right*/
	       g.setColor (new Color (255, 237, 77));
	       g.fillOval (538, 57, 40, 40);
	       /**Triangle in top center*/
	       int[] sunX21 = {550, 560, 570};
	       int[] sunY21 = {55, 35, 55};
	       g.fillPolygon (sunX21, sunY21, numOfPoints1);
	       /**Triangle and 2 o'clock (top right)*/
	       int[] sunX22 = {587, 595, 575};
	       int[] sunY22 = {75, 55, 60};
	       g.fillPolygon (sunX22, sunY22, numOfPoints2);
	       /**Right triangle (3 o'clock)*/
	       int[] sunX23 = {585, 605, 585};
	       int[] sunY23 = {75, 85, 95};
	       g.fillPolygon (sunX23, sunY23, numOfPoints3);
	       /**Right bottom triangle (4:30 o'clock)*/
	       int[] sunX24 = {580, 590, 570};
	       int[] sunY24 = {90, 110, 100};
	       g.fillPolygon (sunX24, sunY24, numOfPoints4);
	       /**Bottom trangle (6 o'clock)*/
	       int[] sunX25 = {547, 557, 567};
	       int[] sunY25 = {100, 120, 100};
	       g.fillPolygon (sunX25, sunY25, numOfPoints5);
	       /**Bottom trangle (7 o'clock)*/
   	    int[] sunX26 = {535, 525, 545};
	       int[] sunY26 = {90, 110, 100};
      	 g.fillPolygon (sunX26, sunY26, numOfPoints6);    
      	 /**Left trangle (9 o'clock)*/
      	 int[] sunX27 = {535, 515, 535};
      	 int[] sunY27 = {65, 75, 85};
      	 g.fillPolygon (sunX27, sunY27, numOfPoints7);
      	 /**Top left trangle (10:30 o'clock)*/
      	 int[] sunX28 = {535, 525, 545};
      	 int[] sunY28 = {65, 45, 50};
      	 g.fillPolygon (sunX28, sunY28, numOfPoints8);
          /**Logo*/          
          g.drawImage(logo,20,40,null);
          /**Font*/
          Font title = new Font("Serif", Font.BOLD,40);
          g.setFont(title);
          g.setColor(Color.black);
          g.drawString("Learn",360,200);
          g.drawString("Test",370,300);
          g.drawString("Play game",330,400);
          Font subtitle = new Font("Serif", Font.BOLD,20);
          g.setFont(subtitle);
          g.drawString("Main Menu",20,465); 
          if(x1 > 15 && x1 < 110 && y1 > 450 && y1 < 470)
          {
            new MainMenu();
            frame.dispose();
          }

          if(x1 > 85 && x1 < 710 && y1 > 150 && y1 < 230)
          {
            new LearningFrame1();
            frame.dispose();
          }
          else if(x1 > 85 && x1 < 710 && y1 > 250 && y1 < 330)
          {
            new InstructionsMaze();
            frame.dispose();
          }
          else if(x1 > 85 && x1 < 710 && y1 > 350 && y1 < 430)
          {
            new InstructionsGame();  
            frame.dispose();
          }  
      }
   }
}