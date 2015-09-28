
package complementos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Escrevetxt {
    
    private String file;
    FileWriter arq;
    
    public Escrevetxt(String arquivo){
        this.file = arquivo;    
    }
    
    public void exec() throws IOException{
        
        try {
            arq = arq = new FileWriter(this.file);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(Escrevetxt.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter gravarArq = new PrintWriter(arq); 
        gravarArq.println("+--Resultado--+"); 
        for (int i =0 ; i<=10; i++) { 
            gravarArq.println( i );
         }
        arq.close();    
    }
    
    
    
}
