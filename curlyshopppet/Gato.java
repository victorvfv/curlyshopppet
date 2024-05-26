public class Gato {
    // instance variables - replace the example below with your own
    private int edad;
    private String color;

    /**
     * Constructor for objects of class Gato
     */
    public Gato(String color,int edad) {
        this.color = color;
        this.edad = edad;
    }
    //metodo que devuelve el color.
    public String getcolor() {
        return color ;
    }
    //devuelve la edad.
    public int getEdad() {
        return edad;
    }
    //metodo setColor
    public void setcolor(String otroColor) {
        color= otroColor;
    }
    //metodo setedad.
    public void setEdad(int tiempo) {
        edad = tiempo;
    }

    public void imprimirDetalles(){
        System.out.println("El gato es de color " + color + " y tiene " + edad + "años");
    }

    //fin de la clase 
}
