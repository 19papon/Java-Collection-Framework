import java.util.*;

public class KthSmallest {
    public static int findKthSmallest(ArrayList<Integer> list, int k) {
        Collections.sort(list);
        return list.get(k - 1); // k is 1-based
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 2, 1, 6, 8));
        int k = 3;
        System.out.println("Kth smallest: " + findKthSmallest(list, k));
    }
}
