final class mea extends men {
    static final mea o;

    static {
        o = new mea();
    }

    private mea() {
        super("CharMatcher.any()");
    }

    public boolean b(char c) {
        return true;
    }

    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        bm.b(i, length);
        return i == length ? -1 : i;
    }
}
