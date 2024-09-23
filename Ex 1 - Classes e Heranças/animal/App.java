public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá main");

        Gato jorge = new Gato();
        jorge.peso = 5;  // Inicializando o peso do gato
        jorge.altura = 0.25f;  // Inicializando a altura do gato
        
        System.out.println(jorge.fazerBarulho());
        System.out.println("Peso do gato: " + jorge.getPeso() + " kg");
        System.out.println("Altura do gato: " + jorge.getAltura() + " m");
    }
}
