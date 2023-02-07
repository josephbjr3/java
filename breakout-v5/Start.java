import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    Counter counter;
    Lives live;
    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(460, 460, 1); 
        //GreenfootImage background = getBackground();
        //background.setColor(Color.black);
        //background.fill();
        int height = getHeight();
        int width = getWidth();
        Title title = new Title();
        addObject(title, width/2,height/2);
    }

    public void act()
    {
        if (Greenfoot.mouseClicked(null))
        {
            counter=new Counter();
            live = new Lives();
            Greenfoot.setWorld(new Level1(live,counter));
        }
    }
}