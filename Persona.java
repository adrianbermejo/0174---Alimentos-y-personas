import java.util.ArrayList;
/**
 * El constructor de la clase Persona deberá tener (en el mismo orden):

Un parámetro que permita indicar el nombre de la persona.
Un parámetro booleano que permita indicar si la persona es un hombre.
Un parámetro entero que permita indicar el peso en kilogramos de la persona.
Un parámetro entero que permita indicar la altura en centímetros de la persona.
Un parámetro entero que permita indicar la edad en años de la persona.
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    private boolean varon;
    private int peso;
    private int altura;
    private int edad;
    private int calorias;
    private ArrayList<Comida> comidas;
    private ArrayList<Persona> listaDePersonas;
    /**
     * Constructor for objects of class Personas
     */
    public Persona(String nombre,boolean varon,int peso,int altura,int edad)
    {
        this.nombre= nombre;
        this.varon= varon;
        this.peso =peso;
        this.altura = altura;
        this.edad= edad;
        calorias =0;
        listaDePersonas = new ArrayList<>();
    }

    /**
     * devuelvve las calorias de la persona
     */
    public int getCaloriasIngeridas(){

        return calorias;
    }

    /**
     * dar de comer a una persona no puede superar su metabolismo basal
     */
    public int comer(Comida comida){
        int devolver =0;

        if ((varon=true && calorias<=(10*peso+6*altura+5*edad)+5 )|| (varon =false&& calorias<=(10*peso+6*altura+5*edad)- 161)){
            calorias = calorias + comida.getCalorias();
            devolver = comida.getCalorias();
        }
        else{
            devolver=-1;   
        }

        return devolver;
    }

    public String contestar(String pregunta){
        float div = (float)pregunta.length()/3;
        String devolver = "NO";
       int resultado = pregunta.toUpperCase().indexOf(nombre.toUpperCase());

        if (((varon=true && calorias>=(10*peso+6*altura+5*edad)+5 )|| (varon =false&& calorias>=(10*peso+6*altura+5*edad)- 161))){
                devolver = pregunta.toUpperCase();
        }
       else if(resultado != -1){
           devolver = pregunta.toUpperCase();
       }
      else{
            if (div==pregunta.length()/3){

                devolver = "SI";

            }
             else if(resultado != -1){
           devolver = pregunta.toUpperCase();
       }
      
            else{
                devolver = "NO" ; 
            }
 }
       
        System.out.print(devolver);
        return devolver ;

     }
    }
    
    
    
    
    
    
   