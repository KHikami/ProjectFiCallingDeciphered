package defpackage;

final /* synthetic */ class cts {
    static final /* synthetic */ int[] a = new int[ctw.a().length];

    static {
        try {
            a[ctw.b - 1] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[ctw.a - 1] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[ctw.c - 1] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
