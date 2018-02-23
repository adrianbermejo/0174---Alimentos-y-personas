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
        comidas = new ArrayList<>();
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
    public int comer(Comida plato){
        int devolver =0;

        if ((varon=true && calorias<=(10*peso+6*altura+5*edad)+5 )|| (varon =false&& calorias<=(10*peso+6*altura+5*edad)- 161)){
            calorias = calorias + plato.getCalorias();
            devolver = plato.getCalorias();
            comidas.add(plato);
        }
        else{
            devolver=-1;   
        }

        return devolver;
    }

    /**
     * Ahora queremos que sea posible preguntarle cosas a la persona. Si no ha sobrepasado su metabolismo basal, te contestará "SI" o "NO" (¡en mayúsculas!)
     * dependiendo de si la pregunta tiene una longitud (es decir, el número de letras de la misma) divisible por 3 o no, respectivamente.
     *  En caso de que la persona ya haya sobrepasado el metabolismo basal o en el caso de que tu pregunta contenga el nombre de la persona,
     *  responderá con la misma pregunta que le has hecho pero gritando (es decir, el mismo texto de la pregunta pero en mayúsculas) indiferentemente de la longitud de a pregunta.
     *  El método que se utiliza para preguntar cosas a la persona debe llamarse contestar, admite un único parámetro y debe devolver la respuesta además de imprimirla por pantalla.
     */
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

    /**
     * Se pide que implementes el código necesario para disponer de un método en la clase Persona llamado getAlimentoMasCaloricoConsumido que imprima por pantalla
     * y que devuelva el nombre de la comida más calórico ingerida hasta ahora por un usuario.
     * En caso de que la persona no haya comido nada el método infoma por pantalla de tal situación y devuelve null. En caso de que haya empate entre dos o más comidas, imprime y devuelve la última de ellas.
     */
    public String getAlimentoMasCaloricoConsumido(){
        String mayorCaloria = null;
        int comer = 0;
        for(Comida plato:comidas){
            if(plato.getCalorias()>=comer){
                comer = plato.getCalorias();
                mayorCaloria = plato.getComida();
            }
        }
        return mayorCaloria;
    }

}









 
   