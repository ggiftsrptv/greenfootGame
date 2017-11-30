import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    GreenfootImage image;
    
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        repaintScore();
    }
    
    
    /**
     * Constructor for objects of class ScoreBoard.
     * And this method will draw the ScoreBoard.
     */
    public ScoreBoard(){
        String score = Playing.getScore();
        image = new GreenfootImage(100,50);
        image.setColor(Color.BLACK);
        image.setFont(new java.awt.Font(score, Font.PLAIN,30));
        image.drawString(score+"", 50,25);
        setImage(image);
    }
    
    /**
     * This method will draw the ScoreBoard.
     * 
     */
    public void repaintScore(){
        String score = Playing.getScore();
        image.clear();
        image.setColor(Color.BLACK);
        image.setFont(new java.awt.Font(score, Font.PLAIN,30));
        image.drawString(score, 50,25);
        setImage(image);
    }
}