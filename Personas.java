
/**
 * El constructor de la clase Persona deberá tener (en el mismo orden):

Un parámetro que permita indicar el nombre de la persona.
Un parámetro booleano que permita indicar si la persona es un hombre.
Un parámetro entero que permita indicar el peso en kilogramos de la persona.
Un parámetro entero que permita indicar la altura en centímetros de la persona.
Un parámetro entero que permita indicar la edad en años de la persona.
 */
public class Personas
{
    // instance variables - replace the example below with your own
    private String nombre;
    private boolean varon;
    private int peso;
    private int altura;
    private int edad;
    /**
     * Constructor for objects of class Personas
     */
    public Personas(String nombre,boolean varon,int peso,int altura,int edad)
    {
        this.nombre= nombre;
        this.varon= varon;
        this.peso =peso;
        this.altura = altura;
        this.edad= edad;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
}
