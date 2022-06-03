import greenfoot.*;  
import java.util.List;

public class Portal extends ScrollingActor
{
    private int level;
    
    private int character;
    private int health;
    private int bombAmmo;
    private int selectedItem;
    private int score;
    
    public Portal(int level)
    {
        this.level=level;
            setImage("images/Portal_0.png");
    }
    
    public void act()
    {
            checkLevelPass();
    }
    private void checkLevelPass()
    {
        MainCharacter mainCharacter =(MainCharacter) getOneIntersectingObject(MainCharacter.class);
        if(mainCharacter != null)
        {
            character = mainCharacter.getCharacter();
            health = mainCharacter.getHealth();
            bombAmmo = mainCharacter.getBombAmmo();
            selectedItem = mainCharacter.getSelectedItem();
            score = mainCharacter.getScore();
            switch(level)
            {
                
                case 3:
                    Greenfoot.setWorld(new Level4(character, health, bombAmmo, selectedItem, score));
                break;
                case 6:
                    Greenfoot.setWorld(new Level7(character, health, bombAmmo, selectedItem, score));
                break;
                case 9:
                    Greenfoot.setWorld(new ScoreMenu());
                break;
            }
        }
    }
}
