public class Calculator {
    // Malas prácticas: variable no descriptiva, método innecesario
    private int x;

    public int sumar(int a, int b) {
        return a + b;
    }
    //esto es una prueba
    public int dividir(int a, int b) {
        // Error: no maneja división por 0 correctamente
        return a / b;
    }

    // Código redundante e innecesario
    //SEGUNDA PRUEBA
    //tercer cambio
    //cuarto cambio
    //cambio 06/04/2025 1
    //cambio 06/04/2025 2

    public void imprimirMensaje() {
        //he realizado un cambio
        // cambio 4
        System.out.println("Hola, soy un método inútil");
    }
}
