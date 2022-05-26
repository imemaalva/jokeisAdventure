import greenfoot.*; 
public class Enemy extends ScrollingActor{
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int CHASING_RANGE = 160;

    private static final int ZOMBIE = 0;
    private static final int SKELLINGTON = 1;
    private static final int DEMON = 2;

    private int enemyType;

    public int holdToAttack=1;
    public int imageRepetition;
    public int currentImage = 0;
    public int counterAnimation = 0;

    public int playerX;
    public int playerY;
    public int distance;

    public int health;
    public int direction = RIGHT;    
    public int speed;
    private int strength;
    public int jumpStrength;

    public boolean attacking = false;
    public boolean hurted = false;
    public boolean vulnerability = true;
    public boolean walking = false;
    public boolean destroyed = false;
    public boolean up;
    public boolean appearing = true;
    public boolean appearingStart = false;

    public static final int ACCELERATION = 1;
    public int vSpeed = 0;
    public boolean jumping = false;
    public boolean collision = false;

    public Enemy(int health, int speed, int type, int strength, int jumpStrength){
        this.health = health;
        this.speed = speed;
        enemyType = type;
        this.strength = strength;
        this.jumpStrength = jumpStrength;
    }
    
    

    public void checkDestroyed()
    {
        if(health <= 0)
        {
            destroyed = true;
            getWorld().removeObject(this);
        }

    }

    public void checkDamageCollision()
    {
        Weapon  weapon =(Weapon) getOneIntersectingObject(Weapon.class);
        if(weapon != null && vulnerability == true && hurted == false)
        {
            if(weapon.getDamage() > 0)
            {
                getWorld().removeObject(weapon);
                health -= weapon.getDamage();
                hurted = true;
                vulnerability = false;
            }
        }
    }

    public boolean onGround()
    {
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2+8, Block.class);
        if(ground == null)
        {
            jumping = true;
            return false;
        }
        else
        {
            moveToGround(ground);
            return true;
        }
    }

    public boolean checkCellingColision()
    {

        Actor celling = getOneObjectAtOffset(0, -getImage().getHeight()/2, Block.class);
        if(celling != null)
        {
            vSpeed = 0;
            stopByWall(celling);
            return true;
        }
        else
        {
            collision=false;
            return false;
        }
    }

    public boolean checkWallColision()
    {
        Actor wall = getOneIntersectingObject(Block.class);
        if(wall == null)
        {
            collision = false;
            return false;
        }
        else
        {
            stopByWall(wall);
            return true;
        }

    }

    public void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;

        setLocation(getX(), newY);
        jumping = false;
    }

    public void stopByWall(Actor wall)
    {
        int newX;
        int newY;
        int wallWidth = wall.getImage().getWidth();
        int wallHeight = wall.getImage().getHeight();

        if(direction == RIGHT && wall.getX()-16 > getX() )
        {
            newX = wall.getX() - (wallWidth + getImage().getWidth())/2;
            collision = true;
            setLocation(newX-speed+5, getY());
        }
        else if(direction == LEFT && wall.getX()+16 < getX() )
        {
            newX = wall.getX() + (wallWidth + getImage().getWidth())/2;
            collision = true;
            setLocation(newX-speed-5, getY());
        }
    }

    public void calculatePlayerLocation(){
        MainCharacter player =getWorldOfType(ScrollingWorld.class).character;
        if(player != null)
        {
            playerX=player.getX();
            playerY=player.getY();
        }
    }

    public void calculateDistanceWithPlayer(){
        distance=(int)Math.sqrt(Math.pow(playerX-getX(),2)+Math.pow(playerY-getY(),2));
    }

    public void checkChasing(){
        if(distance<=160 && distance>=32 && hurted == false && appearingStart == true && appearing == false){
            if(playerX > getX()+24){
                walking = true;
                setLocation(getX()+speed,getY());
                direction = RIGHT;
            }
            else if(playerX < getX()-24 ){
                walking = true;
                setLocation(getX()-speed,getY());
                direction = LEFT;
            }
            else
            {
                walking = false;
            }
            attacking = false;
            holdToAttack = 20;
        }
        else if (distance > 160)
        {
            attacking = false;
            walking = false;
        }
        else if(distance < 32)
            if (holdToAttack >= 20 && hurted == false && vulnerability == true )
            {
                switch(enemyType)
                {
                    case ZOMBIE: 
                        if(direction == RIGHT)
                            getWorld().addObject(new BasicEnemyAttack(strength),getX()+8,getY());
                        else
                            getWorld().addObject(new BasicEnemyAttack(strength),getX()-8,getY());
                        break;
                    case SKELLINGTON: 
                        if(direction == RIGHT)
                            getWorld().addObject(new BasicEnemyAttack(strength),getX()+8,getY());
                        else
                            getWorld().addObject(new BasicEnemyAttack(strength),getX()-8,getY());
                        break;
                }
                attacking = true;
                holdToAttack=0;
            }
    }  
    public void checkAppearing(){
        if(distance <= 163 && appearingStart == false){
            appearingStart = true;
        }
        else   
            appearingStart = false;
    }
}
