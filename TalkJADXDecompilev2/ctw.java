package defpackage;

public final class ctw {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    private static final /* synthetic */ int[] d = new int[]{a, b, c};

    public static int[] a() {
        return (int[]) d.clone();
    }
}
