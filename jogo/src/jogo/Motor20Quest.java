package jogo;

/**
 *
 * @author Jefs
 */
public class Motor20Quest implements MotorDoJogo {

    MotorDoJogo ref = null;
    BaseDificultador basedif;
    Dificultador dif;
    int pontuacao = 0;
    int qQuant = 0;
    int dificudade;

    @Override
    public boolean acabou() {
        if (getqQuant() == 20) {

            return true;
        }

        return false;
    }

    @Override
    public boolean acertou(double resposta, Expressao expr) {
        setqQuant(getqQuant() + 1);

        if (resposta == expr.resposta) {
            setPontuacao(getPontuacao() + 1);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public Dificultador pedeDif(int dificuldade) {
        basedif = new BaseDificultador();
        dif = basedif.getDificultador(dificuldade);
        return dif;
    }

    @Override
    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public int getqQuant() {
        return qQuant;
    }

    public void setqQuant(int qQuant) {
        this.qQuant = qQuant;
    }

}
