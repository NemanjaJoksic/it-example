package org.joksin.itexample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SimpleIT {

    @Test
    void test() {
        System.out.println("Simple Integration Test ...");
    }

}
