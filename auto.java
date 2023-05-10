public class Coche {
  private int numPuertas;

  public Coche(int numPuertas) {
      this.numPuertas = numPuertas;
  }

  public int getNumPuertas() {
      return numPuertas;
  }

  public void agregarPuerta() {
      numPuertas++;
  }

  public static void main(String[] args) {
      Coche miCoche = new Coche(3);
      miCoche.agregarPuerta();
      System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas.");
  }
}
/*
En esta clase, hay una variable de instancia numPuertas que almacena el número de puertas del coche. El constructor Coche se utiliza para inicializar esta variable cuando se crea un objeto Coche. También hay dos métodos: getNumPuertas que devuelve el número de puertas, y agregarPuerta que incrementa el número de puertas.

En el main, se crea un objeto miCoche con 3 puertas. Luego, se llama al método agregarPuerta para agregar una puerta más al coche. Finalmente, se muestra el número de puertas usando el método getNumPuertas.
 
Al ejecutar este código, deberías ver el siguiente resultado en la consola: Mi coche tiene 4 puertas.
 
*/