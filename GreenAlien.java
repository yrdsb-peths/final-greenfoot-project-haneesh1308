import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenAlien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenAlien extends Actor
{
    GreenfootImage[] animation = new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    private int xSpeed = 3;
    private int ySpeed = 3;
    /**
     * Act - do whatever the GreenAlien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GreenAlien()
    {
        for(int i = 0; i < animation.length; i++)
        {
            animation[i] = new GreenfootImage("images/Green_Alien/Alien" + i +".png");
            animation[i].scale(100, 100);
        }
        animationTimer.mark();
        setImage(animation[0]);
    }
    public void act()
    {
        animateGreenAlien();
        setLocation(getX() + xSpeed, getY() + ySpeed);
        if(getY() > 380)
        {
            ySpeed = ySpeed *-1;
        }
        else
        if(getX() > 580)
        {
            xSpeed = xSpeed *-1;
        }
        else
        if(getY() < 20)
        {
            ySpeed = ySpeed *-1;
        }
        else
        if(getX() < 20)
        {
            xSpeed = xSpeed *-1;
        }
        
        if (Greenfoot.mouseClicked(this))
        {
            getWorld().removeObject(this);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
        }
    }
    int imageIndex = 0;
    public void animateGreenAlien()
    {
        if(animationTimer.millisElapsed() < 125)
        {
            return;
        }
        animationTimer.mark();
        setImage(animation[imageIndex]);
        imageIndex = (imageIndex + 1) % animation.length;
    }
    
    
}
