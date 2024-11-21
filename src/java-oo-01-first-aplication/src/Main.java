public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoLancamento);

        boolean incluidoPlano = true;

        double notaFilme = 8.1;

        //Média calculada pela  3 notas da Jack, Paulo e Suelem.
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse ="""
                        Filme Top Gun
                        Filme de Aventura com galã dos anos 80
                        Muito Bom!
                        Ano de lançamento
                        """ + anoLancamento;

        System.out.println(sinopse);

        int classificacao = (int) media / 2;

        System.out.println(classificacao);

    }
}