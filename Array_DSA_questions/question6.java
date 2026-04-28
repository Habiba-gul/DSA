class Bubble_sort {
    private int[] arr;

    public Bubble_sort(int[] arr) {
        this.arr = arr;
    }
    public void sort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j]= arr[j + 1];
                    arr[j + 1] = temp;
                } 
            }
         } }
    public void display() {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
public class question6 {
    public static void main(String[] args) {
        int[] data = {64, 12, 45, 3, 99, 27, 81, 50, 7, 33};
        Bubble_sort bs = new Bubble_sort(data);
        System.out.print("Before sort: "); bs.display();
        bs.sort();
        System.out.print("After sort:  "); bs.display();
    }
}
