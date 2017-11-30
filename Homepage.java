import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hompage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Homepage extends World
{
     static GreenfootSound backgroundMusic = new GreenfootSound("home.wav");
 
    /**
     * Constructor for objects of class hompage.
     * 
     */
    public Homepage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        addObject(new Start(), 815, 265);
        addObject(new howto(), 815, 444);
        addObject(new ScoreBoard(), 815, 444);
        
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
     * This method will pause backgroundMusic of class Homepage
     * 
     */
    public static void pause()
    {
        backgroundMusic.pause();
    }
    
    /**
     * This method will make backgroundMusic play loop of class Homepage  
     * 
     */
    public void started()
    {
        backgroundMusic.playLoop();
    }
    
}
