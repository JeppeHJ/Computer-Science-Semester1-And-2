package Opgaver.Opgave3;

import Opgaver.Opgave3.Skole;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class SkoleTest {
    private Skole skole;

    @BeforeEach
    void setUp() {
        // Arrange
        this.skole = new Skole("Barrit");
        ArrayList<Integer> karakterer = new ArrayList<>();
        karakterer.add(1);
        karakterer.add(2);
        karakterer.add(3);
        karakterer.add(4);
        Studerende s1 = new Studerende(1, "Anders", karakterer);
        Studerende s2 = new Studerende(2, "Anders2", karakterer);
        Studerende s3 = new Studerende(3, "Anders3", karakterer);
        Studerende s4 = new Studerende(4, "Anders4", karakterer);
        skole.addStuderende(s1);
        skole.addStuderende(s2);
        skole.addStuderende(s3);
        skole.addStuderende(s4);
    }

    // Tester tilføjelse af en studerende til skolen
    @Test
    void addStuderende() {
        // Arrange
        ArrayList<Integer> karakterer = new ArrayList<>();
        Studerende s5 = new Studerende(5, "Anders5", karakterer);

        // Act
        skole.addStuderende(s5);

        // Assert
        assertEquals(5, skole.getStuderendeList().size());
    }

    // Tester fjernelse af en studerende fra skolen
    @Test
    void removeStuderende() {
        // Arrange
        Studerende s1 = skole.findStuderende(1);

        // Act
        skole.removeStuderende(s1);

        // Assert
        assertEquals(3, skole.getStuderendeList().size());
    }

    // Tester beregning af gennemsnittet for karakterer på skolen
    @Test
    void gennemsnit() {
        // Arrange
        double forventetGennemsnit = 2.5;  // Gennemsnittet af karaktererne 1, 2, 3, 4

        // Act
        double faktiskGennemsnit = skole.gennemsnit();

        // Assert
        assertEquals(forventetGennemsnit, faktiskGennemsnit, 0.01);
    }

    // Tester søgning efter en specifik studerende
    @Test
    void findStuderende() {
        // Arrange

        // Act
        Studerende s1 = skole.findStuderende(1);

        // Assert
        assertNotNull(s1);
        assertEquals("Anders", s1.getNavn());
    }

    // Tester konvertering af skoleobjekt til en streng
    @Test
    void testToString() {
        // Arrange

        // Act
        String resultat = skole.toString();

        // Assert
        assertEquals("Skole{navn='Barrit'}", resultat);
    }
}
