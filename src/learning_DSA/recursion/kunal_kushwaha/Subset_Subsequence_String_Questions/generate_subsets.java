package learning_DSA.recursion.kunal_kushwaha.Subset_Subsequence_String_Questions;

public class generate_subsets {
    public static void main(String[] args) {
        String sequence = "ab";
        String sub_sequence = "";

        // Start the recursion with an empty processed string (sub_sequence)
        // and the full unprocessed string (sequence)
        subset(sub_sequence, sequence);
    }

    // Function to print all subsets/subsequences
    // sub_sequence (p): The string we are building (processed)
    // sequence (up): The string remaining to be checked (unprocessed)
    private static void subset(String sub_sequence, String sequence) {

        // --- BASE CASE ---
        // If the unprocessed string is empty, we have made a decision for every character.
        // We print the result accumulated in 'sub_sequence' and stop this branch.
        if (sequence.isEmpty()) {
            System.out.println(sub_sequence);
            return;
        }

        // Get the first character of the remaining string to make a decision on it
        char current_char = sequence.charAt(0);

        // --- RECURSIVE CALL 1: TAKE IT ---
        // We decide to INCLUDE the current character in our result.
        // Note: 'current_char + sub_sequence' adds the new char to the START of the string.
        subset(sub_sequence + current_char, sequence.substring(1));

        // --- RECURSIVE CALL 2: IGNORE IT ---
        // We decide NOT to include the current character.
        // We keep 'sub_sequence' as is and move to the rest of the string.
        subset(sub_sequence, sequence.substring(1));
    }
}