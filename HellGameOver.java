import greenfoot.*;
public class HellGameOver extends GameOverScreen
{

    public HellGameOver(int character)
    {
        super(2, character);
        if (character == MISA)
        bg =new GreenfootImage("images/GameOver_Hell_Misa.png");
        else
        bg =new GreenfootImage("images/GameOver_Hell_Ime.png"); 
        
        bg.scale(600,400);
        setBackground(bg);
    }
}
