import greenfoot.*;  
public class BombAttack extends Weapon
{
    private static final int MAX_COUNTER_EXPLODE = 14;

    private boolean damaging = false;

    private static final int DAMAGE = 10;

    private int timeBeforeExplode = 0;
    private int counterAnimation;
    private int currentImage=0;
    private int imageRepetition = 0;

    private GreenfootImage []explode;
    public BombAttack()
    {
        explode= new GreenfootImage [MAX_COUNTER_EXPLODE];
        explode[0] = new GreenfootImage("images/Bomb_Explode_0.png");
        explode[1] = new GreenfootImage("images/Bomb_Explode_1.png");
        explode[2] = new GreenfootImage("images/Bomb_Explode_2.png");
        explode[3] = new GreenfootImage("images/Bomb_Explode_3.png");
        explode[4] = new GreenfootImage("images/Bomb_Explode_4.png");
        explode[5] = new GreenfootImage("images/Bomb_Explode_5.png");
        explode[6] = new GreenfootImage("images/Bomb_Explode_6.png");
        explode[7] = new GreenfootImage("images/Bomb_Explode_7.png");
        explode[8] = new GreenfootImage("images/Bomb_Explode_8.png");
        explode[9] = new GreenfootImage("images/Bomb_Explode_9.png");
        explode[10] = new GreenfootImage("images/Bomb_Explode_10.png");
        explode[11] = new GreenfootImage("images/Bomb_Explode_11.png");
        explode[12] = new GreenfootImage("images/Bomb_Explode_12.png");
        explode[13] = new GreenfootImage("images/Bomb_Explode_13.png");

        setImage(explode[currentImage]);
    }

    public void act()
    {
        animation();
    }

    public boolean isDamaging()
    {
        return damaging;
    }

    private void animation()
    {
        if(getImage() == explode[9])
        {
            damaging=true;
            super.setDamage(DAMAGE);
        }
        if(getImage() == explode[MAX_COUNTER_EXPLODE-1])
            getWorld().removeObject(this);
        if(imageRepetition >=2)
        {
            imageRepetition = 0;
            if(timeBeforeExplode > 15)
            {
                counterAnimation++;
                if(counterAnimation >= MAX_COUNTER_EXPLODE)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % explode.length;
                setImage(explode[currentImage]);
            }
            if(timeBeforeExplode <= 15)
                timeBeforeExplode++;
        }
        imageRepetition++;
    }
}
