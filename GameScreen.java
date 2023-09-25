/**
 *This program displays the final level of our educational program. 
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

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 
import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

 
public class GameScreen implements KeyListener 
{  

   /**Stores coordinates of user's cursor*/
   private int x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6, x7, y7;

   /**X position of character*/
   private int charX = 40; 
   /**Y position of character*/
   private int charY = 330; 
   
   /**Drawing object for graphics*/
   private Drawing d;
   /**Creates new frame titled How to survive a hot country*/
   JFrame frame = new JFrame("How to survive a hot country");
   
   /**Timer object to control animation*/
   private Timer moveArrow;
   /**Y position of arrow*/
   private int arrowY = 500;
   /**Frame counter*/ 
   private int frameCounter = 0; 
   /**Question counter*/
   private int questionCounter = 0; 
   
   /**
    * {@link GameScreen} constructor.
    * Sets frame size, adds a key listener to recognize interaction with keyboard, creates the Drawing object d for graphics, and makes frame visible to user
    *
    */
   public GameScreen() 
   {   
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(800,500);
      frame.addKeyListener(this);
      d = new Drawing();
      frame.add(d);
      frame.setVisible(true); 
      }
      
   
    /**
    *Recognizes when user interacts with their keyboard and changes charX and charY accordingly
    *      
    *@param e Object that handles user interactivity with a keyboard
    *@return void
    */

   public void keyPressed(KeyEvent e) 
   {
         if(e.getKeyCode() == KeyEvent.VK_LEFT)
           {
            charX-=3; 
           }
          if(e.getKeyCode() == KeyEvent.VK_RIGHT)
           {
            charX+=3; 
           }
          if(e.getKeyCode() == KeyEvent.VK_SPACE)
           {
               frameCounter = 1;
               d = new Drawing();
           }
           d.repaint(); 
                     
   }
       
    /**
     *Recognizes when user releases a key on their keyboard
     *      
     *@param e Object that handles user interactivity with a keyboard      
     *@return void
     */

    public void keyReleased(KeyEvent e) 
    {

    }
    
    /**
     *Recognizes when user clicks a key on their keyboard
     *      
     *@param e Object that handles user interactivity with a keyboard      
     *@return void
     */

    public void keyTyped(KeyEvent e) 
    {        
    }


   class ClickHandler extends MouseAdapter
   {
         /**
          *Recognizes when user presses their mouse and sets coordinates to x1 and y1, and x2 and y2
          *      
          *@param e Object that handles user interactivity with a mouse
          *@return void
          */
          
         public void mousePressed(MouseEvent e)
         {
               if(questionCounter == 0)
               {
                  x1 = e.getX();
                  y1 = e.getY();
               }
         }
        
         /**
          *Recognizes when user releases their mouse and sets coordinates to x1 and y1, and x2 and y2
          *      
          *@param e Object that handles user interactivity with a mosue
          *@return void
          */

         public void mouseReleased(MouseEvent e)
         {

               if(questionCounter == 0)
               {
                  x1 = e.getX();
                  y1 = e.getY();
                  d.repaint();
               }
         }
   }


   
   class Drawing extends JComponent
   {
   
     /**
      * {@link Drawing} constructor.
      * Calls animation method
      *
      */
      public Drawing()
      {
         shootArrow();
      }
      
     /**
      *Displays all graphics (calls all methods necessary)
      *      
      *@param g Object that allows for drawing of graphics to occur
      *@return void
      */
    public void paint (Graphics g)
      {             
           background(g);
           target(g,390,260); 
           target(g,190,260);
           target(g,590,260);    
           character(g,charX,charY);   
           if (frameCounter == 1)
           {
            drawArrow(g); 
           }
         /*  
           g.setColor(new Color(133,95,29)); 
           g.fillRect(3+charX,7+arrowY,6,18); 
           
           int[] arrowTriX = {0+charX, 10+charX, 5+charX};
	        int[] arrowTriY = {77+arrowY, 77+arrowY, 07+arrowY};
	        int numOfPoints5 = 3;
	        g.fillPolygon (arrowTriX, arrowTriY, numOfPoints5);     */ 
      } 

      
     /**
      *Displays background
      *      
      *@param g Object that allows for drawing of graphics to occur
      *@return void
      */
      public void background(Graphics g){
      
        /**Sky*/ 
        g.setColor(new Color(74, 194, 246)); 
        g.fillRect(0,0,800,280);  
        
        /**Grass*/ 
        g.setColor(new Color(39, 174, 51)); 
        g.fillRect(0,280,800,220); 
      }  
      
     /**
      *Displays targets
      *      
      *@param g, x, y Object that allows for drawing of graphics to occur, X position of target, Y position of target
      *@return void
      */
      public void target(Graphics g, int x, int y)
      {
         g.setColor(Color.white); 
         g.fillOval(x-55, y-55, 130,130);
         
         g.setColor(Color.black); 
         g.fillOval(x-40, y-40, 100,100); 
      
         g.setColor(Color.blue); 
         g.fillOval(x-30,y-30,80,80);
      
         g.setColor(Color.red); 
         g.fillOval(x-15, y-15, 50,50); 
      
         g.setColor(Color.yellow); 
         g.fillOval(x,y,20,20); 

      }
      
     /**
      *Displays character
      *      
      *@param g, x, y Object that allows for drawing of graphics to occur, X position of character, Y position of character
      *@return void
      */
      
      public void character(Graphics g, int x, int y) 
      {
         g.setColor(new Color(235,52,213)); 
         g.fillOval(0+x,0+y, 40, 40); 
         g.fillRect(10+x,20+y,20,35);  
         g.fillRect(3+x,55+y,15,20);  
         g.fillRect(22+x,55+y,15,20);        
      
      }   
      
     /**
      *Animates arrow
      *      
      *@return void
      */
      public void shootArrow()
      {
          arrowY = 500;
          moveArrow = new Timer(10,(ActionEvent e) -> {
          arrowY-=2; 
          this.repaint();
          if(arrowY < 300 && charX<355 && charX>445)
          {
             moveArrow.stop();
             frameCounter = 0;
          }
          else if (arrowY < 300)
          {
            moveArrow.stop();
            frameCounter = 0;
          }
            });
         moveArrow.setRepeats(true);
         moveArrow.setInitialDelay(0);
         moveArrow.start();
      }
      
     /**
      *Displays arrow
      *      
      *@param g Object that allows for drawing of graphics to occur
      *@return void
      */
      public void drawArrow(Graphics g)
      {
           g.setColor(new Color(133,95,29)); 
            g.fillRect(3+charX+20,-100+arrowY,4,18);
           
           int[] arrowTriX = {0+charX+20, 10+charX+20, 5+charX+20};
	        int[] arrowTriY = {-100+arrowY, -100+arrowY, -120+arrowY};
	        int numOfPoints5 = 3;
	        g.fillPolygon (arrowTriX, arrowTriY, numOfPoints5); 
           int arrowTip = charX+25; 
           int aY = arrowY-120; 
           if ((arrowTip >=390 && arrowTip<=410 && aY <= 270) ||(arrowTip >=190 && arrowTip<=208 && aY <= 270) || (arrowTip >= 590 && arrowTip<=610 && aY <= 270))
           {
               new ActionQuestion();
               frame.dispose();
               moveArrow.stop();
           }
      }
      

  
  }}