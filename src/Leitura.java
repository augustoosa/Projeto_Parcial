// Augusto da Silva de Sá - RA: 2564319
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// PADRÃO SINGLETON
public class Leitura {

    private static Leitura LeiUnic; //passo1: Geracao de objeto statico
    public static int contador = 0;

    //construtor privado
    private Leitura(){} //passo 2

    //método que garante que só possa ser criado 1 objeto (do tipo leitura) na memória
    public static Leitura geraLeitura(){ 
        //se o objeto nunca foi instanciado entra no if
        if(LeiUnic==null){
            //aqui ele é instanciado
            LeiUnic=new Leitura();
        }

        //se ele ja foi criado, ele nao é criado de novo
        else{
            contador++;
        }
        return LeiUnic;
    }

    public String entDados(String rotulo){

        System.out.println(rotulo);

        InputStreamReader tec = new InputStreamReader(System.in);
        BufferedReader bufTec = new BufferedReader(tec);
        String ret = "";
        try {
            ret= bufTec.readLine();
        } catch (IOException ioe) {
            System.out.println("ERRO");
        }

        return ret;
    }
    
}
