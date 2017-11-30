import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
   
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { move();
        
        
    }
    
    /**
     * Move the Object of this class.
     * 
     */
    public void move(){
        setLocation(getX()-3, getY());
        if(getX()==0){
            getWorld().removeObject(this);
        }
    }
}