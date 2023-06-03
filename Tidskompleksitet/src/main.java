import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Methods opgave1 = new Methods();
        // n * log(n)

        int testArr[] = {5,10,5,6,4,9,8};

        System.out.println(Arrays.toString(opgave1.prefixAverage(testArr)));
        Nedboer nedboer = new Nedboer();
        System.out.println(nedboer.bedsteTreFerieUger());

        System.out.println(nedboer.bedsteFerieUgerStart(3));

    }
}
