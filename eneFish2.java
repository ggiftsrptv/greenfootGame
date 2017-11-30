import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class eneFish2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class eneFish2 extends Enemy
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int timeToSwitchImage;
    public eneFish2(){
        image1 = new GreenfootImage("eneFishB1.png");
        image2 = new GreenfootImage("eneFishB2.png");
        setImage(image1);
    }
    /**
     * Act - do whatever the eneFish2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        switchImage();
        
    }
    
    public void switchImage(){
        if(timeToSwitchImage>=5){
            if(getImage() == image1)
                setImage(image2);
            else
                setImage(image1);
                timeToSwitchImage =0;
            
        }else
            timeToSwitchImage++;
        
    }
}
