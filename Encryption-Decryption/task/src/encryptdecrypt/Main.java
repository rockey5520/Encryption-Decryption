package encryptdecrypt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  //stage 3
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String mode = scanner.nextLine();
    String input = scanner.nextLine();
    int pointer = scanner.nextInt();
    switch (mode) {
      case "enc":
        enc(input, pointer);
        break;
      case "dec":
        dec(input, pointer);
        break;
    }
  }

  public static void enc(String text, int key) {
    String encryptedString = "";

    char[] textCharArray = text.toCharArray();

    for (char ch : textCharArray) {
      encryptedString += (char) (ch + key);
    }

    System.out.println(encryptedString);
  }

  public static void dec(String text, int key) {
    String decryptedString = "";

    char[] textCharArray = text.toCharArray();

    for (char ch : textCharArray) {
      decryptedString += (char) (ch - key);
    }

    System.out.println(decryptedString);
  }
}

//stage 2
    /*List<Character> characters = "abcdefghijklmnopqrstuvwxyz".chars().mapToObj(x -> (char) x)
        .collect(Collectors.toList());
    Scanner scanner = new Scanner(System.in);
    String[] input = scanner.nextLine().split(" ");
    List<String> output = new ArrayList<>();
    int pointer = scanner.nextInt()-1;
    for (String s: input
    ) {
      char[] chars = s.toCharArray();
      List<Character> characterList = new ArrayList<>();
      for (Character character: chars
      ) {
        int i = characters.indexOf(character);
        if(i+pointer > 25){
          characterList.add(characters.get((i+pointer)-25));
        }else{
          characterList.add(characters.get((i+pointer)+1));
        }
      }
      StringBuilder stringBuilder = new StringBuilder();
      for (Character character: characterList
      ) {
        stringBuilder.append(character);
      }
      output.add(stringBuilder.toString());
    }
    StringJoiner stringJoiner = new StringJoiner(" ");
    for (String s: output
    ) {
      stringJoiner.add(s);
    }
    System.out.println(stringJoiner);
*/


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

