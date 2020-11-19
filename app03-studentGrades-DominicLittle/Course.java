

/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Dominic Little
 * @version 0.1 11/Sep/2020
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String codeNo;
    private String title;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    public static final int MAX_MODULES = 4;

    private int noModules;
    private int mark;
    private int finalMark;
    private int totalMark;
   

   
    private Grades finalGrade;
        
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;
        
        this.module1 = new Module ("Programming Concepts", "CO452");
        this.module2 = new Module ("3D Modeling", "CO452");
        this.module3 = new Module ("Binary", "CO452");
        this.module4 = new Module ("Games Design Theory", "CO452");
    }
    
    public void addMark(int mark, int moduleNo)
    {
        if(moduleNo ==1)
        {
            module1.awardMark(mark);
        }
        if(moduleNo ==2)
        {
            module2.awardMark(mark);
        }
        if(moduleNo ==3)
        {
            module3.awardMark(mark);
        }
        if(moduleNo ==4)
        {
            module4.awardMark(mark);
        }
    }
    
   public void addModule(int number, Module module)
    {
        if((number >= 1) && (number <= MAX_MODULES)) noModules++;
        
        switch(number)
        {
            case 1: module1 = module; break;
            case 2: module2 = module; break;
            case 3: module3 = module; break;
            case 4: module4 = module; break;
        }
    }
    
   
    /**
     * Prints out the details of a course
     */
    public void print()
    {
        // put your code here
        System.out.println("Course " + codeNo + " - " + title);
    }
    
    private void printModules()
    {
        if(module1 != null) module1.print();
        if(module2 != null) module2.print();
        if(module3 != null) module3.print();
        if(module4 != null) module4.print();
    }
    
    private String calculateGrade()
   {
       mark = totalMark / MAX_MODULES;
       
       if(mark <= 40)
       {
           return "F";
       }
       else if(mark <= 50)
       {
           return "D";
       }
       else if(mark <= 60)
       {
           return "C";
       }
       else if(mark <= 70)
       {
           return "B";
       }
       else return "A";
   }
}
