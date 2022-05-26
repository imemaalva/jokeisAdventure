import greenfoot.*;
public class FragileBrick extends Block
{
    
    private static final int STABLE = 0;
    private static final int MIDDLE = 1;
    private static final int BROKEN = 2;
    
    private int resistence = 20;
    
    private boolean destroyed = false;
    
    private GreenfootImage []damaged;
    
    public FragileBrick()
    {
        damaged = new GreenfootImage[3];
        damaged[STABLE] = new GreenfootImage("images/Block_1.png");
        damaged[MIDDLE] = new GreenfootImage("images/Block_10.png");
        damaged[BROKEN] = new GreenfootImage("images/Block_11.png");
    }
    
    public void act()
    {
        checkDestroyed();
        if(destroyed == false)
        {
        checkResistence();
        checkDamageCollision();
    }
    }
    
    public void checkDestroyed()
    {
        if(resistence <= 0)
        {
            destroyed = true;
            getWorld().removeObject(this);
        }
        
    }
    
    private void checkDamageCollision()
    {
        Weapon  weapon =(Weapon) getOneIntersectingObject(Weapon.class);
        if(weapon != null)
        {
            resistence -= weapon.getDamage();
        }
    }
    
    private void checkResistence()
    {
        if(resistence > 12)
            setImage(damaged[STABLE]);
        else if(resistence > 6)
            setImage(damaged[MIDDLE]);
        else
            setImage(damaged[BROKEN]);
    }
}
