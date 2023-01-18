import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1, false);
        Pointer pointer = new Pointer();
        addObject(pointer, -10, -10);
        GreenAlien greenAlien = new GreenAlien();
        addObject(greenAlien, 200, 100);
        BlueAlien blueAlien = new BlueAlien();
        addObject(blueAlien, 400, 250);
        RedAlien redAlien = new RedAlien();
        addObject(redAlien, 150, 270);
        YellowAlien yellowAlien = new YellowAlien();
        addObject(yellowAlien, 420, 100);
    }
}


