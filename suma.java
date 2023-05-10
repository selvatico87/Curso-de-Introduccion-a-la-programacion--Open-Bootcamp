public class SumaTresNumeros {
  public static int suma(int num1, int num2, int num3) {
      return num1 + num2 + num3;
  }
  public static void main(String[] args) {
      int a = 5;
      int b = 10;
      int c = 15;
      int resultado = suma(a, b, c);
      System.out.println("El resultado de la suma es: " + resultado);
  }
}
/*
En esta función, la suma se realiza en la línea return num1 + num2 + num3;. La función suma recibe tres parámetros numéricos y devuelve su suma. En el main, se crean tres variables enteras a, b y c que se les asigna un valor numérico. Luego, se llama a la función suma con estos tres valores, y el resultado se almacena en la variable resultado. Finalmente, se imprime el resultado en la consola usando System.out.println().

Al ejecutar este código, deberías ver el siguiente resultado en la consola: El resultado de la suma es: 30' 
*/