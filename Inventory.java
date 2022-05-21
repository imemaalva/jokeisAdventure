import greenfoot.*; 
public class Inventory extends Actor
{
    private static final int MISA = 0;
    private static final int IME = 1;
    
    private int bomb=0;
    
    private GreenfootImage [][]inventory;
    Inventory()
    {
        inventory = new GreenfootImage [2][2];
        inventory[MISA][0] = new GreenfootImage("images/Inventory_0.png");
        inventory[MISA][1] = new GreenfootImage("images/Inventory_1.png");
        inventory[IME][0] = new GreenfootImage("images/Inventory_2.png");
        inventory[IME][1] = new GreenfootImage("images/Inventory_3.png");
    }
    public void act()
    {
        checkCharacter();
    }
    private void checkCharacter()
    {
        if(getWorldOfType(ScrollingWorld.class).getCharacter() == MISA)
            setImage(inventory[MISA][bomb]);
        else
            setImage(inventory[IME][bomb]);
    }
    
    public void setBombExistence(int ammo)
    {
        if (ammo > 0)
            bomb = 1;
        else
            bomb = 0;
    }
}
