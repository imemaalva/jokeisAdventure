import greenfoot.*; 
public class Enemy extends ScrollingActor{
    static final int LEFT = 0;
    static final int RIGHT = 1;
    static final int CHASING_RANGE = 160;

    public int holdToAttack=0;
    public int imageRepetition;
    public int currentImage = 0;
    public int counterAnimation = 0;

    public int playerX;
    public int playerY;
    public int distance;

    public int health;
    public int direction = RIGHT;    
    public int speed;

    public boolean attacking = false;
    public boolean hurted = false;
    public boolean vulnerability = true;
    public boolean walking = false;
    public boolean isNear = false;

    public Enemy(int health, int speed){
        this.health = health;
        this.speed = speed;

    }
    public void calculatePlayerLocation(){
        MainCharacter player =(MainCharacter)getWorld().getObjects(MainCharacter.class).get(0);
        playerX=player.getX();
        playerY=player.getY();
    }

    public void checkDistance(){

        if(distance<=160 && distance>=32)
            isNear = true;
        else
            isNear = false;

    }

    public void checkChasing(){
        if(isNear==true){
            if(playerX > getX() ){
                setLocation(getX()+speed,getY());
                direction = RIGHT;
            }
            else if(playerX < getX() ){
                setLocation(getX()-speed,getY());
                direction = LEFT;
            }
            walking = true;

        }
        else
            walking = false;
    }  
}
