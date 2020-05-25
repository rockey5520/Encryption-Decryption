import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = input.split(" ");
        String word = s[0];
        int split = Integer.parseInt(s[1]);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(input.substring(split,input.length()-1));
        stringBuilder.append(input.substring(0,split));

        System.out.println(stringBuilder.toString().replace(" ",""));


    }
}