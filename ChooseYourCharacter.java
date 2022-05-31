import greenfoot.*;  
public class ChooseYourCharacter extends Menu
{

    public ChooseYourCharacter()
    {
        bg = new GreenfootImage("images/Menu_Choose.png");
        bg.scale(600,400);
        setBackground(bg);
        
        addObject(new MenuButton(3,1), 508, 360);
        addObject(new CharacterButton(0),134, 160);
        addObject(new CharacterButton(1),440, 160);
    }
}
