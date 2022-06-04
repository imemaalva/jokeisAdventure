import greenfoot.*;  
public class Level7 extends ScrollingWorld
{

    private static final int WORLD_WIDTH = 6784;
    private static final int WORLD_HEIGHT = 608;

    private int x=0;
    private static final int LEVEL = 2;
    private static final int LEVEL_COUNTER = 7;

    public Level7(int characterId, int health, int bombAmmo, int selectedItem, int score)
    {
        super(WORLD_WIDTH, WORLD_HEIGHT, LEVEL, new GreenfootImage("images/Lvl_Hell_0.png"),characterId);
        if(bgMusic!=null)
            bgMusic.stop();
        bgMusic = new GreenfootSound("sounds/The Trooper.mp3");
        bgMusic.playLoop();

        character = new MainCharacter(characterId,health,score,selectedItem,bombAmmo);

        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

        for(x=0;x<5;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

        for(x=6;x<11;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        for(x=12;x<15;x++)
        {
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        }

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new FragileBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        for(x=18;x<20;x++)
        {
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2));
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        }

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2));
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2));
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

        for(x=16;x<26;x++)
            addObject(new Lava(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2));

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2));
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);

        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new Skellington(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+6), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        for(x=29;x<37;x++)
            addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        for(x=40;x<46;x++)
            addObject(new BlackGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);


        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);
        addObject(new Zombie(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        for(x=49;x<62;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*9);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*12);
        for(int y=2;y<10;y++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*12);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*11);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        for(int y=5;y<11;y++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        for(int y=5;y<9;y++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+6), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+7), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+7), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+7), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*10);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+8), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+8), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+8), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*10);
        for(int y=9,x=71;y>5;y--)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);
        for(int y=8,x=72;x<78;x++,y--)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);
        x=78;
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x-1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

        for(x=78;x<83;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);

        for(int y=3,x=83;x<88;x++,y++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        for(x=88;x<91;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);

        for(int y=7;y>1;y--)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        for(x=92;x<94;x++)
        {
            addObject(new Lava(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new Lava(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2));
        }

        for(x=94;x<96;x++)
            for(int y=2;y<8;y++)
                addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        for(x=96;x<98;x++)
        {
            addObject(new Lava(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new Lava(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2));
        }

        for(x=98;x<100;x++)
            for(int y=2;y<8;y++)
                addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        for(x=100;x<102;x++)
        {
            addObject(new Lava(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new Lava(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2));
        }

        for(x=102;x<104;x++)
            for(int y=2;y<8;y++)
                addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        for(x=104;x<107;x++)
        {
            addObject(new Lava(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new Lava(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2));
        }

        for(int y=2;y<7;y++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+8), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);

        for(x=107;x<117;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);

        for(int y=6,x=117;x<122;x++,y--)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        for(int y=2,x=122;x<130;x++,y++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        for(int y=9,x=130;x<139;x++,y--)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);
        x=139;
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+8), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);

        addObject(new Zombie(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+12), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);

        for(x=143;x<155;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        for(int y=2;y<7;y++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);
        for(x=156;x<158;x++)
        {
            addObject(new Lava(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new Lava(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2));
        }

        for(x=158;x<162;x++)
            for(int y=2;y<8;y++)
                addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        for(x=162;x<164;x++)
        {
            addObject(new Lava(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new Lava(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2));
        }

        for(int y=2;y<7;y++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        for(x=165;x<176;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);

        for(x=180;x<185;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        for(int y=2,x=185;x<192;x++,y++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        for(int y=2,x=191;y<7;y++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        for(x=192;x<212;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x-6), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

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
    }

}
