final /* synthetic */ class edc {
    static final /* synthetic */ int[] a;

    static {
        a = new int[fhe.values().length];
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
