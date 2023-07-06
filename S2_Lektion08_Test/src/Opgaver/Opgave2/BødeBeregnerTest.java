package Opgaver.Opgave2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class BødeBeregnerTest {

    /**
     * Tests the calculation of a fine with a one-week delay for an adult.
     * The fine amount should be increased by twenty.
     */
    @Test
    void beregnBøde_WithOneWeekDelayForAdult_ReturnsIncreasedFineByTwenty() {
        // Arrange
        BødeBeregner beregner = new BødeBeregner();
        beregner.setBøde(100);
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = beregnetDato.plus(7, ChronoUnit.DAYS);
        boolean voksen = true;

        // Act
        int result = beregner.beregnBøde(beregnetDato, faktiskDato, voksen);

        // Assert
        assertEquals(120, result);
    }

    /**
     * Tests the calculation of a fine with a one-week delay for a child.
     * The fine amount should be increased by ten.
     */
    @Test
    void beregnBøde_WithOneWeekDelayForChild_ReturnsIncreasedFineByTen() {
        // Arrange
        BødeBeregner beregner = new BødeBeregner();
        beregner.setBøde(100);
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = beregnetDato.plus(7, ChronoUnit.DAYS);
        boolean voksen = false;

        // Act
        int result = beregner.beregnBøde(beregnetDato, faktiskDato, voksen);

        // Assert
        assertEquals(110, result);
    }

    /**
     * Tests the calculation of a fine with a two-week delay for an adult.
     * The fine amount should be increased by sixty.
     */
    @Test
    void beregnBøde_WithTwoWeeksDelayForAdult_ReturnsIncreasedFineBySixty() {
        // Arrange
        BødeBeregner beregner = new BødeBeregner();
        beregner.setBøde(100);
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = beregnetDato.plus(14, ChronoUnit.DAYS);
        boolean voksen = true;

        // Act
        int result = beregner.beregnBøde(beregnetDato, faktiskDato, voksen);

        // Assert
        assertEquals(160, result);
    }

    /**
     * Tests the calculation of a fine with a two-week delay for a child.
     * The fine amount should be increased by thirty.
     */
    @Test
    void beregnBøde_WithTwoWeeksDelayForChild_ReturnsIncreasedFineByThirty() {
        // Arrange
        BødeBeregner beregner = new BødeBeregner();
        beregner.setBøde(100);
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = beregnetDato.plus(14, ChronoUnit.DAYS);
        boolean voksen = false;

        // Act
        int result = beregner.beregnBøde(beregnetDato, faktiskDato, voksen);

        // Assert
        assertEquals(130, result);
    }

    /**
     * Tests the calculation of a fine with a delay of more than two weeks for an adult.
     * The fine amount should be increased by ninety.
     */
    @Test
    void beregnBøde_WithMoreThanTwoWeeksDelayForAdult_ReturnsIncreasedFineByNinety() {
        // Arrange
        BødeBeregner beregner = new BødeBeregner();
        beregner.setBøde(100);
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = beregnetDato.plus(15, ChronoUnit.DAYS);
        boolean voksen = true;

        // Act
        int result = beregner.beregnBøde(beregnetDato, faktiskDato, voksen);

        // Assert
        assertEquals(190, result);
    }

    /**
     * Tests the calculation of a fine with a delay of more than two weeks for a child.
     * The fine amount should be increased by forty-five.
     */
    @Test
    void beregnBøde_WithMoreThanTwoWeeksDelayForChild_ReturnsIncreasedFineByFourtyFive() {
        // Arrange
        BødeBeregner beregner = new BødeBeregner();
        beregner.setBøde(100);
        LocalDate beregnetDato = LocalDate.now();
        LocalDate faktiskDato = beregnetDato.plus(15, ChronoUnit.DAYS);
        boolean voksen = false;

        // Act
        int result = beregner.beregnBøde(beregnetDato, faktiskDato, voksen);

        // Assert
        assertEquals(145, result);
    }
}
