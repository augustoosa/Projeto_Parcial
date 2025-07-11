// Augusto da Silva de Sá - RA: 2564319
public class QtdEquipesInvException extends Exception {

    Leitura l = Leitura.geraLeitura();

    public void impErroEqInv() {
        System.out.println("\nErro: Quantidade de equipes gerenciadas não pode ser menor ou igual a zero.");
    }

    public Gerente corrGerenteEquipes(Gerente ger) {
        try {
            ger.setQtdEquipesGerenc(Integer.parseInt(l.entDados("Digite a nova quantidade de equipes gerenciadas: ")));
        } catch (QtdEquipesInvException eie) {
            impErroEqInv();
            ger = corrGerenteEquipes(ger);
        } catch (NumberFormatException nfe) {
            System.out.println("Valor inválido. Deve ser um número inteiro.");
            ger = corrGerenteEquipes(ger);
        }
        return ger;
    }
}

