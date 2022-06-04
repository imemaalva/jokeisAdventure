import greenfoot.*; 
public class CementeryGameOver extends GameOverScreen
{
    
    public CementeryGameOver(int character, int score)
    {
        super(1, character, score);
        if (character == MISA)
        bg =new GreenfootImage("images/GameOver_Cementery_Misa.png");
        else
        bg =new GreenfootImage("images/GameOver_Cementery_Ime.png"); 
        
        bg.scale(600,400);
        setBackground(bg);
    }
}
