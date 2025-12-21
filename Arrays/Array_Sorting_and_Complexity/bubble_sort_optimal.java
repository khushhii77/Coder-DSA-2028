// Bubble Sort - Optimized
// Time: Best O(n), Worst O(n^2)
// Space: O(1)

class BubbleSortOptimal {
    static void sort(int[] arr) {
          boolean swapped;
            for(int i=0;i<arr.length;i++){
                  swapped=false;
                for(int j=1;j<arr.length-i;j++){
                    if(arr[j]<arr[j-1]){
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                          swapped=true;
                    }
                }
             if(!swapped){
                break;
             }
            }
    }
}
