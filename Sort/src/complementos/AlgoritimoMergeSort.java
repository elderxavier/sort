/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementos;


public class AlgoritimoMergeSort {
    private  int interations = 0;
    
    public  int[] sort(int[] array) {
    
        if (array.length <= 1) {
            return array;
        }
        int meio = array.length / 2;

        int[] dir = new int[meio] ;

        if(array.length % 2 != 0){
             dir = new int[meio+1];
        }    
        //int[] dir = array.length % 2 == 0 ? new int[meio] : new int[meio + 1];
        int[] esq = new int[meio];

        int[] aux = new int[array.length];

        for (int i = 0; i < meio; i++) {
            esq[i] = array[i];
        }

        int auxIndex = 0;
        for (int i = meio; i < array.length; i++) {
            dir[auxIndex] = array[i];
            auxIndex++;
        }

        esq = sort(esq);
        dir = sort(dir);
        aux = mergesort(esq, dir);

        return aux;
    }
 
    private  int[] mergesort(int[] esq, int[] dir) {
        int[] aux = new int[esq.length + dir.length];

        int indexDir = 0; 
        int indexEsq = 0;
        int indexAux = 0;

        while (indexEsq < esq.length || indexDir < dir.length) {
            if (indexEsq < esq.length && indexDir < dir.length) {
                if (esq[indexEsq] <= dir[indexDir]) {
                    aux[indexAux] = esq[indexEsq];
                    indexAux++;
                    indexEsq++;
                    this.interations++;
                } else {
                    aux[indexAux] = dir[indexDir];
                    indexAux++;
                    indexDir++;
                    this.interations++;
                }
            } else if (indexEsq < esq.length) {
                aux[indexAux] = esq[indexEsq];
                indexAux++;
                indexEsq++;
                this.interations++;
            } else if (indexDir < dir.length) {
                aux[indexAux] = dir[indexDir];
                indexAux++;
                indexDir++;
                this.interations++;
            }
        }
        return aux;
    }
    
    public int getIntetions(){
        return this.interations;
    }
    
}
