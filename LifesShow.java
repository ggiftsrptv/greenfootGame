import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LifesShow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifesShow extends Show
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    private int timeToSwitch;
    
    /**
     * Constructor for objects of class LifesShow.
     * 
     */
    public LifesShow(){
        image1 = new GreenfootImage("lifePony5.png");
        image2 = new GreenfootImage("lifePony4.png");
        image3 = new GreenfootImage("lifePony3.png");
        image4 = new GreenfootImage("lifePony2.png");
        image5 = new GreenfootImage("lifePony1.png");
        image6 = new GreenfootImage("lifePony0.png");
        timeToSwitch=0;
    }
    /**
     * Act - do whatever the LifesShow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        switchImage();
    }
    
    /**
     * Animate level of life.
     * 
     */
    public void switchImage(){
        if(timeToSwitch>=50){
            if(getImage() == image1){
                setImage(image2);
            }else if(getImage() == image2){
                setImage(image3);
            }else if(getImage() == image3){
                setImage(image4);
            }else if(getImage() == image4){
                setImage(image5);
            }else if(getImage() == image5){
                setImage(image6);
            }else{
                setImage(image1);
            }
            timeToSwitch =0;
                    
        }else{
            timeToSwitch++;
         }
    }  
}
