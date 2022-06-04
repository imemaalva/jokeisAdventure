import greenfoot.*;  
public class Level6 extends ScrollingWorld
{

    private static final int WORLD_WIDTH = 2016;
    private static final int WORLD_HEIGHT = 608;

    private int x=0;
    private static final int LEVEL = 1;
    private static final int LEVEL_COUNTER = 6;

    private static final int MAX_COUNTER_THUNDER = 9;

    private int timeBeforeThunder = 0;
    private int counterAnimation;
    private int currentImage = 0;
    private int imageRepetition = 0;

    private GreenfootImage []thunder;

    public Level6(int characterId, int health, int bombAmmo, int selectedItem, int score)
    {
        super(WORLD_WIDTH, WORLD_HEIGHT, LEVEL, new GreenfootImage("images/Lvl_Cementery_2_0.png"),characterId);

        thunder = new GreenfootImage[MAX_COUNTER_THUNDER];
        thunder[0] = new GreenfootImage("images/Lvl_Cementery_2_0.png");
        thunder[1] = new GreenfootImage("images/Lvl_Cementery_2_1.png");
        thunder[2] = new GreenfootImage("images/Lvl_Cementery_2_2.png");
        thunder[3] = new GreenfootImage("images/Lvl_Cementery_2_3.png");
        thunder[4] = new GreenfootImage("images/Lvl_Cementery_2_4.png");
        thunder[5] = new GreenfootImage("images/Lvl_Cementery_2_5.png");
        thunder[6] = new GreenfootImage("images/Lvl_Cementery_2_6.png");
        thunder[7] = new GreenfootImage("images/Lvl_Cementery_2_7.png");
        thunder[8] = new GreenfootImage("images/Lvl_Cementery_2_8.png");

        character = new MainCharacter(characterId,health,score,selectedItem,bombAmmo);

        for(x=3;x<9;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        for (int y=4,x=11;y<9;y++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        for(x=12;x<14;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

        for (int y=6,x=14;y<10;y++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        for (int y=10,x=15;y<13;y++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        for (int y=11,x=16;y<13;y++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        for (int y=9,x=17;y<11;y++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);

        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*13);

        for(x=20;x<35;x++)
        {
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*12);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*13);    
        }

        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*12);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*13); 

        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);

        for (int y=6,x=39;y<12;y++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);

        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+6), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+6), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);

        for (x=42;x<60;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

        for (x=44;x<46;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);

        for (x=48;x<50;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);

        for (x=52;x<54;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);

        for (x=56;x<58;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);

        addObject(new BossDeath(), BLOCK_SIZE*(x-6), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);

        addObject(character, 96,200);
        bar = new HealthBar(character.getHealth(),100);
        powerUpBar = new PowerUpBar(character.getPowerUpQuantity(),100, characterId);
        inventory = new Inventory(character.getBombAmmo());

        addObject(new IdMainCharacter(), (BLOCK_SIZE/2)*3, SCROLL_HEIGHT-BLOCK_SIZE/2-BLOCK_SIZE);
        addObject(inventory, BLOCK_SIZE*3, SCROLL_HEIGHT-BLOCK_SIZE/2);
        addObject(new Cursor(), (BLOCK_SIZE/2)*3, SCROLL_HEIGHT-BLOCK_SIZE/2);
        addObject(bar,(BLOCK_SIZE/2)+BLOCK_SIZE*3+1 , SCROLL_HEIGHT-(BLOCK_SIZE/4)-BLOCK_SIZE);
        addObject(powerUpBar,(BLOCK_SIZE/2)+BLOCK_SIZE*3+1 , SCROLL_HEIGHT-(BLOCK_SIZE/4)-BLOCK_SIZE-10);
        for(int i = 1; i<= 3; i++)
            addObject(new JokeisIndicator(i), 16+BLOCK_SIZE*4+BLOCK_SIZE*i, SCROLL_HEIGHT-(BLOCK_SIZE/2)*3);
        addObject(new Score(), 0,0);
    }

    public void act()
    {
        if(character.getDead()==true)
            bgMusic.stop();
        animation();
    }

    private void animation()
    {
        if(super.bimg == thunder[MAX_COUNTER_THUNDER-1] && imageRepetition >=3)
        {
            super.bimg = thunder[0];
            imageRepetition = 0;
            timeBeforeThunder = 0;
        }
        if(imageRepetition>=3)
        {
            if(timeBeforeThunder>40)
            {
                imageRepetition=0;
                counterAnimation++;
                if(counterAnimation >= thunder.length)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % MAX_COUNTER_THUNDER;
                super.bimg =thunder[currentImage];

            }
            else 
                timeBeforeThunder++;
        }
        imageRepetition++;   
    }
}
