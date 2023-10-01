public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 30);
        Persona persona2 = new Persona("María", 25);
        persona1.saludar();
        persona2.saludar();
    }
}
//El código tiene una complejidad temporal constante, O(1).