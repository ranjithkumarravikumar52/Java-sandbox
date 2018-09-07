package regularexpressions.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        String string = "I am a string. Yes, I am";

        //replace all "I" with "You"
        String yourString = string.replaceAll("I", "You");
        System.out.println("yourString = " + yourString);


        //CHARACTER CLASSES
        System.out.println("dot (.) -> matches any character, wild card for any character (including numbers)");
        String alphaNumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphaNumeric.replaceAll(".", "Y"));
        System.out.println();

        System.out.println("caret (^) boundary matcher, always followed by pattern matcher by string literal or something complex, replace ONLY once FROM the start/beginning of the string (doesn't replace all the occurrences of matches)");
        System.out.println(alphaNumeric.replaceAll("^abcDeee", "YYY"));
        System.out.println();

        System.out.println("matches() -> returns true if there's a match");
        System.out.println(alphaNumeric.matches("^abcDeee"));
        System.out.println("TWIST: even though we made a match and replaced with YYYY earlier, it gives out false, cos string matches for the whole match. Doesn't work for partial match");
        System.out.println(alphaNumeric.matches("^hello"));
        System.out.println(alphaNumeric.matches("abcDeeeF12Ghhiiiijkl99z"));
        System.out.println();

        System.out.println("Opposite of caret symbol is $ -> checks for the end of the string");
        System.out.println(alphaNumeric.replaceAll("99z$", "THE END"));
        System.out.println();

        System.out.println("Matching a certain occurences of characters in a string");
        System.out.println(alphaNumeric.replaceAll("[aei]", "X"));
        System.out.println();

        System.out.println("Matching a certain occurrences of character with some conditions");
        System.out.println(alphaNumeric.replaceAll("[aei][Fj]", "X"));
        System.out.println();

        System.out.println("Harry".replaceAll("[Hh]arry", "harry"));
        System.out.println();

        //replace every letter in alphanumeric except e and j
        //when we use ^ inside a square bracket, it becomes a character class not boundary matcher
        alphaNumeric = "ejabcejDeeeF12Ghhiiiijkl99z";
        System.out.println(alphaNumeric.replaceAll("[^ej]", "X"));
        System.out.println(alphaNumeric.replaceAll("^ej", "X"));
        System.out.println();

        //'-' operator: matching range a-f & 3-8 inclusive
        System.out.println("matching range a-f & 3-8 inclusive: " + alphaNumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println("matching range a-f & 3-8 inclusive: " + alphaNumeric.replaceAll("[a-fA-F3-8]", "X"));
        System.out.println();

        //special construct
        System.out.println(alphaNumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println();

        //replace all the numbers in a string
        System.out.println(alphaNumeric.replaceAll("[0123456789]", "X"));
        System.out.println(alphaNumeric.replaceAll("[0-9]", "X"));
        System.out.println(alphaNumeric.replaceAll("\\d", "X"));
        System.out.println();

        //replace all non-numbers in a string
        System.out.println(alphaNumeric.replaceAll("\\D", "X"));
        System.out.println();

        //replace ALL (including start, end and everywhere) the white spaces in a string
        String hasWhiteSpaceTabAndNewline = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhiteSpaceTabAndNewline);
        System.out.println(hasWhiteSpaceTabAndNewline.replaceAll("\\s", ""));
        System.out.println(hasWhiteSpaceTabAndNewline.replaceAll("\\t", "\n"));
        System.out.println();

        //replace all non-white space characters (tab, spaces and new line characters)
        System.out.println(hasWhiteSpaceTabAndNewline.replaceAll("\\S", "X"));
        System.out.println();

        //replace all a-z A-Z 0-9 _
        System.out.println(alphaNumeric);
        System.out.println(alphaNumeric.replaceAll("\\w", "X"));
        System.out.println();
        System.out.println(hasWhiteSpaceTabAndNewline);
        System.out.println(hasWhiteSpaceTabAndNewline.replaceAll("\\w", "X"));

        //replace all anything but (a-z A-Z 0-9 _)
        System.out.println(hasWhiteSpaceTabAndNewline);
        System.out.println(hasWhiteSpaceTabAndNewline.replaceAll("\\w", "X"));
        System.out.println(hasWhiteSpaceTabAndNewline.replaceAll("\\W", "X"));
        System.out.println();

        //\\b matches word boundaries - replaces a word with replacement
        System.out.println(hasWhiteSpaceTabAndNewline);
        System.out.println(hasWhiteSpaceTabAndNewline.replaceAll("\\b", "X"));

        //QUANTIFIERS
        alphaNumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphaNumeric);
        System.out.println(alphaNumeric.replaceAll("^abcDeee", "X"));
        System.out.println(alphaNumeric.replaceAll("^abcDe{3}", "X")); //followed by exact count
        System.out.println(alphaNumeric.replaceAll("^abcDe+", "X")); //followed by 1 or more
        System.out.println(alphaNumeric.replaceAll("^abcDe*", "X")); //followed by 0 or more - optional situations
        System.out.println(alphaNumeric.replaceAll("^abcDe{2,5}", "X")); //followed by min or max count
        System.out.println(alphaNumeric.replaceAll("h+i*j", "X")); // 1 or more H, 0 or more i, and one j

        //PATTERNS
        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        //find any h2 tags
        String h2Pattern = "(<h2>)";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches()); //false HAHAHA

        //now that matcher find matches with the entire string or character sequence, how do we figure out the frequencies and the positional
        //matches have an internal state thingy where we have to reset the matcher every time we use it in our logic
        matcher.reset();
        int count = 0;
        System.out.println(htmlText.length());
        while (matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + ": " + matcher.start() + " to " + matcher.end());
        }

        //using groups to find patterns
        //To avoid the above occurence, we have a concept called greedy quantifiers and lazy quantifiers
        //* - greedy; ? - lazy
        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();
        //Occurrence <h2>Sub-heading</h2><p>This is a paragraph about something.</p><p>This is another paragraph about something else.</p><h2>Summary</h2>
        while (groupMatcher.find()) {
            System.out.println("Occurrence " + groupMatcher.group(1));
        }


        System.out.println();
        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern grPattern1 = Pattern.compile(h2TextGroups);
        Matcher textMatcher1 = grPattern1.matcher(htmlText);
        while (textMatcher1.find()) {
            System.out.println("Occurrence: " + textMatcher1.group(2));
        }

        //using logical when writing regular expressions
        //AND OR NOT
        //"abc" "a" AND "b" AND "c"
        //OR
        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("Harry".replaceAll("[Hh]arry", "Larry"));
        System.out.println();

        //NOT
        //[^abc] matches everything except abc
        String tvTest = "tstvtkt";
        //find all ts that are not followed by v
//        String regExpr = "t[^v]";
        String regExpr = "t(?!v)";
        Pattern pattern1 = Pattern.compile(regExpr);
        Matcher matcher1 = pattern1.matcher(tvTest);
        count = 0;
        while (matcher1.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher1.start() + " to " + matcher1.end());
        }


    }
}
