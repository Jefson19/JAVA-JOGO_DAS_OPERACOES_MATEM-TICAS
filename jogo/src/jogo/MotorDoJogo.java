package jogo;

/**
 *
 * @author Jefs
 */
public interface MotorDoJogo {
	//assinatura

    public boolean acabou();

    public boolean acertou(double resposta, Expressao expr);

    public int getPontuacao();

    public int getqQuant();

    public Dificultador pedeDif(int dificuldade);

}
