
import java.util.Scanner;


public class question1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];

        System.out.println("enter 10 number:");
        int max = arr[0], min = arr[0];
         
        for (int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();

        if (arr[i] > max) {max = arr[i];}

        if (arr[i] < min) {min = arr[i];}
        
         }

        System.out.println("Largest: " + max);

        System.out.println("Smallest: " + min);

    }
}
