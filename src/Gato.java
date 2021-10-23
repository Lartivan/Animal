public class Gato extends Animal{
    public Gato(String nombre) {
        super(nombre, "Gato");
    }

    @Override
    public void hacerRuido() {
        System.out.println("MIAU MIAU");
    }
}
