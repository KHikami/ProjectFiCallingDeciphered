final class icg {
    static final boolean[] a;
    static final int[] b;
    static final long[] c;
    static final Object[] d;

    static {
        a = new boolean[0];
        b = new int[0];
        c = new long[0];
        d = new Object[0];
    }

    static int a(int[] iArr, int i, int i2) {
        int i3 = 0;
        int i4 = i - 1;
        while (i3 <= i4) {
            int i5 = (i3 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i3 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return i3 ^ -1;
    }
}
