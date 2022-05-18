import greenfoot.*; 
public class Enemy extends Actor
{
    static final int LEFT = 0;
    static final int RIGHT = 1;
    static final int CHASING_RANGE = 160;
    
    int holdToAttack=0;
    int imageRepetition;
    int currentImage = 0;
    int counterAnimation = 0;
    
    private int health;
    int direction = RIGHT;    
    int xDistance;
    int yDistance;
    int hipotenuse;
    private int speed;
    
    boolean attacking = false;
    boolean hurted = false;
    boolean vulnerability = true;
    boolean walking = false;
    boolean isNear = false;
    
    
    public Enemy(int health, int speed)
    {
        this.health = health;
        this.speed = speed;
        
    }
    public void act()
    {
        setDistance();
        checkChasing();
    }
    
    private void setDistance()
    {
        xDistance = getWorldOfType(MyWorld.class).character.getX()-getX();
        yDistance = getWorldOfType(MyWorld.class).character.getY()-getY();
        
        hipotenuse = (xDistance^2 + yDistance^2)^(1/2);
        if(hipotenuse <= 160)
            isNear = true;
        else
            isNear = false;
        
    }
    
    private void checkChasing()
    {
        if(isNear==true)
        {
            if(xDistance > 0 )
            {
                setLocation(getX()+speed,getY());
                direction = RIGHT;
            }
            else if(xDistance < 0)
            {
                setLocation(getX()-speed,getY());
                direction = LEFT;
            }
            walking = true;
                
        }
    }

    
    
}
