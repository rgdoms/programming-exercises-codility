
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class OddOcurrences {
    public int solution(int[] A) {
        Set<Integer> a = new HashSet<Integer>();
        for (int i = 0; i< A.length; i++) {
            if (a.contains(A[i])) {
                a.remove(A[i]);
            } else
                a.add(A[i]);

        }
        return a.iterator().next();
    }

    public static void main(String ... args) {
        System.out.println(new OddOcurrences().solution(new int[]{9,3,9,3,9,7,9}));

    }
