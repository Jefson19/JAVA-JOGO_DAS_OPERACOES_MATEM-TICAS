package jogo;

/**
 *
 * @author Jefs
 */
//jogonivel
public class BaseMotorDoJogo {

    MotorDoJogo ref;

    public MotorDoJogo get(int modo) {
        if (modo == 1) {
            ref = new Motor5Erro();
        } else if (modo == 2) {
            ref = new Motor20Quest();
        }
        return ref;
    }
}
