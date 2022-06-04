import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Demon extends Enemy {
    private static final int MAX_COUNTER_STAY = 5;
    private static final int MAX_COUNTER_ATTACK = 6;
    private static final int MAX_COUNTER_HURT = 4;
    private static final int MAX_COUNTER_WALK = 12;
    private static final int MAX_COUNTER_FLY = 12;
    private static final int MAX_COUNTER_FALL = 2;
    private static final int MAX_COUNTER_JUMP = 2;

    private static final int SCORE = 150;
    
    private static final int SPEED = 3;
    private static final int INITIAL_HEALTH = 30;
    private static final int STRENGTH = 8;
    private static final int JUMP_STRENGTH = 17;

    private GreenfootImage [][]stay;
    private GreenfootImage [][]attack;
    private GreenfootImage [][]hurt;
    private GreenfootImage [][]walk;
    private GreenfootImage []fall; 
    private GreenfootImage [][]fly;
    private GreenfootImage [][]attack_fly;

    private int holdToJump=0;
    
    private boolean flying = false;
    private int holdToThrow = 0;

    public Demon(){
        super(INITIAL_HEALTH, SPEED, 2, STRENGTH, JUMP_STRENGTH,false,0, SCORE);
        appearing = false;
        appearingStart = true;

        
        fall = new GreenfootImage[MAX_COUNTER_FALL];
        fall[LEFT]=new GreenfootImage("images/Demon_Fall_left_0.png");
        fall[RIGHT]=new GreenfootImage("images/Demon_Fall_right_0.png");

        stay = new GreenfootImage[MAX_COUNTER_STAY][2];
        stay[0][LEFT]=new GreenfootImage("images/Demon_left_0.png");
        stay[1][LEFT]=new GreenfootImage("images/Demon_left_1.png");
        stay[2][LEFT]=new GreenfootImage("images/Demon_left_2.png");
        stay[3][LEFT]=new GreenfootImage("images/Demon_left_3.png");
        stay[4][LEFT]=new GreenfootImage("images/Demon_left_4.png");
        stay[0][RIGHT]=new GreenfootImage("images/Demon_right_0.png");
        stay[1][RIGHT]=new GreenfootImage("images/Demon_right_1.png");
        stay[2][RIGHT]=new GreenfootImage("images/Demon_right_2.png");
        stay[3][RIGHT]=new GreenfootImage("images/Demon_right_3.png");
        stay[4][RIGHT]=new GreenfootImage("images/Demon_right_4.png");

        attack = new GreenfootImage[MAX_COUNTER_ATTACK][2];
        attack[0][LEFT]=new GreenfootImage("images/Demon_Attack_left_0.png");
        attack[1][LEFT]=new GreenfootImage("images/Demon_Attack_left_1.png");
        attack[2][LEFT]=new GreenfootImage("images/Demon_Attack_left_2.png");
        attack[3][LEFT]=new GreenfootImage("images/Demon_Attack_left_3.png");
        attack[4][LEFT]=new GreenfootImage("images/Demon_Attack_left_4.png");
        attack[5][LEFT]=new GreenfootImage("images/Demon_Attack_left_5.png");
        attack[0][RIGHT]=new GreenfootImage("images/Demon_Attack_right_0.png");
        attack[1][RIGHT]=new GreenfootImage("images/Demon_Attack_right_1.png");
        attack[2][RIGHT]=new GreenfootImage("images/Demon_Attack_right_2.png");
        attack[3][RIGHT]=new GreenfootImage("images/Demon_Attack_right_3.png");
        attack[4][RIGHT]=new GreenfootImage("images/Demon_Attack_right_4.png");
        attack[5][RIGHT]=new GreenfootImage("images/Demon_Attack_right_5.png");
        
        attack_fly = new GreenfootImage[MAX_COUNTER_ATTACK][2];
        attack_fly[0][LEFT]=new GreenfootImage("images/Demon_Fly_Attack_left_0.png");
        attack_fly[1][LEFT]=new GreenfootImage("images/Demon_Fly_Attack_left_1.png");
        attack_fly[2][LEFT]=new GreenfootImage("images/Demon_Fly_Attack_left_2.png");
        attack_fly[3][LEFT]=new GreenfootImage("images/Demon_Fly_Attack_left_3.png");
        attack_fly[4][LEFT]=new GreenfootImage("images/Demon_Fly_Attack_left_4.png");
        attack_fly[5][LEFT]=new GreenfootImage("images/Demon_Fly_Attack_left_5.png");
        attack_fly[0][RIGHT]=new GreenfootImage("images/Demon_Fly_Attack_right_0.png");
        attack_fly[1][RIGHT]=new GreenfootImage("images/Demon_Fly_Attack_right_1.png");
        attack_fly[2][RIGHT]=new GreenfootImage("images/Demon_Fly_Attack_right_2.png");
        attack_fly[3][RIGHT]=new GreenfootImage("images/Demon_Fly_Attack_right_3.png");
        attack_fly[4][RIGHT]=new GreenfootImage("images/Demon_Fly_Attack_right_4.png");
        attack_fly[5][RIGHT]=new GreenfootImage("images/Demon_Fly_Attack_right_5.png");

        hurt = new GreenfootImage[MAX_COUNTER_HURT][2];
        hurt[0][LEFT]=new GreenfootImage("images/Demon_Hurt_left_0.png");
        hurt[1][LEFT]=new GreenfootImage("images/Demon_Hurt_left_1.png");
        hurt[2][LEFT]=new GreenfootImage("images/Demon_Hurt_left_2.png");
        hurt[3][LEFT]=new GreenfootImage("images/Demon_Hurt_left_3.png");
        hurt[0][RIGHT]=new GreenfootImage("images/Demon_Hurt_right_0.png");
        hurt[1][RIGHT]=new GreenfootImage("images/Demon_Hurt_right_1.png");
        hurt[2][RIGHT]=new GreenfootImage("images/Demon_Hurt_right_2.png");
        hurt[3][RIGHT]=new GreenfootImage("images/Demon_Hurt_right_3.png");

        walk = new GreenfootImage[MAX_COUNTER_WALK][2];
        walk[0][LEFT]=new GreenfootImage("images/Demon_Walk_left_0.png");
        walk[1][LEFT]=new GreenfootImage("images/Demon_Walk_left_1.png");
        walk[2][LEFT]=new GreenfootImage("images/Demon_Walk_left_2.png");
        walk[3][LEFT]=new GreenfootImage("images/Demon_Walk_left_3.png");
        walk[4][LEFT]=new GreenfootImage("images/Demon_Walk_left_4.png");
        walk[5][LEFT]=new GreenfootImage("images/Demon_Walk_left_5.png");
        walk[6][LEFT]=new GreenfootImage("images/Demon_Walk_left_6.png");
        walk[7][LEFT]=new GreenfootImage("images/Demon_Walk_left_7.png");
        walk[8][LEFT]=new GreenfootImage("images/Demon_Walk_left_8.png");
        walk[9][LEFT]=new GreenfootImage("images/Demon_Walk_left_9.png");
        walk[10][LEFT]=new GreenfootImage("images/Demon_Walk_left_10.png");
        walk[11][LEFT]=new GreenfootImage("images/Demon_Walk_left_11.png");
        walk[0][RIGHT]=new GreenfootImage("images/Demon_Walk_right_0.png");
        walk[1][RIGHT]=new GreenfootImage("images/Demon_Walk_right_1.png");
        walk[2][RIGHT]=new GreenfootImage("images/Demon_Walk_right_2.png");
        walk[3][RIGHT]=new GreenfootImage("images/Demon_Walk_right_3.png");
        walk[4][RIGHT]=new GreenfootImage("images/Demon_Walk_right_4.png");
        walk[5][RIGHT]=new GreenfootImage("images/Demon_Walk_right_5.png");
        walk[6][RIGHT]=new GreenfootImage("images/Demon_Walk_right_6.png");
        walk[7][RIGHT]=new GreenfootImage("images/Demon_Walk_right_7.png");
        walk[8][RIGHT]=new GreenfootImage("images/Demon_Walk_right_8.png");
        walk[9][RIGHT]=new GreenfootImage("images/Demon_Walk_right_9.png");
        walk[10][RIGHT]=new GreenfootImage("images/Demon_Walk_right_10.png");
        walk[11][RIGHT]=new GreenfootImage("images/Demon_Walk_right_11.png");
        
        fly = new GreenfootImage[MAX_COUNTER_FLY][2];
        fly[0][LEFT]=new GreenfootImage("images/Demon_Fly_left_0.png");
        fly[1][LEFT]=new GreenfootImage("images/Demon_Fly_left_1.png");
        fly[2][LEFT]=new GreenfootImage("images/Demon_Fly_left_2.png");
        fly[3][LEFT]=new GreenfootImage("images/Demon_Fly_left_3.png");
        fly[4][LEFT]=new GreenfootImage("images/Demon_Fly_left_4.png");
        fly[5][LEFT]=new GreenfootImage("images/Demon_Fly_left_5.png");
        fly[6][LEFT]=new GreenfootImage("images/Demon_Fly_left_6.png");
        fly[7][LEFT]=new GreenfootImage("images/Demon_Fly_left_7.png");
        fly[8][LEFT]=new GreenfootImage("images/Demon_Fly_left_8.png");
        fly[9][LEFT]=new GreenfootImage("images/Demon_Fly_left_9.png");
        fly[10][LEFT]=new GreenfootImage("images/Demon_Fly_left_10.png");
        fly[11][LEFT]=new GreenfootImage("images/Demon_Fly_left_11.png");
        fly[0][RIGHT]=new GreenfootImage("images/Demon_Fly_right_0.png");
        fly[1][RIGHT]=new GreenfootImage("images/Demon_Fly_right_1.png");
        fly[2][RIGHT]=new GreenfootImage("images/Demon_Fly_right_2.png");
        fly[3][RIGHT]=new GreenfootImage("images/Demon_Fly_right_3.png");
        fly[4][RIGHT]=new GreenfootImage("images/Demon_Fly_right_4.png");
        fly[5][RIGHT]=new GreenfootImage("images/Demon_Fly_right_5.png");
        fly[6][RIGHT]=new GreenfootImage("images/Demon_Fly_right_6.png");
        fly[7][RIGHT]=new GreenfootImage("images/Demon_Fly_right_7.png");
        fly[8][RIGHT]=new GreenfootImage("images/Demon_Fly_right_8.png");
        fly[9][RIGHT]=new GreenfootImage("images/Demon_Fly_right_9.png");
        fly[10][RIGHT]=new GreenfootImage("images/Demon_Fly_right_10.png");
        fly[11][RIGHT]=new GreenfootImage("images/Demon_Fly_right_11.png");

    }

    public void act(){
        checkDestroyed();
        if(destroyed == false)
        {
            checkDamageCollision();
            animation();
            calculateDistanceWithPlayer();
            calculatePlayerLocation();
            checkChasing();
            checkFall(); 
            checkWallColision();
            checkJumping();
            throwFireball();
        }
    }

    private void animation(){
        if(holdToAttack > 0 && holdToAttack < 20)
            holdToAttack++;

        if(getImage() == attack[MAX_COUNTER_ATTACK-1][direction] ){
            attacking = false;
            holdToAttack++;
        }  

        if(getImage() == hurt[MAX_COUNTER_HURT-1][direction]){
            if(imageRepetition==6){
                hurted=false;
                vulnerability=true;
            }
        }

        //Do nothing
        if(attacking == false && hurted == false  && walking == false && vulnerability == true){
            if (currentImage>=stay.length)
                currentImage=0;
            if(imageRepetition >= 3){
                imageRepetition=0;
                counterAnimation++;
                if(counterAnimation >= MAX_COUNTER_STAY)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % stay.length;
            }
            setImage(stay[currentImage][direction]);
        }

        //walk
        if(attacking == false && hurted == false && walking == true && vulnerability == true && jumping == false ){
            if (currentImage>=MAX_COUNTER_WALK)
                currentImage=0;
            if(imageRepetition >= 2){
                imageRepetition=0;
                counterAnimation++;
                if(counterAnimation >= MAX_COUNTER_WALK)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % walk.length;
            }
            setImage(walk[currentImage][direction]);
        }
        
        if(attacking == false && hurted == false && vulnerability == true && flying == true && jumping == true){
            if (currentImage>=MAX_COUNTER_FLY)
                currentImage=0;
            if(imageRepetition >= 2){
                imageRepetition=0;
                counterAnimation++;
                if(counterAnimation >= MAX_COUNTER_FLY)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % fly.length;
            }
            setImage(fly[currentImage][direction]);
        }

        if(attacking == true && hurted == false && flying == false){
            if (currentImage>=attack.length)
                currentImage=0;
            if(imageRepetition >= 2){
                imageRepetition=0;
                counterAnimation++;
                if(counterAnimation >= MAX_COUNTER_ATTACK)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % attack.length;
            }
            setImage(attack[currentImage][direction]);        
        }
        
        if(attacking == true && hurted == false && flying == true){
            if (currentImage>=attack_fly.length)
                currentImage=0;
            if(imageRepetition >= 2){
                imageRepetition=0;
                counterAnimation++;
                if(counterAnimation >= MAX_COUNTER_ATTACK)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % attack_fly.length;
            }
            setImage(attack_fly[currentImage][direction]);        
        }

        if(hurted == true && getImage()!= hurt[MAX_COUNTER_HURT-1][direction]){
            if (currentImage>=hurt.length)
                currentImage=0;
            if(imageRepetition >= 5){
                if(direction == RIGHT)
                    setLocation(getX()-SPEED,getY());
                else
                    setLocation(getX()+SPEED,getY());
                imageRepetition=0;
                counterAnimation++;
                if(counterAnimation >= MAX_COUNTER_HURT)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % hurt.length;
            }
            setImage(hurt[currentImage][direction]);
        }

        imageRepetition++;
    }

    private void checkJumping()
    {
        if(holdToJump >=20)
        {
            holdToJump = 0;
            if (direction == RIGHT)
            {
                Block block = (Block) getOneObjectAtOffset(40,16,Block.class);
                if(block != null)
                    jump();
            }
            else
            {
                Block block = (Block) getOneObjectAtOffset(-40,16,Block.class);
                if(block != null)
                    jump();
            }
        }
        else
            holdToJump++;
    }

    private void jump()
    { 
        vSpeed = vSpeed - jumpStrength;
        jumping = true;
        fall();
    }

    private void checkFall()
    {
        if(onGround())
        {
            vSpeed=0;
            flying = false;
        }
        else 
            fall();
    }

    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        if (attacking == false  && hurted == false)
            setImage(fall[direction]);
        if(vSpeed <= 6)
        {
        if (attacking == false  && hurted == false)
            flying = true;
            vSpeed = vSpeed+ACCELERATION;
        }
        jumping = true;

    }

    private void throwFireball()
    {

            if (holdToThrow >= 70 && hurted == false && vulnerability == true && walking ==true && attacking == false)
            {
                if(direction == RIGHT)
                    getWorld().addObject(new FireBallAttack(STRENGTH,RIGHT),getX()+8,getY());
                else
                    getWorld().addObject(new FireBallAttack(STRENGTH,LEFT),getX()-8,getY());
                attacking = true;
                holdToThrow=0;
            }
            else
            
            holdToThrow++;
    }

}
