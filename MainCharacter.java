import greenfoot.*;
public class MainCharacter extends Actor
{
    private static int OFFSET = 5;
    
    private static int MISA = 0;
    private static int IME = 2;
    
    private static int LEFT = 0;
    private static int RIGHT = 1;
    
    private GreenfootImage [][]stay;
    private GreenfootImage [][]attack_sword;
    private GreenfootImage [][]attack_knife;
    private GreenfootImage [][]attack_bomb;
    private GreenfootImage [][]attack_fist;
    private GreenfootImage [][]hurt;
    private GreenfootImage [][]death;
    private GreenfootImage [][]walk;
    
    private int character = MISA; 
    private int health = 100;
    private int power = 100;
    private int direction = RIGHT;
    private int score = 0;
    private int offsetX = 0;
    private int offsetY = 0;
    
    public MainCharacter()
    {
        stay = new GreenfootImage[5][4];
        stay[0][MISA+LEFT]=new GreenfootImage("Misa_left_0");
        stay[1][MISA+LEFT]=new GreenfootImage("Misa_left_1");
        stay[2][MISA+LEFT]=new GreenfootImage("Misa_left_2");
        stay[3][MISA+LEFT]=new GreenfootImage("Misa_left_3");
        stay[4][MISA+LEFT]=new GreenfootImage("Misa_left_4");
        stay[0][MISA+RIGHT]=new GreenfootImage("Misa_right_0");
        stay[1][MISA+RIGHT]=new GreenfootImage("Misa_right_1");
        stay[2][MISA+RIGHT]=new GreenfootImage("Misa_right_2");
        stay[3][MISA+RIGHT]=new GreenfootImage("Misa_right_3");
        stay[4][MISA+RIGHT]=new GreenfootImage("Misa_right_4");
        stay[0][IME+LEFT]=new GreenfootImage("Ime_left_0");
        stay[1][IME+LEFT]=new GreenfootImage("Ime_left_1");
        stay[2][IME+LEFT]=new GreenfootImage("Ime_left_2");
        stay[3][IME+LEFT]=new GreenfootImage("Ime_left_3");
        stay[4][IME+LEFT]=new GreenfootImage("Ime_left_4");
        stay[0][IME+RIGHT]=new GreenfootImage("Ime_right_0");
        stay[1][IME+RIGHT]=new GreenfootImage("Ime_right_1");
        stay[2][IME+RIGHT]=new GreenfootImage("Ime_right_2");
        stay[3][IME+RIGHT]=new GreenfootImage("Ime_right_3");
        stay[4][IME+RIGHT]=new GreenfootImage("Ime_right_4");
        
        attack_sword = new GreenfootImage[6][4];
        attack_sword[0][MISA+LEFT]=new GreenfootImage("Misa_Attck_Sword_left_0");
        attack_sword[1][MISA+LEFT]=new GreenfootImage("Misa_Attck_Sword_left_1");
        attack_sword[2][MISA+LEFT]=new GreenfootImage("Misa_Attck_Sword_left_2");
        attack_sword[3][MISA+LEFT]=new GreenfootImage("Misa_Attck_Sword_left_3");
        attack_sword[4][MISA+LEFT]=new GreenfootImage("Misa_Attck_Sword_left_4");
        attack_sword[5][MISA+LEFT]=new GreenfootImage("Misa_Attck_Sword_left_5");
        attack_sword[0][MISA+RIGHT]=new GreenfootImage("Misa_Attck_Sword_right_0");
        attack_sword[1][MISA+RIGHT]=new GreenfootImage("Misa_Attck_Sword_right_1");
        attack_sword[2][MISA+RIGHT]=new GreenfootImage("Misa_Attck_Sword_right_2");
        attack_sword[3][MISA+RIGHT]=new GreenfootImage("Misa_Attck_Sword_right_3");
        attack_sword[4][MISA+RIGHT]=new GreenfootImage("Misa_Attck_Sword_right_4");
        attack_sword[5][MISA+RIGHT]=new GreenfootImage("Misa_Attck_Sword_right_5");
        attack_sword[0][IME+LEFT]=new GreenfootImage("Ime_Attck_Sword_left_0");
        attack_sword[1][IME+LEFT]=new GreenfootImage("Ime_Attck_Sword_left_1");
        attack_sword[2][IME+LEFT]=new GreenfootImage("Ime_Attck_Sword_left_2");
        attack_sword[3][IME+LEFT]=new GreenfootImage("Ime_Attck_Sword_left_3");
        attack_sword[4][IME+LEFT]=new GreenfootImage("Ime_Attck_Sword_left_4");
        attack_sword[5][IME+LEFT]=new GreenfootImage("Ime_Attck_Sword_left_5");
        attack_sword[0][IME+RIGHT]=new GreenfootImage("Ime_Attck_Sword_right_0");
        attack_sword[1][IME+RIGHT]=new GreenfootImage("Ime_Attck_Sword_right_1");
        attack_sword[2][IME+RIGHT]=new GreenfootImage("Ime_Attck_Sword_right_2");
        attack_sword[3][IME+RIGHT]=new GreenfootImage("Ime_Attck_Sword_right_3");
        attack_sword[4][IME+RIGHT]=new GreenfootImage("Ime_Attck_Sword_right_4");
        attack_sword[5][IME+RIGHT]=new GreenfootImage("Ime_Attck_Sword_right_5");
    }
    
    
    public void act()
    {
        // Add your action code here.
    }
}
