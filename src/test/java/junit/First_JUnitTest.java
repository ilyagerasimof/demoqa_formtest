package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class First_JUnitTest {

    @Test
    void firstTest(){
        //System.out.println("Yell");
        Assertions.assertTrue(3>2);
    }


}
