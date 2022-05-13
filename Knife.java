import greenfoot.*; 
public class Knife extends Weapon
{
    private static int MAX_COUNTER_SPIN = 4;
    
    private int counterAnimation;
    private int currentImage=0;
    private GreenfootImage []spin;
    public Knife()
    {
        spin = new GreenfootImage [MAX_COUNTER_SPIN];
        spin[0] = new GreenfootImage("images/Knife_0.png");
        spin[1] = new GreenfootImage("images/Knife_1.png");
        spin[2] = new GreenfootImage("images/Knife_2.png");
        spin[3] = new GreenfootImage("images/Knife_3.png");
    }
    public void act()
    {
        animation();
    }
    private void animation()
    {
        counterAnimation++;
        if(counterAnimation >= MAX_COUNTER_SPIN)
            counterAnimation=0;
        currentImage = (currentImage + 1) % spin.length;
        setImage(spin[currentImage]);
    }
}
