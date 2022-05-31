import greenfoot.*; 
public class MenuButton extends Actor
{
    private static final int PLAY = 0;
    private static final int SCORE = 1;
    private static final int HOW_TO_PLAY = 2;
    private static final int RETURN = 3;
    
    private int skin;
    private int menu;
    
    public MenuButton(int skin , int menu){
        this.skin = skin;
        this.menu = menu;
    }
    
    public void act(){
        checkButtonSkin();
        checkClicked();
    }
    
    private void checkButtonSkin(){
        switch(skin){
            case PLAY: 
                setImage("images/Button_Play.png");
            break;
            
            case SCORE: 
                setImage("images/Button_Score.png");
            break;
            
            case HOW_TO_PLAY: 
                setImage("images/Button_HowToPlay.png");
            break;
            
            case RETURN: 
                setImage("images/Button_Return.png");
            break;
            
        }
    }
    
    private void checkClicked(){
        if(Greenfoot.mouseClicked(this)){
             switch(skin){
            case PLAY: 
                Greenfoot.setWorld(new ChooseYourCharacter());
            break;
            
            case SCORE: 
                Greenfoot.setWorld(new ScoreMenu());
            break;
            
            case HOW_TO_PLAY: 
                Greenfoot.setWorld(new HowToPlay());
            break;
            
            case RETURN: 
                Greenfoot.setWorld(new MainMenu());
            break;
        }
        }
    }
}
