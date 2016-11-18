package defpackage;

final /* synthetic */ class bis {
    static final /* synthetic */ int[] a = new int[bhk.values().length];

    static {
        try {
            a[bhk.USE_OLD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[bhk.REPLACE_OLD.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
    }
}
