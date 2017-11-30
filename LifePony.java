import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lifePony here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifePony extends Actor
{
    private GreenfootImage image;
    private String[] life = {"lifePony1","lifePony2","lifePony3","lifePony4","lifePony5"};
    private static int levelLife;
    
    /**
     * Constructor for objects of class LifePony.
     * 
     */
    public LifePony(){
        levelLife =5;
        
    }
    
    /**
     * Act - do whatever the lifePony wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkLife();
    }
    
    /**
     * This method will change image of level of life.
     * 
     */
    public void checkLife(){
        switch(levelLife){
            case 0 : image = new GreenfootImage("lifePony0.png");setImage(image); break;
            case 1 : image = new GreenfootImage("lifePony1.png");setImage(image); break;
            case 2 : image = new GreenfootImage("lifePony2.png");setImage(image); break;
            case 3 : image = new GreenfootImage("lifePony3.png");setImage(image); break;
            case 4 : image = new GreenfootImage("lifePony4.png");setImage(image); break;
            case 5 : image = new GreenfootImage("lifePony5.png");setImage(image); break;
        }
    }
    
    /**
     * This method will increase the level life.
     * 
     */
    public static void increaseLife(){
        levelLife++;
    }
    
    /**
     * This method will decrease the level life
     * 
     */
    public static void decreaseLife(){
        levelLife--;
    }
    
    /**
     * This method will return level of life.
     * 
     */
    public static int getLife(){
        return levelLife;
    }
}
