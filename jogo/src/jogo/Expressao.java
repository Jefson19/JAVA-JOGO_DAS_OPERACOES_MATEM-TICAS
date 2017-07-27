package jogo;

/**
 *
 * @author Jefs
 */
public class Expressao {

    int nivel;
    char tipo;
    String expressao;
    double resposta;

    public Expressao(int nivel, char tipo, String expressao, double resposta) {
        this.nivel = nivel;
        this.tipo = tipo;
        this.expressao = expressao;
        this.resposta = resposta;
    }

    @Override
    public String toString() {
        return "Expressao{" + "nivel=" + nivel + ", tipo=" + tipo + ", expressao=" + expressao + ", resposta=" + resposta + '}';
    }

}
