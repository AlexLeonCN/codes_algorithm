package leet_codes.main_bank;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class LeetCodes0034Test {
    @Test
    void searchRange() {
        LeetCodes0034 leetCodes = new LeetCodes0034();
        int[] result = leetCodes.searchRange(new int[]{5,7,7,8,8,10}, 8);
        String resultString = "[";
        for (int it : result) {
            resultString += it + ",";
        }
        resultString = resultString.substring(0,resultString.length() -1 ) + "]";
        Assert.assertEquals("[3,4]",resultString);
    }
    @Test
    void test_searchRange2(){
        LeetCodes0034 leetCodes = new LeetCodes0034();
        int[] result = leetCodes.searchRange2(new int[]{5,7,7,8,8,10}, 8);
        String resultString = "[";
        for (int it : result) {
            resultString += it + ",";
        }
        resultString = resultString.substring(0,resultString.length() -1 ) + "]";
        Assert.assertEquals("[3,4]",resultString);
    }
}