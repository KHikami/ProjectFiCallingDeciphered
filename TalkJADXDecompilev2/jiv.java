package defpackage;

final /* synthetic */ class jiv {
    static final /* synthetic */ int[] a = new int[jix.values().length];

    static {
        try {
            a[jix.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[jix.EMPTY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[jix.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[jix.LOADED.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}