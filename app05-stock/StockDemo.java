import java.util.Random;

/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Dominic Little
 * @version 1

 */
public class StockDemo
{
    public static final int FIRST_ID = 200;
    public static final int LAST_ID = 209;
    
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
        
        addTestData();
        demoDeliverProducts();
    }
    
    public void addTestData()
    {
        int id = FIRST_ID;
        manager.addProduct(new Product(id,"Iphone 12"));
        
        id++; 
        manager.addProduct(new Product(id,"Iphone 12+"));
        
        id++; 
        manager.addProduct(new Product(id,"Iphone 12 mini"));
        
        id++; 
        manager.addProduct(new Product(id,"Iphone 11"));
        
        id++; 
        manager.addProduct(new Product(id,"Iphone 11+"));
        
        id++; 
        manager.addProduct(new Product(id,"Iphone 11 mini"));
    }
    
    public void runDemo()
    {
       manager.printAllProducts();
       demoDeliverProducts();
       manager.printAllProducts();
       demoSellProducts();
       manager.printAllProducts();
       
       manager.removeProduct(102);
       
       manager.renameProduct(103, "Iphone 12");
       manager.searchProducts("Apple");
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
     * Shows that the StockManager can sell all
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
}
