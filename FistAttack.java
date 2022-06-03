import greenfoot.*;
public class FistAttack extends Weapon
{
    private static final int DAMAGE = 1;

    private int damageQuantity;

    private int timeToAttack=0;
    
    private GreenfootSound hit = new GreenfootSound("sounds/Throw.mp3");

    public FistAttack(int damageMultiplicator)
    {
        hit.play();
        damageQuantity = DAMAGE * damageMultiplicator;
        super.setDamage(damageQuantity);
    }

    public void act()
    {
        if(checkWallCollision() == false)
            getWorld().removeObject(this);
    }
}