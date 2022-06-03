import greenfoot.*;
public class SwordAttack extends Weapon
{
    private static final int DAMAGE = 5;

    private int damageQuantity;

    private GreenfootSound sword = new GreenfootSound("sounds/Sword_sound_2.WAV");
    private int timeToAttack=0;

    public SwordAttack(int damageMultiplicator)
    {
        damageQuantity = DAMAGE * damageMultiplicator;
        super.setDamage(damageQuantity);
    }

    public void act()
    {
        checkEnemy();
        if(checkWallCollision() == false)
            getWorld().removeObject(this);
    }
    private void checkEnemy()
    {
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy==null)
            sword.play();
    }


    
}
