import org.jacop.core.BoundDomain;
import org.jacop.core.IntDomain;
import org.jacop.core.IntVar;
import org.jacop.core.Store;

public class PizzaMaster {
    public static void main(String[] args) {
        long T1, T2, T;
        int n = 4;
        int[] price = new int[] {10, 5, 20, 15};
        int m = 2;
        int[] buy = new int[] {1,2};
        int[] free = new int[] {1,1};

        T1 = System.currentTimeMillis();
        letsDeal(n, price, m, buy, free);
        T2 = System.currentTimeMillis();
        T = T2 - T1;
        System.out.println("\n\t*** Execution time = " + T + " ms");
    }

    private static void letsDeal(int n, int[] price, int m, int[] buy, int[] free) {
        Store store = new Store();
        IntVar[] p = new IntVar[n];
        for(int i = 0; i < n; i++){
            p[i] = new IntVar(store, "p"+i, price[i],price[i]);
        }
        System.out.print(p[0].value());
    }
}
