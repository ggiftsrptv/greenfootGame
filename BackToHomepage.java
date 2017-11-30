import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackToHomepage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackToHomepage extends Actor
{
    /**
     * Act - do whatever the BackToHomepage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        changeWorld();
    }
    
    public void changeWorld(){
        if(Greenfoot.mouseClicked(this)){
            GameOver.pause();
            Greenfoot.setWorld(new Homepage());
        }
    }
}
