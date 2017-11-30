import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life extends Actor
{
    private static boolean delete;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int timeToSwitch;
    
    /**
     * Constructor for objects of class Life.
     * 
     */
    public Life(){
        delete = false;
        image1 = new GreenfootImage("lifePony.png");
        image2 = new GreenfootImage("lifePo.png");
    }
    
    /**
     * Act - do whatever the Life wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-3, getY());
        getLife();
        switchImage();
    }
    
    /**
     * if life touch with class Pony,
     * it will update level of life.
     */
    public void getLife(){
        if(isTouching(Pony.class)){
             Greenfoot.playSound("coin-life.wav");
             if(LifePony.getLife() < 5){
                 LifePony.increaseLife();
             }
             getWorld().removeObject(this);
        }else{
            if(isAtEdge()){
                getWorld().removeObject(this);
            }
        }
    }
    
    /**
     * Animate life.
     * 
     */
    public void switchImage(){
        if(timeToSwitch>=30){
            if(getImage() == image1){
                setImage(image2);
            }else{
                setImage(image1);
            }
            timeToSwitch =0;
                    
        }else{
            timeToSwitch++;
         }
    }

   }
