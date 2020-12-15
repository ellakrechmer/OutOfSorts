import java.util.*;
public class SortsTester{
  public static void main(String [] args){
    //bubbleSort
    System.out.println("Bubble Sort Testing:");
    int[] a=new int[6];
    Random rng = new Random(100);//seed of 100 is stored.
    for(int i = 0; i < 6; i++ ){
      a[i]=rng.nextInt() % 10;
    }
    System.out.println(toString(a));
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
