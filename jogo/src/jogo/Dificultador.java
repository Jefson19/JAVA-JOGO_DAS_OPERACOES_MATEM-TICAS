package jogo;

import java.util.ArrayList;

/**
 *
 * @author Jefs
 */
public interface Dificultador {

    //assinatura da função

    public Expressao getAleatorio(ArrayList<Expressao> expressao);

    public String informacao(Expressao exp);

}
