import java.util.Scanner;

public class ListaEntrega24 {
    
    public static void main(String[] args) { 
        
        Scanner entrada = new Scanner(System.in); 
        
        int numero, soma=0, modulo ;
        
        System.out.println("Entre com um número maio que zero que seja inteiro: ");    
        numero = entrada.nextInt();
        
        if (numero > 0){
            while(numero > 0){
            modulo = numero % 10;
            soma += modulo;
            numero /=10;
  
        }
        
        System.out.println("soma dos digitos: " +soma);
       
    }
}
}