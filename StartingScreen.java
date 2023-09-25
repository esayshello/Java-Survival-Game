/**
 *Splashscreen of program. 
 *
 *<h2>Course Info:<h2>
 *ICS4UO/P-1 Ms. Krasteva
 *
 *@date May 17, 2023
 *@author Eathan Rajendram & Ma'ayan Shai
 */
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*; 
import java.awt.Color.*; 

public class StartingScreen 
{
   /**Stores coordinates of user's cursor*/
   private int x1,y1;
   private int squareX = 200;
   private int squareY = 200;
   private int squareTwoX = 150;
   private int squareTwoY = 220;
   private Timer moveSquare; 
   /**References image file Logo to Image object logo*/
   private final Image logo = DisplayImage.readImage("img/Logo.jpeg"); 
   /**Creates new Drawing object for graphics*/ 
   private Drawing draw = new Drawing();
   /**Creates new frame titled How to survive a hot country*/
   JFrame frame = new JFrame("How to survive a hot country");
   
   /**
    * {@link StartingScreen} constructor.
    * Creates frame, sets frame size, adds a mouse listener to recognize cursor movements and the Drawing object draw for graphics, and makes frame visible to user
    *
    */

   public StartingScreen()
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
      
      public Drawing()
      {
         moveSquare();
      }
      
      /**
       *Displays graphics for splashscreen
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */

      public void paint (Graphics g)
      {                 
          /**Sky*/
          g.setColor(new Color (89,194,240));
          g.fillRect(0,0,800,500);
          g.setColor(Color.yellow);
          g.fillOval(-20,-20,100,100);
          int[] quadX1 = {-40, 20, squareX-30, squareY-30};
          int[] quadY1 = {110, 80, squareTwoX+40, squareTwoY+40};
          g.fillPolygon (quadX1, quadY1, 4); 
          int[] quadX2 = {90, 150, squareX+100, squareY+100};
          int[] quadY2 = {20, -10, squareTwoX-50, squareTwoY-50};
          g.fillPolygon (quadX2, quadY2, 4); 
          int[] quadX3 = {50, 110, squareX+60, squareY+60};
          int[] quadY3 = {90, 55, squareTwoX+20, squareTwoY+20};
          g.fillPolygon (quadX3, quadY3, 4); 
          if(x1 > 0 && x1 < 800 && y1 > 0 && y1 < 500)
          {
            squareX = 501;
            new Purpose(); 
            frame.dispose();
          } 
          /**Font*/
          Font intro = new Font("Serif", Font.BOLD, 35);
          g.setFont(intro);
          g.setColor(Color.black);
          /**Text*/
          g.drawString("EduME presents..." , 250, 110);
          g.drawString("CLICK ANYWHERE TO CONTINUE!",100,320); 
          /**Font*/
          Font title = new Font("Serif", Font.BOLD + Font.ITALIC, 40);
          g.setFont(title);
          g.setColor(Color.red);
          /**Text*/
          g.drawString("Hot Topics! Surviving in a " , 170, 200);
          g.drawString("foriegn country.",270,250);
          /**Logo*/       
          g.drawImage(logo,430,390,null);
          /**Text*/
          Font smallFont = new Font("Monospaced",Font.BOLD,20);
          g.setColor(Color.black);
          g.setFont(smallFont);
          g.drawString("By: EduME",300,450);
      }
        
        public void moveSquare()
        {
            moveSquare = new Timer(1000,(ActionEvent e) -> {
            squareX += 10;
            squareY += 10;
            squareTwoX += 10;
            squareTwoY += 10;
            draw.repaint();
            if(squareX > 500)
            {
               moveSquare.stop();
            }
            });
            moveSquare.setRepeats(true);
            moveSquare.setInitialDelay(0);
            moveSquare.start();
        }   
     }
  }  
  

