package dev.kuyReverseWords;

public class Kata {

    public static String main (final String original) {
        if (original.length() == 0) {
            return "";
        }
        String example = original;
        String[] str = example.split("\\s+");
        final int len = str.length;
        String output = "";
        String pre_output = "";
        int x = 0;

        for (byte i=0; i<len; i++){
            int word_len = str[i].length();
            String[] word = str[i].split("");
            for (int j=word_len; j!=0; j--) {
                pre_output += word[j-1];
            }
        }
        String[] _output = new String[pre_output.length()];
        _output = pre_output.split("");
        for(String n : example.split("")) {
            if (Character.isWhitespace(n.charAt(0))) {
                output += " ";
            } else {
                System.out.println(n);
                output += _output[x++];
            }
        }

        System.out.println(output);
        return output;
    }

}
