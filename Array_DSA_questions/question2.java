import java.util.Random;;
public class question2{
    public static void main(String[] args) {
        int arr[]=new int[8];
        Random rr=new Random();
        
        System.out.println("random numbers for array:");
        for (int i=0;i<=arr.length-1;i++){
            System.out.println(i+"th value is:");
            arr[i]=rr.nextInt(100)+1;
            System.out.print(arr[i]);
            System.out.println();
        }
             System.out.println("reverse array");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
            System.out.println();
        }


    }
}


