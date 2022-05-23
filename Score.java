import greenfoot.*; 
public class Score extends Actor
{
    private int score;
    private static final int BLOCK_SIZE = 32;
    private static final int SCROLL_HEIGHT = 400;
    public void act()
    {
        ScrollingWorld world = getWorldOfType(ScrollingWorld.class);
        score = world.character.getScore();
        world.showText("Score: " + score, BLOCK_SIZE*5+BLOCK_SIZE*2-8,SCROLL_HEIGHT-BLOCK_SIZE/2);
    }
}
