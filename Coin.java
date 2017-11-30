import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    private int timeToSwitch;
    private int timeToAppear;
    
    /**
     * Constructor for objects of class coin.
     * 
     */
    public Coin(){
        image1 = new GreenfootImage("coin1.png");
        image2 = new GreenfootImage("coin2.png");
        image3 = new GreenfootImage("coin3.png");
        image4 = new GreenfootImage("coin4.png");
        image5 = new GreenfootImage("coin5.png");
        image6 = new GreenfootImage("coin6.png");
        timeToSwitch=0;
        timeToAppear=0;
    }
    
    /**
     * Act - do whatever the coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        switchImage();
        getCoin();
        timeToAppear++;
    }  
    
    /**
     *  Animate coin.
     * 
     */
    public void switchImage(){
        if(timeToSwitch>=4){
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
    
    /**
     * if coin touch with class Pony,
     * it will update score.
     * 
     */
     public void getCoin(){
        if(isTouching(Pony.class)){
             Greenfoot.playSound("coin-life.wav");
             for(int i=0 ; i<20 ; i++){
                 Playing.updateScore();
             }
             getWorld().removeObject(this);
        }else{
            if(timeToAppear>400){
                getWorld().removeObject(this);
                timeToAppear=0;
            }
        }
    }
}
