import greenfoot.*; 
public class KnifeAttack extends Weapon
{
    private static final int DAMAGE = 3;
    private static final int MAX_COUNTER_SPIN = 4;
    private static final int LEFT = 0;
    private static final int RIGHT = 1;

    private int damageQuantity;
    
    private GreenfootSound thrown = new GreenfootSound("sounds/Throw.mp3");

    private int counterAnimation;
    private int currentImage=0;
    private GreenfootImage []spin;
    private int direction;
    private int speed=6;

    public KnifeAttack(int direction, int damageMultiplicator)
    {
        damageQuantity = DAMAGE * damageMultiplicator;
        thrown.play();
        spin = new GreenfootImage [MAX_COUNTER_SPIN];
        spin[0] = new GreenfootImage("images/Knife_0.png");
        spin[1] = new GreenfootImage("images/Knife_1.png");
        spin[2] = new GreenfootImage("images/Knife_2.png");
        spin[3] = new GreenfootImage("images/Knife_3.png");
        super.setDamage(damageQuantity);
        this.direction=direction;
    }

    public void act()
    {
        movement();
        checkWallCollision();

    }

    private void movement()
    {
        counterAnimation++;
        if(counterAnimation >= MAX_COUNTER_SPIN)
            counterAnimation=0;
        currentImage = (currentImage + 1) % spin.length;
        setImage(spin[currentImage]);
        if (direction == RIGHT)
            setLocation(getX()+speed,getY());
        else
            setLocation(getX()-speed,getY());

    }

    
}
