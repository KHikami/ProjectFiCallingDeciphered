package p000;

import android.util.SparseIntArray;

public abstract class acu {
    final SparseIntArray f284a = new SparseIntArray();
    private boolean f285b = false;

    public void m606a() {
        this.f284a.clear();
    }

    int m607b(int i, int i2) {
        if (!this.f285b) {
            return mo79a(i, i2);
        }
        int i3 = this.f284a.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        i3 = mo79a(i, i2);
        this.f284a.put(i, i3);
        return i3;
    }

    public int mo79a(int i, int i2) {
        if (1 == i2) {
            return 0;
        }
        int a;
        int i3;
        int i4;
        if (this.f285b && this.f284a.size() > 0) {
            a = m604a(i);
            if (a >= 0) {
                i3 = this.f284a.get(a) + 1;
                a++;
                i4 = a;
                a = i3;
                for (i3 = i4; i3 < i; i3++) {
                    a++;
                    if (a == i2) {
                        a = 0;
                    } else if (a > i2) {
                        a = 1;
                    }
                }
                if (a + 1 > i2) {
                    return a;
                }
                return 0;
            }
        }
        a = 0;
        i3 = 0;
        i4 = a;
        a = i3;
        for (i3 = i4; i3 < i; i3++) {
            a++;
            if (a == i2) {
                a = 0;
            } else if (a > i2) {
                a = 1;
            }
        }
        if (a + 1 > i2) {
            return 0;
        }
        return a;
    }

    int m604a(int i) {
        int i2 = 0;
        int size = this.f284a.size() - 1;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            if (this.f284a.keyAt(i3) < i) {
                i2 = i3 + 1;
            } else {
                size = i3 - 1;
            }
        }
        size = i2 - 1;
        if (size < 0 || size >= this.f284a.size()) {
            return -1;
        }
        return this.f284a.keyAt(size);
    }

    public int m608c(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i4++;
            if (i4 == i2) {
                i3++;
                i4 = 0;
            } else if (i4 > i2) {
                i4 = 1;
                i3++;
            }
        }
        if (i4 + 1 > i2) {
            return i3 + 1;
        }
        return i3;
    }
}
