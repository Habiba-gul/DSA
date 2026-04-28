import java.util.Scanner;

class even_odd_count {
     int[] arr = new int[15];

    public even_odd_count() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public void display() {
        int even = 0, odd = 0;
       for (int i = 0; i < arr.length; i++) {
         if (arr[i] % 2 == 0) {
            even++;
        } else {
              odd++;
        }
    }
        System.out.println("Even count: " + even);
        System.out.println("Odd  count: " + odd);
    }
}

public class question3 {
     public static void main(String[] args) {
        even_odd_count c = new even_odd_count();
        c.display();
    }
}
