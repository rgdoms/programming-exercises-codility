/**
 * Created by rgdoms on 07/09/2016.
 */
public class TapeEquilibrium {

    public int solution(int[] A) {
        int minDif = Integer.MAX_VALUE;
        int sumSup = 0;
        int sumInf = 0;
        for (int i = 0; i < A.length; i++)
            sumSup += A[i];
        for (int p = 1; p < A.length; p++) {
            sumInf += A[p - 1];
            sumSup -= A[p - 1];
            int actdif = Math.abs(sumInf - sumSup);
            if (actdif < minDif) {
                minDif = actdif;
            }
        }
        return minDif;
    }

    public static void main(String ...a) {
        System.out.println(new TapeEquilibrium().solution(new int[]{3,1,2,4,3}));
    }
}
