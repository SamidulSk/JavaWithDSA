import java.util.Arrays;

public class AnagramChecker {
    
    public static boolean isAnagram(String s1, String s2) {
        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }
        
        // Create arrays to count frequency of each character (assuming lowercase English letters)
        int[] count = new int[26];
        
        // Count frequency of characters in string s1
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }
        
        // Subtract frequency of characters in string s2
        for (char c : s2.toCharArray()) {
            count[c - 'a']--;
        }
        
        // Check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1, s2));
        
        s1 = "hello";
        s2 = "bello";
        System.out.println(isAnagram(s1, s2));
    }
}
