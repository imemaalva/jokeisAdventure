import greenfoot.*;
public class ScrollingActor extends Actor
{
    public void setNewLocation(int dx, int dy) 
    {
        setLocation(getX()+dx, getY()+dy);
    }
    
}
