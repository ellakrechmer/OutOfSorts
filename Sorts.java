public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int n=data.length;
    int swapped=1;
    while (swapped!=0){
      swapped=0;
      for (int i=0; i<n-1; i++){
        if (data[i]>data[i+1]){
          int first=data[i];
          int second=data[i+1];
          data[i]=second;
          data[i+1]=first;
          swapped+=1;
        }
      }
      n--;
    }
  }
}
