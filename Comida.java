 import java.util.ArrayList;
/**
 * l constructor de la clase Comida deberá tener (en el mismo orden):

Un parámetro que permita indicar el nombre de la comida.
Un parámetro entero que permita indicar la cantidad de calorias asociadas a la comida.
En los constructores no es necesario comprobar la validez de ningún parámetro, asumimos que nos pasan valores legales.
 */
public class Comida
{
    // instance variables - replace the example below with your own
    private String  comida;
    private int  calorias;
    private ArrayList<Comida> comidas;
    /**
     * Constructor for objects of class comidas
     */
    public Comida(String comida,int calorias)
    {
       this.comida=comida;
       this.calorias=calorias;
      comidas = new ArrayList<>();
      
    }
    
     /**
     * devuelve as alorias de la comida
     */
    public String  getComida(){
     return comida;   
    }

    /**
     * devuelve as alorias de la comida
     */
    public int  getCalorias(){
     return calorias;   
    }
}
