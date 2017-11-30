import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    static GreenfootSound backgroundMusic = new GreenfootSound("gameover.wav");
    
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        Playing.pause();
        addObject(new TryAgain(), 692, 382);
        addObject(new BackToHomepage(), 827, 507);
        addObject(new ScoreBoard(),653, 269);
        
    }
    
    /**
     * Act - do whatever the star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        pause();
        
        started();
        
    }
    
    /**
     * This method will pause backgroundMusic of class Gameover
     * 
     */
    public static void pause()
    {
        backgroundMusic.pause();
    }
    
    /**
     * This method will make backgroundMusic play loop of class Gameover 
     * 
     */
    public void started()
    {
        backgroundMusic.play();
        
    }
}
