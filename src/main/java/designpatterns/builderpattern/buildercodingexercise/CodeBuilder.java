package designpatterns.builderpattern.buildercodingexercise;

public class CodeBuilder {
    private Class classObject;


    public CodeBuilder(String classObjectName) {
        this.classObject = new Class(classObjectName);
    }

    CodeBuilder addField(String variableName, String variableType) {
        this.classObject.addMember(variableName, variableType);
        return this;
    }

    @Override
    public String toString() {
        return classObject.toString();
    }

}

