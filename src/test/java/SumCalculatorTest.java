import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SumCalculatorTest {
    SumCalculator calculator;

    @BeforeEach
    void BeforeEach() {
        calculator = new SumCalculator();
    }


    @Test
    void testThatSumWorksCorrectOnOne() {
        int expected = 1;
        int actual = calculator.sum(1);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testThatSumWorksCorrectOnThree() {
        int expected = 6;
        int actual = calculator.sum(3);
        Assertions.assertEquals(expected, actual);
    }
@Test
    void testOnIllegalArgument(){

        IllegalArgumentException illegalArgumentException = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            int actual = calculator.sum(0);
        });
}




}