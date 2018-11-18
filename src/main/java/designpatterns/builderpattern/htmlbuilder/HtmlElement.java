package designpatterns.builderpattern.htmlbuilder;

import java.util.ArrayList;
import java.util.Collections;

public class HtmlElement {
    //util
    private final int indentSize = 2; //indent length 2 char by default
    public String name; //name of the tag
    public String text; //content inside a tag (provided there's no other tags)
    ArrayList<HtmlElement> elements = new ArrayList<>(); //if we need more tags inside a tag, then we use a recursive structure;
    private String newLine = System.lineSeparator(); //new line character

    //empty
    public HtmlElement() {

    }

    //init name and text
    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }


    /**
     * Prints all the elements from our recursive structure (not important for our builder pattern demo), just a boilerplate code
     * <br>
     *     Trying to get our indentation right.
     *
     * @param indent
     */
    private String toStringImpl(int indent) {
        StringBuilder sb = new StringBuilder();
        String i = String.join("", Collections.nCopies(indent * indentSize, " "));
        sb.append(String.format("%s<%s>%s", i, name, newLine));
        if (text != null && !text.isEmpty()) {
            sb.append(String.join("", Collections.nCopies(indentSize * (indent + 1), "")))
                    .append(text)
                    .append(newLine);
        }

        //check text recursively
        for(HtmlElement e:elements){
            sb.append(e.toStringImpl(indent + 1));
        }

        sb.append(String.format("%s<%s>%s", i, name, newLine));
        return sb.toString();


    }

    /**
     * Since we have a recursive implementation of Htmlelements, we need some toString(), that return more than a basic implementation
     */
    @Override
    public String toString() {
        return toStringImpl(0);
    }



}

class HtmlBuilder{
    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootName){
        this.rootName = rootName;
        root.name = rootName;
    }

    public HtmlBuilder addChild(String childName, String childText){
        HtmlElement e = new HtmlElement(childName, childText);
        root.elements.add(e);
        return this;
    }

    public void clear(){
        root = new HtmlElement();
        root.name = rootName;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
