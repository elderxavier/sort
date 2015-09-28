
package complementos;


public class AlgoritimoQuicksort {
    private int array[];
    private int length;
    private long interations = 0;
    
    public void AlgoritimoQuicksort(){
    }
    //public void sort(int[] inputArr) {
    
    
    public int[] sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return inputArr;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
        return array;
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
        
         
        int i = lowerIndex;
        int j = higherIndex;        
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];        
        while (i <= j) {            
            while (array[i] < pivot) {
                i++;
                
            }
            while (array[j] > pivot) {
                j--;                
            }
            if (i <= j) {
                organizeNumbers(i, j);                                
                i++;
                j--;
            }
        }        
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void organizeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        this.interations ++;
    }

    public long getInterations() {
        return interations;
    }

    public void setInterations(long interations) {
        this.interations = interations;
    }
    
    
}
