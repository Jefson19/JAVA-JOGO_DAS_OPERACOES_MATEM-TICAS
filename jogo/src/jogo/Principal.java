/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Jefs
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //reposta do aluno
        double resposta;
        int modo;
        int dificuldade;
        int opcao;
        int Tpontos;
        int contQ;

        MotorDoJogo ref;
        BaseMotorDoJogo motor = new BaseMotorDoJogo();
        FonteDeExpressoes expressao = new FonteDeExpressoes();
        ArrayList<Expressao> listaExp = expressao.getlista();
        Expressao exp;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, " JOGO DAS OPERAÇÕES MATEMÁTICAS\n\n 1 - Ir para o Jogar!\n 2 - Sair"));
           
            

            switch (opcao) {
                case 1:
                     JOptionPane.showMessageDialog(null, " \n                       BEM-VINDO\n AO JOGO DAS OPERAÇÕES MATEMÁTICAS\n\n Iremos praticar as 4 operações básicas:\n Soma\n Subtração\n Multiplicação \n Divisão\n ");
                    do {
                        modo = Integer.parseInt(JOptionPane.showInputDialog(null, " ESCOLHA UM MODO DE JOGO\n 1 - Responder 20 Questões e pode errar apenas 5 questões \n 2 - Responder 20 Questões"));
                    } while (modo < 1 || modo > 2);
                    do {
                        dificuldade = Integer.parseInt(JOptionPane.showInputDialog(null, " ESCOLHA UMA DIFICULDADE:\n 1 - Fácil \n 2 - Médio \n 3 - Dificil"));
                    } while (modo < 1 || modo > 3);
                    ref = motor.get(modo);
                    Tpontos = 0;
                    contQ = 0;
                    while (!ref.acabou()) {
                        contQ++;
                        exp = ref.pedeDif(dificuldade).getAleatorio(listaExp);
                        resposta = Double.parseDouble(JOptionPane.showInputDialog(null, "Questão " + contQ + "\n" + ref.pedeDif(dificuldade).informacao(exp) + " = \n Digite a resposta"));
                        if (ref.acertou(resposta, exp)) {
                            Tpontos++;
                        }

                    }
                    JOptionPane.showMessageDialog(null, "\n    FIM DE JOGO!");

                    JOptionPane.showMessageDialog(null, "Você respondeu: " + contQ + "\nVocê acertou um total de " + Tpontos + " pontos\n\n");

                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso joguinho.\n");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!\n");
            }
        } while (opcao != 2);

    }

}
