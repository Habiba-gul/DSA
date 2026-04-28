class TwoStacks {
    int[] arr;
    int top1, top2;
    int size;

    public TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    public void push1(int x) {
        if (top1 + 1 == top2) {
            System.out.println("Stack 1 Overflow");
            return;
        }
        top1++;
        arr[top1] = x;
    }

    public void push2(int x) {
        if (top1 + 1 == top2) {
            System.out.println("Stack 2 Overflow");
            return;
        }
        top2--;
        arr[top2] = x;
    }

    public int pop1() {
        if (top1 == -1) {
            System.out.println("Stack 1 Underflow");
            return -1;
        }
        return arr[top1--];
    }

    public int pop2() {
        if (top2 == size) {
            System.out.println("Stack 2 Underflow");
            return -1;
        }
        return arr[top2++];
    }

    public void display1() {
        for (int i = 0; i <= top1; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public void display2() {
        for (int i = top2; i < size; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
}
public class TwoStacksMain {
    public static void main(String[] args) {

        TwoStacks ts = new TwoStacks(10);

      ts.push1(11);
        ts.push1(40);
        ts.push1(30);
//stack2
        ts.push2(167);
        ts.push2(222);
        ts.push2(260);

        ts.display1();
          ts.display2();
        System.out.println("Pop Stack 1: " + ts.pop1());
        System.out.println("Pop Stack 2: " + ts.pop2());

        ts.display2();
    }
}