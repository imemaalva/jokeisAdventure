import greenfoot.*;  
public class EnemyAttack extends ScrollingActor
{
    private int damage;
    
    public void setDamage(int damage)
    {
        this.damage = damage;
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public boolean checkWallCollision()
    {
            Actor wall = getOneIntersectingObject(Block.class);
            
            if(wall != null)
            {
            if(damage > 0)
                getWorld().removeObject(this);
                return true;
            }
            else
                return false;
    }
}
