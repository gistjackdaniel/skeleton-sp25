import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        
        Map<Character, Integer> map = new TreeMap<>();
        int value = 1;
        for (char c = 'a'; c <= 'z'; c++){
            map.put(c, value++);
        }
        return map;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        if (nums.isEmpty()) {
            return new HashMap<>();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.size(); i++){
            int square = nums.get(i) * nums.get(i);
            map.put(nums.get(i), square);
        }

        return map;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        if (words.isEmpty()) {
            return new HashMap<>();
        }

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.size(); i++ ){
            String word = words.get(i);
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        return map;
    }

    public static void main(String[] args){

        //case 1
        System.out.println(letterToNum());
        
        //case 2
        List<Integer> L = List.of(1, 2, 3, 4, 5, 6);
        squares(L).forEach((key, val) -> System.out.println(key + " to " + val));
        
        //case 3
        List<String> words = List.of("I", "belive", "myself" ,"but" ,"sometimes" ,"I", "kill", "myself");
        System.out.println(countWords(words));

    }



}
