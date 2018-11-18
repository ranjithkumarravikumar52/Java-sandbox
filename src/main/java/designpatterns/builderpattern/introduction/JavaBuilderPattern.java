package designpatterns.builderpattern.introduction;

/**
 * Imagine we have a huge string array and we want to append each string from the array with "li /li" tags. <br>
 *     Once implemented notice, how cumbersome it becomes to enclose it li and /li tags <br>
 *         It gets easier when we use OOP
 */
public class JavaBuilderPattern {
    public static void main(String[] args) {
        String[] words = {"hello", "world", "This is Ranjith"};

        String appendList = "<ul>\n";
        for(String s : words){
            appendList += " <li>"+s+"</li>\n";
        }
        appendList += "</ul>\n";
        System.out.println(appendList);
    }
}
