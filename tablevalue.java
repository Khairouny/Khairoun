
/**
 * Write a description of class tablevalue here.
 *
 * @author (Bita/6/22/019/tz)
 * @version (QUESTION 3(I))
 */
public class tablevalue
{
   public static void main(String[] args) {
        int N = 1;
        System.out.println("N\t10*N\t100*N\t1000*N");
        while (N <= 5) {
            int tenN = 10 * N;
            int hundredN = 100 * N;
            int thousandN = 1000 * N;
            System.out.println(N + "\t" + tenN + "\t" + hundredN + "\t" + thousandN);
            N++;
        }
    }
}
