import java.util.*;
public class SortsTester{
  public static void main(String [] args){
    //bubbleSort
    //test1
    // System.out.println("Bubble Sort Testing:");
    // int[] a=new int[6];
    // Random rng = new Random(1);
    // for(int i = 0; i < 6; i++ ){
    //   a[i]=rng.nextInt() % 10;
    // }
    // System.out.println(toString(a)); Sorts.bubbleSort(a); System.out.println(toString(a));
    //
    // System.out.println();
    // //test 2
    // int[] b= new int[20];
    // rng = new Random(2);
    // for(int i = 0; i < 20; i++ ){
    //   b[i]=rng.nextInt() % 100;
    // }
    // System.out.println(toString(b)); Sorts.bubbleSort(b); System.out.println(toString(b));
    //
    // System.out.println();
    // //test3
    // int[] c= new int[15];
    // rng = new Random(3);
    // for(int i = 0; i < 15; i++ ){
    //   c[i]=rng.nextInt() % 1000;
    // }
    // System.out.println(toString(c)); Sorts.bubbleSort(c);System.out.println(toString(c));



  //   //selectionSort testing
  //   System.out.println("Selection Sort Testing:");
  //   int[] d=new int[6];
  //   Random rng = new Random(1);
  //   for(int i = 0; i < 6; i++ ){
  //     d[i]=rng.nextInt() % 10;
  //   }
  //   System.out.println(toString(d)); Sorts.selectionSort(d);System.out.println(toString(d));
  //
  //   System.out.println();
  //   //test 2
  //   int[] e= new int[20];
  //   rng = new Random(2);
  //   for(int i = 0; i < 20; i++ ){
  //     e[i]=rng.nextInt() % 100;
  //   }
  //   System.out.println(toString(e)); Sorts.selectionSort(e); System.out.println(toString(e));
  //
  //   System.out.println();
  //   //test3
  //   int[] f= new int[15];
  //   rng = new Random(3);
  //   for(int i = 0; i < 15; i++ ){
  //     f[i]=rng.nextInt() % 1000;
  //   }
  //   System.out.println(toString(f)); Sorts.selectionSort(f); System.out.println(toString(f));
  // }

  // //insertionSort testing
  // System.out.println("Insertion Sort Testing:");
  // int[] g=new int[6];
  // Random rng = new Random(1);
  // for(int i = 0; i < 6; i++ ){
  //   g[i]=rng.nextInt() % 10;
  // }
  // System.out.println(toString(g)); Sorts.insertionSort(g);System.out.println(toString(g));
  //
  // System.out.println();
  // //test 2
  // int[] h= new int[20];
  // rng = new Random(2);
  // for(int i = 0; i < 20; i++ ){
  //   h[i]=rng.nextInt() % 100;
  // }
  // System.out.println(toString(h)); Sorts.insertionSort(h); System.out.println(toString(h));
  //
  // System.out.println();
  // //test3
  // int[] j= new int[15];
  // rng = new Random(3);
  // for(int i = 0; i < 15; i++ ){
  //   j[i]=rng.nextInt() % 1000;
  // }
  // System.out.println(toString(j)); Sorts.insertionSort(j); System.out.println(toString(j));

  //Already Sorted
  System.out.println();
  System.out.println("Already Sorted Tests:");
  int[] sorted1 = new int[5];
  for(int i=0; i<5; i++) {
    sorted1[i]=i+1;
  }
  Sorts.bubbleSort(sorted1);
  System.out.println(toString(sorted1));

  System.out.println();
  int[] sorted2= new int[15];
  Random rng = new Random(1);
  rng = new Random(20);
  for(int i = 0; i < 15; i++ ){
    sorted2[i]=rng.nextInt() % 1000;
  }
  Arrays.sort(sorted2);
  Sorts.selectionSort(sorted2);
  System.out.println(toString(sorted2));

  System.out.println();
  int[] sorted3= new int[10];
  rng = new Random(100);
  for(int i = 0; i < 10; i++ ){
    sorted3[i]=rng.nextInt() % 1000;
  }
  Arrays.sort(sorted3);
  Sorts.insertionSort(sorted3);
  System.out.println(toString(sorted3));


  }
  public static String toString(int[] data) {
    if (data.length==0) return "[]";
    String str="[";
    for (int i=0; i<data.length-1; i++) {
      str+=data[i]+", ";
    }
    str+=data[data.length-1]+"]";
    return str;
  }
}
