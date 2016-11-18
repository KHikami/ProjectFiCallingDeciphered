package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class nwu extends nvl<Integer> implements RandomAccess, nwy {
    public static final nwu f31195b;
    private int[] f31196c;
    private int f31197d;

    public /* synthetic */ void add(int i, Object obj) {
        m36998b(i, (Integer) obj);
    }

    public /* synthetic */ nxb mo4061d(int i) {
        return mo4056a(i);
    }

    public /* synthetic */ Object get(int i) {
        return m36999e(i);
    }

    public /* synthetic */ Object remove(int i) {
        return m37000f(i);
    }

    public /* synthetic */ Object set(int i, Object obj) {
        return m36996a(i, (Integer) obj);
    }

    static {
        nvl nwu = new nwu();
        f31195b = nwu;
        nwu.f31132a = false;
    }

    nwu() {
        this(new int[10], 0);
    }

    private nwu(int[] iArr, int i) {
        this.f31196c = iArr;
        this.f31197d = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwu)) {
            return super.equals(obj);
        }
        nwu nwu = (nwu) obj;
        if (this.f31197d != nwu.f31197d) {
            return false;
        }
        int[] iArr = nwu.f31196c;
        for (int i = 0; i < this.f31197d; i++) {
            if (this.f31196c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f31197d; i2++) {
            i = (i * 31) + this.f31196c[i2];
        }
        return i;
    }

    public nwy mo4056a(int i) {
        if (i >= this.f31197d) {
            return new nwu(Arrays.copyOf(this.f31196c, i), this.f31197d);
        }
        throw new IllegalArgumentException();
    }

    private Integer m36999e(int i) {
        return Integer.valueOf(mo4059b(i));
    }

    public int mo4059b(int i) {
        m37001g(i);
        return this.f31196c[i];
    }

    public int size() {
        return this.f31197d;
    }

    private Integer m36996a(int i, Integer num) {
        return Integer.valueOf(m36995a(i, num.intValue()));
    }

    private int m36995a(int i, int i2) {
        m36736c();
        m37001g(i);
        int i3 = this.f31196c[i];
        this.f31196c[i] = i2;
        return i3;
    }

    private void m36998b(int i, Integer num) {
        m36997b(i, num.intValue());
    }

    public void mo4060c(int i) {
        m36997b(this.f31197d, i);
    }

    private void m36997b(int i, int i2) {
        m36736c();
        if (i < 0 || i > this.f31197d) {
            throw new IndexOutOfBoundsException(m37002h(i));
        }
        if (this.f31197d < this.f31196c.length) {
            System.arraycopy(this.f31196c, i, this.f31196c, i + 1, this.f31197d - i);
        } else {
            Object obj = new int[(((this.f31197d * 3) / 2) + 1)];
            System.arraycopy(this.f31196c, 0, obj, 0, i);
            System.arraycopy(this.f31196c, i, obj, i + 1, this.f31197d - i);
            this.f31196c = obj;
        }
        this.f31196c[i] = i2;
        this.f31197d++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        m36736c();
        if (collection == null) {
            throw new NullPointerException();
        } else if (!(collection instanceof nwu)) {
            return super.addAll(collection);
        } else {
            nwu nwu = (nwu) collection;
            if (nwu.f31197d == 0) {
                return false;
            }
            if (Integer.MAX_VALUE - this.f31197d < nwu.f31197d) {
                throw new OutOfMemoryError();
            }
            int i = this.f31197d + nwu.f31197d;
            if (i > this.f31196c.length) {
                this.f31196c = Arrays.copyOf(this.f31196c, i);
            }
            System.arraycopy(nwu.f31196c, 0, this.f31196c, this.f31197d, nwu.f31197d);
            this.f31197d = i;
            this.modCount++;
            return true;
        }
    }

    public boolean remove(Object obj) {
        m36736c();
        for (int i = 0; i < this.f31197d; i++) {
            if (obj.equals(Integer.valueOf(this.f31196c[i]))) {
                System.arraycopy(this.f31196c, i + 1, this.f31196c, i, this.f31197d - i);
                this.f31197d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private Integer m37000f(int i) {
        m36736c();
        m37001g(i);
        int i2 = this.f31196c[i];
        System.arraycopy(this.f31196c, i + 1, this.f31196c, i, this.f31197d - i);
        this.f31197d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    private void m37001g(int i) {
        if (i < 0 || i >= this.f31197d) {
            throw new IndexOutOfBoundsException(m37002h(i));
        }
    }

    private String m37002h(int i) {
        return "Index:" + i + ", Size:" + this.f31197d;
    }
}
