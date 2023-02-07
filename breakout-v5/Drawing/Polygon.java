import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Polygon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Polygon extends Actor
{
    int counter;
    int alph=255;
    public Polygon()
    {

    }

    public Color randomColor()
    {
        int r = Greenfoot.getRandomNumber(256);
        int g = Greenfoot.getRandomNumber(256);
        int b = Greenfoot.getRandomNumber(256);
        int alpha = 255;
        return new Color(r,g,b,alpha);
    }

    /**
     * Act - do whatever the Polygon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if (getWorld() !=null)
        {
            setImage();
            turn(3);
            moveShape();
            fade();
            removeMe();
            
        }
        
    }

    public void setImage()
    {
        int xPoints[] = {10,0,15,25,35,50,40,50,35,25,15,0};
        int yPoints[] = {23,35,35,50,35,35,23,10,10,0,10,10};

        GreenfootImage polygon = new GreenfootImage(50,50);
        polygon.setColor(randomColor());
        polygon.fillPolygon(xPoints, yPoints, 12);
        setImage(polygon); 
    }

    public void moveShape()
    {
        setLocation(getX(),getY()+2);
    }

    /**
     * test if the ball is at the top or the bottom
     */
    public boolean atTop()
    {
        if(getWorld()!=null)
        {
        if (getY() > 450)
            return true;
        else
            return false;
        }
        return false;
    }

    public void removeMe()
    {
        if (atTop() == true)
        {
            World w = getWorld();
            w.removeObject(this);
        }
    }

    public void fade()

    {
        //GreenfootImage img = getImage();
        //int alpha = getImage().getTransparency();
        //if (getImage().getTransparency() >= 10)
        alph-=1;
            getImage().setTransparency(alph);
        if(getImage().getTransparency() < 3)
        {
            getWorld().removeObject(this);
        }
    }
}