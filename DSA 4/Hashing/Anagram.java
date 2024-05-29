import java.util.*;

public class Anagram {
    public static boolean isAnangram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1); 
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.get(ch) != null){ // charecter present
                if(map.get(ch)==1){ // if frequency is 1 then remove
                    map.remove(ch);
                }
                else{
                    map.put(ch, map.get(ch)-1); // decrease frequency
                }
            }
            else{  // charecter not present in s
                return false;
            }
        }
        return map.isEmpty(); // if isEmpty true-> true

    }

    public static void main(String[] args) {
        String s = "race";
        String t = "care";
        System.out.println(isAnangram(s, t));
    }
}
