import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import javax.swing.*;
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Lives extends Actor
{
    GreenfootSound sound= new GreenfootSound("pop.wav");
    public int live;

    public Lives()
    {
        live = 5;
        setImage (new GreenfootImage(100, 30));

        update();
    }

    public void addScore()
    {
        live = live - 1;
        update();
        if (live == 0)
        {
            Greenfoot.stop();
            JOptionPane.showMessageDialog(null, "You Lose");
             sound.stop();
        }
    }

    private void update()
    {
        GreenfootImage img = getImage();
        img.clear();
        img.setColor(Color.WHITE);
        img.drawString("Lives: " + live, 4, 20);
    }
}
