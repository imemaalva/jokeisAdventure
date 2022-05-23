import greenfoot.*; 
import java.util.List;
public class ScrollingWorld extends World
{
    static final int BLOCK_SIZE = 32;
    static final int MISA = 0;
    static final int IME = 2;

    public MainCharacter character;
    public HealthBar bar;
    public PowerUpBar powerUpBar;
    public Inventory inventory;

    int characterId=MISA;

    private int xOffset = 0;
    private int yOffset = 0;
    final static int SCROLL_WIDTH = 600;
    final static int SCROLL_HEIGHT = 400;
    private int worldWidth;
    private int worldHeight;
    private GreenfootImage bimg;  

    private boolean change = false;

    public ScrollingWorld(int fullWidth, int fullHeight)
    {   
        super(SCROLL_WIDTH, SCROLL_HEIGHT, 1, false);
        worldWidth = fullWidth;
        worldHeight = fullHeight;
        bimg = new GreenfootImage("images/Lvl_Jungle_0.png");
        shiftWorld(0,0);
    }

    public void act()
    {
        changeCharacter();
    }

    private void changeCharacter()
    {
        if(Greenfoot.isKeyDown("SHIFT") && change == false)
        {
            if (characterId == MISA)
                characterId = IME;
            else
                characterId = MISA;
            change = true;
        }
        if(!Greenfoot.isKeyDown("SHIFT") && change == true)
            change = false;
    }

    public void shiftWorld(int x, int y) 
    {
        if( (xOffset + x) <= 0 && (xOffset + x) >= SCROLL_WIDTH - worldWidth) 
        {
            xOffset = xOffset + x;
            shiftWorldBackground(x, 0);
            shiftWorldActors(x, 0);
        }
        if( (yOffset + y) <= 0 && (yOffset + y) >= SCROLL_HEIGHT - worldHeight) 
        {
            yOffset = yOffset + y;
            shiftWorldBackground(0, y);
            shiftWorldActors(0, y);
        }
    }

    private void shiftWorldBackground(int x, int y) 
    {
        GreenfootImage bkgd = new GreenfootImage(SCROLL_WIDTH, SCROLL_HEIGHT);
        bkgd.drawImage(bimg, xOffset, yOffset);
        setBackground(bkgd);
    }

    private void shiftWorldActors(int x, int y) 
    {
        List<ScrollingActor> scrollingActorList = getObjects(ScrollingActor.class);
        for( ScrollingActor actor : scrollingActorList ) 
        {
            actor.setNewLocation(x,y);
        }
    }

    public int getCharacter()
    {
        return characterId;
    }

}
