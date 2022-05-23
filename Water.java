import greenfoot.*; 
public class Water extends ScrollingActor
{
    private static final int MAX_COUNTER_WATER = 16;
    
    private int counterAnimation;
    private int currentImage = 0;
    private int imageRepetition = 0;
    
    private GreenfootImage []water;
    
    public Water()
    {
        water = new GreenfootImage [MAX_COUNTER_WATER];
        water[0] = new GreenfootImage("images/Water_0.png");
        water[1] = new GreenfootImage("images/Water_1.png");
        water[2] = new GreenfootImage("images/Water_2.png");
        water[3] = new GreenfootImage("images/Water_3.png");
        water[4] = new GreenfootImage("images/Water_4.png");
        water[5] = new GreenfootImage("images/Water_5.png");
        water[6] = new GreenfootImage("images/Water_6.png");
        water[7] = new GreenfootImage("images/Water_7.png");
        water[8] = new GreenfootImage("images/Water_8.png");
        water[9] = new GreenfootImage("images/Water_9.png");
        water[10] = new GreenfootImage("images/Water_10.png");
        water[11] = new GreenfootImage("images/Water_11.png");
        water[12] = new GreenfootImage("images/Water_12.png");
        water[13] = new GreenfootImage("images/Water_13.png");
        water[14] = new GreenfootImage("images/Water_14.png");
        water[15] = new GreenfootImage("images/Water_15.png");
    }
    
    public void act()
    {
        animation();
    }
    
    private void animation()
    {
        if(imageRepetition>=5)
            {
                imageRepetition=0;
                counterAnimation++;
                if(counterAnimation >= water.length)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % MAX_COUNTER_WATER;
            }
        setImage(water[currentImage]);
        imageRepetition++;   
    }
}
