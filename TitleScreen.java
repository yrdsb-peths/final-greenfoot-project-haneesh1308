import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press <space> to start", 30);
        addObject(label,281,186);
        label.setLocation(302,137);
        Label label2 = new Label("Drag mouse and click to shoot", 30);
        addObject(label2,305,221);
        label2.setLocation(294,189);
        Label label3 = new Label("Alien Attack" , 80);
        addObject(label3, getWidth()/2, 70);
        BlueAlien blueAlien = new BlueAlien(400, 250);
        addObject(blueAlien,106,276);
        blueAlien.setLocation(110,275);
        blueAlien.setLocation(116,274);
        GreenAlien greenAlien = new GreenAlien(200, 100);
        addObject(greenAlien,112,362);
        greenAlien.setLocation(124,355);
        RedAlien redAlien = new RedAlien();
        addObject(redAlien,375,276);
        redAlien.setLocation(387,269);
        blueAlien.setLocation(90,271);
        greenAlien.setLocation(85,357);
        redAlien.setLocation(352,265);
        YellowAlien yellowAlien = new YellowAlien(420, 100);
        addObject(yellowAlien,363,361);
        yellowAlien.setLocation(363,367);
        yellowAlien.setLocation(349,359);
        yellowAlien.setLocation(344,358);
        blueAlien.setLocation(86,263);
        blueAlien.setLocation(157,264);
        Label label4 = new Label("Green Alien = \u2713", 40);
        addObject(label4,157,264);
        blueAlien.setLocation(90,260);
        Label label5 = new Label("Blue Alien = \u2713", 40);
        addObject(label5,155,350);
        label5.setLocation(156,353);
        label5.setLocation(156,353);
        Label label6 = new Label(" Red Alien = \u2718", 40);
        addObject(label6,418,271);
        label6.setLocation(418,265);
        yellowAlien.setLocation(416,352);
        Label label7 = new Label("Yellow Alien = \u2713", 40);
        addObject(label7,416,352);
        yellowAlien.setLocation(345,360);
        label6.setLocation(420,267);
        removeObject(yellowAlien);
        removeObject(redAlien);
        removeObject(greenAlien);
        removeObject(blueAlien);
        label5.setLocation(150,356);
        label4.setLocation(170,261);
        label6.setLocation(300,257);
        label6.setLocation(450,263);
        label7.setLocation(440,357);
    }
}
