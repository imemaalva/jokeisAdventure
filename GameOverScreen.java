import greenfoot.*; 
public class GameOverScreen extends World
{
    public static GreenfootSound gameOverMusic = new GreenfootSound("sounds/Home Sweet Home.mp3");
    public static final int MISA = 0;
    public static final int IME = 2;
    
    public static final int JUNGLE = 0;
    public static final int CEMENTERY = 1;
    public static final int HELL = 2;
    public GreenfootImage bg;
    public GameOverScreen(int level, int character)
    {    
        super(600, 400, 1); 
        gameOverMusic.play();
        addObject(new RetryButton(level,character),508,360);
    }
}
