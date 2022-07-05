package leet_codes.main_bank;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodes1029Test {
    public static final Logger log = LoggerFactory.getLogger(LeetCodes1029Test.class);
    public static LeetCodes1029 leetCode;
    @BeforeEach
    void setUp(){
        leetCode = new LeetCodes1029();
    }
    @Test
    void testTwoCitySchedCost(){
        //costs = [[259,770],[448,54],[926,667],[184,139],[840,118],[577,469]]
        int[][] costs = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        int sum = leetCode.twoCitySchedCost(costs);
        log.info(""+sum);
        Assert.assertEquals(1859,sum);
    }
}