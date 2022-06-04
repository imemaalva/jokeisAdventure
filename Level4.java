import greenfoot.*;  
public class Level4 extends ScrollingWorld
{

    private static final int WORLD_WIDTH = 6784;
    private static final int WORLD_HEIGHT = 608;

    private int x=0;
    private static final int LEVEL = 1;
    private static final int LEVEL_COUNTER = 4;

    private static final int MAX_COUNTER_THUNDER = 7;

    private int timeBeforeThunder = 0;
    private int counterAnimation;
    private int currentImage = 0;
    private int imageRepetition = 0;

    private GreenfootImage []thunder;

    public Level4(int characterId, int health, int bombAmmo, int selectedItem, int score)
    {
        super(WORLD_WIDTH, WORLD_HEIGHT, LEVEL, new GreenfootImage("images/Lvl_Cementery_0_6.png"),characterId);
        if(bgMusic!=null)
            bgMusic.stop();
        bgMusic = new GreenfootSound("sounds/For Whom the Bell Tolls.mp3");
        bgMusic.playLoop();

        thunder = new GreenfootImage[MAX_COUNTER_THUNDER];
        thunder[0] = new GreenfootImage("images/Lvl_Cementery_0_6.png");
        thunder[1] = new GreenfootImage("images/Lvl_Cementery_0_0.png");
        thunder[2] = new GreenfootImage("images/Lvl_Cementery_0_1.png");
        thunder[3] = new GreenfootImage("images/Lvl_Cementery_0_2.png");
        thunder[4] = new GreenfootImage("images/Lvl_Cementery_0_3.png");
        thunder[5] = new GreenfootImage("images/Lvl_Cementery_0_4.png");
        thunder[6] = new GreenfootImage("images/Lvl_Cementery_0_5.png");

        character = new MainCharacter(characterId,health,score,selectedItem,bombAmmo);

        addObject(new Skellington(),(BLOCK_SIZE/2)+BLOCK_SIZE*8, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);

        for(x=0;x<9;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        for(x=9;x<16;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);

        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        for(x=17;x<19;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new Skellington(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+8), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4-24);

        for(x=19;x<36;x++)
            addObject(new DarkWoodPlatform(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-(BLOCK_SIZE/4)-BLOCK_SIZE*4);

        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new DarkWoodPlatform(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/4)-BLOCK_SIZE*4);
        addObject(new DarkWoodPlatform(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-(BLOCK_SIZE/4)-BLOCK_SIZE*3);
        addObject(new DarkWoodPlatform(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/4)-BLOCK_SIZE*3);
        addObject(new DarkWoodPlatform(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-(BLOCK_SIZE/4)-BLOCK_SIZE*2);
        addObject(new DarkWoodPlatform(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/4)-BLOCK_SIZE*2);

        addObject(new Skellington(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+13), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2-24);

        for(x=42;x<64;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new Skellington(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2-24);

        addObject(new Jokeis(), (BLOCK_SIZE/2)+BLOCK_SIZE*67, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        for(x=66;x<73;x++)
        {
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        }

        for(x=73;x<75;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        for(x=76;x<80;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new Skellington(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2-24);
        for(x=82;x<87;x++)
        {
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        }
        for(x=87;x<89;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        for(x=92;x<100;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);

        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        for(x=101;x<105;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);

        for(x=110;x<112;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new Skellington(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2-24);
        for(x=112;x<114;x++)
        {
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        }
        for(x=114;x<116;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new Skellington(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2-24);

        addObject(new Jokeis(), (BLOCK_SIZE/2)+BLOCK_SIZE*117, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);
        for(x=116;x<118;x++)
        {
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        }
        for(x=118;x<120;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new Skellington(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2-24);
        for(x=120;x<122;x++)
        {
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        }
        for(x=122;x<124;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);

        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        for(x=127;x<129;x++)
        {
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        }
        addObject(new Skellington(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2-24);
        for(x=129;x<131;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        for(x=131;x<133;x++)
        {
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        }
        for(x=133;x<144;x++)
            addObject(new DarkWoodPlatform(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/4)-(BLOCK_SIZE/2)-BLOCK_SIZE*2);  
        addObject(new DarkWoodPlatform(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/4)-BLOCK_SIZE*2);
        for(x=145;x<149;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        for(x=149;x<155;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

        addObject(new Jokeis(), (BLOCK_SIZE/2)+BLOCK_SIZE*159, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        for(x=155;x<157;x++)
        {
            addObject(new DarkWoodPlatform(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-(BLOCK_SIZE/4)-BLOCK_SIZE*3);
            addObject(new NoGround(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2));
        }
        for(x=157;x<160;x++)
            addObject(new NoGround(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2));
        for(x=160;x<165;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        for(x=165;x<167;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);

        for(x=167;x<172;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        for(x=173;x<176;x++)
        {
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        }
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x-1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x-1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

        for(x=176;x<178;x++)
        {
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        }
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        for(x=179;x<184;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);

        for(x=190;x<212;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        addObject(new RoomPass(LEVEL_COUNTER, characterId), BLOCK_SIZE*(x-3), WORLD_HEIGHT-BLOCK_SIZE*3);
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
