package Main.Java.aula160823.atividade.ex2;

public class ExecptionCoin extends RuntimeException{
    public ExecptionCoin() {
    }
    public ExecptionCoin(String mensage) {
        super(mensage);
    }
}
