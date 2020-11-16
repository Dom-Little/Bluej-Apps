
import java.io.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;
/**
 * 
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author Dominic Little
 * @version 10/11/2020
 */
public class TicketMachine
{
    public static final Ticket BURNLEY_TICKET = new Ticket("Burnley", 200);
    public static final Ticket PADIHAM_TICKET = new Ticket("Padiham", 300);
    public static final Ticket PRESTON_TICKET  = new Ticket("Preston", 330);
    
    private Ticket currentTicket;
    
    // The amount of money entered by a customer so far in pence.
    private int balance;
    
    // The totalCollected amount of money collected by this machine in pence.
    private int totalCollected;
    
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy");


    /**
     * Create a machine that issues tickets for the maximum price
     */
    public TicketMachine()
    {
        balance = 0;
        totalCollected = 0;

        currentTicket = null;
    }


    public void PrintDestinations()
    {
        printHeading();
        System.out.println();

        System.out.print(" Tickets to " + BURNLEY_TICKET.getDestination());
        System.out.println(" cost " + BURNLEY_TICKET.getPrice());
        
        System.out.print(" Tickets to " + PADIHAM_TICKET.getDestination());
        System.out.println(" cost " + PADIHAM_TICKET.getPrice());  
        
        System.out.print(" Tickets to " + PRESTON_TICKET.getDestination());
        System.out.println(" cost " + PRESTON_TICKET.getPrice());        
    }
    
    public void selectBurnleyTicket()
    {
       currentTicket = BURNLEY_TICKET; 
    }
    
    public void selectPadihamTicket()
    {
       currentTicket = PADIHAM_TICKET; 
    }
    
    public void selectPrestonTicket()
    {
       currentTicket = PRESTON_TICKET; 
    }
    
    public int getPrice()
    {
        if(currentTicket != null)
        {
            return currentTicket.getPrice();
        }
        else
        {
            System.out.println("You have not chosen a destination!");
            return 0;
        }
    }

    /**
     * Return The amount of money in pence already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Coin contains an enumeration containing only those
     * coin values that are accepted.
     */
    public void insertCoin(Coin coin)
    {
        updateBalance(coin.getValue());
    }

    /**
     * This method accepts a simple interger.  
     * However only coins of set values are
     * accepted, they are 10, 20, 100 and 200 (pence).
     */
    public void insertCoin(int value)
    {
        switch(value)
        {
            case 10:  case 20: case 100: case 200: 
            
                updateBalance(value);
                break;

            default: 
                System.out.println();
                System.out.println("This " + value + " is not an acceptable coin!");
        }
    }

    
    /**
     * Insert a ten pence coin
     */
    public void insert10Pence()
    {
            updateBalance(10);            
    }
    
    /**
     * Insert a twenty pence coin
     */
    public void insert20Pence()
    {
            updateBalance(20);            
    }
    
    /**
     * Insert a one pound coin
     */
    public void insert1Pound()
    {
            updateBalance(100);            
    }

    /**
     * Insert a two pound coin
     */
    public void insert2Pound()
    {
        updateBalance(200);
    }

    /**
     * Receive an amount of money in pence from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney()
    {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter Ticket Price: >");

        int amount = input.nextInt();

        if(amount > 0) 
        {
            updateBalance(amount);
        }
        else 
        {
            System.out.println();
            System.out.println("Please use a positive amount: " + amount);
        }
    }

    private void printHeading()
    {
        System.out.println();
        System.out.println(" ##############################");
        System.out.println(" #      Peacock Trains");
        System.out.println(" # Train Tickets - PAY HERE");
        System.out.println(" ##############################");
        System.out.println();
    }

    private void updateBalance(int amount)
    {
        balance = balance + amount;
        
        System.out.println();
        System.out.println("Received " + amount + " pence");
        printBalance();
    }

    public void printBalance()
    {
        System.out.println("Balance " + balance + " pence");
    }
    
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        int price = currentTicket.getPrice();
        double pounds;
        
        String date = formatter.format(currentTicket.getDate());
        String destination = currentTicket.getDestination();
        
        if(balance >= price) 
        {
            printHeading();

            System.out.print("Your Train Ticket to ");
            System.out.println(destination );
            System.out.println("On Date: " + date);
            System.out.println("Cost: " + price + " pence");
            System.out.println();

            // Update the totalCollected collected with the price.
            totalCollected = totalCollected + price;
            // Reduce the balance by the prince.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                (price - balance) + " more pence.");

        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
