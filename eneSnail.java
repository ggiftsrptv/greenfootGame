import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class eneSnail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class eneSnail extends Enemy
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    private int timeToSwitchImage;
    
    public eneSnail(){
        image1 = new GreenfootImage("eneSnail1.png");
        image2 = new GreenfootImage("eneSnail2.png");
        image3 = new GreenfootImage("eneSnail3.png");
        image4 = new GreenfootImage("eneSnail4.png");
        image5 = new GreenfootImage("eneSnail5.png");
        image6 = new GreenfootImage("eneSnail6.png");
        setImage(image1);
    }
    
    /**
     * Act - do whatever the eneSnail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        switchImage();
        
    }
    
    public void switchImage(){
        if(timeToSwitchImage>=5){
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
            timeToSwitchImage =0;
            
        }else
            timeToSwitchImage++;
        
    }
}
