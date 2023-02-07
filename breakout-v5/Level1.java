import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Board
{
    
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1(Lives live, Counter counter)
    {    
        super();
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        
    }

    public void createBlocks()
    {
        int x;
        int y = 30;
        Block block = new Block();
        int width = block. getImage().getWidth();
        int height = block.getImage().getHeight();

        for (int rows = 4; rows > 0; rows--)
        {
            x = 42;
            for (int columns = 6; columns > 0; columns--)
            {
                addObject(new Block(), x, y);
                x = x +width +GAP;
            }
            y = y + 40;
        }
    }

    int countStars = 0;
    int locationCounter = Greenfoot.getRandomNumber(460)+10;

   
}