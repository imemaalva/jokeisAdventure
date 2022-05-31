import greenfoot.*; 
public class HealthCure extends ScrollingActor
{
    private static final int MAX_COUNTER_HEART = 21;

    private int counterAnimation;
    private int currentImage = 0;
    private int imageRepetition = 0;

    private GreenfootImage []heart;

    public HealthCure()
    {
        heart = new GreenfootImage [MAX_COUNTER_HEART];
        heart[0] = new GreenfootImage("images/Life_0.png");
        heart[1] = new GreenfootImage("images/Life_1.png");
        heart[2] = new GreenfootImage("images/Life_2.png");
        heart[3] = new GreenfootImage("images/Life_3.png");
        heart[4] = new GreenfootImage("images/Life_4.png");
        heart[5] = new GreenfootImage("images/Life_5.png");
        heart[6] = new GreenfootImage("images/Life_6.png");
        heart[7] = new GreenfootImage("images/Life_7.png");
        heart[8] = new GreenfootImage("images/Life_8.png");
        heart[9] = new GreenfootImage("images/Life_9.png");
        heart[10] = new GreenfootImage("images/Life_10.png");
        heart[11] = new GreenfootImage("images/Life_11.png");
        heart[12] = new GreenfootImage("images/Life_12.png");
        heart[13] = new GreenfootImage("images/Life_13.png");
        heart[14] = new GreenfootImage("images/Life_14.png");
        heart[15] = new GreenfootImage("images/Life_15.png");
        heart[16] = new GreenfootImage("images/Life_16.png");
        heart[17] = new GreenfootImage("images/Life_17.png");
        heart[18] = new GreenfootImage("images/Life_18.png");
        heart[19] = new GreenfootImage("images/Life_19.png");
        heart[20] = new GreenfootImage("images/Life_20.png");
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
            if(counterAnimation >= heart.length)
                counterAnimation=0;
            currentImage = (currentImage + 1) % MAX_COUNTER_HEART;
        }
        setImage(heart[currentImage]);
        imageRepetition++;   
    }
}
