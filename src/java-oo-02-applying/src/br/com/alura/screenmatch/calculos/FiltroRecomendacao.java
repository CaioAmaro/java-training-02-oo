public class FiltroRecomendacao {
    private String recomendacao;

    public void filtrar(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os prerferidos do momento");
        }else if(classificavel.getClassificacao() >=2 ){
            System.out.println("Muito bem avaliado no momento!");
        }else{
            System.out.println("Coloque na sua lista para assitir depois");
        }
    }
}
