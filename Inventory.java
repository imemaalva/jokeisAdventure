import greenfoot.*; 
public class Inventory extends Actor
{
    private static final int MISA = 0;
    private static final int IME = 2;
    
    private int bomb=0;
    
    private GreenfootImage []inventory;
    Inventory()
    {
        inventory = new GreenfootImage [4];
        inventory[0] = new GreenfootImage("images/Inventory_0.png");
        inventory[1] = new GreenfootImage("images/Inventory_1.png");
        inventory[2] = new GreenfootImage("images/Inventory_2.png");
        inventory[3] = new GreenfootImage("images/Inventory_3.png");
    }
    public void act()
    {
        checkCharacter();
    }
    private void checkCharacter()
    {
        if(getWorldOfType(ScrollingWorld.class).getChar() == MISA)
            setImage(inventory[MISA+bomb]);
        else
            setImage(inventory[IME+bomb]);
    }
    
    public void setBombExistence(int ammo)
    {
        if (ammo > 0)
            bomb = 1;
        else
            bomb = 0;
    }
}
