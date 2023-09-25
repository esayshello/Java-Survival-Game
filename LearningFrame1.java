/**
 *This program displays the first level of our education program. 
 *
 *<h2>Course Info:<h2>
 *ICS4UO/P-1 Ms. Krasteva
 *
 *@date May 17, 2023
 *@author Eathan Rajendram & Ma'ayan Shai
 */
 
import java.awt.geom.Line2D;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;
import java.awt.Color.*;
import javax.swing.JFrame;

public class LearningFrame1 
{
   /**Stores coordinates of user's cursor*/
   private int x1, y1, x2, y2;
   /**Stores user's progression*/
   private int counter = 0;
   /**References image file Logo to Image object logo*/
   private final Image logo = DisplayImage.readImage("img/Logo.jpeg"); 
   /**References image file WaterBottle to Image object picOne*/
   private final Image picOne = DisplayImage.readImage("img/WaterBottle.jpeg");
   /**References image file Shirt to Image object picTwo*/
   private final Image picTwo = DisplayImage.readImage("img/Shirt.jpeg");
   /**References image file Sunscreen to Image object picThree*/
   private final Image picThree = DisplayImage.readImage("img/Sunscreen.jpeg");
   /**References image file Hat to Image object picFour*/
   private final Image picFour = DisplayImage.readImage("img/Hat.jpeg");
   /**Creates new Drawing object for graphics*/ 
   Drawing draw = new Drawing();
   /**Creates new frame titled How to survive a hot country*/
   JFrame frame = new JFrame("How to survive a hot country");
   
   /**
    * {@link LearningFrame1} constructor.
    * Creates frame, sets frame size, adds a mouse listener to recognize cursor movements and the Drawing object draw for graphics, and makes frame visible to user
    *
    */
    
   public LearningFrame1()
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
          *Recognizes when user presses their mouse and sets coordinates to x1 and y1, and x2 and y2
          *      
          *@param e Object that handles user interactivity with a mouse
          *@return void
          */
          
         public void mousePressed(MouseEvent e)
         {
            if(counter == 0)
            {
               x1 = e.getX();
               y1 = e.getY();
            }
            if(counter == 1)
            {
               x2 = e.getX();
               y2 = e.getY();
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
            if(counter == 0)
            {
               x1 = e.getX();
               y1 = e.getY();
               draw.repaint();
            }
            if(counter == 1)
            {
               x2 = e.getX();
               y2 = e.getY();
               draw.repaint();
            }         
        }
   }

   class Drawing extends JComponent 
   {
   
      /**
       *Displays graphics for learning screen (calls all methods necessary)
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */
       
      public void paint (Graphics g)
      {  
          super.paint(g);
          ogBackground(g);
          box(g); 
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
      }
          
      /**
       *Displays box and responds to user interaction related to it
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */
       
      public void box(Graphics g)
      {
         g.setColor(new Color(230,184,175)); 
         g.fillRect(230, 280,340,150);
         
         g.setColor(Color.black); 
         g.drawRect(230, 280,340,150);
         
         /**Top parrallelogram*/
         g.setColor(new Color(230,184,175)); 
         int[] quadX1 = {230, 570, 600, 260};
         int[] quadY1 = {280, 280, 240, 240};
         g.fillPolygon (quadX1, quadY1, 4);
         g.setColor(Color.black);
         g.drawPolygon (quadX1, quadY1, 4);
         
         /**Side parrallelogram*/
         g.setColor(new Color(230,184,175)); 
         int[] quadX2 = {570, 570, 600, 600};
         int[] quadY2 = {280, 430, 400, 240};
         g.fillPolygon (quadX2, quadY2, 4);
         g.setColor(Color.black);
         g.drawPolygon (quadX2, quadY2, 4);
         
         /**Front X */
         g.drawLine(230,280,570,430); 
         g.drawLine(230,430,570,280); 
         
         /**Top X*/
         g.drawLine(230,280,600,240); 
         g.drawLine(570,280,260,240);
         
         /**Right X*/ 
         g.drawLine(570,280,600,400); 
         g.drawLine(570,430,600,240); 
         
         /**Font*/
         Font font1 = new Font("Serif",Font.BOLD,35);
         g.setFont(font1); 
         
         /**Text*/
         g.drawString("Click on the box to open it!",230,200); 
         
         /**Font*/
         Font font2 = new Font("Serif",Font.BOLD,14); 
         g.setFont(font2); 
         
         /**Text*/
         g.drawString("Main",30,455); 
         g.drawString("Menu",30,470);
           
         if(counter == 0)
         {
             if(x1 > 25 && x1 < 65 && y1 > 440 && y1 < 475)
             {
                  new MainMenu();
                  frame.dispose();
             }
            else if((x1 >  230 && x1 < 570 && y1 > 280 && y1 < 430) || (x1 > 230 && x1 < 600 && y1 > 240 && y1 < 280) || (x1 > 570 && x1 < 600 && y1 > 240 && y1 < 430))
             {
                  g.setColor(new Color(83,193,241));
                  g.fillRect(230,140,500,100);
                  g.setColor(new Color (255,229,153));
                  int[] quadX3 = {110,130,140,120};
                  int[] quadY3 = {100,90,200,210};
                  g.fillPolygon(quadX3, quadY3, 4);
                  g.setColor(new Color (182,215,168));
                  int[] quadX4 = {160,180,190,170};
                  int[] quadY4 = {100,90,200,210};
                  g.fillPolygon(quadX4, quadY4, 4);
                  g.setColor(new Color (234,153,153));
                  int[] quadX5 = {210,230,240,220};
                  int[] quadY5 = {100,90,200,210};
                  g.fillPolygon(quadX5, quadY5, 4);
                  g.setColor(new Color (255,229,153));
                  int[] quadX6 = {610,630,640,620};
                  int[] quadY6 = {100,90,200,210};
                  g.fillPolygon(quadX6, quadY6, 4);
                  g.setColor(new Color (182,215,168));
                  int[] quadX7 = {660,680,690,670};
                  int[] quadY7 = {100,90,200,210};
                  g.fillPolygon(quadX7, quadY7, 4);
                  g.setColor(new Color (234,153,153));
                  int[] quadX8 = {710,730,740,720};
                  int[] quadY8 = {100,90,200,210};
                  g.fillPolygon(quadX8, quadY8, 4);
                  g.setColor(Color.black);
                  Font fontThree = new Font("Serif",Font.BOLD,28);
                  g.setFont(fontThree); 
                  g.drawString("Nice! Let's see what we",275,100); 
                  g.drawString("have...",380,150);
                  g.drawString("Click anywhere to continue!",260,200);
                  counter = 1;
             }
           }
       
        else if(counter == 1)
        {
         g.setColor(new Color(83,193,241)); 
         g.fillRect(100,130,620,330); 
         Font fontThree = new Font("Serif",Font.BOLD,25);
         Font fontFour = new Font("Serif",Font.BOLD,16);
         Font fontFive = new Font("Serif",Font.BOLD,20);
         g.setFont(fontThree); 
         g.setColor(Color.black);
         g.drawString("Click on any item to learn more about it.",180,100);
         g.drawImage(picOne,100,150,null);
         g.drawImage(picTwo,250,150,null);
         g.drawImage(picThree,430,150,null);
         g.drawImage(picFour,530,150,null);
         g.setFont(fontFive);
         g.drawString("When done, click main menu, click play, and move on to the next stage.",95,450);
          if(x2 > 25 && x2 < 65 && y2 > 440 && y2 < 475)
          {
            new MainMenu();
            frame.dispose();
          }
         else if(x2 > 100 && x2 < 200 && y2 > 150 && y2 < 270)
         {
            g.setColor(Color.white);
            g.fillRect(95,290,105,100);
            g.setColor(Color.black);
            g.drawRect(95,290,105,100);
            g.setFont(fontFour);
            g.drawString("Drink water",100,315);
            g.drawString("regularly.",100,330);
            g.drawString("Avoid",100,350);
            g.drawString("drinking",100,365);
            g.drawString("sugary drinks.",100,380);
         }
         else if(x2 > 250 && x2 < 380 && y2 > 170 && y2 < 250)
         {
            g.setColor(Color.white);
            g.fillRect(245,290,155,80);
            g.setColor(Color.black);
            g.drawRect(245,290,155,80);
            g.setFont(fontFour);
            g.drawString("Wear loose, light, and",250,315);
            g.drawString("comfortable clothing",250,330);
            g.drawString("to help keep you cool.",250,345);
         }
          else if(x2 > 430 && x2 < 505 && y2 > 150 && y2 < 310)
         {
            g.setColor(Color.white);
            g.fillRect(430,320,100,105);
            g.setColor(Color.black);
            g.drawRect(430,320,100,105);
            g.setFont(fontFour);
            g.drawString("Wear",435,345);
            g.drawString("sunscreen",435,360);
            g.drawString("daily to help",435,375);
            g.drawString("protect your",435,390);
            g.drawString("skin from the",435,405);
            g.drawString("sun.",435,420);
         }
         else if(x2 > 550 && x2 < 710 && y2 > 155 && y2 < 270)
         {
            g.setColor(Color.white);
            g.fillRect(555,290,150,100);
            g.setColor(Color.black);
            g.drawRect(555,290,150,100);
            g.setFont(fontFour);
            g.drawString("Wear a hat to help",560,315);
            g.drawString("shield you from the",560,330);
            g.drawString("sun.",560,345);
            g.drawString("This will help keep",560,365);
            g.drawString("you cool.",560,380);
        }
      }
    }
  } 
}