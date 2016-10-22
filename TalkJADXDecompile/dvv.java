final /* synthetic */ class dvv {
    static final /* synthetic */ int[] a;

    static {
        a = new int[dvr.values().length];
        try {
            a[dvr.HIGH_AFFINITY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[dvr.COMBINED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[dvr.DOMAIN.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
