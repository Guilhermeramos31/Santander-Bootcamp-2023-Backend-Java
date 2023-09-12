package entities.enums;

public enum Ligacao {
    Atendeu(1), Desligou(0);
    private final int valor;
    Ligacao(int valor) {
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }
}
