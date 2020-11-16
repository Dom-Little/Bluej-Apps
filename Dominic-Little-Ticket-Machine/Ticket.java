import java.util.Date;
import java.time.LocalDateTime;

/**
 * @author (Dominic Little)
 * @version 10/11/2020
 */

public class Ticket
{
private int price;
    private String destination;
    
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
