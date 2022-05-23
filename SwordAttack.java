import greenfoot.*;
public class SwordAttack extends Weapon
{
    private static final int DAMAGE = 5;
    
    private int damageQuantity;
    
    private int timeToAttack=0;
    
    public SwordAttack(int damageMultiplicator)
    {
        damageQuantity = DAMAGE * damageMultiplicator;
    }
    
    public void act()
    {
        lifeTime();
    }
    
    private void lifeTime()
    {
        if(timeToAttack > 5)
            getWorld().removeObject(this);
        if(timeToAttack <= 5)
            timeToAttack++;
    }
}
