package leet_codes.main_bank;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MainTest {
     Logger log = LoggerFactory.getLogger(MainTest.class);
    @Test
    void test1(){

        int a = 3%3;
        log.info(""+a);
    }
    @Test
    void test2(){

        int a = 3 & 0;
        log.info(""+a);
    }
    @Test
    void test3(){
        int[] num = new int[]{1,1,1,5};
        int a = num[0];
        for (int i = 1; i < num.length; i++) {
            a ^= num[i];
        }
        log.info(""+a);
    }
}
