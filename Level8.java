import greenfoot.*;  
public class Level8 extends ScrollingWorld
{

    private static final int WORLD_WIDTH = 6784;
    private static final int WORLD_HEIGHT = 608;

    private int x=0;
    private static final int LEVEL = 2;
    private static final int LEVEL_COUNTER = 8;

    public Level8(int characterId, int health, int bombAmmo, int selectedItem, int score)
    {
        super(WORLD_WIDTH, WORLD_HEIGHT, LEVEL, new GreenfootImage("images/Lvl_Hell_1.png"),characterId);

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

        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+8), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7); 
        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+16), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7); 
        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+24), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7); 
        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+32), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7); 
        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+40), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7); 
        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+48), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7); 

        for(x=16;x<67;x++)
            addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-BLOCK_SIZE*6);   
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        for(x=69;x<76;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);

        for(int y=0;y<4;y++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        addObject(new Lava(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2));

        for(int y=0;y<4;y++)
            addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        addObject(new Lava(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2));

        for(int y=0;y<4;y++)
            addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        addObject(new Lava(LEVEL_COUNTER,characterId,character.getHealth(),character.getBombAmmo(),character.getSelectedItem(),character.getScore()),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+6), WORLD_HEIGHT-(BLOCK_SIZE/2));

        for(int y=0;y<4;y++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+7), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        for(int y=4,x=84;y<8;y++,x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        for(x=88;x<92;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);

        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        for(x=93;x<96;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);  
        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+8), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7); 
        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+16), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7); 
        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+24), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7); 
        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+32), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7); 
        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+40), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7); 
        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+48), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);       

        for(x=98;x<149;x++)
            addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-BLOCK_SIZE*6);   
        addObject(new BlackBrick(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        for(x=151;x<156;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        for(x=156;x<158;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        for(x=158;x<164;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);

        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);

        for(x=164;x<176;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        for(x=176;x<178;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x-1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);

        for(x=178;x<180;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x-1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new Demon(),(BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        for(x=180;x<185;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        for(int y=2,x=185;y<9;y++,x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*y);

        for(x=192;x<212;x++)
            addObject(new RedGrass(),(BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);

        
        addObject(new RoomPass(LEVEL_COUNTER, characterId), BLOCK_SIZE*(x-3), WORLD_HEIGHT-BLOCK_SIZE*10);

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
