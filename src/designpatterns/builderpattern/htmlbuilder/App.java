package designpatterns.builderpattern.htmlbuilder;

public class App {
    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li", "hello") .addChild("li", "world");
        System.out.println(builder);
    }
}
