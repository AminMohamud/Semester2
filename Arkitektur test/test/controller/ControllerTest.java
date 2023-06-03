package controller;
import org.junit.jupiter.api.Test;
import ordination.*;
import storage.Storage;
import storage.StorageInterface;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ControllerTest {

    private StorageInterface mockedStorage;

    @Test
    void antalOrdinationerPrVægtLægemiddel() {
        //Arrange
        ArrayList<Patient> patienter = new ArrayList<>();
        StorageInterface storageMock = mock(StorageInterface.class);
        when(storageMock.getAllPatienter())
        Controller controller = Controller.getController(storageMock);
        double vægtStart = 10.0;
        double vægtSlut = 20.0;
        Laegemiddel laegemiddel = new Laegemiddel("Bent",1.0,1.0,10,"kg");
        
        //Act
        int faktiskAntal = controller.antalOrdinationerPrVægtPrLægemiddel(vægtStart,vægtSlut, laegemiddel);
        int forventetAntal = 10;


        //Assert
        assertEquals(forventetAntal,faktiskAntal);

    }



}
