import java.util.Date;
import java.time.LocalDateTime;

/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    

public class Ticket
{
private int price;
    private String destination;
    private Date currentDate = new Date();
    private LocalDateTime date = LocalDateTime.now();
    private Date today = new Date();
    
    /**
     * Constructor for objects of class Ticket
     */
    public Ticket( String destination, int price)
    {
        // initialise instance variables
        this.price = price;
        this.destination = destination;
    }

    /**
     * Return the price of the ticket in pence
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Return the name of the destination
     */
    public String getDestination()
    {
        return destination;
    }
    
    public Date getDate()
    {
        return today;
    }
    
}
