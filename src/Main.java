import java.util.*;

public class Main {

    public static void main(String[] args) {
        String [] words = new String[]{"mama", "papa", "tort", "zaza", "no"};
        solver(words);
    }

    public static void solver(String [] words){

        List<String> helpList = new ArrayList<>();

        for(String word: words){

            char[] chars = word.toCharArray();

            Map<Character, Integer> helpMap = new HashMap<>();

            for(Character character: chars) {
                if (helpMap.containsKey(character)) {
                    Integer value = helpMap.get(character) + 1;
                    helpMap.put(character, value);
                } else {
                    helpMap.put(character, 1);
                }
            }
                boolean isRightWord = true;

                    for (Character key : helpMap.keySet()) {
                        if (helpMap.get(key) % 2 != 0) {
                            isRightWord = false;

                        }
                    }

                if (isRightWord) {
                    helpList.add(word);
                }
            }

            Set<Character> mySet = new HashSet<>();

            for (String word: helpList) {
                for (Character character : word.toCharArray()) {
                    mySet.add(character);
                }

            }

            System.out.println(mySet);
    }
}
