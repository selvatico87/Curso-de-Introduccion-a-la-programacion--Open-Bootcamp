// Clase Persona
class Persona {
  private int edad;
  private String nombre;
  private String telefono;

  public int getEdad() {
      return edad;
  }

  public void setEdad(int edad) {
      this.edad = edad;
  }

  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public String getTelefono() {
      return telefono;
  }

  public void setTelefono(String telefono) {
      this.telefono = telefono;
  }
}

// Clase Cliente que hereda de Persona
class Cliente extends Persona {
  private double credito;

  public double getCredito() {
      return credito;
  }

  public void setCredito(double credito) {
      this.credito = credito;
  }
}

// Clase Trabajador que hereda de Persona
class Trabajador extends Persona {
  private double salario;

  public double getSalario() {
      return salario;
  }

  public void setSalario(double salario) {
      this.salario = salario;
  }
}

public class Main {
  public static void main(String[] args) {
      // Crear un objeto de la clase Cliente y establecer sus propiedades
      Cliente cliente = new Cliente();
      cliente.setEdad(35);
      cliente.setNombre("Juan");
      cliente.setTelefono("555-4321");
      cliente.setCredito(5000.0);

      // Mostrar las propiedades del cliente por pantalla
      System.out.println("Edad del cliente: " + cliente.getEdad());
      System.out.println("Nombre del cliente: " + cliente.getNombre());
      System.out.println("Teléfono del cliente: " + cliente.getTelefono());
      System.out.println("Crédito del cliente: " + cliente.getCredito());

      System.out.println("----------------------------------------");

      // Crear un objeto de la clase Trabajador y establecer sus propiedades
      Trabajador trabajador = new Trabajador();
      trabajador.setEdad(28);
      trabajador.setNombre("María");
      trabajador.setTelefono("555-9876");
      trabajador.setSalario(2500.0);

      // Mostrar las propiedades del trabajador por pantalla
      System.out.println("Edad del trabajador: " + trabajador.getEdad());
      System.out.println("Nombre del trabajador: " + trabajador.getNombre());
      System.out.println("Teléfono del trabajador: " + trabajador.getTelefono());
      System.out.println("Salario del trabajador: " + trabajador.getSalario());
  }
}
/*
 * En este código, se crea la clase Persona con las propiedades edad, nombre y telefono, junto con sus respectivos getters y setters. Luego, la clase Cliente hereda de Persona y tiene una propiedad adicional llamada credito, con su correspondiente getter y setter. La clase Trabajador también hereda de Persona y tiene una propiedad adicional llamada salario, con su getter y setter.

En el método main, se crea un objeto de la clase Cliente y se establecen sus propiedades (edad, nombre, telefono y credito), y luego se muestra por pantalla cada una de estas propiedades. A continuación, se crea un objeto de la clase Trabajador y se establecen sus propiedades (edad,

nombre, telefono y salario), y se muestra por pantalla cada una de estas propiedades.

De esta manera, se cumple con la herencia de propiedades específicas de cada subclase (Cliente y Trabajador) desde la clase base Persona.
 */