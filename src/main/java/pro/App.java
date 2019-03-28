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
        System.out.println( "Salut les amis!" );


        String equipeNumber = ResourceBundle.getBundle("param").getString("equipe.number");
        System.out.println("Equipe Number = " + equipeNumber);
    }
}
