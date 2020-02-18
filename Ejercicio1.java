public class Ejercicio1 {

    public static void main(String args[]) {

        Integer numero1 = Integer.parseInt(args[0]);
        Integer numero2 = Integer.parseInt(args[1]);

        Integer resultado = hacerSuma(numero1, numero2);

        System.out.println("La suma es: " + resultado);
    }

    public static int hacerSuma(int numero1, int numero2) {
        return numero1 + numero2;
    }

}