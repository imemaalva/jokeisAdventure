import greenfoot.*;
public class SwordAttack extends Weapon
{
    private static final int DAMAGE = 5;

    private int damageQuantity;

    private int timeToAttack=0;

    public SwordAttack(int damageMultiplicator)
    {
        damageQuantity = DAMAGE * damageMultiplicator;
        super.setDamage(damageQuantity);
    }

    public void act()
    {
        if(checkWallCollision() == false)
            getWorld().removeObject(this);
    }

    
}
