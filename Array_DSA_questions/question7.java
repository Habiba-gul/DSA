class Duplicate_Element_Finder{
     int[] arr;

    public Duplicate_Element_Finder(int[] arr) {
        this.arr = arr;
    }
    public void find_Duplicates(){
        System.out.print("Duplicate elements in arr: ");
        boolean found = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                  
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (arr[k] == arr[i])
                            
                        { alreadyPrinted = true; break; }
                    }
                    if (!alreadyPrinted) {
                        System.out.print(arr[i] + " ");
                        found = true;
                    }
                    break;
                } } }
                 if (!found) System.out.print("None");
                      System.out.println();
            }}

public class question7 {
    public static void main(String[] args) {
        int[] data = {3, 7, 1, 7, 9, 3, 5, 1, 8};
        Duplicate_Element_Finder df = new Duplicate_Element_Finder(data);
        df.find_Duplicates(); 
    }
}
