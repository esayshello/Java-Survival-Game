/**
 *This program displays the exit screen when the user wishes to exit the program. 
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

public class ExitScreen
{
   /**Stores coordinates of user's cursor*/
   private int x1,y1,x2,y2;
   /**References image file Logo to Image object logo*/
   private final Image logo = DisplayImage.readImage("img/Logo.jpeg");
   /**Creates new Drawing object for graphics*/ 
   private Drawing draw = new Drawing();
   
   /**
    * {@link ExitScreen} constructor.
    * Creates frame, sets frame size, adds a mouse listener to recognize cursor movements and the Drawing object draw for graphics, and makes frame visible to user
    *
    */
     
   public ExitScreen()
   {
      JFrame frame = new JFrame("How to survive a hot country");
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
       *Displays graphics for exit screen
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */

      public void paint (Graphics g)
      {                 
          /**Sky*/
          g.setColor(new Color (89,194,240));
          g.fillRect(0,0,800,500);
          /**Font*/
          Font intro1 = new Font("Serif", Font.BOLD, 35);
          g.setFont(intro1);
          g.setColor(Color.black);
          /**Text*/
          g.drawString("GOOD BYE!" , 290, 70);
          /**Font*/
          Font sub = new Font("Serif", Font.BOLD, 20);
          g.setFont(sub);
          g.setColor(Color.black);
          /**Text*/
          g.drawString("All research used in this program came from:",30,115);
          g.drawString("Centers for Disease Control and Prevention. (2022, July 18). Keep your cool in hot",30,150); 
          g.drawString("weather. Centers for Disease Control and Prevention.https://www.cdc.gov/nceh/",30,180);
          g.drawString("features/extremeheat/index.html ",30,210);
          /**Font*/
          Font intro2 = new Font("Serif", Font.BOLD, 22);
          g.setFont(intro2);
          g.setColor(Color.black);
          g.drawString("Thanks for playing our game! Make sure to check out our" , 30, 250);
          g.drawString("other" , 585, 250);
          /**Font*/
          Font intro3 = new Font("Serif", Font.BOLD|Font.ITALIC, 22);
          g.setFont(intro3);
          g.setColor(Color.black);
          /**Text*/
          g.drawString("Hot Topics" , 640, 250);
          /**Font*/
          Font intro4 = new Font("Serif", Font.BOLD, 22);
          g.setFont(intro4);
          g.setColor(Color.black);
          /**Text*/
          g.drawString("programs!" , 30, 280); 
          g.drawString("This game was designed and created by Eathan Rajendram and Ma'ayan Shai.",30,325); 
          g.drawString("Click anywhere to exit.",270,370); 
          /**Logo*/           
          g.drawImage(logo,430,390,null);
          /**Text*/
          Font smallFont = new Font("Monospaced",Font.BOLD,20);
          g.setColor(Color.black);
          g.setFont(smallFont);
          g.drawString("By: EduME",300,450);
          if(x1 > 0 && x1 < 800 && y1 > 0 && y1 < 500)
          {
               System.exit(1);             
          }      
       }
   }
}