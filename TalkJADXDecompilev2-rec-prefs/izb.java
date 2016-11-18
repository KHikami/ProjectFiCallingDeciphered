package p000;

import java.util.Arrays;

public final class izb {
    static final int[] f19450a = new int[]{5, 11, 23, 47, 97, 197, 397, 797, 1597, 3203, 6421, 12853, 25717, 51437, 102877, 205759, 411527, 823117, 1646237, 3292489, 6584983, 13169977, 26339969, 52679969, 105359939, 210719881, 421439783, 842879579, 1685759167, 2147483629};
    private final int f19451b;
    private int f19452c;
    private int[] f19453d;
    private int[] f19454e;
    private int f19455f;

    static int m23554a(int i) {
        return (i << 1) - (i << 8);
    }

    public izb() {
        this(-1);
    }

    private izb(int i) {
        this.f19451b = -1;
        m23555c();
    }

    public void m23558a() {
        m23555c();
    }

    private void m23555c() {
        this.f19452c = 0;
        this.f19453d = new int[f19450a[this.f19452c]];
        this.f19454e = new int[f19450a[this.f19452c]];
        Arrays.fill(this.f19454e, this.f19451b);
    }

    public int m23557a(int i, int i2) {
        boolean z = true;
        ba.m4578a(i2 != this.f19451b, (Object) "Cannot add emptyValue to map");
        int d = m23556d(i);
        if (this.f19454e[d] != this.f19451b) {
            return this.f19454e[d];
        }
        this.f19453d[d] = i;
        this.f19455f++;
        this.f19454e[d] = i2;
        if (this.f19455f > this.f19453d.length / 2) {
            if (this.f19452c < f19450a.length - 1) {
                int[] iArr = this.f19453d;
                int[] iArr2 = this.f19454e;
                this.f19452c++;
                this.f19453d = new int[f19450a[this.f19452c]];
                this.f19454e = new int[f19450a[this.f19452c]];
                Arrays.fill(this.f19454e, this.f19451b);
                int i3 = this.f19455f;
                int length = iArr.length;
                this.f19455f = 0;
                for (d = 0; d < length; d++) {
                    if (iArr2[d] != this.f19451b) {
                        m23557a(iArr[d], iArr2[d]);
                    }
                }
                if (i3 != this.f19455f) {
                    z = false;
                }
                ba.m4609b(z);
            } else {
                throw new IllegalStateException("Too many items, you'd better use array map instead.");
            }
        }
        return this.f19451b;
    }

    public int m23559b(int i) {
        return this.f19454e[m23556d(i)];
    }

    private int m23556d(int i) {
        int length = this.f19453d.length;
        int a = (izb.m23554a(i) & Integer.MAX_VALUE) % length;
        while (this.f19454e[a] != this.f19451b && this.f19453d[a] != i) {
            a++;
            if (a >= length) {
                a = 0;
            }
        }
        return a;
    }

    public boolean m23561c(int i) {
        return m23559b(i) != this.f19451b;
    }

    public izc m23560b() {
        return new izc(this.f19453d, this.f19454e, this.f19451b);
    }
}
