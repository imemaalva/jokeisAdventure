import greenfoot.*; 
public class Lava extends ScrollingActor
{
    private static final int MAX_COUNTER_LAVA = 16;

    private int counterAnimation;
    private int currentImage = 0;
    private int imageRepetition = 0;

    private GreenfootImage []lava;

    public Lava()
    {
        lava = new GreenfootImage [MAX_COUNTER_LAVA];
        lava[0] = new GreenfootImage("images/Lava_0.png");
        lava[1] = new GreenfootImage("images/Lava_1.png");
        lava[2] = new GreenfootImage("images/Lava_2.png");
        lava[3] = new GreenfootImage("images/Lava_3.png");
        lava[4] = new GreenfootImage("images/Lava_4.png");
        lava[5] = new GreenfootImage("images/Lava_5.png");
        lava[6] = new GreenfootImage("images/Lava_6.png");
        lava[7] = new GreenfootImage("images/Lava_7.png");
        lava[8] = new GreenfootImage("images/Lava_8.png");
        lava[9] = new GreenfootImage("images/Lava_9.png");
        lava[10] = new GreenfootImage("images/Lava_10.png");
        lava[11] = new GreenfootImage("images/Lava_11.png");
        lava[12] = new GreenfootImage("images/Lava_12.png");
        lava[13] = new GreenfootImage("images/Lava_13.png");
        lava[14] = new GreenfootImage("images/Lava_14.png");
        lava[15] = new GreenfootImage("images/Lava_15.png");
    }

    public void act()
    {
        animation();
    }

    private void animation()
    {
        if(imageRepetition>=7)
        {
            imageRepetition=0;
            counterAnimation++;
            if(counterAnimation >= lava.length)
                counterAnimation=0;
            currentImage = (currentImage + 1) % MAX_COUNTER_LAVA;
        }
        setImage(lava[currentImage]);
        imageRepetition++;   
    }
}
