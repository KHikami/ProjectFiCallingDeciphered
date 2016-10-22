final class cwz {
    public static final int a;
    public static final int b;
    private static final /* synthetic */ int[] c;

    public static int[] a() {
        return (int[]) c.clone();
    }

    static {
        a = 1;
        b = 2;
        c = new int[]{a, b};
    }
}
