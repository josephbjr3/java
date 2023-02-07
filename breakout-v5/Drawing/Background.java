import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    int counter = 0;
    int locationCounter = Greenfoot.getRandomNumber(580)+10;
    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(460, 460, 1); 
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
    }

    public void act()
    {
        counter++;
        if (counter%10==0)
        {
            if (Greenfoot.getRandomNumber(100)<90)
                addObject(new Polygon(), Greenfoot.getRandomNumber(440)+10, 10);
        }
        //if (counter%67==0)
        //{
          //  if (Greenfoot.getRandomNumber(100)<90)
            //{
              //  addObject(new Polygon(), Greenfoot.getRandomNumber(440)+10, 10);
                //Greenfoot.playSound("shooting_star.wav");
           // }
        //}
    }

}