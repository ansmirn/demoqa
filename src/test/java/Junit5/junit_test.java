package Junit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class junit_test {
    @BeforeEach
    void beforeEach (){
        System.out.println("Before");
    }
    @AfterEach
    void afterEach (){
        System.out.println("After test");
    }
    @Test
    void test(){
        System.out.println("   Test");
    }

}
