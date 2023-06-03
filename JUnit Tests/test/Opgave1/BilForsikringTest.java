package Opgave1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest {

    @Test
    void beregnPraemie_25år_Kvinde_0år() {

    // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        int alder = 25;
        boolean isKvinde = true;
        int skadeFrieaer = 0;

    // Act
        bilForsikring.setGrundpraemie(1000);
       double forventetForsikring = bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaer);

    // Assert
        double actual = (950);
        assertEquals(forventetForsikring, actual);

    }

    @Test
    void beregnPraemie_18år_Kvinde_0år() {
        //Arrange
        BilForsikring bilForsikring = new BilForsikring();
        int alder = 18;
        boolean isKvinde = true;
        int skadeFrieaer = 3;
        bilForsikring.setGrundpraemie(1000);

        // Act
        double forventetForsikring = bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaer);

        //Assert
        double actual = (950);
        assertEquals(forventetForsikring,actual);
    }


}