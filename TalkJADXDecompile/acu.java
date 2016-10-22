import android.util.SparseIntArray;

public abstract class acu {
    final SparseIntArray a;
    private boolean b;

    public acu() {
        this.a = new SparseIntArray();
        this.b = false;
    }

    public void a() {
        this.a.clear();
    }

    int b(int i, int i2) {
        if (!this.b) {
            return a(i, i2);
        }
        int i3 = this.a.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        i3 = a(i, i2);
        this.a.put(i, i3);
        return i3;
    }

    public int a(int i, int i2) {
        if (1 == i2) {
            return 0;
        }
        int a;
        int i3;
        int i4;
        if (this.b && this.a.size() > 0) {
            a = a(i);
            if (a >= 0) {
                i3 = this.a.get(a) + 1;
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

    int a(int i) {
        int i2 = 0;
        int size = this.a.size() - 1;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            if (this.a.keyAt(i3) < i) {
                i2 = i3 + 1;
            } else {
                size = i3 - 1;
            }
        }
        size = i2 - 1;
        if (size < 0 || size >= this.a.size()) {
            return -1;
        }
        return this.a.keyAt(size);
    }

    public int c(int i, int i2) {
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
