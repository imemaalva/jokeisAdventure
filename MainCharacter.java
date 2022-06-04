import greenfoot.*;
public class MainCharacter extends Actor
{
    //Sprites per animation
    private static final int MAX_COUNTER_STAY = 5;
    private static final int MAX_COUNTER_SWORD = 6;
    private static final int MAX_COUNTER_KNIFE = 9;
    private static final int MAX_COUNTER_BOMB = 9;
    private static final int MAX_COUNTER_FIST = 9;
    private static final int MAX_COUNTER_HURT = 4;
    private static final int MAX_COUNTER_DEATH = 15;
    private static final int MAX_COUNTER_WALK = 12;

    private static final int X_BOUNDARY = 96;
    private static final int Y_BOUNDARY = 64;

    private static final int ITEM_FIST = 0;
    private static final int ITEM_SWORD = 1;
    private static final int ITEM_KNIFE = 2;
    private static final int ITEM_BOMB = 3;
    
    private static final int JUNGLE = 0;
    private static final int CEMENTERY = 1;
    private static final int HELL = 2;

    //Gravity constant
    private static final int ACCELERATION = 1;
    private static final int HSPEED = 4;

    //Character constanr
    private static final int MISA = 0;
    private static final int IME = 2;

    //Direction constant
    private static final int LEFT = 0;
    private static final int RIGHT = 1;

    //Array per animation
    private GreenfootImage [][]stay;
    private GreenfootImage [][]attack_sword;
    private GreenfootImage [][]attack_knife;
    private GreenfootImage [][]attack_bomb;
    private GreenfootImage [][]attack_fist;
    private GreenfootImage [][]hurt;
    private GreenfootImage [][]death;
    private GreenfootImage [][]walk;
    private GreenfootImage [][]run;
    private GreenfootImage []jump;
    private GreenfootImage []fall;
    
    private GreenfootSound itemCollect = new GreenfootSound("sounds/Item.mp3");

    //Player resources
    private int character; 
    private int health;
    private int power = 100;
    private int direction = RIGHT;
    private int score;
    private int selectedItem;
    private int bombAmmo;
    private int jokeisQuantity = 0;
    private int strenght = 1;

    //Movement values
    private int speed = HSPEED;
    private int vSpeed = 0;
    private int jumpStrength = 9;

    //Animation managment
    private int counterAnimation;
    private int currentImage = 0;
    private int imageRepetition = 0;
    private int holdToAttack = 1;
    private int timeSinceLastHurt = 0;
    private int timeToHeal = 0;
    private int timeToReloadPower=0;

    //Action indicator
    private boolean jumping = false;
    private boolean attacking = false;
    private boolean hurted = false;
    private boolean died = false;
    private boolean up = false;
    private boolean collision = false;
    private boolean walking = false;
    private boolean vulnerability = true;
    private boolean powerUp = false;

    public MainCharacter(int character, int health, int score, int selectedItem, int bombAmmo)
    {
        this.character = character;
        this.health = health;
        this.score = score;
        this.selectedItem = selectedItem;
        this.bombAmmo = bombAmmo;
        jump = new GreenfootImage[4];
        jump[MISA+LEFT]=new GreenfootImage("images/Misa_Jump_left_0.png");
        jump[MISA+RIGHT]=new GreenfootImage("images/Misa_Jump_right_0.png");
        jump[IME+LEFT]=new GreenfootImage("images/Ime_Jump_left_0.png");
        jump[IME+RIGHT]=new GreenfootImage("images/Ime_Jump_right_0.png");

        fall = new GreenfootImage[4];
        fall[MISA+LEFT]=new GreenfootImage("images/Misa_Fall_left_0.png");
        fall[MISA+RIGHT]=new GreenfootImage("images/Misa_Fall_right_0.png");
        fall[IME+LEFT]=new GreenfootImage("images/Ime_Fall_left_0.png");
        fall[IME+RIGHT]=new GreenfootImage("images/Ime_Fall_right_0.png");

        stay = new GreenfootImage[4][MAX_COUNTER_STAY];
        stay[MISA+LEFT][0]=new GreenfootImage("images/Misa_left_0.png");
        stay[MISA+LEFT][1]=new GreenfootImage("images/Misa_left_1.png");
        stay[MISA+LEFT][2]=new GreenfootImage("images/Misa_left_2.png");
        stay[MISA+LEFT][3]=new GreenfootImage("images/Misa_left_3.png");
        stay[MISA+LEFT][4]=new GreenfootImage("images/Misa_left_4.png");
        stay[MISA+RIGHT][0]=new GreenfootImage("images/Misa_right_0.png");
        stay[MISA+RIGHT][1]=new GreenfootImage("images/Misa_right_1.png");
        stay[MISA+RIGHT][2]=new GreenfootImage("images/Misa_right_2.png");
        stay[MISA+RIGHT][3]=new GreenfootImage("images/Misa_right_3.png");
        stay[MISA+RIGHT][4]=new GreenfootImage("images/Misa_right_4.png");
        stay[IME+LEFT][0]=new GreenfootImage("images/Ime_left_0.png");
        stay[IME+LEFT][1]=new GreenfootImage("images/Ime_left_1.png");
        stay[IME+LEFT][2]=new GreenfootImage("images/Ime_left_2.png");
        stay[IME+LEFT][3]=new GreenfootImage("images/Ime_left_3.png");
        stay[IME+LEFT][4]=new GreenfootImage("images/Ime_left_4.png");
        stay[IME+RIGHT][0]=new GreenfootImage("images/Ime_right_0.png");
        stay[IME+RIGHT][1]=new GreenfootImage("images/Ime_right_1.png");
        stay[IME+RIGHT][2]=new GreenfootImage("images/Ime_right_2.png");
        stay[IME+RIGHT][3]=new GreenfootImage("images/Ime_right_3.png");
        stay[IME+RIGHT][4]=new GreenfootImage("images/Ime_right_4.png");

        attack_sword = new GreenfootImage[4][MAX_COUNTER_SWORD];
        attack_sword[MISA+LEFT][0]=new GreenfootImage("images/Misa_Attack_Sword_left_0.png");
        attack_sword[MISA+LEFT][1]=new GreenfootImage("images/Misa_Attack_Sword_left_1.png");
        attack_sword[MISA+LEFT][2]=new GreenfootImage("images/Misa_Attack_Sword_left_2.png");
        attack_sword[MISA+LEFT][3]=new GreenfootImage("images/Misa_Attack_Sword_left_3.png");
        attack_sword[MISA+LEFT][4]=new GreenfootImage("images/Misa_Attack_Sword_left_4.png");
        attack_sword[MISA+LEFT][5]=new GreenfootImage("images/Misa_Attack_Sword_left_5.png");
        attack_sword[MISA+RIGHT][0]=new GreenfootImage("images/Misa_Attack_Sword_right_0.png");
        attack_sword[MISA+RIGHT][1]=new GreenfootImage("images/Misa_Attack_Sword_right_1.png");
        attack_sword[MISA+RIGHT][2]=new GreenfootImage("images/Misa_Attack_Sword_right_2.png");
        attack_sword[MISA+RIGHT][3]=new GreenfootImage("images/Misa_Attack_Sword_right_3.png");
        attack_sword[MISA+RIGHT][4]=new GreenfootImage("images/Misa_Attack_Sword_right_4.png");
        attack_sword[MISA+RIGHT][5]=new GreenfootImage("images/Misa_Attack_Sword_right_5.png");
        attack_sword[IME+LEFT][0]=new GreenfootImage("images/Ime_Attack_Sword_left_0.png");
        attack_sword[IME+LEFT][1]=new GreenfootImage("images/Ime_Attack_Sword_left_1.png");
        attack_sword[IME+LEFT][2]=new GreenfootImage("images/Ime_Attack_Sword_left_2.png");
        attack_sword[IME+LEFT][3]=new GreenfootImage("images/Ime_Attack_Sword_left_3.png");
        attack_sword[IME+LEFT][4]=new GreenfootImage("images/Ime_Attack_Sword_left_4.png");
        attack_sword[IME+LEFT][5]=new GreenfootImage("images/Ime_Attack_Sword_left_5.png");
        attack_sword[IME+RIGHT][0]=new GreenfootImage("images/Ime_Attack_Sword_right_0.png");
        attack_sword[IME+RIGHT][1]=new GreenfootImage("images/Ime_Attack_Sword_right_1.png");
        attack_sword[IME+RIGHT][2]=new GreenfootImage("images/Ime_Attack_Sword_right_2.png");
        attack_sword[IME+RIGHT][3]=new GreenfootImage("images/Ime_Attack_Sword_right_3.png");
        attack_sword[IME+RIGHT][4]=new GreenfootImage("images/Ime_Attack_Sword_right_4.png");
        attack_sword[IME+RIGHT][5]=new GreenfootImage("images/Ime_Attack_Sword_right_5.png");

        attack_knife = new GreenfootImage[4][MAX_COUNTER_KNIFE];
        attack_knife[MISA+LEFT][0]=new GreenfootImage("images/Misa_Attack_Knife_left_0.png");
        attack_knife[MISA+LEFT][1]=new GreenfootImage("images/Misa_Attack_Knife_left_1.png");
        attack_knife[MISA+LEFT][2]=new GreenfootImage("images/Misa_Attack_Knife_left_2.png");
        attack_knife[MISA+LEFT][3]=new GreenfootImage("images/Misa_Attack_Knife_left_3.png");
        attack_knife[MISA+LEFT][4]=new GreenfootImage("images/Misa_Attack_Knife_left_4.png");
        attack_knife[MISA+LEFT][5]=new GreenfootImage("images/Misa_Attack_Knife_left_5.png");
        attack_knife[MISA+LEFT][6]=new GreenfootImage("images/Misa_Attack_Knife_left_6.png");
        attack_knife[MISA+LEFT][7]=new GreenfootImage("images/Misa_Attack_Knife_left_7.png");
        attack_knife[MISA+LEFT][8]=new GreenfootImage("images/Misa_Attack_Knife_left_8.png");
        attack_knife[MISA+RIGHT][0]=new GreenfootImage("images/Misa_Attack_Knife_right_0.png");
        attack_knife[MISA+RIGHT][1]=new GreenfootImage("images/Misa_Attack_Knife_right_1.png");
        attack_knife[MISA+RIGHT][2]=new GreenfootImage("images/Misa_Attack_Knife_right_2.png");
        attack_knife[MISA+RIGHT][3]=new GreenfootImage("images/Misa_Attack_Knife_right_3.png");
        attack_knife[MISA+RIGHT][4]=new GreenfootImage("images/Misa_Attack_Knife_right_4.png");
        attack_knife[MISA+RIGHT][5]=new GreenfootImage("images/Misa_Attack_Knife_right_5.png");
        attack_knife[MISA+RIGHT][6]=new GreenfootImage("images/Misa_Attack_Knife_right_6.png");
        attack_knife[MISA+RIGHT][7]=new GreenfootImage("images/Misa_Attack_Knife_right_7.png");
        attack_knife[MISA+RIGHT][8]=new GreenfootImage("images/Misa_Attack_Knife_right_8.png");
        attack_knife[IME+LEFT][0]=new GreenfootImage("images/Ime_Attack_Knife_left_0.png");
        attack_knife[IME+LEFT][1]=new GreenfootImage("images/Ime_Attack_Knife_left_1.png");
        attack_knife[IME+LEFT][2]=new GreenfootImage("images/Ime_Attack_Knife_left_2.png");
        attack_knife[IME+LEFT][3]=new GreenfootImage("images/Ime_Attack_Knife_left_3.png");
        attack_knife[IME+LEFT][4]=new GreenfootImage("images/Ime_Attack_Knife_left_4.png");
        attack_knife[IME+LEFT][5]=new GreenfootImage("images/Ime_Attack_Knife_left_5.png");
        attack_knife[IME+LEFT][6]=new GreenfootImage("images/Ime_Attack_Knife_left_6.png");
        attack_knife[IME+LEFT][7]=new GreenfootImage("images/Ime_Attack_Knife_left_7.png");
        attack_knife[IME+LEFT][8]=new GreenfootImage("images/Ime_Attack_Knife_left_8.png");
        attack_knife[IME+RIGHT][0]=new GreenfootImage("images/Ime_Attack_Knife_right_0.png");
        attack_knife[IME+RIGHT][1]=new GreenfootImage("images/Ime_Attack_Knife_right_1.png");
        attack_knife[IME+RIGHT][2]=new GreenfootImage("images/Ime_Attack_Knife_right_2.png");
        attack_knife[IME+RIGHT][3]=new GreenfootImage("images/Ime_Attack_Knife_right_3.png");
        attack_knife[IME+RIGHT][4]=new GreenfootImage("images/Ime_Attack_Knife_right_4.png");
        attack_knife[IME+RIGHT][5]=new GreenfootImage("images/Ime_Attack_Knife_right_5.png");
        attack_knife[IME+RIGHT][6]=new GreenfootImage("images/Ime_Attack_Knife_right_6.png");
        attack_knife[IME+RIGHT][7]=new GreenfootImage("images/Ime_Attack_Knife_right_7.png");
        attack_knife[IME+RIGHT][8]=new GreenfootImage("images/Ime_Attack_Knife_right_8.png");

        attack_bomb = new GreenfootImage[4][MAX_COUNTER_BOMB];
        attack_bomb[MISA+LEFT][0]=new GreenfootImage("images/Misa_Attack_Bomb_left_0.png");
        attack_bomb[MISA+LEFT][1]=new GreenfootImage("images/Misa_Attack_Bomb_left_1.png");
        attack_bomb[MISA+LEFT][2]=new GreenfootImage("images/Misa_Attack_Bomb_left_2.png");
        attack_bomb[MISA+LEFT][3]=new GreenfootImage("images/Misa_Attack_Bomb_left_3.png");
        attack_bomb[MISA+LEFT][4]=new GreenfootImage("images/Misa_Attack_Bomb_left_4.png");
        attack_bomb[MISA+LEFT][5]=new GreenfootImage("images/Misa_Attack_Bomb_left_5.png");
        attack_bomb[MISA+LEFT][6]=new GreenfootImage("images/Misa_Attack_Bomb_left_6.png");
        attack_bomb[MISA+LEFT][7]=new GreenfootImage("images/Misa_Attack_Bomb_left_7.png");
        attack_bomb[MISA+LEFT][8]=new GreenfootImage("images/Misa_Attack_Bomb_left_8.png");
        attack_bomb[MISA+RIGHT][0]=new GreenfootImage("images/Misa_Attack_Bomb_right_0.png");
        attack_bomb[MISA+RIGHT][1]=new GreenfootImage("images/Misa_Attack_Bomb_right_1.png");
        attack_bomb[MISA+RIGHT][2]=new GreenfootImage("images/Misa_Attack_Bomb_right_2.png");
        attack_bomb[MISA+RIGHT][3]=new GreenfootImage("images/Misa_Attack_Bomb_right_3.png");
        attack_bomb[MISA+RIGHT][4]=new GreenfootImage("images/Misa_Attack_Bomb_right_4.png");
        attack_bomb[MISA+RIGHT][5]=new GreenfootImage("images/Misa_Attack_Bomb_right_5.png");
        attack_bomb[MISA+RIGHT][6]=new GreenfootImage("images/Misa_Attack_Bomb_right_6.png");
        attack_bomb[MISA+RIGHT][7]=new GreenfootImage("images/Misa_Attack_Bomb_right_7.png");
        attack_bomb[MISA+RIGHT][8]=new GreenfootImage("images/Misa_Attack_Bomb_right_8.png");
        attack_bomb[IME+LEFT][0]=new GreenfootImage("images/Ime_Attack_Bomb_left_0.png");
        attack_bomb[IME+LEFT][1]=new GreenfootImage("images/Ime_Attack_Bomb_left_1.png");
        attack_bomb[IME+LEFT][2]=new GreenfootImage("images/Ime_Attack_Bomb_left_2.png");
        attack_bomb[IME+LEFT][3]=new GreenfootImage("images/Ime_Attack_Bomb_left_3.png");
        attack_bomb[IME+LEFT][4]=new GreenfootImage("images/Ime_Attack_Bomb_left_4.png");
        attack_bomb[IME+LEFT][5]=new GreenfootImage("images/Ime_Attack_Bomb_left_5.png");
        attack_bomb[IME+LEFT][6]=new GreenfootImage("images/Ime_Attack_Bomb_left_6.png");
        attack_bomb[IME+LEFT][7]=new GreenfootImage("images/Ime_Attack_Bomb_left_7.png");
        attack_bomb[IME+LEFT][8]=new GreenfootImage("images/Ime_Attack_Bomb_left_8.png");
        attack_bomb[IME+RIGHT][0]=new GreenfootImage("images/Ime_Attack_Bomb_right_0.png");
        attack_bomb[IME+RIGHT][1]=new GreenfootImage("images/Ime_Attack_Bomb_right_1.png");
        attack_bomb[IME+RIGHT][2]=new GreenfootImage("images/Ime_Attack_Bomb_right_2.png");
        attack_bomb[IME+RIGHT][3]=new GreenfootImage("images/Ime_Attack_Bomb_right_3.png");
        attack_bomb[IME+RIGHT][4]=new GreenfootImage("images/Ime_Attack_Bomb_right_4.png");
        attack_bomb[IME+RIGHT][5]=new GreenfootImage("images/Ime_Attack_Bomb_right_5.png");
        attack_bomb[IME+RIGHT][6]=new GreenfootImage("images/Ime_Attack_Bomb_right_6.png");
        attack_bomb[IME+RIGHT][7]=new GreenfootImage("images/Ime_Attack_Bomb_right_7.png");
        attack_bomb[IME+RIGHT][8]=new GreenfootImage("images/Ime_Attack_Bomb_right_8.png");

        attack_fist = new GreenfootImage[4][MAX_COUNTER_FIST];
        attack_fist[MISA+LEFT][0]=new GreenfootImage("images/Misa_Attack_Fist_left_0.png");
        attack_fist[MISA+LEFT][1]=new GreenfootImage("images/Misa_Attack_Fist_left_1.png");
        attack_fist[MISA+LEFT][2]=new GreenfootImage("images/Misa_Attack_Fist_left_2.png");
        attack_fist[MISA+LEFT][3]=new GreenfootImage("images/Misa_Attack_Fist_left_3.png");
        attack_fist[MISA+LEFT][4]=new GreenfootImage("images/Misa_Attack_Fist_left_4.png");
        attack_fist[MISA+LEFT][5]=new GreenfootImage("images/Misa_Attack_Fist_left_5.png");
        attack_fist[MISA+LEFT][6]=new GreenfootImage("images/Misa_Attack_Fist_left_6.png");
        attack_fist[MISA+LEFT][7]=new GreenfootImage("images/Misa_Attack_Fist_left_7.png");
        attack_fist[MISA+LEFT][8]=new GreenfootImage("images/Misa_Attack_Fist_left_8.png");
        attack_fist[MISA+RIGHT][0]=new GreenfootImage("images/Misa_Attack_Fist_right_0.png");
        attack_fist[MISA+RIGHT][1]=new GreenfootImage("images/Misa_Attack_Fist_right_1.png");
        attack_fist[MISA+RIGHT][2]=new GreenfootImage("images/Misa_Attack_Fist_right_2.png");
        attack_fist[MISA+RIGHT][3]=new GreenfootImage("images/Misa_Attack_Fist_right_3.png");
        attack_fist[MISA+RIGHT][4]=new GreenfootImage("images/Misa_Attack_Fist_right_4.png");
        attack_fist[MISA+RIGHT][5]=new GreenfootImage("images/Misa_Attack_Fist_right_5.png");
        attack_fist[MISA+RIGHT][6]=new GreenfootImage("images/Misa_Attack_Fist_right_6.png");
        attack_fist[MISA+RIGHT][7]=new GreenfootImage("images/Misa_Attack_Fist_right_7.png");
        attack_fist[MISA+RIGHT][8]=new GreenfootImage("images/Misa_Attack_Fist_right_8.png");
        attack_fist[IME+LEFT][0]=new GreenfootImage("images/Ime_Attack_Fist_left_0.png");
        attack_fist[IME+LEFT][1]=new GreenfootImage("images/Ime_Attack_Fist_left_1.png");
        attack_fist[IME+LEFT][2]=new GreenfootImage("images/Ime_Attack_Fist_left_2.png");
        attack_fist[IME+LEFT][3]=new GreenfootImage("images/Ime_Attack_Fist_left_3.png");
        attack_fist[IME+LEFT][4]=new GreenfootImage("images/Ime_Attack_Fist_left_4.png");
        attack_fist[IME+LEFT][5]=new GreenfootImage("images/Ime_Attack_Fist_left_5.png");
        attack_fist[IME+LEFT][6]=new GreenfootImage("images/Ime_Attack_Fist_left_6.png");
        attack_fist[IME+LEFT][7]=new GreenfootImage("images/Ime_Attack_Fist_left_7.png");
        attack_fist[IME+LEFT][8]=new GreenfootImage("images/Ime_Attack_Fist_left_8.png");
        attack_fist[IME+RIGHT][0]=new GreenfootImage("images/Ime_Attack_Fist_right_0.png");
        attack_fist[IME+RIGHT][1]=new GreenfootImage("images/Ime_Attack_Fist_right_1.png");
        attack_fist[IME+RIGHT][2]=new GreenfootImage("images/Ime_Attack_Fist_right_2.png");
        attack_fist[IME+RIGHT][3]=new GreenfootImage("images/Ime_Attack_Fist_right_3.png");
        attack_fist[IME+RIGHT][4]=new GreenfootImage("images/Ime_Attack_Fist_right_4.png");
        attack_fist[IME+RIGHT][5]=new GreenfootImage("images/Ime_Attack_Fist_right_5.png");
        attack_fist[IME+RIGHT][6]=new GreenfootImage("images/Ime_Attack_Fist_right_6.png");
        attack_fist[IME+RIGHT][7]=new GreenfootImage("images/Ime_Attack_Fist_right_7.png");
        attack_fist[IME+RIGHT][8]=new GreenfootImage("images/Ime_Attack_Fist_right_8.png");

        hurt = new GreenfootImage[4][MAX_COUNTER_HURT];
        hurt[MISA+LEFT][0]=new GreenfootImage("images/Misa_Hurt_left_0.png");
        hurt[MISA+LEFT][1]=new GreenfootImage("images/Misa_Hurt_left_1.png");
        hurt[MISA+LEFT][2]=new GreenfootImage("images/Misa_Hurt_left_2.png");
        hurt[MISA+LEFT][3]=new GreenfootImage("images/Misa_Hurt_left_3.png");
        hurt[MISA+RIGHT][0]=new GreenfootImage("images/Misa_Hurt_right_0.png");
        hurt[MISA+RIGHT][1]=new GreenfootImage("images/Misa_Hurt_right_1.png");
        hurt[MISA+RIGHT][2]=new GreenfootImage("images/Misa_Hurt_right_2.png");
        hurt[MISA+RIGHT][3]=new GreenfootImage("images/Misa_Hurt_right_3.png");
        hurt[IME+LEFT][0]=new GreenfootImage("images/Ime_Hurt_left_0.png");
        hurt[IME+LEFT][1]=new GreenfootImage("images/Ime_Hurt_left_1.png");
        hurt[IME+LEFT][2]=new GreenfootImage("images/Ime_Hurt_left_2.png");
        hurt[IME+LEFT][3]=new GreenfootImage("images/Ime_Hurt_left_3.png");
        hurt[IME+RIGHT][0]=new GreenfootImage("images/Ime_Hurt_right_0.png");
        hurt[IME+RIGHT][1]=new GreenfootImage("images/Ime_Hurt_right_1.png");
        hurt[IME+RIGHT][2]=new GreenfootImage("images/Ime_Hurt_right_2.png");
        hurt[IME+RIGHT][3]=new GreenfootImage("images/Ime_Hurt_right_3.png");

        death = new GreenfootImage[4][MAX_COUNTER_DEATH];
        death[MISA+LEFT][0]=new GreenfootImage("images/Misa_Dead_left_0.png");
        death[MISA+LEFT][1]=new GreenfootImage("images/Misa_Dead_left_1.png");
        death[MISA+LEFT][2]=new GreenfootImage("images/Misa_Dead_left_2.png");
        death[MISA+LEFT][3]=new GreenfootImage("images/Misa_Dead_left_3.png");
        death[MISA+LEFT][4]=new GreenfootImage("images/Misa_Dead_left_4.png");
        death[MISA+LEFT][5]=new GreenfootImage("images/Misa_Dead_left_5.png");
        death[MISA+LEFT][6]=new GreenfootImage("images/Misa_Dead_left_6.png");
        death[MISA+LEFT][7]=new GreenfootImage("images/Misa_Dead_left_7.png");
        death[MISA+LEFT][8]=new GreenfootImage("images/Misa_Dead_left_8.png");
        death[MISA+LEFT][9]=new GreenfootImage("images/Misa_Dead_left_9.png");
        death[MISA+LEFT][10]=new GreenfootImage("images/Misa_Dead_left_10.png");
        death[MISA+LEFT][11]=new GreenfootImage("images/Misa_Dead_left_11.png");
        death[MISA+LEFT][12]=new GreenfootImage("images/Misa_Dead_left_12.png");
        death[MISA+LEFT][13]=new GreenfootImage("images/Misa_Dead_left_13.png");
        death[MISA+LEFT][14]=new GreenfootImage("images/Misa_Dead_left_14.png");
        death[MISA+RIGHT][0]=new GreenfootImage("images/Misa_Dead_right_0.png");
        death[MISA+RIGHT][1]=new GreenfootImage("images/Misa_Dead_right_1.png");
        death[MISA+RIGHT][2]=new GreenfootImage("images/Misa_Dead_right_2.png");
        death[MISA+RIGHT][3]=new GreenfootImage("images/Misa_Dead_right_3.png");
        death[MISA+RIGHT][4]=new GreenfootImage("images/Misa_Dead_right_4.png");
        death[MISA+RIGHT][5]=new GreenfootImage("images/Misa_Dead_right_5.png");
        death[MISA+RIGHT][6]=new GreenfootImage("images/Misa_Dead_right_6.png");
        death[MISA+RIGHT][7]=new GreenfootImage("images/Misa_Dead_right_7.png");
        death[MISA+RIGHT][8]=new GreenfootImage("images/Misa_Dead_right_8.png");
        death[MISA+RIGHT][9]=new GreenfootImage("images/Misa_Dead_right_9.png");
        death[MISA+RIGHT][10]=new GreenfootImage("images/Misa_Dead_right_10.png");
        death[MISA+RIGHT][11]=new GreenfootImage("images/Misa_Dead_right_11.png");
        death[MISA+RIGHT][12]=new GreenfootImage("images/Misa_Dead_right_12.png");
        death[MISA+RIGHT][13]=new GreenfootImage("images/Misa_Dead_right_13.png");
        death[MISA+RIGHT][14]=new GreenfootImage("images/Misa_Dead_right_14.png");
        death[IME+LEFT][0]=new GreenfootImage("images/Ime_Dead_left_0.png");
        death[IME+LEFT][1]=new GreenfootImage("images/Ime_Dead_left_1.png");
        death[IME+LEFT][2]=new GreenfootImage("images/Ime_Dead_left_2.png");
        death[IME+LEFT][3]=new GreenfootImage("images/Ime_Dead_left_3.png");
        death[IME+LEFT][4]=new GreenfootImage("images/Ime_Dead_left_4.png");
        death[IME+LEFT][5]=new GreenfootImage("images/Ime_Dead_left_5.png");
        death[IME+LEFT][6]=new GreenfootImage("images/Ime_Dead_left_6.png");
        death[IME+LEFT][7]=new GreenfootImage("images/Ime_Dead_left_7.png");
        death[IME+LEFT][8]=new GreenfootImage("images/Ime_Dead_left_8.png");
        death[IME+LEFT][9]=new GreenfootImage("images/Ime_Dead_left_9.png");
        death[IME+LEFT][10]=new GreenfootImage("images/Ime_Dead_left_10.png");
        death[IME+LEFT][11]=new GreenfootImage("images/Ime_Dead_left_11.png");
        death[IME+LEFT][12]=new GreenfootImage("images/Ime_Dead_left_12.png");
        death[IME+LEFT][13]=new GreenfootImage("images/Ime_Dead_left_13.png");
        death[IME+LEFT][14]=new GreenfootImage("images/Ime_Dead_left_14.png");
        death[IME+RIGHT][0]=new GreenfootImage("images/Ime_Dead_right_0.png");
        death[IME+RIGHT][1]=new GreenfootImage("images/Ime_Dead_right_1.png");
        death[IME+RIGHT][2]=new GreenfootImage("images/Ime_Dead_right_2.png");
        death[IME+RIGHT][3]=new GreenfootImage("images/Ime_Dead_right_3.png");
        death[IME+RIGHT][4]=new GreenfootImage("images/Ime_Dead_right_4.png");
        death[IME+RIGHT][5]=new GreenfootImage("images/Ime_Dead_right_5.png");
        death[IME+RIGHT][6]=new GreenfootImage("images/Ime_Dead_right_6.png");
        death[IME+RIGHT][7]=new GreenfootImage("images/Ime_Dead_right_7.png");
        death[IME+RIGHT][8]=new GreenfootImage("images/Ime_Dead_right_8.png");
        death[IME+RIGHT][9]=new GreenfootImage("images/Ime_Dead_right_9.png");
        death[IME+RIGHT][10]=new GreenfootImage("images/Ime_Dead_right_10.png");
        death[IME+RIGHT][11]=new GreenfootImage("images/Ime_Dead_right_11.png");
        death[IME+RIGHT][12]=new GreenfootImage("images/Ime_Dead_right_12.png");
        death[IME+RIGHT][13]=new GreenfootImage("images/Ime_Dead_right_13.png");
        death[IME+RIGHT][14]=new GreenfootImage("images/Ime_Dead_right_14.png");

        walk = new GreenfootImage[4][MAX_COUNTER_WALK];
        walk[MISA+LEFT][0]=new GreenfootImage("images/Misa_Walk_left_0.png");
        walk[MISA+LEFT][1]=new GreenfootImage("images/Misa_Walk_left_1.png");
        walk[MISA+LEFT][2]=new GreenfootImage("images/Misa_Walk_left_2.png");
        walk[MISA+LEFT][3]=new GreenfootImage("images/Misa_Walk_left_3.png");
        walk[MISA+LEFT][4]=new GreenfootImage("images/Misa_Walk_left_4.png");
        walk[MISA+LEFT][5]=new GreenfootImage("images/Misa_Walk_left_5.png");
        walk[MISA+LEFT][6]=new GreenfootImage("images/Misa_Walk_left_6.png");
        walk[MISA+LEFT][7]=new GreenfootImage("images/Misa_Walk_left_7.png");
        walk[MISA+LEFT][8]=new GreenfootImage("images/Misa_Walk_left_8.png");
        walk[MISA+LEFT][9]=new GreenfootImage("images/Misa_Walk_left_9.png");
        walk[MISA+LEFT][10]=new GreenfootImage("images/Misa_Walk_left_10.png");
        walk[MISA+LEFT][11]=new GreenfootImage("images/Misa_Walk_left_11.png");
        walk[MISA+RIGHT][0]=new GreenfootImage("images/Misa_Walk_right_0.png");
        walk[MISA+RIGHT][1]=new GreenfootImage("images/Misa_Walk_right_1.png");
        walk[MISA+RIGHT][2]=new GreenfootImage("images/Misa_Walk_right_2.png");
        walk[MISA+RIGHT][3]=new GreenfootImage("images/Misa_Walk_right_3.png");
        walk[MISA+RIGHT][4]=new GreenfootImage("images/Misa_Walk_right_4.png");
        walk[MISA+RIGHT][5]=new GreenfootImage("images/Misa_Walk_right_5.png");
        walk[MISA+RIGHT][6]=new GreenfootImage("images/Misa_Walk_right_6.png");
        walk[MISA+RIGHT][7]=new GreenfootImage("images/Misa_Walk_right_7.png");
        walk[MISA+RIGHT][8]=new GreenfootImage("images/Misa_Walk_right_8.png");
        walk[MISA+RIGHT][9]=new GreenfootImage("images/Misa_Walk_right_9.png");
        walk[MISA+RIGHT][10]=new GreenfootImage("images/Misa_Walk_right_10.png");
        walk[MISA+RIGHT][11]=new GreenfootImage("images/Misa_Walk_right_11.png");
        walk[IME+LEFT][0]=new GreenfootImage("images/Ime_Walk_left_0.png");
        walk[IME+LEFT][1]=new GreenfootImage("images/Ime_Walk_left_1.png");
        walk[IME+LEFT][2]=new GreenfootImage("images/Ime_Walk_left_2.png");
        walk[IME+LEFT][3]=new GreenfootImage("images/Ime_Walk_left_3.png");
        walk[IME+LEFT][4]=new GreenfootImage("images/Ime_Walk_left_4.png");
        walk[IME+LEFT][5]=new GreenfootImage("images/Ime_Walk_left_5.png");
        walk[IME+LEFT][6]=new GreenfootImage("images/Ime_Walk_left_6.png");
        walk[IME+LEFT][7]=new GreenfootImage("images/Ime_Walk_left_7.png");
        walk[IME+LEFT][8]=new GreenfootImage("images/Ime_Walk_left_8.png");
        walk[IME+LEFT][9]=new GreenfootImage("images/Ime_Walk_left_9.png");
        walk[IME+LEFT][10]=new GreenfootImage("images/Ime_Walk_left_10.png");
        walk[IME+LEFT][11]=new GreenfootImage("images/Ime_Walk_left_11.png");
        walk[IME+RIGHT][0]=new GreenfootImage("images/Ime_Walk_right_0.png");
        walk[IME+RIGHT][1]=new GreenfootImage("images/Ime_Walk_right_1.png");
        walk[IME+RIGHT][2]=new GreenfootImage("images/Ime_Walk_right_2.png");
        walk[IME+RIGHT][3]=new GreenfootImage("images/Ime_Walk_right_3.png");
        walk[IME+RIGHT][4]=new GreenfootImage("images/Ime_Walk_right_4.png");
        walk[IME+RIGHT][5]=new GreenfootImage("images/Ime_Walk_right_5.png");
        walk[IME+RIGHT][6]=new GreenfootImage("images/Ime_Walk_right_6.png");
        walk[IME+RIGHT][7]=new GreenfootImage("images/Ime_Walk_right_7.png");
        walk[IME+RIGHT][8]=new GreenfootImage("images/Ime_Walk_right_8.png");
        walk[IME+RIGHT][9]=new GreenfootImage("images/Ime_Walk_right_9.png");
        walk[IME+RIGHT][10]=new GreenfootImage("images/Ime_Walk_right_10.png");
        walk[IME+RIGHT][11]=new GreenfootImage("images/Ime_Walk_right_11.png");

        run = new GreenfootImage[2][MAX_COUNTER_WALK];
        run[MISA+LEFT][0]=new GreenfootImage("images/Misa_PowerUp_left_0.png");
        run[MISA+LEFT][1]=new GreenfootImage("images/Misa_PowerUp_left_1.png");
        run[MISA+LEFT][2]=new GreenfootImage("images/Misa_PowerUp_left_2.png");
        run[MISA+LEFT][3]=new GreenfootImage("images/Misa_PowerUp_left_3.png");
        run[MISA+LEFT][4]=new GreenfootImage("images/Misa_PowerUp_left_4.png");
        run[MISA+LEFT][5]=new GreenfootImage("images/Misa_PowerUp_left_5.png");
        run[MISA+LEFT][6]=new GreenfootImage("images/Misa_PowerUp_left_6.png");
        run[MISA+LEFT][7]=new GreenfootImage("images/Misa_PowerUp_left_7.png");
        run[MISA+LEFT][8]=new GreenfootImage("images/Misa_PowerUp_left_8.png");
        run[MISA+LEFT][9]=new GreenfootImage("images/Misa_PowerUp_left_9.png");
        run[MISA+LEFT][10]=new GreenfootImage("images/Misa_PowerUp_left_10.png");
        run[MISA+LEFT][11]=new GreenfootImage("images/Misa_PowerUp_left_11.png");
        run[MISA+RIGHT][0]=new GreenfootImage("images/Misa_PowerUp_right_0.png");
        run[MISA+RIGHT][1]=new GreenfootImage("images/Misa_PowerUp_right_1.png");
        run[MISA+RIGHT][2]=new GreenfootImage("images/Misa_PowerUp_right_2.png");
        run[MISA+RIGHT][3]=new GreenfootImage("images/Misa_PowerUp_right_3.png");
        run[MISA+RIGHT][4]=new GreenfootImage("images/Misa_PowerUp_right_4.png");
        run[MISA+RIGHT][5]=new GreenfootImage("images/Misa_PowerUp_right_5.png");
        run[MISA+RIGHT][6]=new GreenfootImage("images/Misa_PowerUp_right_6.png");
        run[MISA+RIGHT][7]=new GreenfootImage("images/Misa_PowerUp_right_7.png");
        run[MISA+RIGHT][8]=new GreenfootImage("images/Misa_PowerUp_right_8.png");
        run[MISA+RIGHT][9]=new GreenfootImage("images/Misa_PowerUp_right_9.png");
        run[MISA+RIGHT][10]=new GreenfootImage("images/Misa_PowerUp_right_10.png");
        run[MISA+RIGHT][11]=new GreenfootImage("images/Misa_PowerUp_right_11.png");
    }

    public void act()
    {
        animation();
        if (died==false)
        {

            keyCheckMove();
            boundedMove();
            checkFall(); 
            checkCellingColision();
            checkWallColision();
            checkHealth();
            checkPowerUpQuantity();
            checkCharacter();
            checkHurted();
            checkItemBombCollision();
            checkItemHeartCollision();
            checkItemJokeisCollision();
            checkBreakWallRunning();
        }

    }

    private void animation()
    {
        if(holdToAttack > 0 && holdToAttack < 15 && died == false)
            holdToAttack++;
        if(getImage() == attack_fist[character+direction][MAX_COUNTER_FIST-1]|| getImage() == attack_sword[character+direction][MAX_COUNTER_SWORD-1] || getImage() == attack_knife[character+direction][MAX_COUNTER_KNIFE-1] || getImage() == attack_bomb[character+direction][MAX_COUNTER_BOMB-1] && died == false)
        {
            attacking = false;
            holdToAttack++;
        }    

        if(getImage() == death[character+direction][MAX_COUNTER_DEATH-1])
        {
            if(imageRepetition==20)
                switch(getWorldOfType(ScrollingWorld.class).getLevel())
                {
                    case JUNGLE:
                        Greenfoot.setWorld(new JungleGameOver(character, score));
                    break;
                    case CEMENTERY:
                        Greenfoot.setWorld(new CementeryGameOver(character, score));
                    break;
                    case HELL:
                        Greenfoot.setWorld(new HellGameOver(character, score));
                    break;
                }
        }

        if(getImage() == hurt[character+direction][MAX_COUNTER_HURT-1]&& died == false)
        {
            if(imageRepetition==6)
            {
                hurted=false;
                vulnerability=true;
            }
            timeSinceLastHurt=0;
        }

        //Do nothing
        if(attacking == false && hurted == false && died == false && jumping == false && walking == false && vulnerability == true)
        {
            if (currentImage>=MAX_COUNTER_STAY)
                currentImage=0;
            if(imageRepetition >= 3)
            {
                imageRepetition=0;
                counterAnimation++;
                if(counterAnimation >= MAX_COUNTER_STAY)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % MAX_COUNTER_STAY;
            }
            setImage(stay[character+direction][currentImage]);
        }

        //walk
        if(attacking == false && hurted == false && died == false && jumping == false && walking == true && vulnerability == true)
        {
            if (currentImage>=MAX_COUNTER_WALK)
                currentImage=0;
            if(imageRepetition >= 2)
            {
                imageRepetition=0;
                counterAnimation++;
                if(counterAnimation >= MAX_COUNTER_WALK)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % MAX_COUNTER_WALK;
            }
            if(powerUp == true && character == MISA)
                setImage(run[character+direction][currentImage]);
            else
                setImage(walk[character+direction][currentImage]);
        }

        if(attacking == true && died == false && hurted == false)
        {
            switch(selectedItem)
            {
                case ITEM_FIST:
                    if (currentImage>=MAX_COUNTER_FIST)
                        currentImage=0;
                    if(imageRepetition >= 2)
                    {
                        imageRepetition=0;
                        counterAnimation++;
                        if(counterAnimation >= MAX_COUNTER_FIST)
                            counterAnimation=0;
                        currentImage = (currentImage + 1) % MAX_COUNTER_FIST;
                    }
                    setImage(attack_fist[character+direction][currentImage]);
                    break;
                case ITEM_SWORD:
                    if (currentImage>=MAX_COUNTER_SWORD)
                        currentImage=0;
                    if(imageRepetition >= 4)
                    {
                        imageRepetition=0;
                        counterAnimation++;
                        if(counterAnimation >= MAX_COUNTER_SWORD)
                            counterAnimation=0;
                        currentImage = (currentImage + 1) % MAX_COUNTER_SWORD;
                    }
                    setImage(attack_sword[character+direction][currentImage]);
                    break;
                case ITEM_KNIFE:
                    if (currentImage>=MAX_COUNTER_KNIFE)
                        currentImage=0;
                    if(imageRepetition >= 3)
                    {
                        imageRepetition=0;
                        counterAnimation++;
                        if(counterAnimation >= MAX_COUNTER_KNIFE)
                            counterAnimation=0;
                        currentImage = (currentImage + 1) % MAX_COUNTER_KNIFE;
                    }
                    setImage(attack_knife[character+direction][currentImage]);
                    break;
                case ITEM_BOMB:
                    if(bombAmmo>0)
                    {
                        if (currentImage>=MAX_COUNTER_BOMB)
                            currentImage=0;
                        if(imageRepetition >= 3)
                        {
                            imageRepetition=0;
                            counterAnimation++;
                            if(counterAnimation >= MAX_COUNTER_BOMB)
                                counterAnimation=0;
                            currentImage = (currentImage + 1) % MAX_COUNTER_BOMB;
                        }
                        setImage(attack_bomb[character+direction][currentImage]);
                    }
                    else
                    {
                        attacking = false;
                        holdToAttack = 15;
                    }
                    break;
            }
        }

        if(died == true && getImage() != death[character+direction][MAX_COUNTER_DEATH-1])
        {
            if (currentImage>=MAX_COUNTER_DEATH)
                currentImage=0;
            if(imageRepetition >= 2)
            {
                imageRepetition=0;
                counterAnimation++;
                if(counterAnimation >= MAX_COUNTER_DEATH)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % MAX_COUNTER_DEATH;
            }
            setImage(death[character+direction][currentImage]);
        }

        if(hurted == true && getImage()!= hurt[character+direction][MAX_COUNTER_HURT-1] && died == false)
        {
            if (currentImage>=MAX_COUNTER_HURT)
                currentImage=0;
            if(imageRepetition >= 5)
            {
                imageRepetition=0;
                counterAnimation++;
                if(counterAnimation >= MAX_COUNTER_HURT)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % MAX_COUNTER_HURT;
            }
            setImage(hurt[character+direction][currentImage]);
        }

        imageRepetition++;
        return;
    }

    private void checkHealth()
    {
        if (timeSinceLastHurt > 100)
        {
            if (timeToHeal >= 10)
            {
                timeToHeal = 0;
                if (health <100)
                    health++;
            }
            timeToHeal++;
        }
        if(health <=0)
        {
            died = true;
            hurted = false;
        }

        timeSinceLastHurt++;    
        getWorldOfType(ScrollingWorld.class).bar.setValue(health);
    }

    private void checkPowerUpQuantity()
    {
        if (powerUp==true)
        {
            if(character == IME)
                strenght = 2;
            power--;    
        }
        else if(powerUp == false && power<100 && timeToReloadPower >= 3)
        {
            timeToReloadPower = 0;
            power++;
        }
        if (power <= 0)
        {
            powerUp=false;
            strenght = 1;
        }
        timeToReloadPower++;
        getWorldOfType(ScrollingWorld.class).powerUpBar.setValue(power);
    }

    private void keyCheckMove()
    {
        //Move left
        if((Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A")) && !(Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("D"))){
            if((direction==LEFT && collision == false)||(direction == RIGHT && collision == true))
                if(powerUp == true && character == MISA)
                    speed = -HSPEED*2;
                else
                    speed = -HSPEED;
            direction = LEFT;
            setLocation(getX()+speed,getY());
            walking=true;
        }

        //Move right
        if((Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("D")) && !(Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("A"))){
            if((direction==RIGHT && collision == false)||(direction == LEFT && collision == true))
                if(powerUp == true && character == MISA)
                    speed = HSPEED*2;
                else
                    speed = HSPEED;
            direction = RIGHT;
            setLocation(getX()+speed,getY());
            walking=true;
        }

        //Key release walking
        if((!(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A")) && !(Greenfoot.isKeyDown("right") || (Greenfoot.isKeyDown("D")))) || ((Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A")) && (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("D"))))
        {
            speed=0;
            walking=false;
        } 

        //Jump
        if((Greenfoot.isKeyDown("UP") || Greenfoot.isKeyDown("W")) && jumping == false)
        {
            jump();
        }

        if(Greenfoot.isKeyDown("ENTER") &&  holdToAttack>=15 && hurted == false && died == false && vulnerability == true)
        {
            attacking = true;
            holdToAttack=0;
            createWeapon();
        }

        if(Greenfoot.isKeyDown("SPACE") && power == 100)
        {
            itemCollect.play();
            powerUp=true;
        }

        if(Greenfoot.isKeyDown("1"))
            selectedItem=ITEM_FIST;
        if(Greenfoot.isKeyDown("2"))
            selectedItem=ITEM_SWORD;
        if(Greenfoot.isKeyDown("3"))
            selectedItem=ITEM_KNIFE;
        if(Greenfoot.isKeyDown("4"))
            selectedItem=ITEM_BOMB;

    }

    private void createWeapon()
    {
        switch(selectedItem)
        {
            case ITEM_FIST:
                if(direction == RIGHT)
                    getWorld().addObject(new FistAttack(strenght),getX()+8,getY());
                else
                    getWorld().addObject(new FistAttack(strenght),getX()-8,getY());
                break;

            case ITEM_SWORD:
                if(direction == RIGHT)
                    getWorld().addObject(new SwordAttack(strenght),getX()+12,getY());
                else
                    getWorld().addObject(new SwordAttack(strenght),getX()-12,getY());
                break;

            case ITEM_KNIFE:
                if(direction == RIGHT)
                    getWorld().addObject(new KnifeAttack(direction, strenght),getX()+32,getY());
                else
                    getWorld().addObject(new KnifeAttack(direction, strenght),getX()-32,getY());
                break;

            case ITEM_BOMB:
                if(bombAmmo>0)
                {
                    if(direction == RIGHT)
                        getWorld().addObject(new BombAttack(),getX()+32,getY()+7);
                    else
                        getWorld().addObject(new BombAttack(),getX()-32,getY()+7);
                    bombAmmo--;    
                    getWorldOfType(ScrollingWorld.class).inventory.setBombExistence(bombAmmo);
                }
                break;
        }
    }

    private void checkCharacter()
    {
        character = getWorldOfType(ScrollingWorld.class).getCharacter();
    }

    private void checkHurted()
    {
        EnemyAttack  attack =(EnemyAttack) getOneIntersectingObject(EnemyAttack.class);
        if(attack != null && vulnerability == true && hurted == false)
        {
            if(attack.getDamage() > 0)
            {
                getWorld().removeObject(attack);
                health -= attack.getDamage();
                hurted = true;
                vulnerability = false;
            }
        }
    }

    private void checkFall()
    {
        if(onGround())
            vSpeed=0;
        else
            fall();
    }

    private void jump()
    {
        up = true;
        vSpeed = vSpeed - jumpStrength;
        jumping = true;
        fall();
    }

    private void fall()
    {
        if (attacking == false && died == false && hurted == false)
            setImage(fall[character+direction]);
        setLocation(getX(), getY() + vSpeed);
        if(vSpeed <= 6)
        {
            if (attacking == false && died == false && hurted == false)
                setImage(jump[character+direction]);
            vSpeed = vSpeed+ACCELERATION;
        }
        jumping = true;
    }

    private boolean onGround()
    {
        Actor ground = getOneObjectAtOffset(0, 24, Block.class);
        if(ground == null)
        {
            jumping = true;
            return false;
        }
        else
        {
            up = false;
            moveToGround(ground);
            return true;
        }
    }

    private boolean checkCellingColision()
    {

        Actor celling = getOneObjectAtOffset(0, -24, Block.class);
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

    private boolean checkWallColision()
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

    private void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;

        setLocation(getX(), newY);
        jumping = false;
    }

    private void stopByWall(Actor wall)
    {
        int newX;
        int newY;
        int wallWidth = wall.getImage().getWidth();
        int wallHeight = wall.getImage().getHeight();

        if(direction == RIGHT && wall.getX()-16 > getX() && up == false)
        {
            newX = wall.getX() - (wallWidth + getImage().getWidth())/2;
            collision = true;
            setLocation(newX-speed+5, getY());
        }
        else if(direction == LEFT && wall.getX()+16 < getX() && up == false)
        {
            newX = wall.getX() + (wallWidth + getImage().getWidth())/2;
            collision = true;
            setLocation(newX-speed-5, getY());
        }
        else if (wall.getX()-16 > getX() && up == true && Greenfoot.isKeyDown("right"))
        {
            newX = wall.getX() - (wallWidth + getImage().getWidth())/2;
            collision = true;
            setLocation(newX-speed+5, getY());
        }

        else if (wall.getX()+16 < getX() && up == true && Greenfoot.isKeyDown("left"))
        {
            newX = wall.getX() + (wallWidth + getImage().getWidth())/2;
            collision = true;
            setLocation(newX-speed-5, getY());
        }
        else if (wall.getX()-16 > getX() && up == true && !Greenfoot.isKeyDown("right"))
        {
            newX = wall.getX() - (wallWidth + getImage().getWidth())/2;
            collision = true;
            setLocation(newX-speed+5, getY());
        }

        else if (wall.getX()+16 < getX() && up == true && !Greenfoot.isKeyDown("left"))
        {
            newX = wall.getX() + (wallWidth + getImage().getWidth())/2;
            collision = true;
            setLocation(newX-speed-5, getY());
        }
        else if(wall.getY()+16 <= getY() && up == true && !(wall.getX()+14 <= getX()-24 && wall.getX()-14 >= getX()+24 ))
        {
            newY = wall.getY() + (wallHeight + getImage().getHeight())/2;
            setLocation(getX(), newY);
        }
        speed = 0;
    }

    private void checkItemBombCollision()
    {

        Actor bomb = getOneIntersectingObject(BombAmmo.class);
        if(bomb != null)
        {
            itemCollect.play();
            getWorld().removeObject(bomb);
            bombAmmo+=5;
            getWorldOfType(ScrollingWorld.class).inventory.setBombExistence(bombAmmo);
        }
    }
    
    private void checkItemHeartCollision()
    {
        Actor life = getOneIntersectingObject(HealthCure.class);
        if(life != null)
        {
            itemCollect.play();
            getWorld().removeObject(life);
            health = 100;
        }
    }
    
    private void checkBreakWallRunning()
    {
        Actor block, block2;
        if (direction == RIGHT)
        {
            block = getOneObjectAtOffset(32,16,FragileBrick.class);
            block2 = getOneObjectAtOffset(32,-16,FragileBrick.class);
        }
        else
        {
            block = getOneObjectAtOffset(-32,16,FragileBrick.class);
            block2 = getOneObjectAtOffset(-32,-16,FragileBrick.class);
        }
        if(block != null && speed != 0 && character == MISA && powerUp == true)
            getWorld().removeObject(block);
        if(block2 != null && speed != 0 && character == MISA && powerUp == true)
            getWorld().removeObject(block2);
    }

    private void checkItemJokeisCollision()
    {

        Actor jokeis = getOneIntersectingObject(Jokeis.class);
        if(jokeis != null)
        {
            itemCollect.play();
            getWorld().removeObject(jokeis);
            score+=100;
            jokeisQuantity++;
        }
    }

    private void boundedMove() 
    {
        if( speed+getX() <= X_BOUNDARY && jumping ==false)
        {
            setLocation(X_BOUNDARY, getY());
            ((ScrollingWorld)getWorld()).shiftWorld(-speed,-vSpeed);
        } else if( speed+getX() >= getWorld().getWidth()-X_BOUNDARY && jumping ==false) 
        {
            setLocation(getWorld().getWidth()-X_BOUNDARY, getY());
            ((ScrollingWorld)getWorld()).shiftWorld(-speed,-vSpeed);
        } 
        else if(vSpeed >=-12  && speed+getX() <= X_BOUNDARY)
        {
            setLocation(X_BOUNDARY, getY());
            ((ScrollingWorld)getWorld()).shiftWorld(-speed,-vSpeed);
        }
        else if(vSpeed >=-12  && speed+getX() >= getWorld().getWidth()-X_BOUNDARY)
        {
            setLocation(getWorld().getWidth()-X_BOUNDARY, getY());
            ((ScrollingWorld)getWorld()).shiftWorld(-speed,-vSpeed);
        }
        else if(vSpeed >=-12  && speed+getX() > X_BOUNDARY )
        {
            ((ScrollingWorld)getWorld()).shiftWorld(-speed,-vSpeed);
        }else if(vSpeed >=-12  && speed+getX() < getWorld().getWidth()-X_BOUNDARY )
        {
            ((ScrollingWorld)getWorld()).shiftWorld(-speed,-vSpeed);
        }
        else if(vSpeed >=-12 )
        {
            ((ScrollingWorld)getWorld()).shiftWorld(getX(),-vSpeed);
        }

    }
    
    public int getBombAmmo()
    {
        return bombAmmo;
    }

    public int getHealth()
    {
        return health;
    }

    public int getPowerUpQuantity()
    {
        return power;
    }

    public int getSelectedItem()
    {
        return selectedItem;
    }

    public int getJokeisQuantity()
    {
        return jokeisQuantity;
    }

    public int getScore()
    {
        return score;
    }
    public int getCharacter()
    {
        return character;
    }
    public boolean getDead()
    {
        return died;
    }
    public void setScore(int score){
        this.score+=score;
    }
}
