import greenfoot.*; 
public class ScoreMenu extends Menu
{
    public ScoreMenu()
    {
        bg = new GreenfootImage("images/Menu_Score.png");
        bg.scale(600,400);
        setBackground(bg);
        
        addObject(new MenuButton(3,1), 508, 360);
    }
}
