import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tryAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryAgain extends Actor
{
    
    /**
     * Act - do whatever the tryAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        changeWorld();
    }    
    
    /**
     * This method will change the world from class Gameover to Playing
     * and this method will call method pause of class Gameover
     */
    public void changeWorld(){
        if(Greenfoot.mouseClicked(this)){
            GameOver.pause();
            Greenfoot.setWorld(new Playing());
        }
    }
}
