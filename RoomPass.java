import greenfoot.*;  
public class RoomPass extends ScrollingActor
{
    private static final int MAX_COUNTER_PORTAL = 18;

    private int counterAnimation;
    private int currentImage = 0;
    private int imageRepetition = 0;
    
    private int level;
    private int character;
    private int health;
    private int bombAmmo;
    private int selectedItem;
    private int score;

    private GreenfootImage []portal;
    
    public RoomPass(int level, int character)
    {
        this.character = character;
        this.level = level;
        portal = new GreenfootImage[MAX_COUNTER_PORTAL];
        portal[0] = new GreenfootImage("images/Spr_room_pass_0.png");
        portal[1] = new GreenfootImage("images/Spr_room_pass_1.png");
        portal[2] = new GreenfootImage("images/Spr_room_pass_2.png");
        portal[3] = new GreenfootImage("images/Spr_room_pass_3.png");
        portal[4] = new GreenfootImage("images/Spr_room_pass_4.png");
        portal[5] = new GreenfootImage("images/Spr_room_pass_5.png");
        portal[6] = new GreenfootImage("images/Spr_room_pass_6.png");
        portal[7] = new GreenfootImage("images/Spr_room_pass_7.png");
        portal[8] = new GreenfootImage("images/Spr_room_pass_8.png");
        portal[9] = new GreenfootImage("images/Spr_room_pass_9.png");
        portal[10] = new GreenfootImage("images/Spr_room_pass_10.png");
        portal[11] = new GreenfootImage("images/Spr_room_pass_11.png");
        portal[12] = new GreenfootImage("images/Spr_room_pass_12.png");
        portal[13] = new GreenfootImage("images/Spr_room_pass_13.png");
        portal[14] = new GreenfootImage("images/Spr_room_pass_14.png");
        portal[15] = new GreenfootImage("images/Spr_room_pass_15.png");
        portal[16] = new GreenfootImage("images/Spr_room_pass_16.png");
        portal[17] = new GreenfootImage("images/Spr_room_pass_17.png");
    }
    
    public void act()
    {
        animation();
        checkLevelPassed();
    }
    
    private void animation()
    {
        if(imageRepetition>=2)
        {
            imageRepetition=0;
            counterAnimation++;
            if(counterAnimation >= portal.length)
                counterAnimation=0;
            currentImage = (currentImage + 1) % MAX_COUNTER_PORTAL;
        }
        setImage(portal[currentImage]);
        imageRepetition++;   
    }
    
    private void checkLevelPassed()
    {
        MainCharacter mainCharacter =(MainCharacter) getOneIntersectingObject(MainCharacter.class);
        if(mainCharacter != null)
        {
            
            health = mainCharacter.getHealth();
            bombAmmo = mainCharacter.getBombAmmo();
            selectedItem = mainCharacter.getSelectedItem();
            score = mainCharacter.getScore();
            switch(level)
            {
                case 1:
                    Greenfoot.setWorld(new Level2(character, health, bombAmmo, selectedItem, score));
                break;
                
                case 2:
                    Greenfoot.setWorld(new Level3(character, health, bombAmmo, selectedItem, score));
                break;
                
                case 3:
                    Greenfoot.setWorld(new Level4(character, health, bombAmmo, selectedItem, score));
                break;
                
                case 4:
                    Greenfoot.setWorld(new Level5(character, health, bombAmmo, selectedItem, score));
                break;
                
                case 5:
                    Greenfoot.setWorld(new Level6(character, health, bombAmmo, selectedItem, score));
                break;
                case 6:
                    Greenfoot.setWorld(new Level7(character, health, bombAmmo, selectedItem, score));
                break;
                
                case 7:
                    Greenfoot.setWorld(new Level8(character, health, bombAmmo, selectedItem, score));
                break;
                case 8:
                    Greenfoot.setWorld(new Level9(character, health, bombAmmo, selectedItem, score));
                break;
                
/*                case 9:
                    Greenfoot.setWorld(new WinScreen());
                break;*/
            }
        }
    }
}
