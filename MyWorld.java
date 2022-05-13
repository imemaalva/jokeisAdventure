import greenfoot.*;  
public class MyWorld extends World
{
    private static int BLOCK_SIZE = 32;
    private static int MISA = 0;
    private static int IME = 2;
    public MainCharacter character = new MainCharacter(MISA);
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 400, 1); 
        addObject(character, 50, 50);
        Block block = new Block();
        addObject(block, 16, 384);
        for(int i = 1; i<20;i++)
        {
            block = new Block();
            addObject(block, 16+BLOCK_SIZE*i, 384);
        }
        block = new Block();
        addObject(block, 16+BLOCK_SIZE*7, 384-BLOCK_SIZE);
        block = new Block();
        addObject(block, 16+BLOCK_SIZE*7, 384-BLOCK_SIZE*2);
        block = new Block();
        addObject(block, 16+BLOCK_SIZE*8, 384-BLOCK_SIZE*3);
    }
}
