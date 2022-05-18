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

    private static final int X_BOUNDARY = 112;
    
    private static final int ITEM_FIST = 0;
    private static final int ITEM_SWORD = 1;
    private static final int ITEM_KNIFE = 2;
    private static final int ITEM_BOMB = 3;
    
    //Gravity constant
    private static final int ACCELERATION = 2;
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
    private GreenfootImage []jump;
    private GreenfootImage []fall;
    
    //Player resources
    private int character; 
    private int health = 50;
    private int power = 100;
    private int direction = RIGHT;
    private int score = 0;
    private int selectedItem = 0;
    private int bombAmmo=0;
    private int jokeisQuantity = 0;
    
    //Movement values
    private int speed = HSPEED;
    private int vSpeed = 0;
    private int jumpStrength = 15;
    
    //Animation managment
    private int counterAnimation;
    private int currentImage = 0;
    private int imageRepetition = 0;
    private int holdToAttack = 1;
    private int timeSinceLastHurt = 0;
    private int timeToHeal = 0;
    
    //Action indicator
    private boolean jumping = false;
    private boolean attacking = false;
    private boolean hurted = false;
    private boolean died = false;
    private boolean walking = false;
    private boolean vulnerability = true;
    
    public MainCharacter(int character)
    {
        this.character = character;
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
        
        stay = new GreenfootImage[MAX_COUNTER_STAY][4];
        stay[0][MISA+LEFT]=new GreenfootImage("images/Misa_left_0.png");
        stay[1][MISA+LEFT]=new GreenfootImage("images/Misa_left_1.png");
        stay[2][MISA+LEFT]=new GreenfootImage("images/Misa_left_2.png");
        stay[3][MISA+LEFT]=new GreenfootImage("images/Misa_left_3.png");
        stay[4][MISA+LEFT]=new GreenfootImage("images/Misa_left_4.png");
        stay[0][MISA+RIGHT]=new GreenfootImage("images/Misa_right_0.png");
        stay[1][MISA+RIGHT]=new GreenfootImage("images/Misa_right_1.png");
        stay[2][MISA+RIGHT]=new GreenfootImage("images/Misa_right_2.png");
        stay[3][MISA+RIGHT]=new GreenfootImage("images/Misa_right_3.png");
        stay[4][MISA+RIGHT]=new GreenfootImage("images/Misa_right_4.png");
        stay[0][IME+LEFT]=new GreenfootImage("images/Ime_left_0.png");
        stay[1][IME+LEFT]=new GreenfootImage("images/Ime_left_1.png");
        stay[2][IME+LEFT]=new GreenfootImage("images/Ime_left_2.png");
        stay[3][IME+LEFT]=new GreenfootImage("images/Ime_left_3.png");
        stay[4][IME+LEFT]=new GreenfootImage("images/Ime_left_4.png");
        stay[0][IME+RIGHT]=new GreenfootImage("images/Ime_right_0.png");
        stay[1][IME+RIGHT]=new GreenfootImage("images/Ime_right_1.png");
        stay[2][IME+RIGHT]=new GreenfootImage("images/Ime_right_2.png");
        stay[3][IME+RIGHT]=new GreenfootImage("images/Ime_right_3.png");
        stay[4][IME+RIGHT]=new GreenfootImage("images/Ime_right_4.png");
        
        attack_sword = new GreenfootImage[MAX_COUNTER_SWORD][4];
        attack_sword[0][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Sword_left_0.png");
        attack_sword[1][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Sword_left_1.png");
        attack_sword[2][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Sword_left_2.png");
        attack_sword[3][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Sword_left_3.png");
        attack_sword[4][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Sword_left_4.png");
        attack_sword[5][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Sword_left_5.png");
        attack_sword[0][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Sword_right_0.png");
        attack_sword[1][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Sword_right_1.png");
        attack_sword[2][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Sword_right_2.png");
        attack_sword[3][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Sword_right_3.png");
        attack_sword[4][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Sword_right_4.png");
        attack_sword[5][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Sword_right_5.png");
        attack_sword[0][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Sword_left_0.png");
        attack_sword[1][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Sword_left_1.png");
        attack_sword[2][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Sword_left_2.png");
        attack_sword[3][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Sword_left_3.png");
        attack_sword[4][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Sword_left_4.png");
        attack_sword[5][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Sword_left_5.png");
        attack_sword[0][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Sword_right_0.png");
        attack_sword[1][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Sword_right_1.png");
        attack_sword[2][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Sword_right_2.png");
        attack_sword[3][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Sword_right_3.png");
        attack_sword[4][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Sword_right_4.png");
        attack_sword[5][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Sword_right_5.png");
        
        attack_knife = new GreenfootImage[MAX_COUNTER_KNIFE][4];
        attack_knife[0][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Knife_left_0.png");
        attack_knife[1][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Knife_left_1.png");
        attack_knife[2][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Knife_left_2.png");
        attack_knife[3][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Knife_left_3.png");
        attack_knife[4][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Knife_left_4.png");
        attack_knife[5][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Knife_left_5.png");
        attack_knife[6][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Knife_left_6.png");
        attack_knife[7][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Knife_left_7.png");
        attack_knife[8][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Knife_left_8.png");
        attack_knife[0][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Knife_right_0.png");
        attack_knife[1][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Knife_right_1.png");
        attack_knife[2][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Knife_right_2.png");
        attack_knife[3][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Knife_right_3.png");
        attack_knife[4][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Knife_right_4.png");
        attack_knife[5][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Knife_right_5.png");
        attack_knife[6][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Knife_right_6.png");
        attack_knife[7][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Knife_right_7.png");
        attack_knife[8][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Knife_right_8.png");
        attack_knife[0][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Knife_left_0.png");
        attack_knife[1][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Knife_left_1.png");
        attack_knife[2][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Knife_left_2.png");
        attack_knife[3][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Knife_left_3.png");
        attack_knife[4][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Knife_left_4.png");
        attack_knife[5][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Knife_left_5.png");
        attack_knife[6][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Knife_left_6.png");
        attack_knife[7][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Knife_left_7.png");
        attack_knife[8][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Knife_left_8.png");
        attack_knife[0][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Knife_right_0.png");
        attack_knife[1][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Knife_right_1.png");
        attack_knife[2][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Knife_right_2.png");
        attack_knife[3][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Knife_right_3.png");
        attack_knife[4][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Knife_right_4.png");
        attack_knife[5][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Knife_right_5.png");
        attack_knife[6][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Knife_right_6.png");
        attack_knife[7][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Knife_right_7.png");
        attack_knife[8][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Knife_right_8.png");
        
        attack_bomb = new GreenfootImage[MAX_COUNTER_BOMB][4];
        attack_bomb[0][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Bomb_left_0.png");
        attack_bomb[1][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Bomb_left_1.png");
        attack_bomb[2][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Bomb_left_2.png");
        attack_bomb[3][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Bomb_left_3.png");
        attack_bomb[4][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Bomb_left_4.png");
        attack_bomb[5][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Bomb_left_5.png");
        attack_bomb[6][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Bomb_left_6.png");
        attack_bomb[7][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Bomb_left_7.png");
        attack_bomb[8][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Bomb_left_8.png");
        attack_bomb[0][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Bomb_right_0.png");
        attack_bomb[1][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Bomb_right_1.png");
        attack_bomb[2][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Bomb_right_2.png");
        attack_bomb[3][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Bomb_right_3.png");
        attack_bomb[4][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Bomb_right_4.png");
        attack_bomb[5][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Bomb_right_5.png");
        attack_bomb[6][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Bomb_right_6.png");
        attack_bomb[7][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Bomb_right_7.png");
        attack_bomb[8][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Bomb_right_8.png");
        attack_bomb[0][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Bomb_left_0.png");
        attack_bomb[1][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Bomb_left_1.png");
        attack_bomb[2][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Bomb_left_2.png");
        attack_bomb[3][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Bomb_left_3.png");
        attack_bomb[4][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Bomb_left_4.png");
        attack_bomb[5][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Bomb_left_5.png");
        attack_bomb[6][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Bomb_left_6.png");
        attack_bomb[7][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Bomb_left_7.png");
        attack_bomb[8][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Bomb_left_8.png");
        attack_bomb[0][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Bomb_right_0.png");
        attack_bomb[1][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Bomb_right_1.png");
        attack_bomb[2][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Bomb_right_2.png");
        attack_bomb[3][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Bomb_right_3.png");
        attack_bomb[4][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Bomb_right_4.png");
        attack_bomb[5][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Bomb_right_5.png");
        attack_bomb[6][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Bomb_right_6.png");
        attack_bomb[7][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Bomb_right_7.png");
        attack_bomb[8][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Bomb_right_8.png");
    
        attack_fist = new GreenfootImage[MAX_COUNTER_FIST][4];
        attack_fist[0][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Fist_left_0.png");
        attack_fist[1][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Fist_left_1.png");
        attack_fist[2][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Fist_left_2.png");
        attack_fist[3][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Fist_left_3.png");
        attack_fist[4][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Fist_left_4.png");
        attack_fist[5][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Fist_left_5.png");
        attack_fist[6][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Fist_left_6.png");
        attack_fist[7][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Fist_left_7.png");
        attack_fist[8][MISA+LEFT]=new GreenfootImage("images/Misa_Attack_Fist_left_8.png");
        attack_fist[0][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Fist_right_0.png");
        attack_fist[1][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Fist_right_1.png");
        attack_fist[2][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Fist_right_2.png");
        attack_fist[3][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Fist_right_3.png");
        attack_fist[4][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Fist_right_4.png");
        attack_fist[5][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Fist_right_5.png");
        attack_fist[6][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Fist_right_6.png");
        attack_fist[7][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Fist_right_7.png");
        attack_fist[8][MISA+RIGHT]=new GreenfootImage("images/Misa_Attack_Fist_right_8.png");
        attack_fist[0][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Fist_left_0.png");
        attack_fist[1][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Fist_left_1.png");
        attack_fist[2][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Fist_left_2.png");
        attack_fist[3][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Fist_left_3.png");
        attack_fist[4][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Fist_left_4.png");
        attack_fist[5][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Fist_left_5.png");
        attack_fist[6][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Fist_left_6.png");
        attack_fist[7][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Fist_left_7.png");
        attack_fist[8][IME+LEFT]=new GreenfootImage("images/Ime_Attack_Fist_left_8.png");
        attack_fist[0][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Fist_right_0.png");
        attack_fist[1][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Fist_right_1.png");
        attack_fist[2][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Fist_right_2.png");
        attack_fist[3][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Fist_right_3.png");
        attack_fist[4][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Fist_right_4.png");
        attack_fist[5][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Fist_right_5.png");
        attack_fist[6][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Fist_right_6.png");
        attack_fist[7][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Fist_right_7.png");
        attack_fist[8][IME+RIGHT]=new GreenfootImage("images/Ime_Attack_Fist_right_8.png");
     
        hurt = new GreenfootImage[MAX_COUNTER_HURT][4];
        hurt[0][MISA+LEFT]=new GreenfootImage("images/Misa_Hurt_left_0.png");
        hurt[1][MISA+LEFT]=new GreenfootImage("images/Misa_Hurt_left_1.png");
        hurt[2][MISA+LEFT]=new GreenfootImage("images/Misa_Hurt_left_2.png");
        hurt[3][MISA+LEFT]=new GreenfootImage("images/Misa_Hurt_left_3.png");
        hurt[0][MISA+RIGHT]=new GreenfootImage("images/Misa_Hurt_right_0.png");
        hurt[1][MISA+RIGHT]=new GreenfootImage("images/Misa_Hurt_right_1.png");
        hurt[2][MISA+RIGHT]=new GreenfootImage("images/Misa_Hurt_right_2.png");
        hurt[3][MISA+RIGHT]=new GreenfootImage("images/Misa_Hurt_right_3.png");
        hurt[0][IME+LEFT]=new GreenfootImage("images/Ime_Hurt_left_0.png");
        hurt[1][IME+LEFT]=new GreenfootImage("images/Ime_Hurt_left_1.png");
        hurt[2][IME+LEFT]=new GreenfootImage("images/Ime_Hurt_left_2.png");
        hurt[3][IME+LEFT]=new GreenfootImage("images/Ime_Hurt_left_3.png");
        hurt[0][IME+RIGHT]=new GreenfootImage("images/Ime_Hurt_right_0.png");
        hurt[1][IME+RIGHT]=new GreenfootImage("images/Ime_Hurt_right_1.png");
        hurt[2][IME+RIGHT]=new GreenfootImage("images/Ime_Hurt_right_2.png");
        hurt[3][IME+RIGHT]=new GreenfootImage("images/Ime_Hurt_right_3.png");
        
        death = new GreenfootImage[MAX_COUNTER_DEATH][4];
        death[0][MISA+LEFT]=new GreenfootImage("images/Misa_Dead_left_0.png");
        death[1][MISA+LEFT]=new GreenfootImage("images/Misa_Dead_left_1.png");
        death[2][MISA+LEFT]=new GreenfootImage("images/Misa_Dead_left_2.png");
        death[3][MISA+LEFT]=new GreenfootImage("images/Misa_Dead_left_3.png");
        death[4][MISA+LEFT]=new GreenfootImage("images/Misa_Dead_left_4.png");
        death[5][MISA+LEFT]=new GreenfootImage("images/Misa_Dead_left_5.png");
        death[6][MISA+LEFT]=new GreenfootImage("images/Misa_Dead_left_6.png");
        death[7][MISA+LEFT]=new GreenfootImage("images/Misa_Dead_left_7.png");
        death[8][MISA+LEFT]=new GreenfootImage("images/Misa_Dead_left_8.png");
        death[9][MISA+LEFT]=new GreenfootImage("images/Misa_Dead_left_9.png");
        death[10][MISA+LEFT]=new GreenfootImage("images/Misa_Dead_left_10.png");
        death[11][MISA+LEFT]=new GreenfootImage("images/Misa_Dead_left_11.png");
        death[12][MISA+LEFT]=new GreenfootImage("images/Misa_Dead_left_12.png");
        death[13][MISA+LEFT]=new GreenfootImage("images/Misa_Dead_left_13.png");
        death[14][MISA+LEFT]=new GreenfootImage("images/Misa_Dead_left_14.png");
        death[0][MISA+RIGHT]=new GreenfootImage("images/Misa_Dead_right_0.png");
        death[1][MISA+RIGHT]=new GreenfootImage("images/Misa_Dead_right_1.png");
        death[2][MISA+RIGHT]=new GreenfootImage("images/Misa_Dead_right_2.png");
        death[3][MISA+RIGHT]=new GreenfootImage("images/Misa_Dead_right_3.png");
        death[4][MISA+RIGHT]=new GreenfootImage("images/Misa_Dead_right_4.png");
        death[5][MISA+RIGHT]=new GreenfootImage("images/Misa_Dead_right_5.png");
        death[6][MISA+RIGHT]=new GreenfootImage("images/Misa_Dead_right_6.png");
        death[7][MISA+RIGHT]=new GreenfootImage("images/Misa_Dead_right_7.png");
        death[8][MISA+RIGHT]=new GreenfootImage("images/Misa_Dead_right_8.png");
        death[9][MISA+RIGHT]=new GreenfootImage("images/Misa_Dead_right_9.png");
        death[10][MISA+RIGHT]=new GreenfootImage("images/Misa_Dead_right_10.png");
        death[11][MISA+RIGHT]=new GreenfootImage("images/Misa_Dead_right_11.png");
        death[12][MISA+RIGHT]=new GreenfootImage("images/Misa_Dead_right_12.png");
        death[13][MISA+RIGHT]=new GreenfootImage("images/Misa_Dead_right_13.png");
        death[14][MISA+RIGHT]=new GreenfootImage("images/Misa_Dead_right_14.png");
        death[0][IME+LEFT]=new GreenfootImage("images/Ime_Dead_left_0.png");
        death[1][IME+LEFT]=new GreenfootImage("images/Ime_Dead_left_1.png");
        death[2][IME+LEFT]=new GreenfootImage("images/Ime_Dead_left_2.png");
        death[3][IME+LEFT]=new GreenfootImage("images/Ime_Dead_left_3.png");
        death[4][IME+LEFT]=new GreenfootImage("images/Ime_Dead_left_4.png");
        death[5][IME+LEFT]=new GreenfootImage("images/Ime_Dead_left_5.png");
        death[6][IME+LEFT]=new GreenfootImage("images/Ime_Dead_left_6.png");
        death[7][IME+LEFT]=new GreenfootImage("images/Ime_Dead_left_7.png");
        death[8][IME+LEFT]=new GreenfootImage("images/Ime_Dead_left_8.png");
        death[9][IME+LEFT]=new GreenfootImage("images/Ime_Dead_left_9.png");
        death[10][IME+LEFT]=new GreenfootImage("images/Ime_Dead_left_10.png");
        death[11][IME+LEFT]=new GreenfootImage("images/Ime_Dead_left_11.png");
        death[12][IME+LEFT]=new GreenfootImage("images/Ime_Dead_left_12.png");
        death[13][IME+LEFT]=new GreenfootImage("images/Ime_Dead_left_13.png");
        death[14][IME+LEFT]=new GreenfootImage("images/Ime_Dead_left_14.png");
        death[0][IME+RIGHT]=new GreenfootImage("images/Ime_Dead_right_0.png");
        death[1][IME+RIGHT]=new GreenfootImage("images/Ime_Dead_right_1.png");
        death[2][IME+RIGHT]=new GreenfootImage("images/Ime_Dead_right_2.png");
        death[3][IME+RIGHT]=new GreenfootImage("images/Ime_Dead_right_3.png");
        death[4][IME+RIGHT]=new GreenfootImage("images/Ime_Dead_right_4.png");
        death[5][IME+RIGHT]=new GreenfootImage("images/Ime_Dead_right_5.png");
        death[6][IME+RIGHT]=new GreenfootImage("images/Ime_Dead_right_6.png");
        death[7][IME+RIGHT]=new GreenfootImage("images/Ime_Dead_right_7.png");
        death[8][IME+RIGHT]=new GreenfootImage("images/Ime_Dead_right_8.png");
        death[9][IME+RIGHT]=new GreenfootImage("images/Ime_Dead_right_9.png");
        death[10][IME+RIGHT]=new GreenfootImage("images/Ime_Dead_right_10.png");
        death[11][IME+RIGHT]=new GreenfootImage("images/Ime_Dead_right_11.png");
        death[12][IME+RIGHT]=new GreenfootImage("images/Ime_Dead_right_12.png");
        death[13][IME+RIGHT]=new GreenfootImage("images/Ime_Dead_right_13.png");
        death[14][IME+RIGHT]=new GreenfootImage("images/Ime_Dead_right_14.png");
        
        walk = new GreenfootImage[MAX_COUNTER_WALK][4];
        walk[0][MISA+LEFT]=new GreenfootImage("images/Misa_Walk_left_0.png");
        walk[1][MISA+LEFT]=new GreenfootImage("images/Misa_Walk_left_1.png");
        walk[2][MISA+LEFT]=new GreenfootImage("images/Misa_Walk_left_2.png");
        walk[3][MISA+LEFT]=new GreenfootImage("images/Misa_Walk_left_3.png");
        walk[4][MISA+LEFT]=new GreenfootImage("images/Misa_Walk_left_4.png");
        walk[5][MISA+LEFT]=new GreenfootImage("images/Misa_Walk_left_5.png");
        walk[6][MISA+LEFT]=new GreenfootImage("images/Misa_Walk_left_6.png");
        walk[7][MISA+LEFT]=new GreenfootImage("images/Misa_Walk_left_7.png");
        walk[8][MISA+LEFT]=new GreenfootImage("images/Misa_Walk_left_8.png");
        walk[9][MISA+LEFT]=new GreenfootImage("images/Misa_Walk_left_9.png");
        walk[10][MISA+LEFT]=new GreenfootImage("images/Misa_Walk_left_10.png");
        walk[11][MISA+LEFT]=new GreenfootImage("images/Misa_Walk_left_11.png");
        walk[0][MISA+RIGHT]=new GreenfootImage("images/Misa_Walk_right_0.png");
        walk[1][MISA+RIGHT]=new GreenfootImage("images/Misa_Walk_right_1.png");
        walk[2][MISA+RIGHT]=new GreenfootImage("images/Misa_Walk_right_2.png");
        walk[3][MISA+RIGHT]=new GreenfootImage("images/Misa_Walk_right_3.png");
        walk[4][MISA+RIGHT]=new GreenfootImage("images/Misa_Walk_right_4.png");
        walk[5][MISA+RIGHT]=new GreenfootImage("images/Misa_Walk_right_5.png");
        walk[6][MISA+RIGHT]=new GreenfootImage("images/Misa_Walk_right_6.png");
        walk[7][MISA+RIGHT]=new GreenfootImage("images/Misa_Walk_right_7.png");
        walk[8][MISA+RIGHT]=new GreenfootImage("images/Misa_Walk_right_8.png");
        walk[9][MISA+RIGHT]=new GreenfootImage("images/Misa_Walk_right_9.png");
        walk[10][MISA+RIGHT]=new GreenfootImage("images/Misa_Walk_right_10.png");
        walk[11][MISA+RIGHT]=new GreenfootImage("images/Misa_Walk_right_11.png");
        walk[0][IME+LEFT]=new GreenfootImage("images/Ime_Walk_left_0.png");
        walk[1][IME+LEFT]=new GreenfootImage("images/Ime_Walk_left_1.png");
        walk[2][IME+LEFT]=new GreenfootImage("images/Ime_Walk_left_2.png");
        walk[3][IME+LEFT]=new GreenfootImage("images/Ime_Walk_left_3.png");
        walk[4][IME+LEFT]=new GreenfootImage("images/Ime_Walk_left_4.png");
        walk[5][IME+LEFT]=new GreenfootImage("images/Ime_Walk_left_5.png");
        walk[6][IME+LEFT]=new GreenfootImage("images/Ime_Walk_left_6.png");
        walk[7][IME+LEFT]=new GreenfootImage("images/Ime_Walk_left_7.png");
        walk[8][IME+LEFT]=new GreenfootImage("images/Ime_Walk_left_8.png");
        walk[9][IME+LEFT]=new GreenfootImage("images/Ime_Walk_left_9.png");
        walk[10][IME+LEFT]=new GreenfootImage("images/Ime_Walk_left_10.png");
        walk[11][IME+LEFT]=new GreenfootImage("images/Ime_Walk_left_11.png");
        walk[0][IME+RIGHT]=new GreenfootImage("images/Ime_Walk_right_0.png");
        walk[1][IME+RIGHT]=new GreenfootImage("images/Ime_Walk_right_1.png");
        walk[2][IME+RIGHT]=new GreenfootImage("images/Ime_Walk_right_2.png");
        walk[3][IME+RIGHT]=new GreenfootImage("images/Ime_Walk_right_3.png");
        walk[4][IME+RIGHT]=new GreenfootImage("images/Ime_Walk_right_4.png");
        walk[5][IME+RIGHT]=new GreenfootImage("images/Ime_Walk_right_5.png");
        walk[6][IME+RIGHT]=new GreenfootImage("images/Ime_Walk_right_6.png");
        walk[7][IME+RIGHT]=new GreenfootImage("images/Ime_Walk_right_7.png");
        walk[8][IME+RIGHT]=new GreenfootImage("images/Ime_Walk_right_8.png");
        walk[9][IME+RIGHT]=new GreenfootImage("images/Ime_Walk_right_9.png");
        walk[10][IME+RIGHT]=new GreenfootImage("images/Ime_Walk_right_10.png");
        walk[11][IME+RIGHT]=new GreenfootImage("images/Ime_Walk_right_11.png");
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
           checkCharacter();
           checkHurted();
           checkItemBombCollision();
           checkItemJokeisCollision();
       }
    
    }

    private void animation()
    {
        if(holdToAttack > 0 && holdToAttack < 15)
            holdToAttack++;
        if(getImage() == attack_fist[MAX_COUNTER_FIST-1][character+direction] || getImage() == attack_sword[MAX_COUNTER_SWORD-1][character+direction] || getImage() == attack_knife[MAX_COUNTER_KNIFE-1][character+direction] || getImage() == attack_bomb[MAX_COUNTER_BOMB-1][character+direction] )
        {
            attacking = false;
            holdToAttack++;
        }    
        
        if(getImage() == death[MAX_COUNTER_DEATH-1][character+direction])
        {
            if(imageRepetition==20)
                getWorld().removeObject(this);
        }
        
        if(getImage() == hurt[MAX_COUNTER_HURT-1][character+direction])
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
            if (currentImage>=stay.length)
                currentImage=0;
            if(imageRepetition >= 3)
            {
                imageRepetition=0;
                counterAnimation++;
                if(counterAnimation >= MAX_COUNTER_STAY)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % stay.length;
            }
            setImage(stay[currentImage][character+direction]);
        }
        
        //walk
        if(attacking == false && hurted == false && died == false && jumping == false && walking == true && vulnerability == true)
        {
            if (currentImage>=walk.length)
                currentImage=0;
            if(imageRepetition >= 2)
            {
                imageRepetition=0;
                counterAnimation++;
                if(counterAnimation >= MAX_COUNTER_WALK)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % walk.length;
            }
            setImage(walk[currentImage][character+direction]);
        }
        
        if(attacking == true )
        {
            switch(selectedItem)
            {
                case ITEM_FIST:
                    if (currentImage>=attack_fist.length)
                        currentImage=0;
                    if(imageRepetition >= 2)
                    {
                        imageRepetition=0;
                        counterAnimation++;
                        if(counterAnimation >= MAX_COUNTER_FIST)
                            counterAnimation=0;
                        currentImage = (currentImage + 1) % attack_fist.length;
                    }
                    setImage(attack_fist[currentImage][character+direction]);
                break;
                case ITEM_SWORD:
                    if (currentImage>=attack_sword.length)
                        currentImage=0;
                    if(imageRepetition >= 4)
                    {
                        imageRepetition=0;
                        counterAnimation++;
                        if(counterAnimation >= MAX_COUNTER_SWORD)
                            counterAnimation=0;
                        currentImage = (currentImage + 1) % attack_sword.length;
                    }
                    setImage(attack_sword[currentImage][character+direction]);
                break;
                case ITEM_KNIFE:
                    if (currentImage>=attack_knife.length)
                        currentImage=0;
                    if(imageRepetition >= 3)
                    {
                        imageRepetition=0;
                        counterAnimation++;
                        if(counterAnimation >= MAX_COUNTER_KNIFE)
                            counterAnimation=0;
                        currentImage = (currentImage + 1) % attack_knife.length;
                    }
                    setImage(attack_knife[currentImage][character+direction]);
                break;
                case ITEM_BOMB:
                    if(bombAmmo>0)
                    {
                        if (currentImage>=attack_bomb.length)
                            currentImage=0;
                        if(imageRepetition >= 3)
                        {
                            imageRepetition=0;
                            counterAnimation++;
                            if(counterAnimation >= MAX_COUNTER_BOMB)
                                counterAnimation=0;
                            currentImage = (currentImage + 1) % attack_bomb.length;
                        }
                        setImage(attack_bomb[currentImage][character+direction]);
                    }
                    else
                    {
                        attacking = false;
                        holdToAttack = 15;
                    }
                break;
            }
        }
        
        if(died == true && getImage() != death[MAX_COUNTER_DEATH-1][character+direction])
        {
            if (currentImage>=death.length)
                currentImage=0;
            if(imageRepetition >= 2)
            {
                imageRepetition=0;
                counterAnimation++;
                if(counterAnimation >= MAX_COUNTER_DEATH)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % death.length;
            }
            setImage(death[currentImage][character+direction]);
        }
        
        if(hurted == true && getImage()!= hurt[MAX_COUNTER_HURT-1][character+direction])
        {
            if (currentImage>=hurt.length)
                currentImage=0;
            if(imageRepetition >= 5)
            {
                imageRepetition=0;
                counterAnimation++;
                if(counterAnimation >= MAX_COUNTER_HURT)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % hurt.length;
            }
            setImage(hurt[currentImage][character+direction]);
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
    
    private void keyCheckMove()
    {
        //Move left
        if(Greenfoot.isKeyDown("left")){
            direction = LEFT;
            speed = -HSPEED;
            setLocation(getX()+speed,getY());
            walking=true;
        }
        
        //Move right
        if(Greenfoot.isKeyDown("right")){
            direction = RIGHT;
            speed = HSPEED;
            setLocation(getX()+speed,getY());
            walking=true;
        }
        
        //Key release walking
        if(!Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("right"))
        {
            speed=0;
            walking=false;
        }
        
        //Jump
        if(Greenfoot.isKeyDown("UP") && jumping == false)
        {
            jump();
        }
        
        if(Greenfoot.isKeyDown("ENTER") &&  holdToAttack>=15 && hurted == false && died == false && vulnerability == true)
        {
            attacking = true;
            holdToAttack=0;
            createWeapon();
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
                    getWorld().addObject(new FistAttack(),getX()+8,getY());
                else
                    getWorld().addObject(new FistAttack(),getX()-8,getY());
            break;
            
            case ITEM_SWORD:
                if(direction == RIGHT)
                    getWorld().addObject(new SwordAttack(),getX()+12,getY());
                else
                    getWorld().addObject(new SwordAttack(),getX()-12,getY());
            break;
            
            case ITEM_KNIFE:
                if(direction == RIGHT)
                    getWorld().addObject(new KnifeAttack(direction),getX()+32,getY());
                else
                    getWorld().addObject(new KnifeAttack(direction),getX()-32,getY());
            break;
            
            case ITEM_BOMB:
                if(bombAmmo>0)
                {
                    if(direction == RIGHT)
                        getWorld().addObject(new BombAttack(),getX()+32,getY()+8);
                    else
                        getWorld().addObject(new BombAttack(),getX()-32,getY()+8);
                    bombAmmo--;    
                    getWorldOfType(ScrollingWorld.class).inventory.setBombExistence(bombAmmo);
                }
            break;
        }
    }
    
    private void checkCharacter()
    {
        character = getWorldOfType(ScrollingWorld.class).getChar();
    }
    
    private void checkHurted()
    {
        if (Greenfoot.mouseClicked(this) && vulnerability == true && hurted == false)
        {
            health-=5;
            hurted = true;
            vulnerability = false;
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
        vSpeed = vSpeed - jumpStrength;
        jumping = true;
        fall();
    }
    
    private void fall()
    {
        if (attacking == false && died == false && hurted == false)
            setImage(fall[character+direction]);
        setLocation(getX(), getY() + vSpeed);
        if(vSpeed>=-12)
        ((ScrollingWorld)getWorld()).shiftWorld(-speed,-vSpeed);
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
        Actor ground = getOneObjectAtOffset(0, 32, Block.class);
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
    
    private boolean checkCellingColision()
    {
        
        Actor celling = getOneObjectAtOffset(0, -16, Block.class);
        if(celling != null)
        {
            vSpeed = 1;
            bopHead(celling);
            return true;
        }
        else
            return false;
    }
    
    private boolean checkWallColision()
    {
        if (direction == RIGHT)
        {
            Actor wall = getOneObjectAtOffset(16, 0, Block.class);
            if(wall == null)
                return false;
            else
            {
                stopByWall(wall);
                return true;
            }
        }
        else
        {
            Actor wall = getOneObjectAtOffset(-16, 0, Block.class);
            if(wall == null)
                return false;
            else
            {
                stopByWall(wall);
                return true;
            }
        }
    }
    
    private void bopHead(Actor celling)
    {
        int cellingHeight = celling.getImage().getHeight();
        int newY = celling.getY() + (cellingHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
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
        int wallWidth = wall.getImage().getWidth();
        if(direction == RIGHT)
        {
            int newX = wall.getX() - (wallWidth + getImage().getWidth())/2;
            setLocation(newX+5, getY());
        }
        else
        {
            int newX = wall.getX() + (wallWidth + getImage().getWidth())/2;
            setLocation(newX-5, getY());
        }
    }
    
    private boolean checkItemBombCollision()
    {
        if (direction == RIGHT)
        {
            Actor bomb = getOneObjectAtOffset(20, 0, BombAmmo.class);
            if(bomb == null)
                return false;
            else
            {
                getWorld().removeObject(bomb);
                bombAmmo+=5;
                getWorldOfType(ScrollingWorld.class).inventory.setBombExistence(bombAmmo);
                return true;
            }
        }
        else
        {
            Actor bomb = getOneObjectAtOffset(-20, 0, BombAmmo.class);
            if(bomb == null)
                return false;
            else
            {
                getWorld().removeObject(bomb);
                bombAmmo+=5;
                getWorldOfType(ScrollingWorld.class).inventory.setBombExistence(bombAmmo);
                return true;
            }
        }
    }
    
    private boolean checkItemJokeisCollision()
    {
        if (direction == RIGHT)
        {
            Actor jokeis = getOneObjectAtOffset(20, 0, Jokeis.class);
            if(jokeis == null)
                return false;
            else
            {
                getWorld().removeObject(jokeis);
                score+=100;
                jokeisQuantity++;
                getWorldOfType(ScrollingWorld.class).inventory.setBombExistence(bombAmmo);
                return true;
            }
        }
        else
        {
            Actor jokeis = getOneObjectAtOffset(-20, 0, Jokeis.class);
            if(jokeis == null)
                return false;
            else
            {
                getWorld().removeObject(jokeis);
                score+=100;
                jokeisQuantity++;
                getWorldOfType(ScrollingWorld.class).inventory.setBombExistence(bombAmmo);
                return true;
            }
        }
    }
    
    private void boundedMove() 
    {
        if( speed+getX() <= X_BOUNDARY ) 
        {
            setLocation(X_BOUNDARY, getY());
            ((ScrollingWorld)getWorld()).shiftWorld(-speed,getY());
        } else if( speed+getX() >= getWorld().getWidth()-X_BOUNDARY ) 
        {
            setLocation(getWorld().getWidth()-X_BOUNDARY, getY());
            ((ScrollingWorld)getWorld()).shiftWorld(-speed,getY());
        } 
        
    }
    
    public int getHealth()
    {
        return health;
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
}
