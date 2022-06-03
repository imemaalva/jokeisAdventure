import greenfoot.*; 
public class ScoreMenu extends Menu
{
    public ScoreMenu()
    {
        if(menuMusic==null)
        {
        menuMusic = new GreenfootSound("sounds/Sweet Child O' Mine.mp3");
        
        menuMusic.playLoop();
        }
        bg = new GreenfootImage("images/Menu_Score.png");
        bg.scale(600,400);
        setBackground(bg);
        
        addObject(new MenuButton(3,1), 508, 360);
    }
    
}
