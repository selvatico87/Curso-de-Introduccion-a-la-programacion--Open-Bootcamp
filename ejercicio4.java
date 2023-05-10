import java.util.*;

      public class Main {
    public static void main(String[] args) {
        // Condición if
        int numeroIf = 5;
        if (numeroIf < 0) {
            System.out.println("El número es negativo.");
        } else if (numeroIf > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es 0.");
        }

        // Bucle while
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El valor de numeroWhile es: " + numeroWhile);
        }

        // Bucle do-while
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println("El valor de numeroDoWhile es: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        // Bucle for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El valor de numeroFor es: " + numeroFor);
        }

        // Switch
        String estacion = "verano";
        switch (estacion) {
            case "invierno":
                System.out.println("Estamos en invierno.");
                break;
            case "primavera":
                System.out.println("Estamos en primavera.");
                break;
            case "verano":
                System.out.println("Estamos en verano.");
                break;
            case "otoño":
                System.out.println("Estamos en otoño.");
                break;
            default:
                System.out.println("El valor de estacion no es una estación del año.");
                break;
        }
    }
}