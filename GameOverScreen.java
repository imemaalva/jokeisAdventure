import greenfoot.*; 
public class GameOverScreen extends World
{
    public static GreenfootSound gameOverMusic = new GreenfootSound("sounds/Home Sweet Home.mp3");
    public static final int MISA = 0;
    public static final int IME = 2;
    
    public static final int JUNGLE = 0;
    public static final int CEMENTERY = 1;
    public static final int HELL = 2;
    
    public String name; 
    public int score;
    public GreenfootImage bg;
    

    
    public GameOverScreen(int level, int character, int score)
    {    
        super(600, 400, 1); 
        gameOverMusic.play();
        this.score = score;
        addObject(new RetryButton(level,character),508,360);
      
        name = Greenfoot.ask("Nombre: ");
        showText(name, 300, 175);
        showText("Score: " + score, 300, 200);
        Greenfoot.setWorld(new ScoreMenu());
    }
    
    public int getScore(){
        return this.score;
    }

}
