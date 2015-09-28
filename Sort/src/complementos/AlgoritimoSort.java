
package complementos;

public class AlgoritimoSort {    
    private long interations = 0;            
    public int[] sort(int[] inputArr){
        int retorna[] = inputArr;
        for(int i = 0; i < retorna.length; i++){            
            for(int j = 0; j < retorna.length; j++){
                if(retorna[j] > retorna[i] ){
                    int aux = retorna[i];
                    retorna[i] = retorna[j];
                    retorna[j] = aux;
                    this.interations ++;
                }
            }           
           
        }
        return retorna;        
    }   
    
    public long getInterations(){
        return this.interations;
    }
}
