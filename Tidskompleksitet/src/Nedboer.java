public class Nedboer {
    private int[] nedboerPrUge = {20, 10, 12, 12, 13, 14, 15, 10, 8, 7, 13,
            15, 10, 9, 6, 8, 12, 22, 14, 16, 16, 18, 23, 12, 0, 2, 0, 0, 78, 0,
            0, 0, 34, 12, 34, 23, 23, 12, 44, 23, 12, 34, 22, 22, 22, 22, 18,
            19, 21, 32, 24, 13};

    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i de tre uger
     *
     * @return
     */

    public int bedsteTreFerieUger() {
        // TODO return -1 kun indsat så der ikke er compile fejl
        int currentMin = Integer.MAX_VALUE;
        int bedsteUge = 0;


        for (int i = 0; i < nedboerPrUge.length - 2; i++) {
            int sumNedBør = 0;
            sumNedBør += nedboerPrUge[i] + nedboerPrUge[i + 1] + nedboerPrUge[i + 2];

            if (sumNedBør < currentMin) {
                currentMin = sumNedBør;
                bedsteUge = i+1;
            }
        }

        return bedsteUge;
    }

    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i det "antal" uger, der er
     * angivet i paramtereren
     *
     * @return
     */

    public int bedsteFerieUgerStart(int antal) {
        int curentMin = Integer.MAX_VALUE;
        int bedsteugeTal = 0;

        for (int i = 0; i < nedboerPrUge.length - antal; i++) {
            int sumNedboer = 0;

            for (int j = 0; j < antal; j++) {
                sumNedboer += nedboerPrUge[i + j];
            }
            if (sumNedboer < curentMin) {
                curentMin = sumNedboer;
                bedsteugeTal = i+1;
            }

        }
        return bedsteugeTal;
    }

    /**
     * Returnerer ugenummeret på den første uge hvor nedbøren har været præcis
     * den samme flest uger i træk
     *
     * @return
     */
    public int ensNedboer() {
        int indexMax = -1;
        int curmax = Integer.MIN_VALUE;
        int counter = 0;

        for (int i = 1; i < nedboerPrUge.length; i++) {
            if (nedboerPrUge[i-1] == nedboerPrUge[i]) {
                counter++;
            }

        }
        // TODO return -1 kun indsat så der ikke er compile fejl
        return -1;
    }
}
