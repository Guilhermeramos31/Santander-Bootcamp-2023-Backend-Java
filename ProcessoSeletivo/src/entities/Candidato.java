package entities;
public class Candidato{
    private String nome;
    private double salario;
    private int tentativa;
    public Candidato(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public int getTentativa(){
        return this.tentativa;
    }
    public void setTentativa(int tentativa) {
        this.tentativa = tentativa;
    }
}
