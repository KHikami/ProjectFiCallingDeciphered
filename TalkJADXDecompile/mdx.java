final /* synthetic */ class mdx {
    static final /* synthetic */ int[] a;

    static {
        a = new int[mdy.a().length];
        try {
            a[mdy.a - 1] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[mdy.c - 1] = 2;
        } catch (NoSuchFieldError e2) {
        }
    }
}
