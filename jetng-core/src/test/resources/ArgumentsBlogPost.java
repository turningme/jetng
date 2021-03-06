package foo;

/**
 * Bar template.
 */
public class Bar {

    /**
     * Generates Bar template.
     *
     * @param arguments
     *            arguments
     * @return generated template
     */
    public String generate(final Meta arguments) {
        final java.io.StringWriter w = new java.io.StringWriter();
        generate(arguments, w);
        return w.toString();
    }

    /**
     * Writes Bar template to a {@link java.io.Writer}.
     *
     * @param arguments
     *            arguments
     * @param writer
     *            writer to output to
     */
    public void generate(final Meta arguments, final java.io.Writer writer) {
        final java.io.PrintWriter out = new java.io.PrintWriter(writer);
        out.println("Hello world");
        out.print(arguments.getValue());
        out.println();
    }
}
