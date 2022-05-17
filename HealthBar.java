import greenfoot.*;

public class HealthBar extends Actor
{
    private int barWidth = 90; // the width of the color portion of the bar
    private int barHeight = 5; // the height of the color portion of the bar
    private int breakPercent = 20; // the percentage amount that changes the color of the bar
    private int breakValue = 20; // in tandem with breakPercent
    
    private boolean usingBreakValue = false;
    private boolean breakLow = true; // when true, with low-percent values bar is dangerColor, else safeColor; reversed when false
    private Color backgroundColor = new Color(0, 0, 0, 0); // the background color of the entire object
    private Color borderColor = Color.BLACK; // the color of all text and the frame of the bar itself
    private Color safeColor = Color.GREEN; // the color of the bar while in the safe range
    private Color dangerColor = Color.RED;
    private float fontSize = 18.0f; // the size of the text
    private int value = 0; // the current value of the bar
    private int maximumValue = 0; // the maximum value of the bar
    private int minimumValue = 0; // the minimum value of the bar
    private boolean showTextualUnits = true; // determines whether or not the textual quantity of the bar is to show
    
    public HealthBar(int initValue, int maxValue)
    {
        maximumValue = maxValue;
        setValue(initValue);
    }
    
    private void newImage()
    {
        int barValue = (int) (barWidth * (value - minimumValue) / (maximumValue - minimumValue));
        GreenfootImage barImg = new GreenfootImage(barWidth + 4, barHeight + 4);
        barImg.setColor(backgroundColor);
        barImg.fill();
        barImg.setColor(borderColor);
        barImg.drawRect(0, 0, barImg.getWidth() - 1, barImg.getHeight() - 1);
        if (value > minimumValue)
        {
            if (breakLow)
            {
                if (value > (usingBreakValue ? breakValue : (int) (breakPercent * (maximumValue - minimumValue) / 100 + minimumValue))) barImg.setColor(safeColor);
                else barImg.setColor(dangerColor);
            }
            else
            {
                if (value < (usingBreakValue ? breakValue : (int) (breakPercent * (maximumValue - minimumValue) / 100 + minimumValue))) barImg.setColor(safeColor);
                else barImg.setColor(dangerColor);
            }
            if (value == (usingBreakValue ? breakValue : (int) (breakPercent * (maximumValue - minimumValue) / 100 + minimumValue)))
            {
                int r = (int) ((safeColor.getRed() + dangerColor.getRed()) / 2);
                int g = (int) ((safeColor.getGreen() + dangerColor.getGreen()) / 2);
                int b = (int) ((safeColor.getBlue() + dangerColor.getBlue()) / 2);
                barImg.setColor(new Color(r, g, b));
            }
            barImg.fillRect(2, 2, barValue, barHeight);
        }
        int sumX = barImg.getWidth();
        int maxY = 0;
        if (barImg.getHeight() > maxY) maxY = barImg.getHeight();
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
    
    
    public int getMinimumValue() 
    { 
        return minimumValue; 
    }
    
  
    
    
}