import greenfoot.*;
public class idMainCharacter extends Actor
{
    private static final int MAX_ID_COUNTER = 15;
    
    private static final int MISA = 0;
    private static final int IME = 1;
    
    
    private int counterAnimation;
    private int currentImage = 0;
    private int imageRepetition = 0;
    private int timeDoNothing=0;
    private boolean controlChange = false;
    
    private int character;
    
    private GreenfootImage [][]id;
    idMainCharacter()
    {
        id = new GreenfootImage [MAX_ID_COUNTER][2];
        id[0][MISA] = new GreenfootImage("images/ID_0_0.png");
        id[1][MISA] = new GreenfootImage("images/ID_0_1.png");
        id[2][MISA] = new GreenfootImage("images/ID_0_2.png");
        id[3][MISA] = new GreenfootImage("images/ID_0_3.png");
        id[4][MISA] = new GreenfootImage("images/ID_0_4.png");
        id[5][MISA] = new GreenfootImage("images/ID_0_5.png");
        id[6][MISA] = new GreenfootImage("images/ID_0_6.png");
        id[7][MISA] = new GreenfootImage("images/ID_0_7.png");
        id[8][MISA] = new GreenfootImage("images/ID_0_8.png");
        id[9][MISA] = new GreenfootImage("images/ID_0_9.png");
        id[10][MISA] = new GreenfootImage("images/ID_0_10.png");
        id[11][MISA] = new GreenfootImage("images/ID_0_11.png");
        id[12][MISA] = new GreenfootImage("images/ID_0_12.png");
        id[13][MISA] = new GreenfootImage("images/ID_0_13.png");
        id[14][MISA] = new GreenfootImage("images/ID_0_14.png");
        id[0][IME] = new GreenfootImage("images/ID_1_0.png");
        id[1][IME] = new GreenfootImage("images/ID_1_1.png");
        id[2][IME] = new GreenfootImage("images/ID_1_2.png");
        id[3][IME] = new GreenfootImage("images/ID_1_3.png");
        id[4][IME] = new GreenfootImage("images/ID_1_4.png");
        id[5][IME] = new GreenfootImage("images/ID_1_5.png");
        id[6][IME] = new GreenfootImage("images/ID_1_6.png");
        id[7][IME] = new GreenfootImage("images/ID_1_7.png");
        id[8][IME] = new GreenfootImage("images/ID_1_8.png");
        id[9][IME] = new GreenfootImage("images/ID_1_9.png");
        id[10][IME] = new GreenfootImage("images/ID_1_10.png");
        id[11][IME] = new GreenfootImage("images/ID_1_11.png");
        id[12][IME] = new GreenfootImage("images/ID_1_12.png");
        id[13][IME] = new GreenfootImage("images/ID_1_13.png");
        id[14][IME] = new GreenfootImage("images/ID_1_14.png");
    }
    
    public void act()
    {
        checkCharacter();
        animation();
    }
    
    private void animation()
    {
        if(currentImage == MAX_ID_COUNTER-1)
        {
            timeDoNothing=0;
            currentImage=0;
        }
        
        if(currentImage == 4 || currentImage == 6 && timeDoNothing > 45 )
        {
            if (controlChange == false)
            {
                timeDoNothing=0;
                controlChange = true;
            }
            else
            {
                currentImage = (currentImage + 1) % id.length;
                imageRepetition = 0;
                controlChange = false;
            }
        }
        
        if(imageRepetition>=4)
            {
                if(timeDoNothing >40)
                {
                    imageRepetition=0;
                    counterAnimation++;
                    if(counterAnimation >= id.length)
                        counterAnimation=0;
                    currentImage = (currentImage + 1) % id.length;
                }
                else 
                    timeDoNothing++;
            }
        setImage(id[currentImage][character]);
        imageRepetition++;        
    }
    
    private void checkCharacter()
    {
        character = getWorldOfType(ScrollingWorld.class).getChar();
        if (character == IME+1)
            character=IME;
    }
}
