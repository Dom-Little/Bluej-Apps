import java.util.Random;

/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Dominic Little
 * @version 2020.11.20
 * 
 * @modifed by Derek Peacock
 * 22/Sep/2020
 */
public class StockDemo
{
    public static final int FIRST_ID = 100;
    public static final int LAST_ID = 109;
    
    // The stock manager.
    private StockManager manager;
    
    private Random randomGenerator;

    /**
     * Create a StockManager and populate it with
     * 10 sample products.
     */
    public StockDemo(StockManager manager)
    {
        randomGenerator = new Random();
        this.manager = manager;
        
        int id = FIRST_ID;
        manager.addProduct(new Product(id,"iPhone 12"));
        
        id++;
        manager.addProduct(new Product(id,"Ipad pro"));
        
        id++; 
        manager.addProduct(new Product(id,"Apple Mac 21.5 Inches"));
        
        id++; 
        manager.addProduct(new Product(id,"Gogle Pixel 4A"));
        
        id++; 
        manager.addProduct(new Product(id,"Google Pixel 3 XL"));
        
        id++; 
        manager.addProduct(new Product(id,"iPhone 11"));
        
        id++; 
        manager.addProduct(new Product(id,"PS5"));
        
        id++; 
        manager.addProduct(new Product(id,"Xbox series X"));
        
        id++; 
        manager.addProduct(new Product(id,"Sony Xperia 5"));
        
        id++; 
        manager.addProduct(new Product(id,"Ipad"));
    }
    
    public void runDemo()
    {
       manager.printAllProducts();
       demoDeliverProducts();
       manager.printAllProducts();
       demoSellProducts();
       manager.printAllProducts();
       
       manager.removeProduct(102);
       manager.renameProduct(103, "Samsung S20");
       
       
    }
    
    private void demoDeliverProducts()
    {
       for(int id = FIRST_ID; id < LAST_ID; id++)
       {
           int quantity = randomGenerator.nextInt(6) + 1;
           manager.takeDelivery(id, quantity);
       }
    }
   
   
    /**
     * Show that the StockManager can sell all
     * different quantities of all of the products
     */
    private void demoSellProducts()
    {
        manager.printAllProducts();
        
        for(int id = FIRST_ID; id < LAST_ID; id++ )
        {
            int quantity = randomGenerator.nextInt(6) + 1;
            manager.sellProduct(id, quantity);
        }
        
        manager.printAllProducts();
    }
    
   
    /**
     * Shows that a product can be removed from
     * the stock by the StockManager
     */
    public void removeProduct(int id)
    {
        manager.printAllProducts();
        manager.removeProduct(id);
        manager.printAllProducts();
    }
    
    
}
