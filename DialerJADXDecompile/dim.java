/* compiled from: PG */
final /* synthetic */ class dim {
    static final /* synthetic */ int[] a;

    static {
        a = new int[dij.values().length];
        try {
            a[dij.PLAINTEXT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[dij.TLS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
    }
}
