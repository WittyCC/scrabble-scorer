import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Scrabble {





  public Integer calculateScore (String word) {

    String pattern= "^[a-zA-Z0-9]*$";
    if (!word.matches(pattern)) {
      return -1;
    }

    String lcWord = word.toLowerCase();

    HashMap<Integer,String> scrabbleHash = new HashMap<Integer, String>();
    scrabbleHash.put(1, "aeioulnrst");
    scrabbleHash.put(2, "dg");
    scrabbleHash.put(3, "bcmp");
    scrabbleHash.put(4, "fhvwy");
    scrabbleHash.put(5, "k");
    scrabbleHash.put(8, "jx");
    scrabbleHash.put(10, "qz");

    int scoreTotal = 0;


    // String meValue = "";
    // String stringMeKey = "";
    for (char c : lcWord.toCharArray()) {
      boolean isMatch = false;
      Set scrabbleSet = scrabbleHash.entrySet();
      Iterator scrabbleIt = scrabbleSet.iterator();

      while (!isMatch) {

        String meValue = "";
        String stringMeKey = "";

        Map.Entry me = (Map.Entry)scrabbleIt.next();
        meValue += me.getValue(); //will give string
        stringMeKey += me.getKey();
        int intScore = Integer.parseInt(stringMeKey);
        if (meValue.contains(Character.toString(c))) {
          scoreTotal += intScore;
          isMatch = true;
        }
      }
    }
    return scoreTotal;
  }
}
