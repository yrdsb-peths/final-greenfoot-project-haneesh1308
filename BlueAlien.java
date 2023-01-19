import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueAlien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueAlien extends Actor
{
    GreenfootImage[] animation = new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    int x = 0;
    int y = 0;
    private int xSpeed = 3;
    private int ySpeed = 3;
    int imageIndex = 0;
    /**
     * Act - do whatever the BlueAlien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BlueAlien(int x, int y)
    {
        for(int i = 0; i < animation.length; i++)
        {
            animation[i] = new GreenfootImage("images/Blue_Alien/Alien" + i +".png");
            animation[i].scale(150, 150);
        }
        animationTimer.mark();
        setImage(animation[0]);
        this.x = x;
        this.y = y;
    }
    public void act()
    {
        animateBlueAlien();
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
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            setLocation(this.x, this.y);
        }
    }
    public void animateBlueAlien()
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
