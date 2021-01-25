import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @autho Dominic Little
 * @version 1 
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Prompt the user to enter a string and Read a line of text
     * from a text terminal, and return a String.
     */
    public String getString(String prompt)
    {
        String value = null;
        boolean isValid = false;

        while(isValid == false)
        {
            System.out.println(prompt);
            value = reader.nextLine();

            if(value.isBlank() || value.isEmpty())
            {
                System.out.println("Your input is blank");
            }
            else isValid = true;
        }

        return value;
    }
    
    /**
     * Prompt the user to enter an int
     * Read an int from the text terminal
     * and return it as an int.
     */
    public int getInt(String prompt)
    {
        boolean isValid = false;
        int number = 0;

        while(isValid == false)
        {
            System.out.println(prompt);

            try
            {
                number = reader.nextInt();
                isValid = true;
            }
            catch(Exception e)
            {
                System.out.println("\nInvalid integer!\n");
            }

        }
        return number;
    }

    /**
     * Displays a prompt and Get an integer value between min and max
     */
    public int getInt(String prompt, int min, int max)
    {
        boolean isValid = false;
        int number = 0;

        while(isValid == false)
        {
            number = getInt(prompt);
            if(number < min || number > max)
            {
                System.out.println("Number must be between " + min + " and " + max);
            }
            else
                isValid = true;
        }
        return number;
    }
}
