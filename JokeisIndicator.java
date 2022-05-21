import greenfoot.*; 
public class JokeisIndicator extends Actor
{
    private int quantity;
    private GreenfootImage[] jokeis;
    JokeisIndicator(int quantity)
    {
        jokeis = new GreenfootImage[2];
        jokeis[0] = new GreenfootImage("images/Jokeis_Un_0.png");
        jokeis[1] = new GreenfootImage("images/Jokeis_0.png");
        this.quantity = quantity;
    }
    public void act()
    {
        checkQuantity();
    }
    
    private void checkQuantity()
    {
        if(getWorldOfType(ScrollingWorld.class).character.getJokeisQuantity()>=quantity)
            setImage(jokeis[1]);
        else
            setImage(jokeis[0]);
        
    }
}
