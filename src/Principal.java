//Augusto da Silva de Sá - RA: 2564319
public class Principal {
    public static void main(String[] args) {

        // Classe de leitura de dados
        Leitura l1 = Leitura.geraLeitura();
        int opcao = 0;

        // MENU
        do {
            System.out.println("\n============= Menu de Funcionários =============");
            System.out.println("1. Cadastrar Gerente");
            System.out.println("2. Cadastrar Programador");
            System.out.println("3. Cadastrar Analista de Dados");
            System.out.println("0. Sair");

            opcao = Integer.parseInt(l1.entDados("Escolha uma opção: "));

            switch (opcao) {
                case 1: {
                    // Instanciação
                    Gerente ger = new Gerente();
                    EntImpGer(ger,l1);
                    break;
                }

                case 2: {
                    // Instanciação
                    Programador pro = new Programador();
                    EntImpPro(pro,l1);
                    break;
                }

                case 3: {
                    // Instanciação
                    AnalistaDeDados ald = new AnalistaDeDados();
                    EntImpAld(ald,l1);
                    break;
                }

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    public static void EntImpGer(Gerente ger, Leitura l1){
        // Captura dos dados do Gerente
        ger.setNome(l1.entDados("Nome do Gerente: "));
        ger.setCpf(l1.entDados("CPF do Gerente (somente dígitos): "));
        ger.setSalario(Double.parseDouble(l1.entDados("Salário do Gerente: ")));
        ger.setDepartamento(l1.entDados("Departamento: "));
        ger.setTipoGerencia(l1.entDados("Tipo de Gerência (ex: Projetos, Pessoas, Financeiro): "));

        //Tratamento de Exception para Quatidade de Equipes Gerenciadas
        try{
            ger.setQtdEquipesGerenc(Integer.parseInt(l1.entDados("Digite a quatidade de equipes gerenciadas: ")));
        }
        
        catch(QtdEquipesInvException eie){
            eie.impErroEqInv();
            ger = eie.corrGerenteEquipes(ger);
        }
        
        catch(NumberFormatException nfe){
            System.out.println("\nO Valor deve ser um inteiro");
        }

        finally{
            System.out.println("\nQuatidade de equipes gerenciadas : "+ ger.getQtdEquipesGerenc());
        }
        

        // Confirmação
        System.out.println("\n--- Gerente cadastrado com sucesso! ---");
        System.out.println("Nome: " + ger.getNome());
        System.out.println("CPF: " + ger.getCpf());
        System.out.println("Salário: R$ " + ger.getSalario());
        System.out.println("Departamento: " + ger.getDepartamento());
        System.out.println("Tipo de Gerência: " + ger.getTipoGerencia());
        System.out.println("Quantidade de Equipes Gerenciadas: " + ger.getQtdEquipesGerenc());
        System.out.println("\nResumo do cargo:");
        ger.gerarDescricaoCargo();
        System.out.println("\nCálculo do bônus:");
        ger.calcBonus(); // Método da interface
    }

    public static void EntImpPro(Programador pro, Leitura l1){
        // Captura dos dados do Programador
        pro.setNome(l1.entDados("Nome do Programador: "));
        pro.setCpf(l1.entDados("CPF do Programador (somente dígitos): "));
        pro.setSalario(Double.parseDouble(l1.entDados("Salário do Programador: ")));
        pro.setLinguagemP(l1.entDados("Linguagem Principal: "));
        try {
            pro.setNivelSen(l1.entDados("Nível de Senioridade (Junior, Pleno ou Senior): "));
        } catch (NivelSenioridadeInvException nsie) {
            nsie.impErroNivelInv();
            pro = nsie.corrNivelProgramador(pro);
        }

        System.out.println("\n--- Programador cadastrado com sucesso! ---");
        System.out.println("Nome: " + pro.getNome());
        System.out.println("CPF: " + pro.getCpf());
        System.out.println("Salário: R$ " + pro.getSalario());
        System.out.println("Linguagem Principal: " + pro.getLinguagemP());
        System.out.println("Nível: " + pro.getNivelSen());
        System.out.println("\nResumo do cargo:");
        pro.gerarDescricaoCargo(); // Método abstrato sobrescrito
    }

    public static void EntImpAld(AnalistaDeDados ald, Leitura l1){
        // Captura dos dados do Analista de Dados
        ald.setNome(l1.entDados("Nome do Analista de Dados: "));
        ald.setCpf(l1.entDados("CPF do Analista (somente dígitos): "));
        ald.setSalario(Double.parseDouble(l1.entDados("Salário do Analista: ")));
        ald.setFerramenta(l1.entDados("Ferramenta Principal (ex: Excel, Power BI): "));
        ald.setQtdRelatorios(Integer.parseInt(l1.entDados("Qtd. de Relatórios Gerados: ")));

        // Confirmação
        System.out.println("\n--- Analista de Dados cadastrado com sucesso! ---");
        System.out.println("Nome: " + ald.getNome());
        System.out.println("CPF: " + ald.getCpf());
        System.out.println("Salário: R$ " + ald.getSalario());
        System.out.println("Ferramenta: " + ald.getFerramenta());
        System.out.println("Qtd. Relatórios: " + ald.getQtdRelatorios());
        System.out.println("\nResumo do cargo:");
        ald.gerarDescricaoCargo();
        System.out.println("\nCálculo do bônus:");
        ald.calcBonus(); // Método da interface
    }
}

