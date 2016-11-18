package p000;

import java.util.Iterator;

public final class mnc<E> extends mks<E> {
    public static final mnc<Object> f27935a = new mnc(mmr.f27915a, 0, null, 0);
    final transient Object[] f27936b;
    private final transient Object[] f27937c;
    private final transient int f27938d;
    private final transient int f27939e;

    public /* synthetic */ Iterator iterator() {
        return mo3806a();
    }

    mnc(Object[] objArr, int i, Object[] objArr2, int i2) {
        this.f27937c = objArr;
        this.f27936b = objArr2;
        this.f27938d = i2;
        this.f27939e = i;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.f27936b;
        if (obj == null || objArr == null) {
            return false;
        }
        int R = gwb.m1443R(obj);
        while (true) {
            R &= this.f27938d;
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
        return this.f27937c.length;
    }

    public mny<E> mo3806a() {
        return mlj.m32460a(this.f27937c);
    }

    int mo3832a(Object[] objArr, int i) {
        System.arraycopy(this.f27937c, 0, objArr, i, this.f27937c.length);
        return this.f27937c.length + i;
    }

    mjq<E> mo3868d() {
        if (this.f27936b == null) {
            return mna.f27928a;
        }
        return new mmu((mjk) this, this.f27937c);
    }

    boolean mo3822e() {
        return false;
    }

    public int hashCode() {
        return this.f27939e;
    }

    boolean V_() {
        return true;
    }
}
