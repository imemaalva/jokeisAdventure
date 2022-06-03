import greenfoot.*;  
public class NoGround extends ScrollingActor
{

    private int level;
    private int character;
    private int health;
    private int bombAmmo;
    private int selectedItem;
    private int score;

    public NoGround(int level, int character, int health, int bombAmmo, int selectedItem, int score)
    {
        this.character = character;
        this.health = health;
        this.bombAmmo = bombAmmo;
        this.selectedItem = selectedItem;
        this.score = score;
        this.level = level;
    }

    public void act()
    {
        checkTouching();
    }

    private void checkTouching()
    {
        MainCharacter mainCharacter =(MainCharacter) getOneIntersectingObject(MainCharacter.class);
        if(mainCharacter != null)
        {
            switch(level)
            {
                case 2:
                    Greenfoot.setWorld(new Level2(character, health, bombAmmo, selectedItem, score));
                    break;

                case 4:
                    Greenfoot.setWorld(new Level4(character, health, bombAmmo, selectedItem, score));
                    break;

                case 5:
                    Greenfoot.setWorld(new Level5(character, health, bombAmmo, selectedItem, score));
                    break;

            }
        }
    }
}
