package complementos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;


public class Lertxt {
    
    public int[] converteInt(String patch) throws FileNotFoundException, IOException{
        /*Contar quantidade de linhas*/
        File arquivoLeitura = new File(patch);  
        LineNumberReader linhaLeitura = new LineNumberReader(new FileReader(arquivoLeitura));  
        linhaLeitura.skip(arquivoLeitura.length());  
        int qtdLinha = linhaLeitura.getLineNumber();  
        /*tamnho do vetor*/
        int retorna[] = new int[qtdLinha];
        int i=0;
        
        /*converte o arquivo de texto e retorna um vetor em int*/
        FileInputStream stream = new FileInputStream(patch);
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        while(linha != null) {           
            int passa = Integer.parseInt(linha);
            if(passa > 0 || passa == 0 || passa <0){
                retorna[i] = passa;
            }        
            linha = br.readLine();        
            i++;
        }
        return retorna;
    }
    
}
