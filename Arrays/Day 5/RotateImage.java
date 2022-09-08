package LINKEDIN;

public class GetDistinctHighestLexicographString {

    public static String getString(String input_str){
        String ans = "";

        int[] alphabets = new int[26];
        int position = 0;

        // MARK THE ALPHABETS TO FREQUENCY TABLE
        for(int i = 0; i < input_str.length() ; i++){

            position = input_str.charAt(i) - 'a';

            if( alphabets[position] == 0 ){
                alphabets[position] = 1;
            }

        }

        // TRAVERSE REVERSE AND GET CHARACTERS
        for(int i = 25; i >= 0; i--){

            char ch = (char) ( i + 'a');

            if( alphabets[i] == 1 ){
                ans = ans + Character.toString(ch);
            }

        }

        return ans;
    }

    public static void main(String[] args) {

        String str = "abacaba";

        System.out.println(getString(str));

    }

}
