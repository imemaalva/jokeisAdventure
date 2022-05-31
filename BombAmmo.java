import greenfoot.*; 
public class BombAmmo extends ScrollingActor
{
    private static final int MAX_COUNTER_BOMB = 10;

    private int counterAnimation;
    private int currentImage = 0;
    private int imageRepetition = 0;

    private GreenfootImage []bomb;

    BombAmmo()
    {
        bomb = new GreenfootImage [MAX_COUNTER_BOMB];
        bomb[0] = new GreenfootImage("images/Bomb_0.png");
        bomb[1] = new GreenfootImage("images/Bomb_1.png");
        bomb[2] = new GreenfootImage("images/Bomb_2.png");
        bomb[3] = new GreenfootImage("images/Bomb_3.png");
        bomb[4] = new GreenfootImage("images/Bomb_4.png");
        bomb[5] = new GreenfootImage("images/Bomb_5.png");
        bomb[6] = new GreenfootImage("images/Bomb_6.png");
        bomb[7] = new GreenfootImage("images/Bomb_7.png");
        bomb[8] = new GreenfootImage("images/Bomb_8.png");
        bomb[9] = new GreenfootImage("images/Bomb_9.png");
    }

    public void act()
    {
        animation();
    }

    private void animation()
    {
        if(imageRepetition>=4)
        {
            imageRepetition=0;
            counterAnimation++;
            if(counterAnimation >= bomb.length)
                counterAnimation=0;
            currentImage = (currentImage + 1) % MAX_COUNTER_BOMB;
        }
        setImage(bomb[currentImage]);
        imageRepetition++;   
    }
}
