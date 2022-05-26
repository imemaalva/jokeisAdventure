import greenfoot.*; 
public class Testing extends ScrollingWorld
{
    private static final int WORLD_WIDTH = 4032;
    private static final int WORLD_HEIGHT = 608;
    
    private int x;
    

    public Testing()
    {
        super(WORLD_WIDTH, WORLD_HEIGHT);
        for(x=0;x<11;x++)
        {
            addObject(new Sand(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2));
            addObject(new Water(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/4));
            addObject(new Water(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/4)-BLOCK_SIZE);
        }
        for(x=11;x<23;x++)
            addObject(new Sand(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new BossDeath(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2-64);
        for(x=x; x<33;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        for(x=x; x<35;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        for(x=x; x<38;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        for(x=x+1; x<42;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        }
        addObject(new Zombie(), (BLOCK_SIZE/2)+BLOCK_SIZE*42, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5-40);
        for(x=x; x<44;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
            addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        }
        for(x=x; x<46;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        }
        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        for(x=x; x<56;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        }
        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x-1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x-1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        for(x=x; x<59;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        }
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        for(x=x+2; x<67;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        }
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);
        for(x=x+1; x<72;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);
        }
        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x-1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x-1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        for(x=x+3; x<81;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        }
        for(x=x; x<84;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        }
         addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        for(x=x+1; x<90;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        }
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        for(x=x+4; x<98;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        }
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        for(x=x+1; x<101;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        }
        for(x=x; x<103;x++)
        {
            addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
            addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
            addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        }
        for(x=x; x<105;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        }
        for(x=x; x<107;x++)
        {
            addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
            addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        }
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        for(x=x+1; x<112;x++)
        {
            addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
            addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
            addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        }
        addObject(new WoodPlatform(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new WoodPlatform(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-BLOCK_SIZE*5);
        for(x=x+2; x<121;x++)
        {
        addObject(new WoodPlatform(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        }
        addObject(new WoodPlatform(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-BLOCK_SIZE*5);
        addObject(new WoodPlatform(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        for(x=x+2; x<125;x++)
        {
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        }
        
        addObject(new BombAmmo(), 16+BLOCK_SIZE*10, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE*5);
        addObject(new Jokeis(), 16+BLOCK_SIZE*10, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE);
        addObject(new Jokeis(), 16+BLOCK_SIZE*12, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE);
        addObject(new Jokeis(), 16+BLOCK_SIZE*30, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE);
        
        
        
        character = new MainCharacter(characterId);
        addObject(character, 16+BLOCK_SIZE*11,50);

        
        


        bar = new HealthBar(character.getHealth(),100);
        powerUpBar = new PowerUpBar(character.getPowerUpQuantity(),100, characterId);
        inventory = new Inventory();

        addObject(new IdMainCharacter(), (BLOCK_SIZE/2)*3, SCROLL_HEIGHT-BLOCK_SIZE/2-BLOCK_SIZE);
        addObject(inventory, BLOCK_SIZE*3, SCROLL_HEIGHT-BLOCK_SIZE/2);
        addObject(new Cursor(), (BLOCK_SIZE/2)*3, SCROLL_HEIGHT-BLOCK_SIZE/2);
        addObject(bar,(BLOCK_SIZE/2)+BLOCK_SIZE*3+1 , SCROLL_HEIGHT-(BLOCK_SIZE/4)-BLOCK_SIZE);
        addObject(powerUpBar,(BLOCK_SIZE/2)+BLOCK_SIZE*3+1 , SCROLL_HEIGHT-(BLOCK_SIZE/4)-BLOCK_SIZE-10);
        for(int i = 1; i<= 3; i++)
            addObject(new JokeisIndicator(i), 16+BLOCK_SIZE*4+BLOCK_SIZE*i, SCROLL_HEIGHT-(BLOCK_SIZE/2)*3);
        addObject(new Score(), 0,0);

    }
}
