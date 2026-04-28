import java.util.Scanner;
class Merge_Array {
     int[] A1, A2, merge;

    public Merge_Array(int[] A1, int[] A2) {
        this.A1 = A1;
        this.A2 = A2;
        merge = new int[A1.length + A2.length];
    }
    public void Merge() {
        int i = 0;
        for (int x : A1) merge[i++] = x;
        for (int x : A2) merge[i++] = x;
    }
    public void display() {
        System.out.print("Merged Array: ");
        for (int x : merge) System.out.print(x + " ");
        System.out.println();
    }
}
public class question4 {
     public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4, 5};
        int[] A2 = {6, 7, 8, 9, 10};
        Merge_Array am = new Merge_Array(A1, A2);
        am.Merge();
        am.display();
    }
}
