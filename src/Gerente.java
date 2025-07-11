//Augusto da Silva de Sá - RA: 2564319
public class Gerente extends Funcionario implements Calc{

    // Atributos
    private String departamento ; 
    private String tipoGerencia ;  // ex: "Projetos", "Pessoas", "Financeiro"
    private int qtdEquipesGerenc;      // Quantidade de equipes gerenciadas

    // Construtor Default
    public Gerente() {
        super();
        departamento = "";
        tipoGerencia = "";
        qtdEquipesGerenc = 0;
    }

    // Construtor com Sobrecarregado
    //Sobrecarga
    public Gerente(String nome, String cpf, double salario,String departamento, String tipoGerencia, int qtdEquipesGerenc) {
        super(nome, cpf, salario);
        this.departamento = departamento;
        this.tipoGerencia = tipoGerencia;
        this.qtdEquipesGerenc = qtdEquipesGerenc;
    }

    // Sobrescrita do método da interface
    public void calcBonus() {
        double bonus = getSalario() * 0.2 * getQtdEquipesGerenc();
        System.out.println("Bônus do Gerente: R$ " + bonus);
    }

    // Sobrescrita do método da classe mae
    public void gerarDescricaoCargo() {
        System.out.println("Gerente do departamento de " + getDepartamento() + ", responsável por " + getQtdEquipesGerenc() + " equipes.");
    }

    // Getters e Setters
    //Tratamento de exception para quatidade de equipes menor ou igual a zero
    public void setQtdEquipesGerenc(int qtdEquipesGerenc) throws QtdEquipesInvException{
		if(qtdEquipesGerenc> 0){
		    this.qtdEquipesGerenc = qtdEquipesGerenc;
        }
		else{
			throw new QtdEquipesInvException();
		}
		
	}

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTipoGerencia() {
        return tipoGerencia;
    }
    public void setTipoGerencia(String tipoGerencia) {
        this.tipoGerencia = tipoGerencia;
    }

    public int getQtdEquipesGerenc() {
        return qtdEquipesGerenc;
    }
}
