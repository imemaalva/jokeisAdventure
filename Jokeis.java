import greenfoot.*;  
public class Jokeis extends ScrollingActor
{
    private static final int MAX_COUNTER_JOKEIS = 10;
    
    private int counterAnimation;
    private int currentImage = 0;
    private int imageRepetition = 0;
    
    private GreenfootImage []jokeis;
    public Jokeis ()
    {
        jokeis = new GreenfootImage [MAX_COUNTER_JOKEIS];
        jokeis[0] = new GreenfootImage("images/Jokeis_0.png");
        jokeis[1] = new GreenfootImage("images/Jokeis_1.png");
        jokeis[2] = new GreenfootImage("images/Jokeis_2.png");
        jokeis[3] = new GreenfootImage("images/Jokeis_3.png");
        jokeis[4] = new GreenfootImage("images/Jokeis_4.png");
        jokeis[5] = new GreenfootImage("images/Jokeis_5.png");
        jokeis[6] = new GreenfootImage("images/Jokeis_6.png");
        jokeis[7] = new GreenfootImage("images/Jokeis_7.png");
        jokeis[8] = new GreenfootImage("images/Jokeis_8.png");
        jokeis[9] = new GreenfootImage("images/Jokeis_9.png");
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
                if(counterAnimation >= jokeis.length)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % MAX_COUNTER_JOKEIS;
            }
        setImage(jokeis[currentImage]);
        imageRepetition++;   
    }
}
