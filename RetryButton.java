import greenfoot.*;  
public class RetryButton extends Actor
{
    private static final int JUNGLE = 0;
    private static final int CEMENTERY = 1;
    private static final int HELL = 2;
    
    private int level;
    private int character;
    public RetryButton(int level, int character)
    {
        this.level = level;
        this.character = character;
    }
    public void act()
    {
        checkClicked();
    }
    private void checkClicked()
    {
        if(Greenfoot.mouseClicked(this))
        {
            switch(level)
            {
                case JUNGLE:
                    Greenfoot.setWorld(new Level1(character));
                break;
                    
            }
        }
    }
}
