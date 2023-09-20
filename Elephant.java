import greenfoot.*;

public class Elephant extends Actor 
{
    public void act()
    {
        move(1);
        if (Greenfoot.getRandomNumber(10) < 1)
        {
            int randomAngle = Greenfoot.getRandomNumber(91) - 45;
            setRotation(getRotation() + randomAngle);
        }
        
        
        checkBounds();
        
        
        checkForBanana();
    }
    
    
    private void checkBounds()
    {
        int x = getX();
        int y = getY();
        
        
        int minX = 25; 
        int maxX = getWorld().getWidth() - 25; 
        int minY = 25;
        int maxY = getWorld().getHeight() - 25; 
        
        if (x <= minX || x >= maxX || y <= minY || y >= maxY)
        {
            setRotation(getRotation() + 180 + Greenfoot.getRandomNumber(90) - 45);
        }
    }
    
    
    private void checkForBanana()
    {
        Actor Banana = getOneObjectAtOffset(0, 0, Banana.class); 
        if (Banana != null)
        {
            setRotation(getRotation() + 180 + Greenfoot.getRandomNumber(90) - 45);
        }
    }
}
