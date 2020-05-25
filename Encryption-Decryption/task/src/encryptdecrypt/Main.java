package encryptdecrypt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    //stage 2

    



    /*//stage 1
    String word = "we found a treasure!";
    ArrayList<Character> straight = IntStream.rangeClosed('a', 'z').mapToObj(c -> (char) c)
        .collect(Collectors.toCollection(ArrayList::new));
    ArrayList<Character> reverse = (ArrayList<Character>) straight.clone();
    Collections.reverse(reverse);

    String[] s = word.split(" ");
    List<String> finalStrings = new ArrayList<>();
    for (String s1 : s
    ) {
      char[] chars = s1.toCharArray();
      List<Character> charsReversed = new ArrayList<>();
      for (Character character: chars
      ) {
          if(character != '!'){
            int indexofCharacterinStriaght = straight.indexOf(character);
            charsReversed.add(reverse.get(indexofCharacterinStriaght));
          }else{
            charsReversed.add('!');
          }
      }
      finalStrings.add(charsReversed.stream().map(x->x.toString()).collect(Collectors.joining()));
    }
    String encoded = finalStrings.stream().map(Object::toString).collect(Collectors.joining(" "))
        .toString();

    System.out.println(encoded);*/
  }
}
