package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class nwu extends nvl<Integer> implements RandomAccess, nwy {
    public static final nwu b;
    private int[] c;
    private int d;

    public /* synthetic */ void add(int i, Object obj) {
        b(i, (Integer) obj);
    }

    public /* synthetic */ nxb d(int i) {
        return a(i);
    }

    public /* synthetic */ Object get(int i) {
        return e(i);
    }

    public /* synthetic */ Object remove(int i) {
        return f(i);
    }

    public /* synthetic */ Object set(int i, Object obj) {
        return a(i, (Integer) obj);
    }

    static {
        nvl nwu = new nwu();
        b = nwu;
        nwu.a = false;
    }

    nwu() {
        this(new int[10], 0);
    }

    private nwu(int[] iArr, int i) {
        this.c = iArr;
        this.d = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwu)) {
            return super.equals(obj);
        }
        nwu nwu = (nwu) obj;
        if (this.d != nwu.d) {
            return false;
        }
        int[] iArr = nwu.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    public nwy a(int i) {
        if (i >= this.d) {
            return new nwu(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    private Integer e(int i) {
        return Integer.valueOf(b(i));
    }

    public int b(int i) {
        g(i);
        return this.c[i];
    }

    public int size() {
        return this.d;
    }

    private Integer a(int i, Integer num) {
        return Integer.valueOf(a(i, num.intValue()));
    }

    private int a(int i, int i2) {
        c();
        g(i);
        int i3 = this.c[i];
        this.c[i] = i2;
        return i3;
    }

    private void b(int i, Integer num) {
        b(i, num.intValue());
    }

    public void c(int i) {
        b(this.d, i);
    }

    private void b(int i, int i2) {
        c();
        if (i < 0 || i > this.d) {
            throw new IndexOutOfBoundsException(h(i));
        }
        if (this.d < this.c.length) {
            System.arraycopy(this.c, i, this.c, i + 1, this.d - i);
        } else {
            Object obj = new int[(((this.d * 3) / 2) + 1)];
            System.arraycopy(this.c, 0, obj, 0, i);
            System.arraycopy(this.c, i, obj, i + 1, this.d - i);
            this.c = obj;
        }
        this.c[i] = i2;
        this.d++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        c();
        if (collection == null) {
            throw new NullPointerException();
        } else if (!(collection instanceof nwu)) {
            return super.addAll(collection);
        } else {
            nwu nwu = (nwu) collection;
            if (nwu.d == 0) {
                return false;
            }
            if (Integer.MAX_VALUE - this.d < nwu.d) {
                throw new OutOfMemoryError();
            }
            int i = this.d + nwu.d;
            if (i > this.c.length) {
                this.c = Arrays.copyOf(this.c, i);
            }
            System.arraycopy(nwu.c, 0, this.c, this.d, nwu.d);
            this.d = i;
            this.modCount++;
            return true;
        }
    }

    public boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Integer.valueOf(this.c[i]))) {
                System.arraycopy(this.c, i + 1, this.c, i, this.d - i);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private Integer f(int i) {
        c();
        g(i);
        int i2 = this.c[i];
        System.arraycopy(this.c, i + 1, this.c, i, this.d - i);
        this.d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    private void g(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    private String h(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }
}
