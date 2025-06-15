//This is a Java application to print a temperature conversion table.
/**********************************************************************
 * The <CODE>TemperatureConversion</CODE> Java application prints a table
 * coverting Celcious to Fahrenheit degrees
 * 
 * @author Lennox Magak
 **********************************************************************/

public class TemperatureConversion{

/**
 * The main method prints a Celsius to Fahrenheit conversion table.
 * The String arguments (args) are not used in this implementation.
 * The bounds of the table range from -50C to +50C in 10 degree increments.
 */
public static void main(String[] args) {

    final double TABLE_BEGIN= -50.0; // The table's first Celsius temperature
    final double Table_END= 50.0;    // The table's final Celsius temperature
    final double TABLE_STEP=10.0; // Increaments between temperatures in the Table.

    double celsius; // A Celsius temperature
    double fahrenheit; // The equivalent  Fahrenheit temperature

    System.out.println("TEMPERATURE CONVERSION");
    System.out.println("----------------------");
    System.out.println("Celcious    Fahrenheit");

    for(celsius=TABLE_BEGIN;celsius<=Table_END; celsius+=TABLE_STEP){
        //Each interation prints one line of the Iteration Table
        fahrenheit= celsiusToFahrenheit(celsius);
        System.out.printf("%6.2fC", celsius);
        System.out.printf("%14.2fF\n", fahrenheit);

    }
    System.out.println("-------------------------");
}

/**
 * Convert a temperature from Celsius degrees to Fahrenheit degrees
 * @param c 
 *      a tempreature in Celsius degrees
 * @return
 *      the temperature c converted to Fahrenheit
 * @throws IllegalArgumentException
 *      Indicates that c is less than the smallest Celsius temperature (-273.15).
 */


public static double  celsiusToFahrenheit(double c){

    final double MINIMUM_CELSIUS=-273.15;
    if (c<MINIMUM_CELSIUS){
        throw new IllegalArgumentException("Argument " + c + " is too small.");
    }
    return (9.0/5.0)*c+32;
}
}
