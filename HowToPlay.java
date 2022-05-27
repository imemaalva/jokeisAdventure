import greenfoot.*;  
public class HowToPlay extends Menu
{
    
    public HowToPlay()
    {
        bg = new GreenfootImage("images/Menu_HowToPlay.png");
        bg.scale(600,400);
        setBackground(bg);
        
        addObject(new MenuButton(3,1), 508, 360);
    }
}
