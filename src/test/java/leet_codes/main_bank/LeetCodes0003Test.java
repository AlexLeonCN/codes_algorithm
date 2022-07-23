package leet_codes.main_bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodes0003Test {
    private  static final Logger log = LoggerFactory.getLogger(LeetCodes0003.class);
    LeetCodes0003 leetCodes;
    @BeforeEach
    void setUp(){
        leetCodes = new LeetCodes0003();
    }
    @Test
    void test(){
        String s = " ";
        int length = leetCodes.lengthOfLongestSubstring(s);
        log.info(""+length);
    }
    @Test
    void testSb(){
        StringBuilder sb = new StringBuilder("abc");
        sb = new StringBuilder(sb.substring(1,3));
        log.info(sb.toString());
    }
}