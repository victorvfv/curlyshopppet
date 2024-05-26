import java.util.ArrayList;
/**
 * Write a description of class Tienda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tienda
{
    // instance variables - replace the example below with your own
    private String localizacion;
    private boolean abierto;
    private ArrayList<Gato> gato;

    /**
     * Constructor for objects of class Tienda
     */
    public Tienda(String localizacion)
    {
        this.localizacion=localizacion;
        abierto=false;
        gato = new ArrayList<Gato>();
    }
    
    public void abrirOCerrar(){
        if(abierto==false){
            abierto=true;
        }
        else{
            abierto=false;
        }
    }
    
    public void conseguirGato(String color, int edad){
        Gato nuevo=new Gato(color,edad);
        gato.add(nuevo);
    }
}
