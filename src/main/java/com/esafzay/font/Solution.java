package com.esafzay.font;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        char asterisk = '*';
        // String result = Solution.pixelate("it works", asterisk);
        String result = Solution.pixelateEfficient("it works!", asterisk);
        System.out.println(result);
    }

    public static String pixelateEfficient(String text, char fill) {

        StringBuilder output = new StringBuilder();

        for (int row = 0; row < 5; row++) {

            for (int i = 0; i < text.length(); i++) {

                char ch = text.charAt(i);

                List<String> charPixels;

                if (ch == ' ') {
                    charPixels = Font.map.get("space");

                } else {
                    charPixels = Font.map.get(String.valueOf(ch).toUpperCase());
                }

                if (charPixels != null) {

                    String rowCharPixels = charPixels.get(row);

                    for (int j = 0; j < rowCharPixels.length(); j++) {

                        if (rowCharPixels.charAt(j) == '1') {
                            output.append(fill);

                        } else {
                            output.append(' ');
                        }
                    }
                    output.append(' ');
                }
            }
            output.append('\n');
        }

        return output.toString();
    }

    /**
     * Convert given text to pixel font.
     *
     * Example:
     *
     * char unicodeX = '\u0058';
     * pixelate("hello", unicodeX);
     *
     * X  X XXXX X   X    XX
     * X  X X    X   X   X  X
     * XXXX XXX  X   X   X  X
     * X  X X    X   X   X  X
     * X  X XXXX XXX XXX  XX
     *
     *
     * pixelate("h", unicodeX);
     *
     * H: ["1001","1001","1111","1001","1001"]
     * ["X  X", "X  X", "XXXX", "X  X", "X  X"]
     *
     * stacked together:
     * X  X
     * X  X
     * XXXX
     * X  X
     * X  X
     *
     * @param  string text String to convert to pixel font.
     * @param  char   fill Character to use for each pixel.
     * @return string      Converted string, with line breaks.
     */
    public static String pixelate(String text, char fill) {

        List<List<String>> stringCharacters = new ArrayList<>(text.length());

        List<String> spacePattern = Font.map.get("space");

        for (int i = 0; i < text.length(); i++) {
            String chStr = String.valueOf(text.charAt(i)).toUpperCase();

            if (chStr.equalsIgnoreCase(" ")) {
                chStr = "space";
            }

            List<String> pattern = Font.map.get(chStr);

            if (pattern != null) {
                stringCharacters.add(pattern);
                stringCharacters.add(spacePattern);
            }
        }

        StringBuilder output = new StringBuilder();

        String fillStr = String.valueOf(fill);

        for (int row = 0; row < 5; row++) {

            for (int i = 0; i < stringCharacters.size(); i++) {
                List<String> charPattern = stringCharacters.get(i);
                String pixel = charPattern.get(row);

                for (int j = 0; j < pixel.length(); j++) {

                    String pixelStr = String.valueOf(pixel.charAt(j));

                    if (pixelStr.equalsIgnoreCase("1")) {
                        output.append(fillStr);

                    } else {
                        output.append(" ");
                    }
                }
            }
            output.append("\n");
        }

        return output.toString();
    }
}
