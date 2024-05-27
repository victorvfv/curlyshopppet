import java.util.ArrayList;
/**
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
//metodo devuelve apertura.
public boolean getApertura ()     {
    return abierto;
}
public String getLocalizacion () {
    return  localizacion;
}
public void setGato(String color, int edad){
    Gato nuevo=new Gato(color,edad);
    gato.add(nuevo);
}

public Gato getGato(int index){
    Gato gatito=null;
    if (index >= 0 && index <= gato.size()) {
        gatito = gato.get(index);
        } 
    return gatito;
}


    
public void setubicado (String ubicado) {
localizacion = ubicado;
}


public void abrilCerral() {
    if (abierto = true) {
        abierto = false ;
    } else {
        abierto = true ;
    }

    //imprimir detalles.
    public void imprime () {
        System.out.println("nuestra tienda esta en " + localizacion+ " ahora está " + abierto+ "y tenemos ") +  gato;
    }

}

}

