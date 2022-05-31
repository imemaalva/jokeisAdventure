import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CharacterButton extends Actor
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
    
    public CharacterButton(int idCharacter){
        character = idCharacter;
       
        id = new GreenfootImage [2][MAX_ID_COUNTER];
        id[MISA][0] = new GreenfootImage("images/ID_0_0.png");
        id[MISA][1] = new GreenfootImage("images/ID_0_1.png");
        id[MISA][2] = new GreenfootImage("images/ID_0_2.png");
        id[MISA][3] = new GreenfootImage("images/ID_0_3.png");
        id[MISA][4] = new GreenfootImage("images/ID_0_4.png");
        id[MISA][5] = new GreenfootImage("images/ID_0_5.png");
        id[MISA][6] = new GreenfootImage("images/ID_0_6.png");
        id[MISA][7] = new GreenfootImage("images/ID_0_7.png");
        id[MISA][8] = new GreenfootImage("images/ID_0_8.png");
        id[MISA][9] = new GreenfootImage("images/ID_0_9.png");
        id[MISA][10] = new GreenfootImage("images/ID_0_10.png");
        id[MISA][11] = new GreenfootImage("images/ID_0_11.png");
        id[MISA][12] = new GreenfootImage("images/ID_0_12.png");
        id[MISA][13] = new GreenfootImage("images/ID_0_13.png");
        id[MISA][14] = new GreenfootImage("images/ID_0_14.png");
        id[IME][0] = new GreenfootImage("images/ID_1_0.png");
        id[IME][1] = new GreenfootImage("images/ID_1_1.png");
        id[IME][2] = new GreenfootImage("images/ID_1_2.png");
        id[IME][3] = new GreenfootImage("images/ID_1_3.png");
        id[IME][4] = new GreenfootImage("images/ID_1_4.png");
        id[IME][5] = new GreenfootImage("images/ID_1_5.png");
        id[IME][6] = new GreenfootImage("images/ID_1_6.png");
        id[IME][7] = new GreenfootImage("images/ID_1_7.png");
        id[IME][8] = new GreenfootImage("images/ID_1_8.png");
        id[IME][9] = new GreenfootImage("images/ID_1_9.png");
        id[IME][10] = new GreenfootImage("images/ID_1_10.png");
        id[IME][11] = new GreenfootImage("images/ID_1_11.png");
        id[IME][12] = new GreenfootImage("images/ID_1_12.png");
        id[IME][13] = new GreenfootImage("images/ID_1_13.png");
        id[IME][14] = new GreenfootImage("images/ID_1_14.png");
        
        
        id[MISA][0].scale(96,96);
        id[MISA][1].scale(96,96);
        id[MISA][2].scale(96,96);
        id[MISA][3].scale(96,96);
        id[MISA][4].scale(96,96);
        id[MISA][5].scale(96,96);
        id[MISA][6].scale(96,96);
        id[MISA][7].scale(96,96);
        id[MISA][8].scale(96,96);
        id[MISA][9].scale(96,96);
        id[MISA][10].scale(96,96);
        id[MISA][11].scale(96,96);
        id[MISA][12].scale(96,96);
        id[MISA][13].scale(96,96);
        id[MISA][14].scale(96,96);
        id[IME][0].scale(96,96);
        id[IME][1].scale(96,96);
        id[IME][2].scale(96,96);
        id[IME][3].scale(96,96);
        id[IME][4].scale(96,96);
        id[IME][5].scale(96,96);
        id[IME][6].scale(96,96);
        id[IME][7].scale(96,96);
        id[IME][8].scale(96,96);
        id[IME][9].scale(96,96);
        id[IME][10].scale(96,96);
        id[IME][11].scale(96,96);
        id[IME][12].scale(96,96);
        id[IME][13].scale(96,96);
        id[IME][14].scale(96,96);
    }
    
    private void animation(){
        if(currentImage == MAX_ID_COUNTER-1){
            timeDoNothing=0;
            currentImage=0;
        }
        
        if(currentImage == 4 || currentImage == 6 && timeDoNothing > 45 ){
            if (controlChange == false){
                timeDoNothing=0;
                controlChange = true;
            }
            else{
                currentImage = (currentImage + 1) % MAX_ID_COUNTER;
                imageRepetition = 0;
                controlChange = false;
            }
        }
        
        if(imageRepetition>=4){
                if(timeDoNothing >40){
                    imageRepetition=0;
                    counterAnimation++;
                    if(counterAnimation >= MAX_ID_COUNTER)
                        counterAnimation=0;
                    currentImage = (currentImage + 1) % MAX_ID_COUNTER;
                }
                else 
                    timeDoNothing++;
            }
        setImage(id[character][currentImage]);
        imageRepetition++;        
    }
    
    public void act(){
        animation();
        checkClick();
    }
    
    public void checkClick(){
        if(Greenfoot.mouseClicked(this))
        {
        if(character !=MISA)
            character = IME+1;
                Greenfoot.setWorld(new Level1(character));
            }
            
    }
    
    
}
