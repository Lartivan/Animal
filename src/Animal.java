public abstract class Animal {
    String nombre;
    String especie;

    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public abstract void hacerRuido();

    public void descripcion () {
        System.out.println("Me llamo " + this.nombre + " y soy un " + this.especie);
    }
    public static void escucharTodos(Animal[] animales){
        for(int i = 0; i<animales.length;i++) {
         animales[i].hacerRuido();
            //for(Animal animal : animales){
           // animal.hacerRuido();

        }
    }
}
