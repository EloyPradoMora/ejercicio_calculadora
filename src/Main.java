public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        int a = 0;
        int b = 0;
        //autores: Jaramillo y Prado

        // Base para el ejercicio: este switch debe ser trabajado en varias feature/*.
        // El conflicto intencional se genera cuando dos o mas features editan las mismas lineas.
        switch (opcion) {
            case 1:
                System.out.print("Suma dos numeros");
                System.out.println("Suma entre "+ a + " y " + b + " es de: " + suma(a, b));
                break;
            case 2:
                System.out.print("Resta dos numeros");
                System.out.println("Resta entre "+ a + " y " + b + " es de: " + resta(a, b));
                break;
            case 3:
                System.out.println("Multiplicacion de a por b");
                System.out.println("multiplicacion entre a "+a +"y b"+b +" : "+a*b);
                break;
            case 4:
                System.out.println("Division de a en b");
                System.out.println("division entre a "+a +"y b"+b +" : "+a/b);
                System.out.println("TODO: implementar division");
                if (b == 0){
                    System.out.println("Numero no puede ser menor que cero");
                    break;
                }
                break;
            default:
                System.out.println("TODO: implementar menu y validaciones");
                break;
        }

        // Evita warnings de variables no usadas en esta base inicial.
        if (a == b) {
            System.out.print("");
        }
    }
    private static int suma(int a, int b) {
        return a + b;
    }
    private static int resta(int a, int b) {
        return a - b;
    }
}
