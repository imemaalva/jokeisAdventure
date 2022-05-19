import greenfoot.*; 
import java.util.List;
public class ScrollingWorld extends World
{
    static final int BLOCK_SIZE = 32;
    static final int MISA = 0;
    static final int IME = 2;
    
    public MainCharacter character;
    public HealthBar bar;
    public Inventory inventory;
    
    private int characterId=MISA;
    
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
        if(Greenfoot.isKeyDown("SPACE") && change == false)
        {
            if (characterId == MISA)
                characterId = IME;
            else
                characterId = MISA;
            change = true;
        }
        if(!Greenfoot.isKeyDown("SPACE") && change == true)
            change = false;
    }
    
    public void shiftWorld(int dx, int dy) 
    {
        if( (xOffset + dx) <= 0 && (xOffset + dx) >= SCROLL_WIDTH - worldWidth) 
        {
            xOffset = xOffset + dx;
            shiftWorldBackground(dx, 0);
            shiftWorldActors(dx, 0);
        }
        if( (yOffset + dy) <= 0 && (yOffset + dy) >= SCROLL_HEIGHT - worldHeight) 
        {
            yOffset = yOffset + dy;
            shiftWorldBackground(0, dy);
            shiftWorldActors(0, dy);
        }
    }
    
    private void shiftWorldBackground(int dx, int dy) 
    {
        GreenfootImage bkgd = new GreenfootImage(SCROLL_WIDTH, SCROLL_HEIGHT);
        bkgd.drawImage(bimg, xOffset, yOffset);
        setBackground(bkgd);
    }
    
    private void shiftWorldActors(int dx, int dy) 
    {
        List<ScrollingActor> saList = getObjects(ScrollingActor.class);
        for( ScrollingActor a : saList ) 
        {
            a.setNewLocation(dx,dy);
        }
    }
    
    public int getCharacter()
    {
        return characterId;
    }
    
    
}
