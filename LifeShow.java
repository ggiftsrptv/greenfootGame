import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LifeShow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeShow extends Show
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int timeToSwitch;
    
    /**
     * Constructor for objects of class LifeShow.
     * 
     */
    public LifeShow(){
        image1 = new GreenfootImage("lifePony.png");
        image2 = new GreenfootImage("lifePo.png");
    }
    /**
     * Act - do whatever the LifeShow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        switchImage();
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
