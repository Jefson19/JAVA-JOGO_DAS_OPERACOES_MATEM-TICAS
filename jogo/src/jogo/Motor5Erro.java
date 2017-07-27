package jogo;

/**
 *
 * 
 */
/**
 *
 * @author Jefs
 */
//jogonivel
public class Motor5Erro implements MotorDoJogo {

    MotorDoJogo ref = null;
    Expressao expr;
    BaseDificultador basedif;
    Dificultador dif;
    int pontuacao = 0;
    int erro = 0;
    int qQuant = 0;

    int dificudade;

    @Override
    public boolean acabou() {
        if (getqQuant() == 20 || getErro() == 5) {

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
            setErro(getErro() + 1);
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

    public int getErro() {
        return erro;
    }

    public void setErro(int erro) {
        this.erro = erro;
    }

    public void setqQuant(int qQuant) {
        this.qQuant = qQuant;
    }
}
