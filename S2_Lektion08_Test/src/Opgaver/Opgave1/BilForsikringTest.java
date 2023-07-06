package Opgaver.Opgave1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest {
    private BilForsikring bf;

    @BeforeEach
    void setUp() {
        // Arrange
        bf = new BilForsikring();
    }

    // Tester Exception kastet, hvis præmie == 0
    @Test
    void beregnPraemieUdenGrundPræmie() {
        // Arrange
        BilForsikring forsikring = new BilForsikring();
        int alder = 25;
        boolean isKvinde = true;
        int skadeFrieaer = 5;

        // Act and Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            forsikring.beregnPraemie(alder, isKvinde, skadeFrieaer);
        });

        String expectedMessage = "GrundPraemie har ikke faeet en vaerdi";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    // Tester exception kastet ved alder under 18
    @Test
    void beregnPraemieAlderUnder18() {
        // Arrange
        BilForsikring forsikring = new BilForsikring();
        int alder = 15;
        boolean isKvinde = true;
        int skadeFrieaer = 5;
        forsikring.setGrundpaemie(1000);

        // Act and assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            forsikring.beregnPraemie(alder, isKvinde, skadeFrieaer);
        });

        String actualMessage = exception.getMessage();
        System.out.println(actualMessage);
        String expectedMessage = "Du er for ung til at tegne en forsikring";
        assertTrue(actualMessage.contains(expectedMessage));
    }

    // Tester exception kastet ved alder minus skadeFrieaer under 18
    @Test
    void beregnPraemieAlderMinusFriaarUnder18() {
        // Arrange
        BilForsikring forsikring = new BilForsikring();
        int alder = 19;
        boolean isKvinde = true;
        int skadeFrieaer = 5;
        forsikring.setGrundpaemie(1000);

        // Act and assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            forsikring.beregnPraemie(alder, isKvinde, skadeFrieaer);
        });

        String actualMessage = exception.getMessage();
        String expectedMessage = "Du kan ikke have kaert skadefri saelaenge";
        assertTrue(actualMessage.contains(expectedMessage));
    }

    // Tester exception kastet ved skadeFrieaer under 0
    @Test
    void beregnPraemieFriaarUnder0() {
        // Arrange
        BilForsikring forsikring = new BilForsikring();
        int alder = 19;
        boolean isKvinde = true;
        int skadeFrieaer = -1;
        forsikring.setGrundpaemie(1000);

        // Act and assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            forsikring.beregnPraemie(alder, isKvinde, skadeFrieaer);
        });

        String actualMessage = exception.getMessage();
        String expectedMessage = "Antal skade frie aer skal vaere positiv";
        assertTrue(actualMessage.contains(expectedMessage));
    }

    // Tester beregning af præmie for personer under 25 år
    @Test
    void beregnPraemieUnder25() {
        // Arrange
        BilForsikring forsikring = new BilForsikring();
        int alder = 23;
        boolean isKvinde = false;
        int skadeFrieaer = 0;
        forsikring.setGrundpaemie(100);

        // Act
        double result = forsikring.beregnPraemie(alder, isKvinde, skadeFrieaer);

        // Assert
        assertEquals(125, result);
    }

    // Tester beregning af præmie for kvinder
    @Test
    void beregnPraemieForKvinde() {
        // Arrange
        BilForsikring forsikring = new BilForsikring();
        int alder = 26;
        boolean isKvinde = true;
        int skadeFrieaer = 0;
        forsikring.setGrundpaemie(100);

        // Act
        double result = forsikring.beregnPraemie(alder, isKvinde, skadeFrieaer);

        // Assert
        assertEquals(95, result);
    }

    // Tester beregning af præmie med skadeFrieaer mindre end tre
    @Test
    void beregnPraemie_WithSkadeFrieAarLessThanThree_ReturnsGrundPraemie() {
        // Arrange
        BilForsikring forsikring = new BilForsikring();
        forsikring.setGrundpaemie(1000);
        int alder = 25;
        boolean isKvinde = false;
        int skadeFrieaer = 2;

        // Act
        double result = forsikring.beregnPraemie(alder, isKvinde, skadeFrieaer);

        // Assert
        assertEquals(1000, result);
    }

    // Tester beregning af præmie med skadeFrieaer mellem tre og fem
    @Test
    void beregnPraemie_WithSkadeFrieAarBetweenThreeAndFive_ReturnsEightyFivePercentOfGrundPraemie() {
        // Arrange
        BilForsikring forsikring = new BilForsikring();
        forsikring.setGrundpaemie(1000);
        int alder = 25;
        boolean isKvinde = false;
        int skadeFrieaer = 4;

        // Act
        double result = forsikring.beregnPraemie(alder, isKvinde, skadeFrieaer);

        // Assert
        assertEquals(850, result);
    }

    // Tester beregning af præmie med skadeFrieaer mellem seks og otte
    @Test
    void beregnPraemie_WithSkadeFrieAarBetweenSixAndEight_ReturnsSeventyFivePercentOfGrundPraemie() {
        // Arrange
        BilForsikring forsikring = new BilForsikring();
        forsikring.setGrundpaemie(1000);
        int alder = 25;
        boolean isKvinde = false;
        int skadeFrieaer = 7;

        // Act
        double result = forsikring.beregnPraemie(alder, isKvinde, skadeFrieaer);

        // Assert
        assertEquals(750, result);
    }

    // Tester beregning af præmie med skadeFrieaer større end otte
    @Test
    void beregnPraemie_WithSkadeFrieAarGreaterThanEight_ReturnsSixtyFivePercentOfGrundPraemie() {
        // Arrange
        BilForsikring forsikring = new BilForsikring();
        forsikring.setGrundpaemie(1000);
        int alder = 30;
        boolean isKvinde = false;
        int skadeFrieaer = 9;

        // Act
        double result = forsikring.beregnPraemie(alder, isKvinde, skadeFrieaer);

        // Assert
        assertEquals(650, result);
    }
}
