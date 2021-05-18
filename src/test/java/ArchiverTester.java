import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ArchiverTester {
    @Test
    public void test_ResetTest() {
        //arrange
        String testString;
        Archiver a = new Archiver();
        //act
        testString = a.getString();
        //assert
        Assertions.assertEquals("hello world", testString);






    }
}