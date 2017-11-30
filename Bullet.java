import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private boolean changeImage = false;
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        
        crashEnemy();
        //crashBullet2();
    }
    
    /**
     * Move the Object of this class.
     * 
     */
    public void move(){
        setLocation(getX()+10, getY());
        
    }
    
    /**
    * Check if Bullet crash with Enemy class.
    * 
    */
    public void crashEnemy(){
        
        if(isTouching(Enemy.class)){
            Greenfoot.playSound("dead.wav");
            removeTouching(Enemy.class);
            
            getWorld().addObject(new Boom(), getX(), getY());
            getWorld().removeObject(this);
            Playing.updateScore();
        }
        else {
            if(isAtEdge()){
                getWorld().removeObject(this);
            }
        
        }
    }
    
}
