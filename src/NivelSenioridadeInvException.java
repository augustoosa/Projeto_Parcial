// Augusto da Silva de Sá - RA: 2564319
public class NivelSenioridadeInvException extends Exception {

    Leitura l = Leitura.geraLeitura();

    // Mensagem de erro personalizada
    public void impErroNivelInv() {
        System.out.println("\nErro: Nível de senioridade inválido. Só são aceitos: Junior, Pleno ou Senior.");
    }

    // Método para corrigir o erro recursivamente
    public Programador corrNivelProgramador(Programador pro) {
        try {
            String novoNivel = l.entDados("Digite o nível correto (Junior, Pleno ou Senior): ");
            pro.setNivelSen(novoNivel);
        } 
        catch (NivelSenioridadeInvException nsie) {
            impErroNivelInv();
            pro = corrNivelProgramador(pro);
        }
        return pro;
    }
}
