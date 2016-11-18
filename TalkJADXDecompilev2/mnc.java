package defpackage;

import java.util.Iterator;

public final class mnc<E> extends mks<E> {
    public static final mnc<Object> a = new mnc(mmr.a, 0, null, 0);
    final transient Object[] b;
    private final transient Object[] c;
    private final transient int d;
    private final transient int e;

    public /* synthetic */ Iterator iterator() {
        return a();
    }

    mnc(Object[] objArr, int i, Object[] objArr2, int i2) {
        this.c = objArr;
        this.b = objArr2;
        this.d = i2;
        this.e = i;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.b;
        if (obj == null || objArr == null) {
            return false;
        }
        int R = gwb.R(obj);
        while (true) {
            R &= this.d;
            Object obj2 = objArr[R];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            R++;
        }
    }

    public int size() {
        return this.c.length;
    }

    public mny<E> a() {
        return mlj.a(this.c);
    }

    int a(Object[] objArr, int i) {
        System.arraycopy(this.c, 0, objArr, i, this.c.length);
        return this.c.length + i;
    }

    mjq<E> d() {
        if (this.b == null) {
            return mna.a;
        }
        return new mmu((mjk) this, this.c);
    }

    boolean e() {
        return false;
    }

    public int hashCode() {
        return this.e;
    }

    boolean V_() {
        return true;
    }
}
