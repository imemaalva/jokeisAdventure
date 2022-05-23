import greenfoot.*;
public class FistAttack extends Weapon
{
    private static final int DAMAGE = 1;
    
    private int damageQuantity;
    
    private int timeToAttack=0;
    
    public FistAttack(int damageMultiplicator)
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