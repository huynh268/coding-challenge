package String;

/**
 * Created by Tien on 3/30/2018.
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * Write a function to find the longest common prefix string amongst an array of strings.

 If there is no common prefix, return an empty string "".

 Example 1:
 Input: ["flower","flow","flight"]
 Output: "fl"

 Example 2:
 Input: ["dog","racecar","car"]
 Output: ""
 Explanation: There is no common prefix among the input strings.

 Note:
 All given inputs are in lowercase letters a-z.


 */
public class LongestCommonPrefix14 {

    /**
     * O(sum length of words) Time complexity
     * O(1) Space complexity
     * @param strs
     * @return
     */
    public String longestCommonPrefix1(String[] strs) {
        if(strs.length == 0) return "";

        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.length() == 0) return "";
            }
        }

        return prefix;
    }

    /**
     * O(sum length of words) Time complexity
     * O(1) Space complexity
     * @param strs
     * @return
     */
    public String longestCommonPrefix2(String[] strs) {
        if(strs.length == 0) return "";

        for(int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for(int j = 1; j  < strs.length; j++) {
                if(i == strs[j].length() || c != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
}
