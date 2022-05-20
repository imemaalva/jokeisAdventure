import greenfoot.*;  
public class MyWorld extends World
{
    private static int BLOCK_SIZE = 32;
    private static int WORLD_WIDTH = 2016;
    private static int WORLD_HEIGHT = 608;
    private static final int MISA = 0;
    private static int IME = 2;
    public MainCharacter character;
    Enemy zombie = new Zombie();

    public MyWorld()
    {   
        super(WORLD_WIDTH, WORLD_HEIGHT, 1); 
        setBackground(new GreenfootImage("images/Lvl_Jungle_0.png"));
        Grass grass;
        for(int i = 0; i<63;i++)
        {
            grass = new Grass();
            addObject(grass, 16+BLOCK_SIZE*i, WORLD_HEIGHT-(BLOCK_SIZE/2)*3);
        }
        grass = new Grass();
        addObject(grass, 16+BLOCK_SIZE*7, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE);
        grass = new Grass();
        addObject(grass, 16+BLOCK_SIZE*7, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE*2);
        grass = new Grass();
        addObject(grass, 16+BLOCK_SIZE*8, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE*3);
        character = new MainCharacter(MISA);            
        addObject(zombie, 16+BLOCK_SIZE*15, WORLD_HEIGHT-BLOCK_SIZE*2-24);

        addObject(character, 50, 50);
    }

    public void act(){
        showText(" "+ zombie.distance,100,100);

    }
}
