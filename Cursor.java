import greenfoot.*; 
public class Cursor extends Actor
{
    private static final int ITEM_FIST = 0;
    private static final int ITEM_SWORD = 1;
    private static final int ITEM_KNIFE = 2;
    private static final int ITEM_BOMB = 3;
    
    private static final int SIZE = 32;
    
    private int position;
    
    private int counterAnimation;
    private int currentImage = 0;
    private int imageRepetition = 0;
        
    private GreenfootImage [] cursor;
    
    Cursor()
    {
        cursor = new GreenfootImage [2];
        cursor[0] = new GreenfootImage("images/Cursor_0.png");
        cursor[1] = new GreenfootImage("images/Cursor_1.png");
    }
    
    public void act()
    {
        checkSelectedItem();
        animation();
    }
    
    private void animation()
    {
        if(imageRepetition >= 20)
            {
                imageRepetition=0;
                counterAnimation++;
                if(counterAnimation >= cursor.length)
                    counterAnimation=0;
                currentImage = (currentImage + 1) % cursor.length;
            }
        setImage(cursor[currentImage]);
        imageRepetition++;
    }
    
    private void checkSelectedItem()
    {
        position = getWorldOfType(ScrollingWorld.class).character.getSelectedItem();
        switch(position)
        {
            case ITEM_FIST:
                setLocation(SIZE+SIZE/2, getY());
            break;
            
            
            case ITEM_SWORD:
                setLocation(SIZE*2+SIZE/2, getY());
            break;
            
            case ITEM_KNIFE:
                setLocation(SIZE*3+SIZE/2, getY());
            break;
            
            case ITEM_BOMB:
                setLocation(SIZE*4+SIZE/2, getY());
            break;
        }
    }
}
