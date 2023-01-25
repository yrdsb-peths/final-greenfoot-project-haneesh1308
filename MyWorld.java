import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    GreenAlien greenAlien = new GreenAlien(200, 100);
    BlueAlien blueAlien = new BlueAlien(400, 250);
    YellowAlien yellowAlien = new YellowAlien(420, 100);
    RedAlien redAlien = new RedAlien();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1, false);
        Pointer pointer = new Pointer();
        addObject(pointer, -10, -10);
        addObject(greenAlien, 200, 100);
        addObject(blueAlien, 400, 250);
        addObject(redAlien, 150, 270);
        addObject(yellowAlien, 420, 100);
            
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 40, 40);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 10 == 0)
        {
            level += 2;
            greenAlien.setSpeed(level);
            blueAlien.setSpeed(level);
            yellowAlien.setSpeed(level);
            redAlien.setSpeed(level);
        }
    }
    
    public void GameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(redAlien))
        {
            removeObject(yellowAlien);
            removeObject(greenAlien);
            removeObject(blueAlien);
            removeObject(scoreLabel);
        }
    }
    
}


