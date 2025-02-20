import java.util.HashSet;
import java.util.Set;

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set = new HashSet<>();

        for(String x : nums) {
            set.add(x);
        }
        String res = "";

        int n = nums[0].length();
        for(long i = 0; i < (long) Math.pow(2, 17); i++) {
            String str = Long.toBinaryString(i);
            while(str.length() != n) {
                str = "0" + str;
            }
            if(!set.contains(str)) {
                res = str;
                break;
            }
        }


        return res;
    }
}