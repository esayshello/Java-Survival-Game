/**
 *Questions of the action level. 
 *
 *<h2>Course Info:<h2>
 *ICS4UO/P-1 Ms. Krasteva
 *
 *@date May 8, 2023
 *@author Eathan Rajendram & Ma'ayan Shai
 */
 
import java.awt.geom.Line2D;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;
import java.awt.Color.*;
import javax.swing.JFrame;

public class ActionQuestion implements KeyListener 
{ 
   /**Stores user's cursor coordinates*/
   private int x1, y1;
   /**Progression counter*/
   private int counter = 0; 
   private int counter2 = 0;
   /**References the image file Logo to Image object logo*/
   private final Image logo = DisplayImage.readImage("img/Logo.jpeg"); 
   /**Creates Drawing object draw for graphics*/
   Drawing draw = new Drawing();
   /**Life counter*/
   private int lifeCounter = 3; 
   /**See if key is pressed*/
   private boolean canKeyPress = false; 
   /**See if answer is right*/
   private boolean answerRight; 
   /**Creates new frame titled How to surive a hot country*/
   JFrame frame = new JFrame("How to survive a hot country");
   
   /**
    * {@link ActionQuestion} constructor.
    * Creates frame, sets frame size, adds a mouse and key listener to recognize cursor and keyboard movements and the Drawing object draw for graphics, and makes frame visible to user
    *
    */
    
   public ActionQuestion()
   {
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(800,500);
      frame.addKeyListener(this);
      draw.addMouseListener(new ClickHandler()); 
      frame.add(draw);
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
      if (canKeyPress)
      {
         x1 = -1; 
         y1 = -1; 
         counter++; 
         if(!answerRight)
         {
            lifeCounter--; 
         }
      }
      if(lifeCounter == 0)
      {
         new GameScreen();
         frame.dispose();
      }
      draw.repaint();  
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
          *Recognizes when user presses their mouse and sets coordinates to x1 and y1
          *      
          *@param e Object that handles user interactivity with a mouse
          *@return void
          */

         public void mousePressed(MouseEvent e)
         { 
            
            if(counter2 == 0)
            {
               x1 = -1; 
               y1 = -1; 
               x1 = e.getX();
               y1 = e.getY();
               draw.repaint(); 
            }
               
         }
         
         /**
          *Recognizes when user releases their mouse and sets coordinates to x1 and y1
          *      
          *@param e Object that handles user interactivity with a mouse
          *@return void
          */
          
         public void mouseReleased(MouseEvent e)
         {
         }
   }

   class Drawing extends JComponent 
   {
   
      /**
       *Displays graphics for level three (questions) screen (calls all methods necessary)
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */

      public void paint (Graphics g)
      {  
        super.paint(g);
        canKeyPress = false; 
        ogBackground(g);
        orderControl(g);     
        g.drawImage(logo,30,30,null);       
      }
      
      /**
       *Displays background
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */ 
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
         
         /**Top left corner*/
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
         g.setColor(Color.black);
         Font font1 = new Font("Serif",Font.BOLD,30);
         Font font2 = new Font("Serif",Font.BOLD,15); 
         g.setFont(font1);
         g.drawString("Click on the right door! Which one will it be? ",100,100);
         g.setFont(font2);
         g.drawString("Main",30,455); 
         g.drawString("Menu",30,470);
         
      } 
      
      /**
       *Determines which question will be displayed to user
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */
       
      public void orderControl(Graphics g){
         
         if(counter == 0){
            questionOne(g); 
         }
         else if(counter == 1){
            questionTwo(g); 
         }
         else if(counter == 2){
            questionThree(g); 
         }
         else if(counter == 3){
            questionFour(g); 
         }
         else if(counter == 4){
            questionFive(g); 
         }
         else if(counter == 5){
            questionSix(g); 
         }
         else if(counter == 6){
            questionSeven(g); 
         }
         else if(counter == 7){
            win(g); 
         }     
      }
     
      /**
       *Displays question one
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */    
      public void questionOne(Graphics g)
      {
             counter2 = 0;
             Font font1 = new Font("Serif",Font.BOLD,30);
             Font font2 = new Font("Serif",Font.BOLD,15); 
             Font font3 = new Font("Serif",Font.PLAIN,15);
             g.setColor(new Color(120,63,4));
             g.fillRect(200,200,150,200);
             g.fillRect(450,200,150,200);
             g.setColor(Color.white);
             g.fillOval(320,300,15,15);
             g.fillOval(570,300,15,15);
             g.setFont(font2);
             g.drawString("Drink water",225,300);
             g.drawString("Drink orange",475,300);
             g.drawString("juice",475,320);
             if(x1 > 550 && x1 < 800 && y1 > 400 && y1 < 500)
             {
               g.setColor(new Color (64,158,22));
               g.fillRect(550,410,250,50);
               new MainMenu();
               frame.dispose();
             } 
             else if(x1 > 200 && x1 < 350 && y1 > 200 && y1 < 400)
             {
                right(g);
             }
             else if(x1 > 450 && x1 < 600 && y1 > 200 && y1 < 400)
             {
                wrong(g); 
             }

      }
      
      /**
       *Displays question two
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */       
      public void questionTwo(Graphics g)
      {     
                counter2 = 0;
                Font font1 = new Font("Serif",Font.BOLD,30);
                Font font2 = new Font("Serif",Font.BOLD,15); 
                Font font3 = new Font("Serif",Font.PLAIN,15);
                g.setColor(new Color(83,193,241)); 
                g.fillRect(80,50,650,300);
                g.fillRect(730,130,20,20); 
                g.setColor(Color.black);
                g.setFont(font1); 
                g.drawString("Now...which one will it be?",100,100);
                g.setColor(new Color(120,63,4));
                g.fillRect(200,200,150,200);
                g.fillRect(450,200,150,200);
                g.setColor(Color.white);
                g.fillOval(320,300,15,15);
                g.fillOval(570,300,15,15);
                g.setFont(font2);
                g.drawString("Wear trendy",215,300);
                g.drawString("pants",215,320);
                g.drawString("Wear",475,300);
                g.drawString("comfortable",475,320);
                g.drawString("shorts",475,340);
                if(x1 > 550 && x1 < 800 && y1 > 400 && y1 < 500)
                {
                  g.setColor(new Color (64,158,22));
                  g.fillRect(550,410,250,50);
                  new MainMenu();
                  frame.dispose();
                }
               else if(x1 > 200 && x1 < 350 && y1 > 200 && y1 < 400)
               {
                  wrong(g);
               }
             else if(x1 > 450 && x1 < 600 && y1 > 200 && y1 < 400)
             {
                right(g); 
             } 
      }
      
      /**
       *Displays question three
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */ 
      public void questionThree(Graphics g)
      {
                counter2 = 0;
                Font font1 = new Font("Serif",Font.BOLD,30);
                Font font2 = new Font("Serif",Font.BOLD,15); 
                Font font3 = new Font("Serif",Font.PLAIN,15);
                g.setColor(new Color(83,193,241)); 
                g.setFont(font2); 
                g.fillRect(80,50,650,300);
                g.fillRect(730,130,20,20); 
                g.setColor(Color.black);
                g.setFont(font1); 
                g.drawString("Now...which one will it be?",100,100);
                g.setColor(new Color(120,63,4));
                g.fillRect(200,200,150,200);
                g.fillRect(450,200,150,200);
                g.setColor(Color.white);
                g.fillOval(320,300,15,15);
                g.fillOval(570,300,15,15);
                g.setFont(font2);
                g.drawString("Run outside",215,300);
                g.drawString("when it is",215,320);
                g.drawString("hot outside",215,340);
                g.drawString("Run outside",465,300);
                g.drawString("when it is",465,320);
                g.drawString("cool outside",465,340);
                if(x1 > 550 && x1 < 800 && y1 > 400 && y1 < 500)
                {
                  g.setColor(new Color (64,158,22));
                  g.fillRect(550,410,250,50);
                  new MainMenu();
                  frame.dispose();
                }
                else if(x1 > 200 && x1 < 350 && y1 > 200 && y1 < 400)
                {
                  wrong(g);
                }
                else if(x1 > 450 && x1 < 600 && y1 > 200 && y1 < 400)
                {
                   right(g); 
                }      
      }
      
      /**
       *Displays question four
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */ 
      public void questionFour(Graphics g){
      
                counter2 = 0;
                Font font1 = new Font("Serif",Font.BOLD,30);
                Font font2 = new Font("Serif",Font.BOLD,15); 
                Font font3 = new Font("Serif",Font.PLAIN,15);
                g.setColor(new Color(83,193,241)); 
                g.setFont(font2); 
                g.fillRect(80,50,650,300);
                g.fillRect(730,130,20,20); 
                g.setColor(Color.black);
                g.setFont(font1); 
                g.drawString("Now...which one will it be?",100,100);
                g.setColor(new Color(120,63,4));
                g.fillRect(200,200,150,200);
                g.fillRect(450,200,150,200);
                g.setColor(Color.white);
                g.fillOval(320,300,15,15);
                g.fillOval(570,300,15,15);
                g.setFont(font2);
                g.drawString("Wear",215,300);
                g.drawString("sunscreen",215,320);
                g.drawString("Do not wear",465,300);
                g.drawString("sunscreen",465,320);
                if(x1 > 550 && x1 < 800 && y1 > 400 && y1 < 500)
                {
                  g.setColor(new Color (64,158,22));
                  g.fillRect(550,410,250,50);
                  new MainMenu();
                  frame.dispose();
                }
                else if(x1 > 200 && x1 < 350 && y1 > 200 && y1 < 400)
                {
                  right(g);
                }
                else if(x1 > 450 && x1 < 600 && y1 > 200 && y1 < 400)
                {
                  wrong(g); 
                }         
      }
      
      /**
       *Displays question five
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */ 
      public void questionFive(Graphics g)
      {    
                counter2 = 0;
                Font font1 = new Font("Serif",Font.BOLD,30);
                Font font2 = new Font("Serif",Font.BOLD,15); 
                Font font3 = new Font("Serif",Font.PLAIN,15);
                g.setColor(new Color(83,193,241)); 
                g.setFont(font2); 
                g.fillRect(80,50,650,300);
                g.fillRect(730,130,20,20); 
                g.setColor(Color.black);
                g.setFont(font1); 
                g.drawString("Now...which one will it be?",100,100);
                g.setColor(new Color(120,63,4));
                g.fillRect(200,200,150,200);
                g.fillRect(450,200,150,200);
                g.setColor(Color.white);
                g.fillOval(320,300,15,15);
                g.fillOval(570,300,15,15);
                g.setFont(font2);
                g.drawString("Wear white",215,300);
                g.drawString("shorts",215,320);
                g.drawString("Wear black",465,300);
                g.drawString("shorts",465,320);
                if(x1 > 550 && x1 < 800 && y1 > 400 && y1 < 500)
                {
                  g.setColor(new Color (64,158,22));
                  g.fillRect(550,410,250,50);
                  new MainMenu();
                  frame.dispose();
                }
               else if(x1 > 200 && x1 < 350 && y1 > 200 && y1 < 400)
               {
                  right(g);
               }
               else if(x1 > 450 && x1 < 600 && y1 > 200 && y1 < 400)
               {
                  wrong(g); 
               }
      }
      
      /**
       *Displays question six
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */ 
      public void questionSix(Graphics g)
      {     
                counter2 = 0;
                Font font1 = new Font("Serif",Font.BOLD,30);
                Font font2 = new Font("Serif",Font.BOLD,15); 
                Font font3 = new Font("Serif",Font.PLAIN,15);
                g.setColor(new Color(83,193,241)); 
                g.setFont(font2); 
                g.fillRect(80,50,650,300);
                g.fillRect(730,130,20,20); 
                g.setColor(Color.black);
                g.setFont(font1); 
                g.drawString("Now...which one will it be?",100,100);
                g.setColor(new Color(120,63,4));
                g.fillRect(200,200,150,200);
                g.fillRect(450,200,150,200);
                g.setColor(Color.white);
                g.fillOval(320,300,15,15);
                g.fillOval(570,300,15,15);
                g.setFont(font2);
                g.drawString("Wear a tight",215,300);
                g.drawString("dress",215,320);
                g.drawString("Wear a loose",465,300);
                g.drawString("dress",465,320);
                if(x1 > 550 && x1 < 800 && y1 > 400 && y1 < 500)
                {
                  g.setColor(new Color (64,158,22));
                  g.fillRect(550,410,250,50);
                  new MainMenu();
                  frame.dispose();
                }
                else if(x1 > 200 && x1 < 350 && y1 > 200 && y1 < 400)
                {
                   wrong(g);
                }
                else if(x1 > 450 && x1 < 600 && y1 > 200 && y1 < 400)
                {
                  right(g); 
                }
      }
      
      /**
       *Displays question seven
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */ 
      public void questionSeven(Graphics g){
                counter2 = 0;
                Font font1 = new Font("Serif",Font.BOLD,30);
                Font font2 = new Font("Serif",Font.BOLD,15); 
                Font font3 = new Font("Serif",Font.PLAIN,15);
                g.setColor(new Color(83,193,241)); 
                g.setFont(font2); 
                g.fillRect(80,50,650,300);
                g.fillRect(730,130,20,20); 
                g.setColor(Color.black);
                g.setFont(font1); 
                g.drawString(" Now...which one will it be?",100,100);
                g.setColor(new Color(120,63,4));
                g.fillRect(200,200,150,200);
                g.fillRect(450,200,150,200);
                g.setColor(Color.white);
                g.fillOval(320,300,15,15);
                g.fillOval(570,300,15,15);
                g.setFont(font2);
                g.drawString("Stay in the",215,300);
                g.drawString("shade",215,320);
                g.drawString("Stay in the sun",465,300);
                if(x1 > 550 && x1 < 800 && y1 > 400 && y1 < 500)
                {
                  g.setColor(new Color (64,158,22));
                  g.fillRect(550,410,250,50);
                  new MainMenu();
                  frame.dispose();
                }
                else if(x1 > 200 && x1 < 350 && y1 > 200 && y1 < 400)
                {
                  right(g);
                }
                else if(x1 > 450 && x1 < 600 && y1 > 200 && y1 < 400)
                {
                   wrong(g); 
                }
      }
      
      /**
       *Displays if user chooses wrong answer
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */ 
      public void wrong(Graphics g)
      {
          counter2 = 1;
          g.setColor(Color.black);
          Font font1 = new Font("Serif",Font.BOLD+Font.ITALIC,40);
          Font font2 = new Font("Serif",Font.BOLD,15); 
          Font font3 = new Font("Serif",Font.PLAIN,15);
          g.setColor(new Color(83,193,241)); 
          g.fillRect(80,50,650,400);
          g.fillRect(730,130,20,20); 
          g.setColor(Color.black);
          g.setFont(font1); 
          g.drawString("WRONG!!!! You have lost a life ",70,230);
          g.drawString("Press any key to continue.", 70,270); 
          canKeyPress = true;
          answerRight = false;        
      }
      
      /**
       *Displays if user chooses right answer
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */ 
      public void right(Graphics g)
      {
          counter2 = 1;
          g.setColor(Color.black);
          Font font1 = new Font("Serif",Font.BOLD+Font.ITALIC,40);
          Font font2 = new Font("Serif",Font.BOLD,15); 
          Font font3 = new Font("Serif",Font.PLAIN,15);
          g.setColor(new Color(83,193,241)); 
          g.fillRect(80,50,650,400);
          g.fillRect(730,130,20,20); 
          g.setColor(Color.black);
          g.setFont(font1); 
          g.drawString("CORRECT!!!",70,230);
          g.drawString("Press any key to continue.", 70,270); 
          canKeyPress = true;
          answerRight = true;     
      }
      
      /**
       *Displays if user won the game
       *      
       *@param g Object that allows for drawing of graphics to occur
       *@return void
       */ 
      public void win(Graphics g)
      {
          counter2 = 0;
          Font font1 = new Font("Serif",Font.BOLD,60);
          Font font2 = new Font("Serif",Font.BOLD,50); 
          Font font3 = new Font("Serif",Font.PLAIN,15);
          g.setColor(new Color(83,193,241)); 
          g.fillRect(80,50,650,300);
          g.fillRect(730,130,20,20); 
          g.setColor(Color.black);
          g.setFont(font1); 
          g.drawString("YOU WIN!",240,150);
          g.setFont(font2); 
          g.drawString("Click anywhere to go to the",100,270);
          g.drawString("main menu!",265,350);
          if(x1 > 0 && x1 < 800 && y1 > 0 && y1 < 500)
          {
               g.setColor(new Color (64,158,22));
               g.fillRect(550,410,250,50);
               new MainMenu();
               frame.dispose();
          }
        }
      }
   } 