import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        //String x = "aabbabaaa";
        testTotalCount(x);
    }

    public static void testTotalCount(String x){
        //System.out.println(x + ",");
        char[] vowels = {'a','e','i','o','u','y'};
        char y;
        int counterVowel = 0;
        int counterConsonant = 0;
        int totalCount = 0;
        for (int i=0;i<x.length();i++){
            y = x.charAt(i);
            if (isVowel(y)){
                counterVowel += 1;
                if (i<x.length()-1){
                    if (isVowel(x.charAt(i+1))){
                    }
                    else {
                        if (counterVowel>2){
                            totalCount += (counterVowel-1)/2;
                        }
                    }
                }
                else {
                    if (counterVowel>2){
                        totalCount += (counterVowel-1)/2;
                    }
                }
                counterConsonant = 0;

            }
            else {
                counterConsonant += 1;
                if (i<x.length()-1){
                    if (!isVowel(x.charAt(i+1))){
                    }
                    else {
                        if (counterConsonant>2){
                            totalCount += (counterConsonant-1)/2;
                        }
                    }
                }
                else {
                    if (counterConsonant>2){
                        totalCount += (counterConsonant-1)/2;
                    }
                }
                counterVowel = 0;
            }

        }
        System.out.println(totalCount );
    }
    public static boolean isVowel(char y){
        return ((y=='a'||y=='e'||y=='i'||y=='o'||y=='u'||y=='y') ? true:false);

    }

}