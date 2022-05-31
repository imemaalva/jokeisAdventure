import greenfoot.*; 
public class Level1 extends ScrollingWorld
{
    private static final int WORLD_WIDTH = 6784;
    private static final int WORLD_HEIGHT = 608;

    private int x;
    private static final int LEVEL = 0;
    private static final int LEVEL_COUNTER = 1;
    

    public Level1(int characterId)
    {
        super(WORLD_WIDTH, WORLD_HEIGHT, LEVEL, new GreenfootImage("images/Lvl_Jungle_0.png"), characterId);
        
        character = new MainCharacter(characterId,100,0,0,0);
        
        for(x=0;x<11;x++)
            addObject(new Sand(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2));

        for(x=11;x<23;x++)
            addObject(new Sand(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        for(x=23; x<33;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        addObject(new Zombie(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE-2-24);
        
        for(x=33; x<35;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);

        for(x=35; x<38;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new HealthCure(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);

        for(x=39; x<42;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        }

        

        for(x=42; x<44;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
            addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        }

        for(x=44; x<46;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        
        addObject(new Zombie(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4-24);
        
        addObject(new Zombie(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE-24);
        addObject(new Zombie(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+7), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE-24);
        for(x=46; x<56;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        }

        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x-1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x-1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

        for(x=56; x<59;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        
        addObject(new Zombie(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5-24);

        for(x=61; x<67;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);

        for(x=68; x<72;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);
        }

        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x-1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x-1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

        for(x=75; x<81;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);

        for(x=81; x<84;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);

        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);

        
        addObject(new Zombie(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE-24);
        
        for(x=85; x<90;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);

        for(x=94; x<98;x++)

            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);

        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);

        for(x=99; x<101;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        for(x=101; x<103;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        }

        for(x=103; x<105;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        for(x=105; x<107;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        }

        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        

        for(x=108; x<112;x++)
        {
            
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        }

        addObject(new WoodPlatform(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new WoodPlatform(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new WoodPlatform(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-BLOCK_SIZE*5);
        addObject(new WoodPlatform(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-BLOCK_SIZE);

        addObject(new Zombie(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-24);
        
        for(x=114; x<121;x++)
        {
            addObject(new WoodPlatform(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            addObject(new WoodPlatform(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2));
        }
        
        addObject(new WoodPlatform(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-BLOCK_SIZE*5);
        addObject(new WoodPlatform(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-BLOCK_SIZE);
        addObject(new WoodPlatform(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new WoodPlatform(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

        for(x=123; x<127;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        }
        
        for(x=127; x<143;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            
            addObject(new Zombie(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x-3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE-24);
        
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);
        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*9);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*10);
        
        for(x=148; x<150;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*10);
        }
        
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*9);
        
        for(x=151; x<153;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            
        for(x=153; x<155;x++)
        {
            addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE-2);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        }
        
        for(x=155; x<161;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        
        for(x=163; x<166;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
            
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        
        for(x=167; x<169;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        
        for(x=172; x<174;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
        
        for(x=174; x<177;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        }
        
        for(x=177; x<179;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            
            addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
            addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
            
        for(x=179; x<182;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        }
        addObject(new Zombie(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE-24);
            for(x=182; x<186;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        }
            
            for(x=186; x<188;x++)
        {
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        }
        
            addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x-1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
            addObject(new FragileBrick(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x-1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        
        for(x=188; x<190;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);
            
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+1), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+2), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+3), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+4), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6);
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+5), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);
        
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+6), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*2);
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+6), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*3); 
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+6), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*4); 
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+6), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*5); 
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+6), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*6); 
        addObject(new Dirt(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+6), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*7);   
        addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+6), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE*8);  
        
        addObject(new Zombie(), (BLOCK_SIZE/2)+BLOCK_SIZE*(x+11), WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE-24);
        
        for(x=197; x<210 ;x++)
            addObject(new Grass(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/2)-BLOCK_SIZE);

            
        addObject(new BombAmmo(), 16+BLOCK_SIZE*10, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE*5);
        addObject(new Jokeis(), 16+BLOCK_SIZE*10, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE);
        addObject(new Jokeis(), 16+BLOCK_SIZE*12, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE);
        addObject(new Jokeis(), 16+BLOCK_SIZE*30, WORLD_HEIGHT-(BLOCK_SIZE/2)*3-BLOCK_SIZE);
        addObject(new RoomPass(LEVEL_COUNTER, characterId), BLOCK_SIZE*(x-5), WORLD_HEIGHT-BLOCK_SIZE*3);

        
        
        addObject(character, 96,200);

        for(x=0;x<11;x++)
        {
            addObject(new Water(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/4));
            addObject(new Water(), (BLOCK_SIZE/2)+BLOCK_SIZE*x, WORLD_HEIGHT-(BLOCK_SIZE/4)-BLOCK_SIZE);
        }

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

}
