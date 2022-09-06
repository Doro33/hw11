package q1;

import java.util.*;

public class Q1 {
    private static HashMap<String, TreeSet<String>> permutations = new HashMap<>();

    private static String sortString(String inputString) {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }

    private static HashMap<String, TreeSet<String>> setNewKeyValues(String input) {
        String newKey = sortString(input);
        if(!permutations.containsKey(newKey))
            permutations.put(newKey,Permutation.getPermutation(input));
        return permutations;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true){
            System.out.println("----------");
            System.out.println("0) exit.");
            System.out.print("please enter the word you want to permute: ");
            input=scanner.nextLine();
            if (input.matches("0"))
                System.exit(0);
            if (permutations.containsKey(sortString(input)))
                System.out.println("this key value was made already.");
            else System.out.println(setNewKeyValues(input));
            System.out.println("Done.");
            System.out.println("Press Enter To Continue");
            try {
                System.in.read();
            } catch (Exception ignored) {
            }
        }
    }
}