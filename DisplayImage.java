/**
 *This program displays images. 
 *
 *<h2>Course Info:<h2>
 *ICS4UO/P-1 Ms. Krasteva
 *
 *@date May 12, 2023
 *@author Eathan Rajendram & Ma'ayan Shai
 */

import java.awt.*;
import java.io.*;
import javax.imageio.*;

public class DisplayImage
{
   /**
    *Displays image based on image pathway passed through the method parameters
    *
    *@param file The pathway to image file 
    *@return Image
    */
     
   public static Image readImage(String file)
   {
      Image img = null;
   
      File imgFile = new File(file);
      try
      {
         img = ImageIO.read(imgFile);
      }
      catch (IOException e)
      {
         System.out.println("Error loading image");
         System.exit(1);
      }
      if(img == null)
      {
         System.out.println(file);
      }
      return img;
   }
}