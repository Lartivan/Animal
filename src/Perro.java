public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre,"perro");
    }

    @Override
    public void hacerRuido() {
        System.out.println("GUAU GUAU");
    }
    @Override
    public void descripcion(){
        super.descripcion();
        System.out.println("aloooooo");
    }
}
