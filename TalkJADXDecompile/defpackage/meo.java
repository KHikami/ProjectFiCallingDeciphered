package defpackage;

/* renamed from: meo */
final class meo extends men {
    static final meo o;

    static {
        o = new meo();
    }

    private meo() {
        super("CharMatcher.none()");
    }

    public boolean b(char c) {
        return false;
    }

    public int a(CharSequence charSequence, int i) {
        bm.b(i, charSequence.length());
        return -1;
    }

    public String a(CharSequence charSequence) {
        return charSequence.toString();
    }
}
