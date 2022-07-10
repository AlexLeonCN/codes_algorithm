package leet_codes.main_bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodes0223Test {
    private static  final Logger log = LoggerFactory.getLogger(LeetCodes0223Test.class);
    private LeetCodes0223 leetCodes;
    @BeforeEach
    void setUp(){
        leetCodes = new LeetCodes0223();
    }
    @Test
    void testMathAbs(){
        int abs = Math.abs(-123);
        log.info(""+abs);
    }
    @Test
    void testSort(){
//        int[] arr = new int[]{-3,5,1,10};
//        leetCodes.sort(arr);
//        for (int item : arr) {
//            log.info("" + item);
//        }
    }
    @Test
    void testCoputeArea(){
        //ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2


        int a = leetCodes.computeArea(-3,0,3,4,0,-1,9,2);
        log.info(""+a);
    }
}