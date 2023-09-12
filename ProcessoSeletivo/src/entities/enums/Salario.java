package entities.enums;
public enum Salario {
    Base(2000);
    private double valor;
    Salario(double valor){
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }

}