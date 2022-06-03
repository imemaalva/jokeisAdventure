import greenfoot.*; 
public class Lava extends ScrollingActor
{
    private static final int MAX_COUNTER_LAVA = 16;

    private int counterAnimation;
    private int currentImage = 0;
    private int imageRepetition = 0;
    
    private int level;
    private int character;
    private int health;
    private int bombAmmo;
    private int selectedItem;
    private int score;

    private GreenfootImage []lava;

    public Lava(int level, int character, int health, int bombAmmo, int selectedItem, int score)
    {
        this.character = character;
        this.health = health;
        this.bombAmmo = bombAmmo;
        this.selectedItem = selectedItem;
        this.score = score;
        this.level = level;
        
        lava = new GreenfootImage [MAX_COUNTER_LAVA];
        lava[0] = new GreenfootImage("images/Lava_0.png");
        lava[1] = new GreenfootImage("images/Lava_1.png");
        lava[2] = new GreenfootImage("images/Lava_2.png");
        lava[3] = new GreenfootImage("images/Lava_3.png");
        lava[4] = new GreenfootImage("images/Lava_4.png");
        lava[5] = new GreenfootImage("images/Lava_5.png");
        lava[6] = new GreenfootImage("images/Lava_6.png");
        lava[7] = new GreenfootImage("images/Lava_7.png");
        lava[8] = new GreenfootImage("images/Lava_8.png");
        lava[9] = new GreenfootImage("images/Lava_9.png");
        lava[10] = new GreenfootImage("images/Lava_10.png");
        lava[11] = new GreenfootImage("images/Lava_11.png");
        lava[12] = new GreenfootImage("images/Lava_12.png");
        lava[13] = new GreenfootImage("images/Lava_13.png");
        lava[14] = new GreenfootImage("images/Lava_14.png");
        lava[15] = new GreenfootImage("images/Lava_15.png");
    }

    public void act()
    {
        animation();
        checkTouching();
    }

    private void animation()
    {
        if(imageRepetition>=7)
        {
            imageRepetition=0;
            counterAnimation++;
            if(counterAnimation >= lava.length)
                counterAnimation=0;
            currentImage = (currentImage + 1) % MAX_COUNTER_LAVA;
        }
        setImage(lava[currentImage]);
        imageRepetition++;   
    }
    
    private void checkTouching()
    {
        MainCharacter mainCharacter =(MainCharacter) getOneIntersectingObject(MainCharacter.class);
        if(mainCharacter != null)
        {
            switch(level)
            {
                case 2:
                    Greenfoot.setWorld(new Level2(character, health, bombAmmo, selectedItem, score));
                    break;
                    
                case 3:
                    Greenfoot.setWorld(new Level3(character, health, bombAmmo, selectedItem, score));
                    break;
                

                case 7:
                    Greenfoot.setWorld(new Level7(character, health, bombAmmo, selectedItem, score));
                    break;
                
                case 8:
                    Greenfoot.setWorld(new Level8(character, health, bombAmmo, selectedItem, score));
                    break;
                /*
                case 9:
                    Greenfoot.setWorld(new Level9());
                    break;*/

            }
        }
    }
}
