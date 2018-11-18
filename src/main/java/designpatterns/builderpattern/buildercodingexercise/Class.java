package designpatterns.builderpattern.buildercodingexercise;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String className;
    private List<MemberVariable> memberList;

    public Class(String className) {
        this.className = className;
        this.memberList = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    void addMember(String variableName, String variableType){
        this.memberList.add(new MemberVariable(variableName, variableType));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(JavaKeyWord.PUBLIC)
                .append(JavaGrammar.ONE_INDENT_SPACE)
                .append(JavaKeyWord.CLASS)
                .append(JavaGrammar.ONE_INDENT_SPACE)
                .append(this.className)
                .append(JavaGrammar.NEW_LINE)
                .append(JavaGrammar.OPEN_CURLY_BRACE)
                .append(JavaGrammar.NEW_LINE);

        for (MemberVariable memberVariable : memberList) {
            builder.append(memberVariable);
        }

        builder.append(JavaGrammar.CLOSED_CURLY_BRACE)
                .append(JavaGrammar.NEW_LINE);
        return builder.toString();
    }
}