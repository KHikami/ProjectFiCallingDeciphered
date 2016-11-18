package p000;

final class icg {
    static final boolean[] f17567a = new boolean[0];
    static final int[] f17568b = new int[0];
    static final long[] f17569c = new long[0];
    static final Object[] f17570d = new Object[0];

    static int m21593a(int[] iArr, int i, int i2) {
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
