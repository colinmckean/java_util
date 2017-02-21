import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class HashMapExample {

  private static HashMap<String, Integer> cards;

  public static void main(String[] args) {

    cards = new HashMap<>();
    cards.put("TWO", 2);
    cards.put("THREE", 3);
    cards.put("JACK", 10);
    cards.put("KING", 10);
    cards.put("JOKER", 100);

    Iterator<Map.Entry<String, Integer>> iterator = cards.entrySet().iterator();

      while (iterator.hasNext()) {
          Map.Entry<String, Integer> hashEntry = iterator.next();
          if(hashEntry.getKey() == "JOKER"){
            iterator.remove();
        }
    }

    for(Map.Entry<String, Integer> hashEntry : cards.entrySet()){
      System.out.println("CARD (key):  " + hashEntry.getKey() + " has the VALUE of: " + hashEntry.getValue());
    }
  }


}