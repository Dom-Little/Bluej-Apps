
/**
 * Write a description of class Coin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coin
{
    public enum coin
    {
        P10 (10),
        P20 (20),
        P100 (100),
        p200 (200);
        
        private final int value;
        
        private coin(int value)
       {
           this.value = value;
       }
       public int getvalue()
       {
           return value;
        }

    }
} 
