package practice;
public class ProjectEular7 {

    static int N = 10001;

    private static boolean isOddPrime(long x) {

        for ( int i = 3 ; i*i <= x ; i+=2 ) {
            if ( x % i == 0 ) {
                return false;
            }               
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        long start = System.nanoTime();
        int x;
        int i = 2;      // 3 is the 2nd prime number
        for ( x = 3 ; ; x+=2 ) {
            if ( isOddPrime(x) ) {              
                if ( i == N )
                    break;
                i++;
            }
        }
        System.out.println(x);

        long stop = System.nanoTime();
        System.out.println("Time: " + (stop - start) / 1000000 + " ms");
    }
}