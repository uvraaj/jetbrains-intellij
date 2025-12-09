package learning_DSA.recursion.kunal_kushwaha.Subset_Subsequence_String_Questions;

public class remove_character {
    public static void main(String[] args) {
        String str = "bcaccda";
        char character_to_remove = 'a';
        int starting_index = 0;
        System.out.println(remove_CHARACTER(str, character_to_remove, starting_index));
        System.out.println(remove_CHAR_ALT(str, character_to_remove));
    }

    private static String remove_CHARACTER(String str, char character_to_remove, int current_index) {

        //base case
        if(current_index == str.length()) {
            return "";
        }

        char current_character = str.charAt(current_index);
        String result_of_rest = remove_CHARACTER(str, character_to_remove, current_index + 1);

        if (current_character == character_to_remove) { return result_of_rest; }
        else { return current_character + result_of_rest; }
    }
    private static String remove_CHAR_ALT(String str, char character_to_remove){
        //base case
        if (str.isEmpty()) { return ""; }

        char current_char = str.charAt(0);

        if (current_char == character_to_remove) {
            return remove_CHAR_ALT(str.substring(1), character_to_remove);
        }
        else {
            return current_char + remove_CHAR_ALT(str.substring(1), character_to_remove);
        }
    }
}
