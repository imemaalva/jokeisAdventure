import greenfoot.*;  
public class FireBallAttack extends EnemyAttack
{
    private int damage;
    
    private static final int MAX_COUNTER_FIRE = 8;
    private static final int LEFT = 0;
    private static final int RIGHT = 1;


    private int counterAnimation;
    private int currentImage=0;
    private GreenfootImage [][]fireball;
    private int direction;
    private int speed=6;

    public FireBallAttack(int strenght, int direction)
    {
        fireball = new GreenfootImage [2][MAX_COUNTER_FIRE];
        fireball[RIGHT][0] = new GreenfootImage("images/Fireball_right_0.png");
        fireball[RIGHT][1] = new GreenfootImage("images/Fireball_right_1.png");
        fireball[RIGHT][2] = new GreenfootImage("images/Fireball_right_2.png");
        fireball[RIGHT][3] = new GreenfootImage("images/Fireball_right_3.png");
        fireball[RIGHT][4] = new GreenfootImage("images/Fireball_right_4.png");
        fireball[RIGHT][5] = new GreenfootImage("images/Fireball_right_5.png");
        fireball[RIGHT][6] = new GreenfootImage("images/Fireball_right_6.png");
        fireball[RIGHT][7] = new GreenfootImage("images/Fireball_right_7.png");
        
        fireball[LEFT][0] = new GreenfootImage("images/Fireball_left_0.png");
        fireball[LEFT][1] = new GreenfootImage("images/Fireball_left_1.png");
        fireball[LEFT][2] = new GreenfootImage("images/Fireball_left_2.png");
        fireball[LEFT][3] = new GreenfootImage("images/Fireball_left_3.png");
        fireball[LEFT][4] = new GreenfootImage("images/Fireball_left_4.png");
        fireball[LEFT][5] = new GreenfootImage("images/Fireball_left_5.png");
        fireball[LEFT][6] = new GreenfootImage("images/Fireball_left_6.png");
        fireball[LEFT][7] = new GreenfootImage("images/Fireball_left_7.png");
        this.direction=direction;
        damage = strenght;
        super.setDamage(damage);
    }

    public void act()
    {
        
        movement();
        checkWallCollision();        
    }
    
     private void movement()
    {
        counterAnimation++;
        if(counterAnimation >= MAX_COUNTER_FIRE)
            counterAnimation=0;
        currentImage = (currentImage + 1) % MAX_COUNTER_FIRE;
        setImage(fireball[direction][currentImage]);
        if (direction == RIGHT)
            setLocation(getX()+speed,getY());
        else
            setLocation(getX()-speed,getY());

    }
}
