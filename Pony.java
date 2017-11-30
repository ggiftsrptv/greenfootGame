import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pony here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pony extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    private GreenfootImage image7;
    private GreenfootImage image8;
    private GreenfootImage image9;
    private int timeToSwitchImage;
    private int delay;
    private boolean changeLife;
    private boolean isSpaceDown;
    private boolean isKeyDown;
    private int timeDelay;
   
   /**
     * Constructor for objects of class Pony.
     * 
     */
   public Pony(){
        image1 = new GreenfootImage("standPo1.png");
        image2 = new GreenfootImage("standPo2.png");
        image3 = new GreenfootImage("standPo3.png");
        image4 = new GreenfootImage("walkPo1.png");
        image5 = new GreenfootImage("walkPo2.png");
        image6 = new GreenfootImage("walkPo3.png");
        image7 = new GreenfootImage("walkPo4.png");
        image8 = new GreenfootImage("walkPo5.png");
        image9 = new GreenfootImage("walkPo6.png");
        delay=0;
        setImage(image1);
        changeLife =false;
        isSpaceDown=false;
        isKeyDown = false;
   }
    
    /**
     * Act - do whatever the Pony wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        switchImage();
        checkKeyPress();
        delay++;
        crashEnemy();
        crashBullet2();
        checkLife();
    }
    
    /**
     * to Animate the picture
     */
    public void switchImage(){
        if(isKeyDown==false){    
            if(timeToSwitchImage>=10){
                    if(getImage() == image1){
                        setImage(image2);
                    }else if(getImage() == image2){
                        setImage(image3);
                    }else{
                        setImage(image1);
                    }
                    timeToSwitchImage =0;
                    
                }else{
                    timeToSwitchImage++;
                }
        }else{
            if(timeToSwitchImage>=3){
                    if(getImage() == image1 || getImage() == image2 || getImage() == image3){
                        setImage(image4);
                    }else if(getImage() == image4){
                        setImage(image5);
                    }else if(getImage() == image5){
                        setImage(image6);
                    }else if(getImage() == image6){
                        setImage(image7);
                    }else if(getImage() == image7){
                        setImage(image8);
                    }else if(getImage() == image8){
                        setImage(image9);
                    }else{
                        setImage(image4);
                    }
                    timeToSwitchImage =0;
                    
                }else{
                    timeToSwitchImage++;
                }
        }
        
    }
    
   
    /**
     * This method will check Key when press the key on keyboard.
     * 
     */
    public void checkKeyPress(){
        
        if(Greenfoot.isKeyDown("down")){
            if(getY()<538){
                setLocation(getX(),getY()+2);
                isKeyDown = true;
            }
        }
        if(Greenfoot.isKeyDown("up")){
            if(getY()>174){
                setLocation(getX(),getY()-2);
                isKeyDown = true;
            }
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-2,getY());
            isKeyDown = true;
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+2,getY());
            isKeyDown = true;
        }
        if(!Greenfoot.isKeyDown("down")&& !Greenfoot.isKeyDown("up") && !Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("right") ){
            isKeyDown = false;
        }
        
        Actor enemy = getOneObjectAtOffset(0, 0, Enemy.class);
        
        if(Greenfoot.isKeyDown("space")&& !isSpaceDown && enemy == null){
            if(delay>=10){
               getWorld().addObject(new Bullet(), getX(),getY());
               Greenfoot.playSound("shoot.wav");
               delay=0;
            }
            isSpaceDown = true;
        }else if(!Greenfoot.isKeyDown("space")&& isSpaceDown){
            isSpaceDown = false;
        }
         
   }
   
   /**
    * This method will check the life of the Pony.
    * 
    */
   public void checkLife(){
       if(LifePony.getLife() < 1){
           Greenfoot.setWorld(new GameOver());
        }
    }
   
   /**
    * This method will check if Pony crash with Enemy class,
    * It will call method of LifePony.
    */
   public void crashEnemy(){
       if(isTouching(Enemy.class)) {
           if(timeDelay >5){
               if(changeLife==false){
                   LifePony.decreaseLife();
                   changeLife = true;
                   Greenfoot.playSound("hit.wav");
               }
               timeDelay=0;
            }else{
                timeDelay++;
            }
       }else{
            changeLife = false;
       }
       
   }
   
   /**
    * This method will check if Pony crash with Bullet2 class,
    * It will call method of LifePony.
    */
   public void crashBullet2(){
       if(isTouching(Bullet2.class)){
            removeTouching(Bullet2.class);
            LifePony.decreaseLife();
       } 
    }
    
   
}
