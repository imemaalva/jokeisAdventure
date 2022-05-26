import greenfoot.*;
public class FistAttack extends Weapon
{
    private static final int DAMAGE = 1;
    
    private int damageQuantity;
    
    private int timeToAttack=0;
    
    public FistAttack(int damageMultiplicator)
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