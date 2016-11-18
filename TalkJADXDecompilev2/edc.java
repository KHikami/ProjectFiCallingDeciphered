package defpackage;

final /* synthetic */ class edc {
    static final /* synthetic */ int[] a = new int[fhe.values().length];

    static {
        try {
            a[fhe.DISPLAYONLY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[fhe.SILENT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[fhe.LOUD.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
