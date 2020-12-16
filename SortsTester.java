import java.util.*;
public class SortsTester{
  public static void main(String [] args){
    //bubbleSort
    //test1
    System.out.println("Bubble Sort Testing:");
    int[] a=new int[6];
    Random rng = new Random(1);
    for(int i = 0; i < 6; i++ ){
      a[i]=rng.nextInt() % 10;
    }
    System.out.println(toString(a));
    Sorts.bubbleSort(a);
    System.out.println(toString(a));

    System.out.println();
    //test 2
    int[] b= new int[20];
    rng = new Random(2);
    for(int i = 0; i < 20; i++ ){
      b[i]=rng.nextInt() % 100;
    }
    System.out.println(toString(b));
    Sorts.bubbleSort(b);
    System.out.println(toString(b));

    System.out.println();
    //test3
    int[] c= new int[15];
    rng = new Random(2);
    for(int i = 0; i < 15; i++ ){
      c[i]=rng.nextInt() % 1000;
    }
    System.out.println(toString(c));
    Sorts.bubbleSort(c);
    System.out.println(toString(c));
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
