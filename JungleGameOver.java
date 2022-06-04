import greenfoot.*;
public class JungleGameOver extends GameOverScreen
{
    
    public JungleGameOver(int character, int score)
    {
        super(0,character, score);
        if (character == MISA)
        bg =new GreenfootImage("images/GameOver_Jungle_Misa.png");
        else
        bg =new GreenfootImage("images/GameOver_Jungle_Ime.png"); 
        
        
        bg.scale(600,400);
        setBackground(bg);
    }
}
