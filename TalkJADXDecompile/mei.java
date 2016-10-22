final class mei extends men {
    static final mei o;

    static {
        o = new mei();
    }

    private mei() {
        super("CharMatcher.javaIsoControl()");
    }

    public boolean b(char c) {
        return c <= '\u001f' || (c >= '\u007f' && c <= '\u009f');
    }
}
