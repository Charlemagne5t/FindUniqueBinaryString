import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void findDifferentBinaryStringTest1(){
        String[] nums = {"01", "10"};
        List<String> expected = List.of( "11", "00");
        String actual = new Solution().findDifferentBinaryString(nums);

        Assert.assertTrue(expected.contains(actual));
    }
}
