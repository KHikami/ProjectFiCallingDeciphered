package p000;

final class awh extends awf {
    awh() {
    }

    public float mo398a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
        int max = Math.max(1, Integer.highestOneBit(ceil));
        if (max >= ceil) {
            i5 = 0;
        }
        return 1.0f / ((float) (max << i5));
    }

    public int mo399a() {
        return awm.f2433a;
    }
}
