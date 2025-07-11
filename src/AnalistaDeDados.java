//Augusto da Silva de Sá - RA: 2564319
public class AnalistaDeDados extends Funcionario implements Calc{

    // Atributos específicos
    private String ferramenta;
    private int qtdRelatorios;

    // Construtor Default
    public AnalistaDeDados() {
        super();
        this.ferramenta = "";
        this.qtdRelatorios = 0;
    }

    // Sobrecarga
    public AnalistaDeDados(String nome, String cpf, double salario,String ferramenta, int qtdRelatorios) {
        super(nome, cpf, salario);
        this.ferramenta = ferramenta;
        this.qtdRelatorios = qtdRelatorios;
    }

    // Sobrescrita do método da interface
    public void calcBonus() {
        double bonus = getSalario() * 0.1 * getQtdRelatorios();
        System.out.println("Bônus do Analista de Dados: R$ " + bonus);
    }

    //Sobrescrita do método da classe mae
    public void gerarDescricaoCargo() {
        System.out.println("Analista de Dados que usa " + getFerramenta() + " e produz " + getQtdRelatorios() + " relatórios mensais.");
    }

    // Getters e Setters
    public String getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(String ferramenta) {
        this.ferramenta = ferramenta;
    }

    public int getQtdRelatorios() {
        return qtdRelatorios;
    }

    public void setQtdRelatorios(int qtdRelatorios) {
        this.qtdRelatorios = qtdRelatorios;
    }
}