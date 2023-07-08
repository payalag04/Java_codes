
import java.util.*;
public class anagram1 {
    public static void main(String[] args){
        String[] strs = {"eat","tea", "tab", "ate", "nat", "bat"};
        List<List<String>> result = anagram(strs);

        for(List<String> group : result){
            System.out.println(group);
        }
    }

    public static List<List<String>> anagram(String[] strs) {
        Map<String, List<String>> anagram_map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            if(!anagram_map.containsKey(sortedString)) { 
                anagram_map.put(sortedString, new ArrayList<>());

            }
            anagram_map.get(sortedString).add(s);

        }
        for(List<String> value : anagram_map.values()){
            result.add(value);
        }
        return result;
    }
}
