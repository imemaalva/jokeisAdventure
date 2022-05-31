import greenfoot.*;  
public class BasicEnemyAttack extends EnemyAttack
{
    private int damage;

    public BasicEnemyAttack(int strenght)
    {
        damage = strenght;
        super.setDamage(damage);
    }

    public void act()
    {
        if(checkWallCollision() == false)
            getWorld().removeObject(this);
    }
}
