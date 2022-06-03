import greenfoot.*;  
public class RetryButton extends Actor
{
    private static final int JUNGLE = 0;
    private static final int CEMENTERY = 1;
    private static final int HELL = 2;
    
    private GreenfootSound button = new GreenfootSound("sounds/button.mp3");
    
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
            getWorldOfType(GameOverScreen.class).gameOverMusic.stop();
            button.play();
            switch(level)
            {
                case JUNGLE:
                    Greenfoot.setWorld(new Level1(character));
                break;
                case CEMENTERY:
                    Greenfoot.setWorld(new Level4(character,100,0,0,0));
                break;
                case HELL:
                    Greenfoot.setWorld(new Level7(character,100,0,0,0));
                break;
                    
            }
        }
    }
}
