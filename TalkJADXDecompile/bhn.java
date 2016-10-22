public final class bhn {
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    private static final /* synthetic */ int[] e;

    public static int[] a() {
        return (int[]) e.clone();
    }

    static {
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        e = new int[]{a, b, c, d};
    }
}
