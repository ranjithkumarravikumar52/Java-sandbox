package designpatterns.builderpattern.buildercodingexercise;

public class MemberVariable {
    private String variableName;
    private String variableType;

    MemberVariable(String variableName, String variableType) {
        this.variableName = variableName;
        this.variableType = variableType;
    }

    private String getVariableName() {
        return variableName;
    }


    private String getVariableType() {
        return variableType;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(JavaGrammar.TWO_INDENT_SPACE)
                .append(JavaKeyWord.PUBLIC)
                .append(JavaGrammar.ONE_INDENT_SPACE)
                .append(this.getVariableType())
                .append(JavaGrammar.ONE_INDENT_SPACE)
                .append(this.getVariableName())
                .append(JavaGrammar.SEMI_COLON)
                .append(JavaGrammar.NEW_LINE);
        return builder.toString();
    }
}
