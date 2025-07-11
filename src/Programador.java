//Augusto da Silva de Sá - RA: 2564319
public class Programador extends Funcionario {

    // Atributos
    private String linguagemP; //linguagem principal (predominante)
    private String nivelSen; //Nivel de Senioridade, ex: Junior, Pleno ou Senior

    // Construtor Default
    public Programador() {
        super();
        linguagemP = "";
        nivelSen = "";
    }

    //Construtor Sobrecarregado
    // Sobregarga
    public Programador(String nome, String cpf, double salario, String linguagemP, String nivelSen) {

        super(nome, cpf, salario);
        this.linguagemP = linguagemP;
        this.nivelSen = nivelSen;
    }

    //Sobrescrita do método da classe mae
    public void gerarDescricaoCargo() {
        System.out.println("Programador nível " + getNivelSen() + ", especialista em " + getLinguagemP() + ".");
    }

    // Getters e Setters
    public String getLinguagemP() { 
        return linguagemP; 
    }
    public void setLinguagemP(String linguagemP) { 
        this.linguagemP = linguagemP; 
    }
    public String getNivelSen() { 
        return nivelSen; 
    }
    public void setNivelSen(String nivelSen) throws NivelSenioridadeInvException {
    if (nivelSen.equalsIgnoreCase("Junior") 
        || nivelSen.equalsIgnoreCase("Pleno") 
        || nivelSen.equalsIgnoreCase("Senior")) {
        this.nivelSen = nivelSen;
    } else {
        throw new NivelSenioridadeInvException();
    }
}


}
