package defpackage;

final /* synthetic */ class dod {
    static final /* synthetic */ int[] a = new int[dnd.values().length];

    static {
        try {
            a[dnd.DOMAIN_RESTRICTED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[dnd.DOMAIN_WITH_EXTERNAL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[dnd.KNOCKABLE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
