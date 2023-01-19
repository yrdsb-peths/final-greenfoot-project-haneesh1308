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
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1, false);
        Pointer pointer = new Pointer();
        addObject(pointer, -10, -10);
        GreenAlien greenAlien = new GreenAlien(200, 100);
        addObject(greenAlien, 200, 100);
        BlueAlien blueAlien = new BlueAlien(400, 250);
        addObject(blueAlien, 400, 250);
        RedAlien redAlien = new RedAlien();
        addObject(redAlien, 150, 270);
        YellowAlien yellowAlien = new YellowAlien(420, 100);
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
            level += 1;
        }
    }
    
    public void GameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    
}


