import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Actor
{
    public Title()
    {
        GreenfootImage img = new GreenfootImage (370, 200);
        img.setColor(new Color(0,255,255,255));
        float fontSize = 20.0f;
        Font font = img.getFont().deriveFont(fontSize);
        img.setFont(font);
        img.drawString("Breakout-Finding Nemo", 10, 50);
        float fontSize3 = 15.0f;
        Font font3 = img.getFont().deriveFont(fontSize3);
        img.setFont(font3);
        img.setColor(new Color(255,0,0,255));
        img.drawString("Use the left and right arrows to move the paddle", 80, 120);
        float fontSize2 = 20.0f;
        Font font2 = img.getFont().deriveFont(fontSize2);
        img.setFont(font2);
        img.setColor(new Color(255,215,0,255));
        img.drawString("Click to play", 125, 170);
        setImage(img);
    }
    /**
     * Act - do whatever the Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
