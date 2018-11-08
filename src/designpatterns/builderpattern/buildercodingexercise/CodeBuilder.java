package designpatterns.builderpattern.buildercodingexercise;

import java.util.LinkedHashMap;
import java.util.Map;

public class CodeBuilder {
    //STRING CONSTANTS
    public final String PUBLIC = "public";
    public final String CLASS = "class";
    public final String OPEN_CURLY_BRACE = "{";
    public final String CLOSED_CURLY_BRACE = "}";
    public final String ONE_INDENT_SPACE = " ";
    public final String TWO_INDENT_SPACE = "  ";
    public final String SEMI_COLON = ";";
    public final String NEW_LINE = System.lineSeparator();
    public String className;
    public Map<String, String> memberList;

    public CodeBuilder(String className) {
        this.className = className;
        this.memberList = new LinkedHashMap<>();
    }

    public CodeBuilder addField(String variableName, String variableType) {
        this.memberList.put(variableName, variableType);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(PUBLIC).append(ONE_INDENT_SPACE).append(CLASS).append(ONE_INDENT_SPACE).append(className).append(NEW_LINE)
                .append(OPEN_CURLY_BRACE).append(NEW_LINE);
        for(String key: memberList.keySet()){
            builder.append(TWO_INDENT_SPACE).append(PUBLIC).append(ONE_INDENT_SPACE).append(memberList.get(key)).append(ONE_INDENT_SPACE).append(key).append(SEMI_COLON).append(NEW_LINE);
        }
        builder.append(CLOSED_CURLY_BRACE).append(NEW_LINE);
        return builder.toString();
    }
}

class Demo{
    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");
        System.out.println(cb);
    }
}
