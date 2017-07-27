/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Jefs
 */
public class DifMedio implements Dificultador {

    ArrayList<Expressao> exp;

    public DifMedio(ArrayList<Expressao> exp) {
        this.exp = exp;
    }

    @Override
    public Expressao getAleatorio(ArrayList<Expressao> listExp) {
        Expressao expr;
        Random aleatorio = new Random();
        //gerar um novo array com as expressoes com o nivel
        do {
            expr = listExp.get(aleatorio.nextInt(listExp.size()));

        } while (expr.nivel == 1 || expr.nivel == 2 || expr.nivel == 5);
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
