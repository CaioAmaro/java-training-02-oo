public class GeradorPrimo extends NumerosPrimos{
    void gerarProximoPrimo(int numero){
        boolean achouProximoPrimo = false;
        int proximoNumero = numero+1;

        while(achouProximoPrimo == false){
            if(verificarPrimo(proximoNumero)){
                System.out.println("O próximo primo após o número "+ numero+ " é o ["+proximoNumero+"]");
                achouProximoPrimo = true;
            }else{
                proximoNumero++;
            }
        }
    }
}
