import greenfoot.*; 
public class Enemy extends Actor{
    static final int LEFT = 0;
    static final int RIGHT = 1;
    static final int CHASING_RANGE = 160;

    int holdToAttack=0;
    int imageRepetition;
    int currentImage = 0;
    int counterAnimation = 0;

    int playerX;
    int playerY;
    int distance;

    private int health;
    int direction = RIGHT;    
    private int speed;

    boolean attacking = false;
    boolean hurted = false;
    boolean vulnerability = true;
    boolean walking = false;
    boolean isNear = false;

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
