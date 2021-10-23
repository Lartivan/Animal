public class Labrador extends Perro{

    public Labrador(String nombre) {
        super(nombre);
    }
    @Override
    public void descripcion(){
        super.descripcion();
        System.out.println("soy muy inteligente");
    }
}
