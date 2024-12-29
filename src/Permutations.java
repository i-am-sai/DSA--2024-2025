import java.util.ArrayList;
import java.util.List;

public class Permutations {

        // Function to generate all permutations of a number
        public static List<String> generatePermutations(String number) {
            List<String> permutations = new ArrayList<>();
            permutations.add(String.valueOf(number.charAt(0))); // Start with the first digit

            // Iterate through each digit in the number (starting from the second one)
            for (int i = 1; i < number.length(); i++) {
                char currentDigit = number.charAt(i);
                List<String> newPermutations = new ArrayList<>();

                // Generate new permutations by placing the current digit in all positions
                for (String perm : permutations) {
                    for (int j = 0; j <= perm.length(); j++) {
                        String newPerm = perm.substring(0, j) + currentDigit + perm.substring(j);
                        newPermutations.add(newPerm);
                    }
                }

                // Replace old permutations with new ones
                permutations = newPermutations;
            }

            return permutations;
        }

        public static void main(String[] args) {
            int inputNumber = 123; // Example input
            String number = String.valueOf(inputNumber);

            List<String> permutations = generatePermutations(number);

            System.out.println("Permutations of " + inputNumber + ":");
            for (String perm : permutations) {
                System.out.println(perm);
            }
        }
    }


