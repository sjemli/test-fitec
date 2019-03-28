package pro;

import java.util.ResourceBundle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String equipe = ResourceBundle.getBundle("param").getString("equipe");
        System.out.println("equipe = " + equipe );
    }
}
