import greenfoot.*;
import java.util.*;
/**
 * Write a description of class Boom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boom extends Actor
{
    private final static int IMAGE_COUNT= 5;
    private GreenfootImage[] images;
    private static GreenfootImage image;
    private int imageNo = 0;
    private int increment = 1;
    
    /**
     * Constructor for objects of class Boom.
     * 
     */
    public Boom() {
        image = new GreenfootImage("boom1.png");
        initializeImages();
        setImage(images[0]);  
    }    
    
    /** 
     * Create the images for explosion.
     */
    public synchronized void initializeImages() {
        if(images == null) {
            int maxSize = image.getWidth();
            int delta = maxSize / IMAGE_COUNT;
            int size = 0;
            images = new GreenfootImage[IMAGE_COUNT];
            for(int i=0; i < IMAGE_COUNT; i++) {
                size = size + delta;
                images[i] = new GreenfootImage(image);
                images[i].scale(size, size);
            }
        }
    }
    
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    { 
        boomAct();
    }
    
    public void boomAct(){
       // bomb.setVolume(70);
        //bomb.play();
        setImage(images[imageNo]);
        imageNo += increment;
        if(imageNo >= IMAGE_COUNT) {
            increment = -increment;
            imageNo += increment;
        }
        
        if(imageNo < 0) {
            getWorld().removeObject(this);
        }
    
    }
}
