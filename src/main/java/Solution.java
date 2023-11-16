import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        Set<Integer> intNumbers = new HashSet<>();
        for (String num: nums) {
            intNumbers.add(Integer.parseInt(num, 2));
        }
        int  i = 0;
        while (i < 65537){
            if(!intNumbers.contains(i)){
                String result =  Integer.toBinaryString(i);
                StringBuilder stringBuilder = new StringBuilder(result);
                while (stringBuilder.length() != n){
                    stringBuilder.insert(0, 0);
                }
                return stringBuilder.toString();
            }
            i++;
        }
        return null;
    }
}
