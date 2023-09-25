/**
 *This program displays the instructions screen when the user wants to play the third level. 
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

public class InstructionsGame
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
    * {@link InstructionsGame} constructor.
    * Creates frame, sets frame size, adds a mouse listener to recognize cursor movements and the Drawing object draw for graphics, and makes frame visible to user
    *
    */
    
   public InstructionsGame()
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
       *Displays graphics for instructions screen (calls all methods necessary)
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */
       
      public void paint (Graphics g)
      {  
          super.paint(g);
          ogBackground(g);
          /**Logo*/       
          g.drawImage(logo,30,30,null);     
       }
       
       public void ogBackground(Graphics g)
       {
            g.setColor(new Color(83,193,241)); 
            g.fillRect(0,0,800,500); 
            
            /**The outside rectangle*/
            g.setColor( Color.black); 
            for(int i = 0; i<10; i++)
            {
               g.drawRect(20+i,20+i,760-i*2,460-i*2); 
            }
            
            /**Top left corner */
            g.setColor(new Color(15,104,159)); 
            int[] triX1 = {20,100 , 20};
            int[] triY1 = {20, 20, 100};
            int numOfPoints = 3;
            g.fillPolygon (triX1, triY1, numOfPoints);
            
            /**Bottom left corner*/
            g.setColor(new Color(94,150,200)); 
            int[] triX2 = {20, 100 , 20};
            int[] triY2 = {481, 481, 400};
            g.fillPolygon (triX2, triY2, numOfPoints);
            
            /**Bottom right corner*/
            g.setColor(new Color(65,134,164)); 
            int[] triX3 = {700, 781 , 781};
            int[] triY3 = {481, 481, 400};
            g.fillPolygon (triX3, triY3, numOfPoints);
            
            /**Top right corner*/
            g.setColor(new Color(162,207,227)); 
            int[] triX4 = {700, 781 , 781};
            int[] triY4 = {20, 20, 100};
            g.fillPolygon (triX4, triY4, numOfPoints);            
            /**Font*/
            Font font1 = new Font("Serif",Font.BOLD,25);
            g.setFont(font1); 
            g.setColor(Color.black);
            
            /**Text*/
            g.drawString("To begin, press space. Then, use the arrow keys to move",60,140);
            g.drawString("left and right. Press space to launch arrows. Aim for the",60,190); 
            g.drawString("yellow circle on targets to advance. Then, answer all the",60,240);
            g.drawString("questions correctly. You will have three lives and every time",60,290);
            g.drawString("you get a question wrong, you lose a life. When you have no lives",60,340);
            g.drawString("left, you need to start at the beginning with shooting arrows.",60,390); 
            g.drawString("CLICK ANYWHERE TO CONTINUE!",160,440); 
            
            /**Font*/
            Font font2 = new Font("Serif",Font.BOLD,14); 
            g.setFont(font2); 
            
            /**Text*/
            g.drawString("Main",30,455); 
            g.drawString("Menu",30,470);
              
            if(x1 > 25 && x1 < 65 && y1 > 440 && y1 < 475)
            {
               new MainMenu();
               frame.dispose();
            }
            else if(x1 > 0 && x1 < 800 && y1 > 0 && y1 < 500)
             {
               new GameScreen(); 
               frame.dispose();
             }
         }
    } 
}