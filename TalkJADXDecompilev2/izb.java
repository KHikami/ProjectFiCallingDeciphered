package defpackage;

import java.util.Arrays;

public final class izb {
    static final int[] a = new int[]{5, 11, 23, 47, 97, 197, 397, 797, 1597, 3203, 6421, 12853, 25717, 51437, 102877, 205759, 411527, 823117, 1646237, 3292489, 6584983, 13169977, 26339969, 52679969, 105359939, 210719881, 421439783, 842879579, 1685759167, 2147483629};
    private final int b;
    private int c;
    private int[] d;
    private int[] e;
    private int f;

    static int a(int i) {
        return (i << 1) - (i << 8);
    }

    public izb() {
        this(-1);
    }

    private izb(int i) {
        this.b = -1;
        c();
    }

    public void a() {
        c();
    }

    private void c() {
        this.c = 0;
        this.d = new int[a[this.c]];
        this.e = new int[a[this.c]];
        Arrays.fill(this.e, this.b);
    }

    public int a(int i, int i2) {
        boolean z = true;
        ba.a(i2 != this.b, (Object) "Cannot add emptyValue to map");
        int d = d(i);
        if (this.e[d] != this.b) {
            return this.e[d];
        }
        this.d[d] = i;
        this.f++;
        this.e[d] = i2;
        if (this.f > this.d.length / 2) {
            if (this.c < a.length - 1) {
                int[] iArr = this.d;
                int[] iArr2 = this.e;
                this.c++;
                this.d = new int[a[this.c]];
                this.e = new int[a[this.c]];
                Arrays.fill(this.e, this.b);
                int i3 = this.f;
                int length = iArr.length;
                this.f = 0;
                for (d = 0; d < length; d++) {
                    if (iArr2[d] != this.b) {
                        a(iArr[d], iArr2[d]);
                    }
                }
                if (i3 != this.f) {
                    z = false;
                }
                ba.b(z);
            } else {
                throw new IllegalStateException("Too many items, you'd better use array map instead.");
            }
        }
        return this.b;
    }

    public int b(int i) {
        return this.e[d(i)];
    }

    private int d(int i) {
        int length = this.d.length;
        int a = (izb.a(i) & Integer.MAX_VALUE) % length;
        while (this.e[a] != this.b && this.d[a] != i) {
            a++;
            if (a >= length) {
                a = 0;
            }
        }
        return a;
    }

    public boolean c(int i) {
        return b(i) != this.b;
    }

    public izc b() {
        return new izc(this.d, this.e, this.b);
    }
}
