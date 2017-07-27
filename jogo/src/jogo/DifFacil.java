package jogo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Jefs
 */
public class DifFacil implements Dificultador {

    ArrayList<Expressao> exp;

    public DifFacil(ArrayList<Expressao> exp) {
        this.exp = exp;
    }

    @Override
    public Expressao getAleatorio(ArrayList<Expressao> listExp) {

        Random aleatorio = new Random();
        Expressao expr;
        //gerar um novo array com as expressoes com o nivel
        do {
            expr = listExp.get(aleatorio.nextInt(listExp.size()));

        } while (expr.nivel == 4 || expr.nivel == 5);
        return expr;
    }

    @Override
    public String informacao(Expressao expr) {
        if (expr.tipo == 's') {
            return "A Subtração de: " + expr.expressao;
        } else if (expr.tipo == 'd') {
            return "A Divisão de: " + expr.expressao;
        } else if (expr.tipo == 'a') {
            return "A Adição de: " + expr.expressao;
        }
        return "A Multiplicação de: " + expr.expressao;
    }

}
