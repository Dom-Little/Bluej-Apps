import java.util.Date;
/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket
{
    // instance variables - replace the example below with your own
    private int price;
    private String destination;
    private Date currentDate = new Date();

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int price)
    {
        // initialise instance variables
        this.destination = destination;
        this.price = price;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return price;
    }
    
    public String findcurrentDestination()
    {
        return destination;
    }
    
    public Date findcurrentDate()
    {
        return currentDate;
    }   
}

