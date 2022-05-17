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
        
        character = new MainCharacter(MISA);
        addObject(character, 50,50);
        
        addObject(new idMainCharacter(), (BLOCK_SIZE/2)*3, SCROLL_HEIGHT-BLOCK_SIZE/2-BLOCK_SIZE);
        addObject(new Inventory(), BLOCK_SIZE*3, SCROLL_HEIGHT-BLOCK_SIZE/2);
        addObject(new Cursor(), (BLOCK_SIZE/2)*3, SCROLL_HEIGHT-BLOCK_SIZE/2);
        
        //addObject(new Scroller(), 0, 0);
    }
}
