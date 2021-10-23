public class Main {

    public static void main(String[] args) {
    Labrador coco = new Labrador("Coco");
    coco.hacerRuido();
    coco.descripcion();
    Animal[] animales = {new Gato("clota"),new Perro("chocho"),new Labrador("LaLo")};
    Animal.escucharTodos(animales);
    }
}
