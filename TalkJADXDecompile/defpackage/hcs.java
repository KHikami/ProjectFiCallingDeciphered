package defpackage;

/* renamed from: hcs */
public final class hcs {
    public static final int[] a;
    public static final long[] b;
    public static final float[] c;
    public static final double[] d;
    public static final boolean[] e;
    public static final String[] f;
    public static final byte[][] g;
    public static final byte[] h;

    static {
        a = new int[0];
        b = new long[0];
        c = new float[0];
        d = new double[0];
        e = new boolean[0];
        f = new String[0];
        g = new byte[0][];
        h = new byte[0];
    }

    public static final int a(hci hci, int i) {
        int i2 = 1;
        int m = hci.m();
        hci.b(i);
        while (hci.a() == i) {
            hci.b(i);
            i2++;
        }
        hci.e(m);
        return i2;
    }
}
