package foo;

public class Bar {

    public String generate(final Object arguments) {
        final java.io.StringWriter w = new java.io.StringWriter();
        generate(arguments, w);
        return w.toString();
    }

    public void generate(final Object arguments, final java.io.Writer writer) {
        final java.io.PrintWriter out = new java.io.PrintWriter(writer);
        out.println("Hello world");
         Meta meta = (Meta)arguments; 
        out.print(meta.getValue());
        out.println();
    }
}
