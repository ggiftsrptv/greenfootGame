import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    private boolean canMove =true;
    private int delay;
    private int timeToAppear;
    
    /**
     * Constructor for objects of class Boss.
     * 
     */
    public Boss(){
        delay=0;
        timeToAppear=0;
    }
    
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        shootPony();
        bossAppear();
    }
    
    /**
     * Move the Object of this class.
     * 
     */
    public void move(){
        if(getY()<176){
            canMove=false;
        }else if(getY()>536){
            canMove=true;
        }
        if(getY()>174 && canMove==true){
            setLocation(getX(),getY()-2);
        }else if(getY()<538 && canMove==false){
            setLocation(getX(),getY()+2);
        }
    }
    
    /**
     * Add object Bullet2 at the same location of Boss
     * 
     */
    public void shootPony(){
        delay++;
        if(delay>30){
            getWorld().addObject(new Bullet2(), getX(),getY());
            delay=0;
        }
    }
    
    /**
     * Remove Object from class.
     * 
     */
    public void bossAppear(){
        timeToAppear++;
        if(timeToAppear>400){
                getWorld().removeObject(this);
                timeToAppear=0;
        }
    }
}
