import greenfoot.*; 
public class Inventory extends Actor
{
    private static final int MISA = 0;
    private static final int IME = 2;
    
    private GreenfootImage []inventory;
    Inventory()
    {
        inventory = new GreenfootImage [2];
        inventory[0] = new GreenfootImage("images/Inventory_0.png");
        inventory[1] = new GreenfootImage("images/Inventory_1.png");
    }
    public void act()
    {
        checkCharacter();
    }
    private void checkCharacter()
    {
        if(getWorldOfType(ScrollingWorld.class).character.getCharacter() == MISA)
            setImage(inventory[0]);
        else
            setImage(inventory[1]);
    }
}
