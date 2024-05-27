public class App {
    public static void main(String[] args) {
        Gato rangato = new Gato("negro", 20);
        System.out.println(rangato.getcolor());
        rangato.setcolor("blanco");
        System.out.println(rangato.getcolor());
        rangato.setEdad(2);
        System.out.println(rangato.getEdad());

    }
}
