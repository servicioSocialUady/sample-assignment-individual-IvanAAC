import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        Scanner in =new Scanner(System.in);
        long entrada = in.nextLong();
        
        BigInteger numeroPrueba = new BigInteger(String.valueOf(entrada));
                       
        
        int a = 0, b = 1, c = 0;
        String resultado = "";        
        boolean esPrimo = numeroPrueba.isProbablePrime(1);;
        boolean esFibonacci = false;
                        
        while(c <= entrada){
            c = a + b;		
            a = b;
            b = c;	

            if(c == entrada){
                esFibonacci = true;
            }            
        }

        if(esFibonacci && esPrimo){
            resultado = "asombroso";
        }
        else if(esFibonacci){
            resultado = "fibonacci";
        } 
        else{
            resultado = "ordinario";
        }
        
        System.out.println(resultado);         
    }
    
}
