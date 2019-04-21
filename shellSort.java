public class shellSort{
    public static void main(String[] args){
        
        int[] a = {20, 35, -15, 7, 55, 1, -22};
        
        for(int gap = a.length / 2; gap > 0; gap /= 2){
            
            for(int i = gap; i < a.length; i++){
                int newElement = a[i];
                int j = i;
                
                while(j >= gap && a[j - gap] > newElement){
                    a[j] = a[j - gap];
                    j -= gap;
                }
                a[j] = newElement;
            }
        }
        
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}