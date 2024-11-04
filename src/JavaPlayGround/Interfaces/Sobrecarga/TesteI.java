package JavaPlayGround.Interfaces.Sobrecarga;

public class TesteI implements Inter1 {
    @Override
    public double teste(double numero) {
        int i = (int) numero;
        return i;
    }

    @Override
    public void teste2(String n) {
        Inter1.super.teste2(n);
    }
}
