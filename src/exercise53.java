/**
 * Created by Praktika on 11.11.2016.
 */
public class exercise53 {

    public static void main(String[] args) {
        nLines(4);
    }
    public static void nLines(int n) {
    if (n == 0) {
        System.out.println("blastoff");
    } else {
        System.out.println(n);
        nLines(n - 1);
    }
    }
}
