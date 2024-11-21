public class NumerosPrimos {

    boolean verificarPrimo(int numero){
        int divisores = 0;

        for(int i=1; i <= numero;i++){
            if(numero%i == 0){
                divisores++;
            }
        }

        if(divisores > 2 || divisores <= 1){
            return false;
        }else{
            return true;
        }

    }

    void listarPrimos(int ate){
        for(int i=1; i<=ate; i++){
            if(verificarPrimo(i)){
                System.out.print(i+" ");
            }
        }
    }
}
