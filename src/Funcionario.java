//Augusto da Silva de Sá - RA: 2564319
public abstract class Funcionario {

    // Atributos
    private String nome;
    private String cpf;
    private double salario;

    // Construtor Default
    public Funcionario() {
        nome = "";
        cpf = "";
        salario = 0.0;
    }

    // Construtor com Sobrecarga
    //Sobrecarga
    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    //método a ser sobrescrito nas classes filhas
    public abstract void gerarDescricaoCargo();

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}