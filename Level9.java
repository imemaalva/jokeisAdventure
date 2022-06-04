import greenfoot.*;  
public class Level9 extends ScrollingWorld
{

    private static final int WORLD_WIDTH = 2019;
    private static final int WORLD_HEIGHT = 608;

    private int x=0;
    private static final int LEVEL = 2;
    private static final int LEVEL_COUNTER = 9;

    public Level9(int characterId, int health, int bombAmmo, int selectedItem, int score)
    {
        super(WORLD_WIDTH, WORLD_HEIGHT, LEVEL, new GreenfootImage("images/Lvl_Hell_2.png"),characterId);

        character = new MainCharacter(characterId,health,score,selectedItem,bombAmmo);

        for(x=0;x<5;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

        for(x=6;x<11;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);

        for(x=11;x<14;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-BLOCK_SIZE*6);        
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*9);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*10);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*11);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*12);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+6), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*9);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+6), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*10);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+7), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+7), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);
        for(x=22;x<49;x++)
            addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*9);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*10);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*11);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*12);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*9);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*10);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        for(x=55;x<64;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        for(x=24;x<28;x++)
            addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*10);

        for(x=30;x<34;x++)
            addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*11);

        for(x=37;x<41;x++)
            addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*11);

        for(x=43;x<47;x++)
            addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*10);

        addObject(new BossDemon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x-8), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*15);

        
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
