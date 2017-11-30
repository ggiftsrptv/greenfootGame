import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Playing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Playing extends World
{
    private int delay=0;
    private int delaySnail=0;
    private int delayB =0;
    private static int score;
    private int randomLife;
    static GreenfootSound backgroundMusic = new GreenfootSound("play.wav");
    private boolean coinAppear;
    private int delayCoin=0;
    private int delayBoss=0;
    private boolean bossAppear;

    /**
     * Constructor for objects of class Playing.
     * 
     */
    public Playing()
    {    
        
        super(1000, 600 , 1);
        
        
        addObject(new Pony(), 91, 339);
        ponyLife();
        addObject(new score(),833,38);
        addObject(new ScoreBoard(),885,47);
        
        score=0;
        setPaintOrder(Pony.class,Coin.class,Boss.class,Enemy.class);
        coinAppear=false;
        bossAppear=false;
    }
    
    /**
     * Act - do whatever the star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        randomEnemy1();
        randomEnemy2();
        randomEnemy3();
        randomLife();
        randomCoin();
        randomBoss();
        pause();
        started();
    }
    
    /**
     * This method will pause backgroundMusic of class Playing
     * 
     */
    public static void pause()
    {
        backgroundMusic.pause();
    }
    
    /**
     * This method will make backgroundMusic play loop of class Playing
     * 
     */
    public void started()
    {
        backgroundMusic.playLoop();
    }
    
    /**
     * This method will create object of class Boss
     * 
     */
    public void randomBoss(){
        delayBoss++;
        if(delayBoss>2000 && bossAppear==false){
            addObject(new Boss(),877,Greenfoot.getRandomNumber(368)+170);
            bossAppear=true;
            delayBoss=0;
        }else if(delayBoss<2000){
            bossAppear=false;
        }
    }
    
    /**
     * This method will create object of class Coin
     * 
     */
    public void randomCoin(){
        delayCoin++;
        if(delayCoin>1500 && coinAppear==false){
            addObject(new Coin(),Greenfoot.getRandomNumber(735)+237,Greenfoot.getRandomNumber(350)+231);
            coinAppear=true;
            delayCoin=0;
        }else if(delayCoin<1500){
            coinAppear=false;
        }
    }
    
    /**
     * This method will create object of class EneFish
     * 
     */
    public void randomEnemy1(){
        delay++;
        if(delay>150){
            addObject(new eneFish(), 992,Greenfoot.getRandomNumber(378)+166);
            delay=0;
        }
    }
    
    /**
     * This method will create object of class EneFish2
     * 
     */
    public void randomEnemy2(){
        delayB++;
        if(delayB>180){
            addObject(new eneFish2(), 992,Greenfoot.getRandomNumber(378)+185);
            delayB=0;
        }
    }
    
    
    /**
     * This method will create object of class EneSnail
     * 
     */
    public void randomEnemy3(){
        delaySnail++;
        if(delaySnail>90){
            addObject(new eneSnail(), 992,Greenfoot.getRandomNumber(378)+185);
            delaySnail=0;
        }
    }
    
    /**
     * This method will create object of class Life
     * 
     */
    public void randomLife(){
        randomLife++;
        if(randomLife>1200){
            int x = Greenfoot.getRandomNumber(100);
            addObject(new Life(),992,Greenfoot.getRandomNumber(378)+201);
            randomLife=0;
        }
    }
    
    /**
     * This method will create object of class PonyLife
     * 
     */
    public void ponyLife(){
        addObject(new LifePony(), 661, 33);
        
    }
    
    /**
     * This method will update the score
     * 
     */
    public static void updateScore(){
        score++;
    }
    
    /**
     * This method will return score
     * 
     */
    public static int getIntScore(){
        return score;
    }
    
    /**
     * This method will return String of score
     * 
     */
    public static String getScore(){
        return score+"";
    }
    
    
}
