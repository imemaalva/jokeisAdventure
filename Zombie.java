import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Zombie extends Enemy {
    private static final int MAX_COUNTER_STAY = 5;
    private static final int MAX_COUNTER_ATTACK = 6;
    private static final int MAX_COUNTER_HURT = 4;
    private static final int MAX_COUNTER_APPEAR = 8;
    private static final int MAX_COUNTER_WALK = 12;

    private static final int SPEED = 3;
    private static final int INITIAL_HEALTH = 20;
    private static final int STRENGTH = 5;

    private GreenfootImage [][]stay;
    private GreenfootImage [][]attack;
    private GreenfootImage [][]hurt;
    private GreenfootImage []appear;
    private GreenfootImage [][]walk;
    private GreenfootImage []fall;
    


    public Zombie(){
        super(INITIAL_HEALTH, SPEED, 0, STRENGTH, 0, false, 0);
        appearing = true;

        fall = new GreenfootImage[2];
        fall[LEFT]=new GreenfootImage("images/Zombie_Walk_left_2.png");
        fall[RIGHT]=new GreenfootImage("images/Zombie_Walk_right_2.png");

        stay = new GreenfootImage[MAX_COUNTER_STAY][2];
        stay[0][LEFT]=new GreenfootImage("images/Zombie_left_0.png");
        stay[1][LEFT]=new GreenfootImage("images/Zombie_left_1.png");
        stay[2][LEFT]=new GreenfootImage("images/Zombie_left_2.png");
        stay[3][LEFT]=new GreenfootImage("images/Zombie_left_3.png");
        stay[4][LEFT]=new GreenfootImage("images/Zombie_left_4.png");
        stay[0][RIGHT]=new GreenfootImage("images/Zombie_right_0.png");
        stay[1][RIGHT]=new GreenfootImage("images/Zombie_right_1.png");
        stay[2][RIGHT]=new GreenfootImage("images/Zombie_right_2.png");
        stay[3][RIGHT]=new GreenfootImage("images/Zombie_right_3.png");
        stay[4][RIGHT]=new GreenfootImage("images/Zombie_right_4.png");

        attack = new GreenfootImage[MAX_COUNTER_ATTACK][2];
        attack[0][LEFT]=new GreenfootImage("images/Zombie_Attack_left_0.png");
        attack[1][LEFT]=new GreenfootImage("images/Zombie_Attack_left_1.png");
        attack[2][LEFT]=new GreenfootImage("images/Zombie_Attack_left_2.png");
        attack[3][LEFT]=new GreenfootImage("images/Zombie_Attack_left_3.png");
        attack[4][LEFT]=new GreenfootImage("images/Zombie_Attack_left_4.png");
        attack[5][LEFT]=new GreenfootImage("images/Zombie_Attack_left_5.png");
        attack[0][RIGHT]=new GreenfootImage("images/Zombie_Attack_right_0.png");
        attack[1][RIGHT]=new GreenfootImage("images/Zombie_Attack_right_1.png");
        attack[2][RIGHT]=new GreenfootImage("images/Zombie_Attack_right_2.png");
        attack[3][RIGHT]=new GreenfootImage("images/Zombie_Attack_right_3.png");
        attack[4][RIGHT]=new GreenfootImage("images/Zombie_Attack_right_4.png");
        attack[5][RIGHT]=new GreenfootImage("images/Zombie_Attack_right_5.png");

        hurt = new GreenfootImage[MAX_COUNTER_HURT][2];
        hurt[0][LEFT]=new GreenfootImage("images/Zombie_Hurt_left_0.png");
        hurt[1][LEFT]=new GreenfootImage("images/Zombie_Hurt_left_1.png");
        hurt[2][LEFT]=new GreenfootImage("images/Zombie_Hurt_left_2.png");
        hurt[3][LEFT]=new GreenfootImage("images/Zombie_Hurt_left_3.png");
        hurt[0][RIGHT]=new GreenfootImage("images/Zombie_Hurt_right_0.png");
        hurt[1][RIGHT]=new GreenfootImage("images/Zombie_Hurt_right_1.png");
        hurt[2][RIGHT]=new GreenfootImage("images/Zombie_Hurt_right_2.png");
        hurt[3][RIGHT]=new GreenfootImage("images/Zombie_Hurt_right_3.png");

        appear = new GreenfootImage[MAX_COUNTER_APPEAR];
        appear[0]=new GreenfootImage("images/Zombie_Appear_right_0.png");
        appear[1]=new GreenfootImage("images/Zombie_Appear_right_1.png");
        appear[2]=new GreenfootImage("images/Zombie_Appear_right_2.png");
        appear[3]=new GreenfootImage("images/Zombie_Appear_right_3.png");
        appear[4]=new GreenfootImage("images/Zombie_Appear_right_4.png");
        appear[5]=new GreenfootImage("images/Zombie_Appear_right_5.png");
        appear[6]=new GreenfootImage("images/Zombie_Appear_right_6.png");
        appear[7]=new GreenfootImage("images/Zombie_Appear_right_7.png");

        walk = new GreenfootImage[MAX_COUNTER_WALK][2];
        walk[0][LEFT]=new GreenfootImage("images/Zombie_Walk_left_0.png");
        walk[1][LEFT]=new GreenfootImage("images/Zombie_Walk_left_1.png");
        walk[2][LEFT]=new GreenfootImage("images/Zombie_Walk_left_2.png");
        walk[3][LEFT]=new GreenfootImage("images/Zombie_Walk_left_3.png");
        walk[4][LEFT]=new GreenfootImage("images/Zombie_Walk_left_4.png");
        walk[5][LEFT]=new GreenfootImage("images/Zombie_Walk_left_5.png");
        walk[6][LEFT]=new GreenfootImage("images/Zombie_Walk_left_6.png");
        walk[7][LEFT]=new GreenfootImage("images/Zombie_Walk_left_7.png");
        walk[8][LEFT]=new GreenfootImage("images/Zombie_Walk_left_8.png");
        walk[9][LEFT]=new GreenfootImage("images/Zombie_Walk_left_9.png");
        walk[10][LEFT]=new GreenfootImage("images/Zombie_Walk_left_10.png");
        walk[11][LEFT]=new GreenfootImage("images/Zombie_Walk_left_11.png");
        walk[0][RIGHT]=new GreenfootImage("images/Zombie_Walk_right_0.png");
        walk[1][RIGHT]=new GreenfootImage("images/Zombie_Walk_right_1.png");
        walk[2][RIGHT]=new GreenfootImage("images/Zombie_Walk_right_2.png");
        walk[3][RIGHT]=new GreenfootImage("images/Zombie_Walk_right_3.png");
        walk[4][RIGHT]=new GreenfootImage("images/Zombie_Walk_right_4.png");
        walk[5][RIGHT]=new GreenfootImage("images/Zombie_Walk_right_5.png");
        walk[6][RIGHT]=new GreenfootImage("images/Zombie_Walk_right_6.png");
        walk[7][RIGHT]=new GreenfootImage("images/Zombie_Walk_right_7.png");
        walk[8][RIGHT]=new GreenfootImage("images/Zombie_Walk_right_8.png");
        walk[9][RIGHT]=new GreenfootImage("images/Zombie_Walk_right_9.png");
        walk[10][RIGHT]=new GreenfootImage("images/Zombie_Walk_right_10.png");
        walk[11][RIGHT]=new GreenfootImage("images/Zombie_Walk_right_11.png");

    }

    public void act(){
        checkDestroyed();
        if(destroyed == false)
        {
            checkDamageCollision();
            checkAppearing();
            animation();
            calculateDistanceWithPlayer();
            calculatePlayerLocation();
            checkChasing();
            checkFall(); 
            checkWallColision();
            checkSound();
        }
    }
    private void checkSound()
    {
        if (hurted==true)
        {
        }
        
        
    }

    private void animation(){
        if(holdToAttack > 0 && holdToAttack < 20)
            holdToAttack++;

        if(getImage() == appear[MAX_COUNTER_APPEAR-1] ){
            appearing = false;
        }  

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
        if(attacking == false && hurted == false  && walking == false && vulnerability == true && appearing == false){
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
        if(attacking == false && hurted == false && walking == true && vulnerability == true && appearing == false){
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

        if(attacking == true && hurted == false ){
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

        if(appearing == true && getImage()!= appear[MAX_COUNTER_APPEAR-1] && hurted == false){
            if (appearingStart==true){
                if (currentImage>=appear.length)
                    currentImage=0;
                if(imageRepetition >= 2){
                    imageRepetition=0;
                    counterAnimation++;
                    if(counterAnimation >= MAX_COUNTER_APPEAR)
                        counterAnimation=0;
                    currentImage = (currentImage + 1) % appear.length;
                }
                setImage(appear[currentImage]);
            }
            else
                setImage(appear[0]);
        }
        imageRepetition++;
    }

    private void checkFall()
    {
        if(onGround())
            vSpeed=0;
        else
            fall();
    }

    private void fall()
    {
        if (attacking == false && hurted == false)
            setImage(fall[direction]);
        setLocation(getX(), getY() + vSpeed);
        if(vSpeed <= 6)
        {
            vSpeed = vSpeed+ACCELERATION;
        }
        jumping = true;
    }

}
