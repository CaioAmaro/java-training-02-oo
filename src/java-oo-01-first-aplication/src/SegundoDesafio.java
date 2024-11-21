public class SegundoDesafio {
    public static void main(String[] args){

        System.out.println("\n");

        double nota1 = 5.5;
        double nota2 = 6.6;
        double mediaNotas = (nota1 + nota2) / 2;
        System.out.println("A média da " + nota1 + " + " + nota2 + " é " + mediaNotas);

        System.out.println("\n");

        double valorDouble = 4.4;
        int valorIntCasting = (int)valorDouble;
        System.out.println(valorDouble + " Feito casting em int fica ("+ valorIntCasting +").");

        System.out.println("\n");

        char letra = 'o';
        String palavra = "Cai";
        String nome = palavra + letra;
        System.out.println(nome);

        System.out.println("\n");

        double precoProduto = 2.5;
        int quantidade = 4;
        double precoTotal = precoProduto * quantidade;
        System.out.println("O valor total é R$"+precoTotal);

        System.out.println("\n");

        double valorDolar = 2;
        double valorReais = valorDolar * 4.94;
        System.out.println("$" + valorDolar + " é R$" + valorReais);

        System.out.println("\n");

        double precoOriginal = 57;
        double percentualDesconto = 0.02;
        double valorDesconto = precoOriginal * percentualDesconto;
        double precoFinal = precoOriginal-valorDesconto;
        System.out.println("O produto Y custando R$" + precoOriginal + " está com R$"+ valorDesconto+ " de desconto, ficando o total de R$"+ precoFinal);

    }
}
