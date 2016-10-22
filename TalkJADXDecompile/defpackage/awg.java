package defpackage;

/* renamed from: awg */
final class awg extends awf {
    awg() {
    }

    public float a(int i, int i2, int i3, int i4) {
        int min = Math.min(i2 / i4, i / i3);
        if (min == 0) {
            return 1.0f;
        }
        return 1.0f / ((float) Integer.highestOneBit(min));
    }

    public int a() {
        return awm.b;
    }
}
