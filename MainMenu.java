import greenfoot.*;  

public class MainMenu extends Menu
{
    public MainMenu()
    {

        bg = new GreenfootImage("images/Menu_Main.png");
        bg.scale(600,400);
        setBackground(bg);
        
        addObject(new MenuButton(0,1), 300, 360);
        addObject(new MenuButton(1,1), 156, 360);
        addObject(new MenuButton(2,1), 444, 360);
        
    }
    
    public void act()
    {
        if(!menuMusic.isPlaying())
          menuMusic.playLoop();
    }
}
