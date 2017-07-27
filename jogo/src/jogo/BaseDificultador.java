package jogo;

/**
 *
 * @author Jefs
 */
public class BaseDificultador {

    Dificultador ref;
    FonteDeExpressoes fonteexpressao;

    public BaseDificultador() {
        this.fonteexpressao = new FonteDeExpressoes();
    }
    //possui um método que retorna um Dificultador

    public Dificultador getDificultador(int dificuldade) {
        //colocar uma variavel
        if (dificuldade == 1) {
            ref = new DifFacil(fonteexpressao.getlista());
        } else if (dificuldade == 2) {
            ref = new DifMedio(fonteexpressao.getlista());
        } else if (dificuldade == 3) {
            ref = new DifDif(fonteexpressao.getlista());
        }
        return ref;
    }
}
