package Sorting;
public class BubbleSort {
  /**
   * bubbleSort        sorts an array of integers using bubble sort
   * 
   * @param unsortedArray    an unsorted array of integers
   * @return          the input array, sorted least to greatest
   */
  public static int[] bubbleSort(int[] unsortedArray) {
    for(int i=1; i < array.length; i++) {
        for (int j=0; j < (array.length - i); j++) {
          if (array[j] > array[j+1]) {
            int tmp = array[j];
            array[j] = array[j+1];
            array[j+1] = tmp;
          }
        }
      }
      
      return array;
  }
}
