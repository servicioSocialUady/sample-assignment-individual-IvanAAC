public class Ejercicio1 {

    public static void main(String args[]) {

        Integer numero1 = Integer.parseInt(args[0]);
        Integer numero2 = Integer.parseInt(args[1]);

        Integer resultado = hacerSuma(numero1, numero2);

        System.out.println(resultado);
    }

    public static int hacerSuma(int numero1, int numero2) {
        int multi = 4 * 8;
        int rest = 5 - 2;
        int divi = 4/2;
        return numero1 + numero2;
    }

}
