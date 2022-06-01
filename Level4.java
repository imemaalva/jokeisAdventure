import greenfoot.*;  
public class Level4 extends ScrollingWorld
{

    private static final int WORLD_WIDTH = 6784;
    private static final int WORLD_HEIGHT = 608;

    private int x=0;
    private static final int LEVEL = 0;
    private static final int LEVEL_COUNTER = 2;
    
    private static final int MAX_COUNTER_THUNDER = 7;

    private int timeBeforeThunder = 0;
    private int counterAnimation;
    private int currentImage = 0;
    private int imageRepetition = 0;

    private GreenfootImage []thunder;

    public Level4(int characterId, int health, int bombAmmo, int selectedItem, int score)
    {
        super(WORLD_WIDTH, WORLD_HEIGHT, LEVEL, new GreenfootImage("images/Lvl_Cementery_0_6.png"),characterId);
        
        thunder = new GreenfootImage[MAX_COUNTER_THUNDER];
        thunder[0] = new GreenfootImage("images/Lvl_Cementery_0_6.png");
        thunder[1] = new GreenfootImage("images/Lvl_Cementery_0_0.png");
        thunder[2] = new GreenfootImage("images/Lvl_Cementery_0_1.png");
        thunder[3] = new GreenfootImage("images/Lvl_Cementery_0_2.png");
        thunder[4] = new GreenfootImage("images/Lvl_Cementery_0_3.png");
        thunder[5] = new GreenfootImage("images/Lvl_Cementery_0_4.png");
        thunder[6] = new GreenfootImage("images/Lvl_Cementery_0_5.png");
    
        character = new MainCharacter(characterId,health,score,selectedItem,bombAmmo);
        
        
        //aquí los bloques
        
        addObject(new RoomPass(LEVEL_COUNTER, characterId), BLOCK_SIZE*(x-10), WORLD_HEIGHT-BLOCK_SIZE*3);

        
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
