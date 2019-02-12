public class Alphabet {

    public static void main(String[] args) {

        char c = 'd';
        
        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + "  alphabet."
                : c + "  not an alphabet.";
        
        System.out.println(output);
    }
}