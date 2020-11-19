
/**
 * Write a description of class Module here.
 *
 * @author Dominic Little
 * @version 0.1 11/Sep/2020
 */
public class Module
{
    private String title;
    
    private String codeNo;
    
    private int mark;
    private boolean complete;

    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        mark = 0;
        this.title = title;
        this.codeNo = codeNo;
        complete = false;
        mark = -1;
    }
    
    public void awardMark(int mark)
    {
        if((mark >= 0) && (mark <= 100))
        {
            this.mark = mark;
        }
        else
        {
            System.out.print("Invalid mark!!!");
        }
    }
    
    public boolean isComplete()
    {
        return complete;
    }
    
    public void print()
    {
        System.out.println("Module: " + codeNo +
            " " + title + " Mark = " + mark);
    }

}
