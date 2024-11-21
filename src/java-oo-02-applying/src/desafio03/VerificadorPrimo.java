public class VerificadorPrimo extends NumerosPrimos{
    void verificarSeEhPrimo(int numero){
        if(verificarPrimo(numero)){
            System.out.println("Número é Primo");
        }else{
            System.out.println("Número não é primo");
        }
    }
}
