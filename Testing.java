/**
 *Second level of our program. 
 *
 *<h2>Course Info:<h2>
 *ICS4UO/P-1 Ms. Krasteva
 *
 *@date May 25, 2023
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

public class Testing implements KeyListener 
{
   /**Stores coordinates of user's cursor*/
   private int x1,y1,x2,y2;
   /**Determines character's  X coordinate position*/ 
   private int charX; 
   /**Determines character's  Y coordinate position*/ 
   private int charY; 
   /**Makes sure user does not interact with already picked up object*/
   private int check = 0, checkTwo = 0, checkThree = 0, checkFour = 0; 
   private int counter = 0;
   /**Creates Drawing object*/
   private Drawing d;
   /**Creates new frame titled How to survive a hot country*/
   JFrame frame = new JFrame("How to survive a hot country");
   /**References image file Logo to Image object logo*/
   private final Image logo = DisplayImage.readImage("img/Logo.jpeg"); 
   /**References image file MazeWaterBottle to Image object picOne*/
   private final Image picOne = DisplayImage.readImage("img/MazeWaterBottle.jpeg");
   /**References image file MazeShirt to Image object picTwo*/
   private final Image picTwo = DisplayImage.readImage("img/MazeShirt.jpeg");
   /**References image file MazeSunscreen to Image object picThree*/
   private final Image picThree = DisplayImage.readImage("img/MazeSunscreen.jpeg");
   /**References image file MazeHat to Image object picFour*/
   private final Image picFour = DisplayImage.readImage("img/MazeHat.jpeg");

   
   /**
    * {@link Testing} constructor.
    * Sets frame size, adds a mouse listener to recognize cursor movements and the Drawing object draw for graphics, and makes frame visible to user
    *
    */
    
   public Testing() 
   {    
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(800,500);
      frame.addKeyListener(this);
      d = new Drawing();
      frame.add(d);
      d.addMouseListener(new ClickHandler());
      frame.setVisible(true); 
      charX = 10; 
      charY = 260; 
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
               else if(counter == 1)
               {
                  x2 = e.getX();
                  y2 = e.getY();
                  d.repaint();
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
                  d.repaint();
               }
               else if(counter == 1)
               {
                  x2 = e.getX();
                  y2 = e.getY();
                  d.repaint();
               }
         }
   }
   
   /**
    *Recognizes when user interacts with their keyboard and changes charX and charY accordingly
    *      
    *@param e Object that handles user interactivity with a keyboard
    *@return void
    */

   public void keyPressed(KeyEvent e) 
   {
       if(e.getKeyCode() == KeyEvent.VK_UP)
       {
            if (charX>=0 && charX<=155 && charY>=260 && charY<=265)
            {
                charY-=3;
                if(charY<=259 && !(charX>=130 && charX<=155 && charX>=75 && charX<=95))
                {
                    charY+=3; 
                }  
            }
            if (charX>=50 && charX<=75 && charY>=260 && charY<=365)
            {
                charY-=3;
                if(charY<=259)
                {
                    charY+=3; 
                }  
            }  
            if (charX>=50 && charX<=230 && charY>=360 && charY<=370)
            {
                charY-=3;
                if(charY<=359)
                {
                    charY+=3; 
                }  
            }  
            if (charX>=210 && charX<=225 && charY>=160 && charY<=370)
            {
                charY-=3;
                if(charY<=159)
                {
                   charY+=3; 
                }  
           } 
           if (charX>=210 && charX<=595 && charY>=160 && charY<=165)
           {
                charY-=3;
                if(charY<=161)
                {
                   charY+=3; 
                }  
           }   
           if (charX>=130 && charX<=155 && charY>=90 && charY<=265)
           {
                charY-=3;
                if(charY<=91)
                {
                   charY+=3; 
                }  
           }   
           if (charX>=75 && charX<=95 && charY>=20 && charY<=265)
           {
                charY-=3;
                if(charY<=21)
                {
                   charY+=3; 
                }  
           }  
           if (charX>=75 && charX<=730 && charY>=20 && charY<=30)
           {
                charY-=3;
                if(charY<=21)
                {
                   charY+=3; 
                }  
           }
           if (charX>=130 && charX<=655 && charY>=90 && charY<=95)
           {
                charY-=3;
                if(charY<=91)
                {
                   charY+=3; 
                }  
           }      
           if (charX>=640 && charX<=655 && charY>=90 && charY<=385)
           {
                charY-=3;
                if(charY<=91)
                {
                   charY+=3; 
                }  
           } 
           if (charX>=640 && charX<=660 && charY>=90 && charY<=380)
           {
                charY-=3;
                if(charY<=91)
                {
                   charY+=3; 
                }  
           }  
           if (charX>=400 && charX<=745 && charY>=380 && charY<=390)
           {
                charY-=3;
                if(charY<=381)
                {
                   charY+=3; 
                }  
           }
           if (charX>=720 && charX<=745 && charY>=85 && charY<=390)
           {
                charY-=3;
                if(charY<=86)
                {
                   charY+=3; 
                }  
           } 
           if (charX>=520 && charX<=545 && charY>=220 && charY<=390)
           {
                charY-=3;
                if(charY<=221)
                {
                   charY+=3; 
                }  
           } 
           if (charX>=290 && charX<=545 && charY>=220 && charY<=230)
           { 
                charY-=3;
                if(charY<=221)
                {
                   charY+=3; 
                }  
           } 
           if (charX>=400 && charX<=425 && charY>=300 && charY<=405)
           { 
                charY-=3;
                if(charY<=301)
                {
                    charY+=3; 
                }  
           } 
           if (charX>=290 && charX<=314 && charY>=220 && charY<=495)
           {
                charY-=3;
                if(charY<=221)
                {
                    charY+=3; 
                }  
           }              
           d.repaint(); 
       }
             
       else if(e.getKeyCode() == KeyEvent.VK_DOWN)
       {
           if (charX>=0 && charX<=155 && charY>=260 && charY<=265)
           {
                charY+=3; 
                if(charY>=266 && !(charX>=50 && charX<=65))
                {
                    charY-=3; 
                }
           }
           if (charX>=50 && charX<=75 && charY>=260 && charY<=365)
           {
                charY+=3; 
                if(charY>=366)
                {
                    charY-=3; 
                }
           }
           if (charX>=50 && charX<=230 && charY>=360 && charY<=370)
           { 
                charY+=3; 
                if(charY>=371)
                {
                    charY-=3; 
                }
           }
           if (charX>=210 && charX<=225 && charY>=160 && charY<=370)
           { 
                charY+=3; 
                if(charY>=371)
                {
                    charY-=3; 
                }
           }
           if (charX>=210 && charX<=595 && charY>=160 && charY<=165)
           {
                charY+=3; 
                if(charY>=166)
                {
                    charY-=3; 
                }
           }
           if (charX>=130 && charX<=155 && charY>=90 && charY<=265)
           {    
                charY+=3; 
                if(charY>=266)
                {
                    charY-=3; 
                }
           }
           if (charX>=75 && charX<=95 && charY>=20 && charY<=265)
           { 
                charY+=3; 
                if(charY>=266)
                {
                    charY-=3; 
                }
           }  
           if (charX>=75 && charX<=730 && charY>=20 && charY<=30)
           { 
                charY+=3; 
                if(charY>=31)
                {
                    charY-=3; 
                }
           } 
           if (charX>=130 && charX<=655 && charY>=90 && charY<=95)
           {
                charY+=3; 
                if(charY>=96)
                {
                    charY-=3; 
                }
           } 
           if (charX>=640 && charX<=660 && charY>=90 && charY<=380)
           {
                 charY+=3; 
                 if(charY>=381)
                 {
                    charY-=3; 
                 }
           }  
           if (charX>=400 && charX<=745 && charY>=380 && charY<=390)
           { 
                 charY+=3; 
                 if(charY>=391)
                 {
                    charY-=3; 
                 }
           }   
           if (charX>=720 && charX<=745 && charY>=85 && charY<=390)
           { 
                 charY+=3; 
                 if(charY>=391)
                 {
                    charY-=3; 
                 }
           } 
           if (charX>=520 && charX<=545 && charY>=220 && charY<=390)
           {
                 charY+=3; 
                 if(charY>=391)
                 {
                     charY-=3; 
                 }
           }
           if (charX>=290 && charX<=545 && charY>=220 && charY<=230)
           {
                 charY+=3; 
                 if(charY>=231)
                 {
                     charY-=3; 
                 }
           }
           if (charX>=400 && charX<=425 && charY>=300 && charY<=405)
           {
                 charY+=3; 
                 if(charY>=406 && !(charX>=290 && charX<=314))
                 {
                     charY-=3; 
                 }
           }
           if (charX>=290 && charX<=314 && charY>=220 && charY<=495)
           {
                 charY+=3; 
                 if(charY>=496)
                 {
                     charY-=3; 
                 }
           }          
              d.repaint(); 
       } 
             
       else if(e.getKeyCode() == KeyEvent.VK_LEFT)
       {
           if (charX>=0 && charX<=155 && charY>=260 && charY<=265)
           {
                 charX-=3; 
                 if(charX<=-1)
                 {
                      charX+=3; 
                 }
           }
                  
          if (charX>=50 && charX<=75 && charY>=260 && charY<=365)
          {
                  charX-=3; 
                  if(charX<=49)
                  {
                      charX+=3; 
                  }
          }
          if (charX>=50 && charX<=230 && charY>=360 && charY<=370)
          {
                  charX-=3; 
                  if(charX<=49)
                  {
                      charX+=3; 
                  }
          }
          if (charX>=210 && charX<=225 && charY>=160 && charY<=370)
          {
                   charX-=3; 
                   if(charX<=209)
                   {
                      charX+=3; 
                   }
          }
                  
          if (charX>=210 && charX<=595 && charY>=160 && charY<=165)
          {
                   charX-=3; 
                   if(charX<=209)
                   {
                      charX+=3; 
                   }
          }
          if (charX>=130 && charX<=155 && charY>=90 && charY<=265)
          {
                   charX-=3; 
                   if(charX<=129)
                   {
                      charX+=3; 
                   }
          }
          if (charX>=75 && charX<=95 && charY>=20 && charY<=265)
          {
                   charX-=3; 
                   if(charX<=74)
                   {
                      charX+=3; 
                   }
          }
          if (charX>=75 && charX<=730 && charY>=20 && charY<=30)
          {
                   charX-=3; 
                   if(charX<=74)
                   {
                      charX+=3; 
                   }
          }
                     
          if (charX>=130 && charX<=655 && charY>=90 && charY<=95)
          {
                   charX-=3; 
                   if(charX<=129 &&!(charY>=380 && charY<=390))
                   {
                      charX+=3; 
                   }
          }
          if (charX>=640 && charX<=660 && charY>=90 && charY<=380)
          { 
                   charX-=3; 
                   if(charX<=639 &&!(charY>=380 && charY<=390))
                   {
                      charX+=3; 
                   }
          }
          if (charX>=400 && charX<=745 && charY>=380 && charY<=390)
          {
                   charX-=3; 
                   if(charX<=399 )
                   {
                      charX+=3; 
                   }
          }
          if (charX>=720 && charX<=745 && charY>=85 && charY<=390)
          {
                   charX-=3; 
                   if(charX<=719 )
                   {
                      charX+=3; 
                   }
          }
          if (charX>=520 && charX<=545 && charY>=220 && charY<=390)
          {
                   charX-=3; 
                   if(charX<=519 && !(charY>=220 && charY<=230))
                   {
                      charX+=3; 
                   }
          }
          if (charX>=290 && charX<=545 && charY>=220 && charY<=230)
          {
                   charX-=3; 
                   if(charX<=289 )
                   {
                      charX+=3; 
                   }
          }
          if (charX>=400 && charX<=425 && charY>=300 && charY<=405)
          {
                   charX-=3; 
                   if(charX<=399 )
                   {
                      charX+=3; 
                   }
          }
          if (charX>=290 && charX<=314 && charY>=220 && charY<=495)
          {
                   charX-=3; 
                   if(charX<=289)
                   {
                      charX+=3; 
                   }
          }                
          d.repaint(); 
     }
                  
     else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
     {
          if (charX>=0 && charX<=150 && charY>=260 && charY<=265)
          {
                    charX+=3; 
                    if(charX>= 151)
                    {
                       charX-=3; 
                    }
          }        
          if (charX>=50 && charX<=75 && charY>=260 && charY<=365)
          {
                    charX+=3; 
                    if(charX>= 76)
                    {
                       charX-=3; 
                    }
          }
          if (charX>=50 && charX<=230 && charY>=360 && charY<=370)
          {
                   charX+=3; 
                   if(charX>= 231)
                   {
                      charX-=3; 
                   }
          }
          if (charX>=210 && charX<=225 && charY>=160 && charY<=370)
          {
                   charX+=3; 
                   if(charX>= 226 ){
                      charX-=3; 
                   }
          }
          if (charX>=210 && charX<=595 && charY>=160 && charY<=165)
          {
                   charX+=3; 
                   if(charX>= 596)
                   {
                      charX-=3; 
                   }
          }
          if (charX>=130 && charX<=155 && charY>=90 && charY<=265)
          {
                   charX+=3; 
                   if(charX>= 156)
                   {
                      charX-=3; 
                   }
          }
          if (charX>=75 && charX<=95 && charY>=20 && charY<=265)
          {
                   charX+=3; 
                   if(charX >= 96)
                   {
                      charX-=3; 
                   }
          }
          if (charX>=75 && charX<=730 && charY>=20 && charY<=30)
          {
                   charX+=3; 
                   if(charX >= 731)
                   {
                      charX-=3; 
                   }
          } 
          if (charX>=130 && charX<=655 && charY>=90 && charY<=95)
          {
                   charX+=3; 
                   if(charX >= 656 && !(charY>=380 && charY<=390))
                   {
                        charX-=3; 
                   }
          } 
          if (charX>=640 && charX<=660 && charY>=90 && charY<=380)
          {
                   charX+=3; 
                   if(charX >= 661)
                   {
                      charX-=3; 
                   }
          }  
          if (charX>=400 && charX<=745 && charY>=380 && charY<=390)
          {
                   charX+=3; 
                   if(charX >= 746)
                   {
                      charX-=3; 
                   }
          }
                     
          if (charX>=720 && charX<=745 && charY>=85 && charY<=390)
          {
                   charX+=3; 
                   if(charX >= 746)
                   {
                      charX-=3; 
                   }
          }  
          if (charX>=520 && charX<=545 && charY>=220 && charY<=390)
          {
                   charX+=3; 
                   if(charX >= 546)
                   {
                      charX-=3; 
                   }
          }
          if (charX>=290 && charX<=545 && charY>=220 && charY<=230)
          {
                   charX+=3; 
                   if(charX >= 546)
                   {
                      charX-=3; 
                   }
          } 
          if (charX>=400 && charX<=425 && charY>=300 && charY<=405)
          {
                   charX+=3; 
                   if(charX >= 426)
                   {
                     charX-=3; 
                   }
          } 
          if (charX>=290 && charX<=314 && charY>=220 && charY<=495)
          {
                   charX+=3; 
                   if(charX >= 315)
                   {
                      charX-=3; 
                   }
          }            
          d.repaint(); 
      }           
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
  
    class Drawing extends JComponent
    {
      
      /**
       *Displays graphics for second level screen (calls all methods necessary)
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */

      public void paint (Graphics g)
      {                  
           background(g);  
           character(g,charX,charY);
           g.drawImage(logo,10,30,null);     
      } 
      
      /**
       *Displays background
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */

      public void background(Graphics g)
      {
         g.setColor(new Color(39,174,51)); 
         g.fillRect(0,0,800,500); 
         
         g.setColor(new Color(214,194,129));  
         g.fillRect( 0,260,170,40);  
         g.fillRect( 50,260,40,140);  
         g.fillRect( 50,360,180,40);  
         g.fillRect( 210,160,40,240);  
         g.fillRect( 210,160,400,40); 
         g.fillRect( 130,90,40,170); 
         g.fillRect( 75,20,40,240); 
         g.fillRect( 75,20,670,40); 
         g.fillRect( 130,90,510,40);   
         g.fillRect( 640,90,40,290);           
         g.fillRect( 400,380,360,40);          
         g.fillRect( 720,85,40,335); 
         g.fillRect( 520,220,40,200); 
         g.fillRect( 290,220,230,40); 
         g.fillRect( 400,300,40,120); 
         g.fillRect( 290,220,40,270); 
         
         /**Font*/
          Font intro2 = new Font("Serif", Font.BOLD, 20);
          g.setFont(intro2);
          g.setColor(Color.black);
          /**Text*/
          g.drawString("Start" , 10, 240);
          g.drawString("Finish" , 225, 450); 
          g.drawString("Main Menu",20,465); 
         if(x1 > 15 && x1 < 110 && y1 > 450 && y1 < 470)
         {
             new MainMenu();
             frame.dispose();
         }
         g.drawImage(picOne,565,250,null);
         g.drawImage(picTwo,100,405,null);
         g.drawImage(picThree,755,10,null);
         g.drawImage(picFour,450,425,null);
         if(check == 1)
         {
            g.setColor(new Color(39,174,51));
            g.fillRect(520,435,280,60);
            g.fillRect(100,405,100,40); 
         }
         if(checkTwo == 1)
         {
            g.setColor(new Color(39,174,51));
            g.fillRect(520,435,280,60);
            g.fillRect(565,250,60,80); 
         }
         if(checkThree == 1)
         {
            g.setColor(new Color(39,174,51));
            g.fillRect(520,435,280,60);
            g.fillRect(755,10,100,60); 
         }
         if(checkFour == 1)
         {
            g.setColor(new Color(39,174,51));
            g.fillRect(520,435,280,60);
            g.fillRect(450,425,100,60); 
         }
         if(check == 0 && (charX > 100 && charX < 140 && charY > 350 && charY < 405))
         {
            Font textFont = new Font("Serif",Font.BOLD,15);
            g.setFont(textFont);
            g.setColor(Color.black);
            g.drawString("You got an object! Click here to continue.",520,455);
            g.setFont(intro2);
            if(x1 > 520 && x1 < 780 && y1 > 435 && y1 < 475)
            {
                  g.setColor(new Color(39,174,51));
                  g.fillRect(520,435,280,60);
                  g.fillRect(100,405,100,40); 
                  check = 1; 
                  x1 = -1;
                  y1 = -1;   
            }
         }
         if(checkTwo == 0 && (charX > 525 && charX < 565 && charY > 250 && charY < 285))
         {
            Font textFont = new Font("Serif",Font.BOLD,15);
            g.setFont(textFont);
            g.setColor(Color.black);
            g.drawString("You got an object! Click here to continue.",520,455);
            g.setFont(intro2);
            if(x1 > 520 && x1 < 780 && y1 > 435 && y1 < 475)
            {
                  g.setColor(new Color(39,174,51));
                  g.fillRect(520,435,280,60);
                  g.fillRect(565,250,60,80);  
                  checkTwo = 1;  
                  x1 = -1;
                  y1 = -1;     
            }
         }
         if(checkThree == 0 && (charX > 715 && charX < 755 && charY > 20 && charY < 60))
         {
            Font textFont = new Font("Serif",Font.BOLD,15);
            g.setFont(textFont);
            g.setColor(Color.black);
            g.drawString("You got an object! Click here to continue.",520,455);
            g.setFont(intro2);
            if(x1 > 520 && x1 < 780 && y1 > 435 && y1 < 475)
            {
                  g.setColor(new Color(39,174,51));
                  g.fillRect(520,435,280,60);
                  g.fillRect(775,10,100,60);  
                  checkThree = 1;  
                  x1 = -1;
                  y1 = -1;     
            }
         }
         if(checkFour == 0 && (charX > 450 && charX < 490 && charY > 370 && charY < 425))
         {
            Font textFont = new Font("Serif",Font.BOLD,15);
            g.setFont(textFont);
            g.setColor(Color.black);
            g.drawString("You got an object! Click here to continue.",520,455);
            g.setFont(intro2);
            if(x1 > 520 && x1 < 780 && y1 > 435 && y1 < 475)
            {
                  g.setColor(new Color(39,174,51));
                  g.fillRect(520,435,280,60);
                  g.fillRect(450,425,100,60);  
                  checkFour = 1;  
                  x1 = -1;
                  y1 = -1;     
            }
         }
         if(check != 0 && checkTwo != 0 && checkThree != 0 && checkFour != 0 && (charX > 200 && charX < 300 && charY > 430 && charY < 500))
         {
            new CongratulationMaze();
            frame.dispose();
         }
      } 
      
      /**
       *Displays character
       *      
       *@param g, x, y Object that allows for drawing of graphics to occur, How much character moves left to right, How much character moves up and down
       *@return void
       */

      public void character(Graphics g, int x, int y) 
      {
         g.setColor(Color.blue); 
         g.fillOval(0+x,0+y, 15, 15); 
         g.fillRect(4+x,13+y,7,15);  
         g.fillRect(+x,20+y,4,10);  
         g.fillRect(11+x,20+y,4,10);        
      
      }     
   }
}