import java.util.Scanner;

class Linear_Search {
    int[] arr;

    public Linear_Search(int[] arr) {
        this.arr = arr;
    }
    public int Search(int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
public class question5 {
    public static void main(String[] args) {
        int[] data = {10, 25, 33, 47, 56, 62, 78, 85};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        Linear_Search linearsearch = new Linear_Search(data);
        int position = linearsearch.Search(target);

        if (position != -1)
            System.out.println("num found at index: " + position);
        else
            System.out.println(" not found.");
    }
}
