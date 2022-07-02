import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;

class MainTest {
    public static Main m;
    public static final Logger log = LoggerFactory.getLogger(MainTest.class);
    @BeforeEach
    void init(){
        m = new Main();
    }
    @Test
    void testBubbleSort(){
        int[] nums = new int[]{2,4,5,1};
        int[] result = m.bubbleSort(nums);
        int[] resullExam = m.bubbleSortExam(nums);
        log.info(Arrays.toString(nums));
        log.info(Arrays.toString(result));
        log.info(Arrays.toString(resullExam));
        Assert.assertEquals(Arrays.toString(result), Arrays.toString(resullExam));
    }

    @Test
    void tesQuickSort(){
        int[] nums = new int[]{10,9,8,7,6,5,4,3,2,1};
        int[] result = m.quickSort(nums);
        int[] resullExam = m.quickSortExam(nums);
        log.info(Arrays.toString(nums));
        log.info(Arrays.toString(result));
        log.info(Arrays.toString(resullExam));
        Assert.assertEquals(Arrays.toString(result), Arrays.toString(resullExam));
    }

}