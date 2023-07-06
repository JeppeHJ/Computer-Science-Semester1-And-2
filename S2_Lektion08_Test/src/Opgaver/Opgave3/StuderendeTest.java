package Opgaver.Opgave3;

import Opgaver.Opgave3.Studerende;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class StuderendeTest {
    private Studerende student;

    @BeforeEach
    void setUp() {
        // Arrange
        ArrayList<Integer> karakterer = new ArrayList<>();
        this.student = new Studerende(1, "Anders", karakterer);
    }

    // Tester tilføjelse af karakter til en studerende
    @Test
    void addKarakter() {
        // Arrange

        // Act
        student.addKarakter(10);
        student.addKarakter(10);

        // Assert
        assertEquals(2, student.getKarakterer().size());
    }

    // Tester hentning af studienummer for en studerende
    @Test
    void testGetStudieNr() {
        // Arrange

        // Act
        int studieNr = student.getStudieNr();

        // Assert
        assertEquals(1, studieNr);
    }

    // Tester hentning af navn for en studerende
    @Test
    void testGetNavn() {
        // Arrange

        // Act
        String navn = student.getNavn();

        // Assert
        assertEquals("Anders", navn);
    }

    // Tester ændring af navn for en studerende
    @Test
    void testSetNavn() {
        // Arrange

        // Act
        student.setNavn("Nyt navn");

        // Assert
        assertEquals("Nyt navn", student.getNavn());
    }

    // Tester konvertering af studerendeobjekt til en streng
    @Test
    void testToString() {
        // Arrange

        // Act
        String resultat = student.toString();

        // Assert
        assertEquals("Studerende{studieNr=1, navn='Anders', karakterer=[]}", resultat);
    }
}
