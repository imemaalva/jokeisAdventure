import greenfoot.*;
public class SwordAttack extends Weapon
{
    private int timeToAttack=0;
    
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
