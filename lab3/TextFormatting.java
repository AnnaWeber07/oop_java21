package annachiriciuc;

import java.util.*;

public class TextFormatting {
    private int sentences;
    private int words;
    private int letters;
    private int consonants;
    private int vowels;
    private String longestWord;
    private String source;
    private String topFive[];
    private int topFiveFrequent[];

    public TextFormatting() {
        this.source = "\0";
        this.topFive = new String[5];
        this.topFiveFrequent = new int[5];
    }

    public TextFormatting(String _source) {
        source = _source;
        this.topFive = new String[5];
        this.topFiveFrequent = new int[5];
        this.analyze();
    }

    public void setSource(String _source) {
        this.source = _source;
        this.analyze();
    }

    public void printData() {
        if (source.equals("\0"))
            System.out.print("Source string is empty\n");

        else {
            System.out.print("Sentences: " + sentences + '\n' +
                    "Words: " + words + '\n' +
                    "Letters: " + letters + '\n' +
                    "Consonants: " + consonants + '\n' +
                    "Vowels: " + vowels + '\n' +
                    "Longest word: " + longestWord + "\n\n" +
                    "Top 5 words:\n"
            );
            for (int index = 0; index < 5; index++) {
                System.out.println(topFiveFrequent[index] + " : " + topFive[index]);
            }
        }
    }

    public int getSentences() {
        return sentences;
    }

    public int getWords() {
        return words;
    }

    public int getLetters() {
        return letters;
    }

    public int getConsonants() {
        return consonants;
    }

    public int getVowels() {
        return vowels;
    }

    private void analyze() {
        Map<String, Integer> word_map = new HashMap<String, Integer>();
        StringBuilder word_buffer = new StringBuilder();

        int longest_w = 0;
        for (int index = 0; index < source.length(); index++) {
            char dt = source.charAt(index);
            if (isVowel(dt)) vowels++;

            else if (isConsonants(dt)) consonants++;

            if (dt == ' ' || dt == '\n') {
                words++;
                word_map.put(word_buffer.toString(), word_map.getOrDefault(word_buffer.toString(), 0) + 1);

                if (word_buffer.length() > longest_w) {
                    longest_w = word_buffer.length();
                    longestWord = word_buffer.toString();
                }
                word_buffer = new StringBuilder();
            } else if (!isSpecial(dt))
                word_buffer.append(dt);

            if (index != source.length() - 1) {
                sentences += (isSentenceTerminating(dt) && !isSentenceTerminating(source.charAt(index + 1)) ? 1 : 0);
            }
        }

        letters = vowels + consonants;

        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
        word_map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        int index = 0;
        for (Map.Entry<String, Integer> dt : reverseSortedMap.entrySet()) {
            if (index == 5) break;
            topFive[index] = dt.getKey();
            topFiveFrequent[index] = dt.getValue();
            index++;
        }
    }

    private boolean isSentenceTerminating(char inp) {
        switch (inp) {
            case '!':
                ;
            case '?':
                ;
            case '.':
                return true;
            default:
                return false;
        }
    }

    private boolean isConsonants(char inp) {
        return !(isSpecial(inp) || isVowel(inp));
    }

    private boolean isVowel(char input) {
        input = Character.toLowerCase(input);
        switch (input) {
            case 'a':
                ;
            case 'y':
                ;
            case 'e':
                ;
            case 'u':
                ;
            case 'o':
                ;
            case 'i':
                return true;
            default:
                return false;
        }
    }

    private boolean isSpecial(char input) {
        switch (input) {
            case '[':
                ;
            case ']':
                ;
            case '<':
                ;
            case '>':
                ;
            case '?':
                ;
            case '.':
                ;
            case '~':
                ;
            case '!':
                ;
            case '@':
                ;
            case '*':
                ;
            case '&':
                ;
            case '(':
                ;
            case ')':
                ;
            case '{':
                ;
            case '}':
                ;
            case '^':
                ;
            case '%':
                ;
            case '$':
                ;
            case '#':
                ;
            case ';':
                ;
            case ':':
                ;
            case '"':
                ;
            case '/':
                ;
            case '-':
                ;
            case '+':
                return true;
            default:
                return false;
        }
    }

}
