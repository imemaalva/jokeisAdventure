import greenfoot.*;

public class PowerUpBar extends Actor
{
    private static final int MISA = 0;
    private static final int IME = 2;
    
    private int barWidth = 90; // the width of the color portion of the bar
    private int barHeight = 2; // the height of the color portion of the bar
    private int breakPercent = 20; // the percentage amount that changes the color of the bar
    private int breakValue = 20; // in tandem with breakPercent
    
    private int character;

    private boolean usingBreakValue = false;
    private boolean breakLow = true; // when true, with low-percent values bar is dangerColor, else safeColor; reversed when false
    private Color backgroundColor = new Color(0, 0, 0, 0); // the background color of the entire object
    private Color borderColor = Color.BLACK; // the color of all text and the frame of the bar itself
    private Color barColor = Color.RED;
    private int value = 0; // the current value of the bar
    private int maximumValue = 0; // the maximum value of the bar
    private int minimumValue = 0; // the minimum value of the bar
    
    public PowerUpBar(int initValue, int maxValue, int character)
    {
        maximumValue = maxValue;
        setValue(initValue);
        
        this.character = character;
        if(character == MISA)
            barColor = Color.RED;
        else
            barColor = Color.YELLOW;
    }
    
    
    private void newImage()
    {
        int barValue = barWidth * (value - minimumValue) / (maximumValue - minimumValue);
        int colorController = (usingBreakValue ? breakValue : (breakPercent * (maximumValue - minimumValue) / 100 + minimumValue));
        GreenfootImage barImg = new GreenfootImage(barWidth + 4, barHeight + 4);
        barImg.setColor(backgroundColor);
        barImg.fill();
        barImg.setColor(borderColor);
        barImg.drawRect(0, 0, barImg.getWidth() - 1, barImg.getHeight() - 1);
        if (value > minimumValue)
        {
            barImg.setColor(barColor);
            barImg.fillRect(2, 2, barValue, barHeight);
        }
        int sumX = barImg.getWidth();
        int maxY = 0;
        if (barImg.getHeight() > maxY) 
            maxY = barImg.getHeight();
        GreenfootImage image = new GreenfootImage(sumX, maxY);
        image.setColor(backgroundColor);
        image.fill();
        image.drawImage(barImg, 0, (image.getHeight() - barImg.getHeight()) / 2);
        setImage(image);
    }

    public void setValue(int value)
    {
        this.value = value;
        checkValue();
        newImage();
    }

    private void checkValue()
    {
        if (value < minimumValue) 
            value = minimumValue;
        if (value > maximumValue) 
            value = maximumValue;
    }

    public int getValue() 
    { 
        return value; 
    }


    
}