import greenfoot.*; 
public class Testing extends ScrollingWorld
{
    private static final int WORLD_WIDTH = 2016;
    private static final int WORLD_HEIGHT = 608;
    
    
    public Testing()
    {
        super(WORLD_WIDTH, WORLD_HEIGHT);
        for(int i = 0; i<63;i++)
        {
            addObject(new Grass(), 16+BLOCK_SIZE*i, WORLD_HEIGHT-(BLOCK_SIZE/2)*3);
        }
        addObject(new Grass(), 16+BLOCK_SIZE*7, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE);
        addObject(new Grass(), 16+BLOCK_SIZE*7, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE*2);
        addObject(new Grass(), 16+BLOCK_SIZE*8, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE*4);
        addObject(new Grass(), 16+BLOCK_SIZE*9, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE*4);
        addObject(new BombAmmo(), 16+BLOCK_SIZE*9, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE*5);
        addObject(new Jokeis(), 16+BLOCK_SIZE*10, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE);
        addObject(new Jokeis(), 16+BLOCK_SIZE*12, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE);
        addObject(new Jokeis(), 16+BLOCK_SIZE*30, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE);

        
        
        character = new MainCharacter(MISA);
        addObject(character, 50,50);
        
        bar = new HealthBar(character.getHealth(),100);
        inventory = new Inventory();
        
        addObject(new IdMainCharacter(), (BLOCK_SIZE/2)*3, SCROLL_HEIGHT-BLOCK_SIZE/2-BLOCK_SIZE);
        addObject(inventory, BLOCK_SIZE*3, SCROLL_HEIGHT-BLOCK_SIZE/2);
        addObject(new Cursor(), (BLOCK_SIZE/2)*3, SCROLL_HEIGHT-BLOCK_SIZE/2);
        addObject(bar,(BLOCK_SIZE/2)+BLOCK_SIZE*3+1 , SCROLL_HEIGHT-(BLOCK_SIZE/4)-BLOCK_SIZE);
        for(int i = 1; i<= 3; i++)
            addObject(new JokeisIndicator(i), 16+BLOCK_SIZE*4+BLOCK_SIZE*i, SCROLL_HEIGHT-(BLOCK_SIZE/2)*3);
        addObject(new Score(), 0,0);
        
    }
}
