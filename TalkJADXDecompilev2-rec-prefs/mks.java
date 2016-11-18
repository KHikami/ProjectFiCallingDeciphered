package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public abstract class mks<E> extends mjk<E> implements Set<E> {
    private transient mjq<E> f27809a;

    public abstract mny<E> mo3806a();

    public /* synthetic */ Iterator iterator() {
        return mo3806a();
    }

    public static <E> mks<E> m32259b(E e) {
        return new mnk(e);
    }

    public static <E> mks<E> m32257a(int i, Object... objArr) {
        while (true) {
            switch (i) {
                case 0:
                    return mnc.f27935a;
                case 1:
                    return mks.m32259b(objArr[0]);
                default:
                    int a = mks.mo3869a(i);
                    Object[] objArr2 = new Object[a];
                    int i2 = a - 1;
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    while (i3 < i) {
                        Object a2 = mmr.m32522a(objArr[i3], i3);
                        int hashCode = a2.hashCode();
                        int G = gwb.m1394G(hashCode);
                        while (true) {
                            int i6 = G & i2;
                            Object obj = objArr2[i6];
                            if (obj == null) {
                                G = i4 + 1;
                                objArr[i4] = a2;
                                objArr2[i6] = a2;
                                i4 = i5 + hashCode;
                            } else if (obj.equals(a2)) {
                                G = i4;
                                i4 = i5;
                            } else {
                                G++;
                            }
                            i3++;
                            i5 = i4;
                            i4 = G;
                        }
                    }
                    Arrays.fill(objArr, i4, i, null);
                    if (i4 == 1) {
                        return new mnk(objArr[0], i5);
                    }
                    if (a != mks.mo3869a(i4)) {
                        i = i4;
                    } else {
                        if (i4 < objArr.length) {
                            objArr = mmr.m32523a(objArr, i4);
                        }
                        return new mnc(objArr, i5, objArr2, i2);
                    }
            }
        }
    }

    private static int mo3869a(int i) {
        if (i < 751619276) {
            int highestOneBit = Integer.highestOneBit(i - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) i)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        bm.m6138a(i < 1073741824, (Object) "collection too large");
        return 1073741824;
    }

    public static <E> mks<E> m32258a(E[] eArr) {
        switch (eArr.length) {
            case 0:
                return mnc.f27935a;
            case 1:
                return mks.m32259b(eArr[0]);
            default:
                return mks.m32257a(eArr.length, (Object[]) eArr.clone());
        }
    }

    mks() {
    }

    boolean V_() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof mks) && V_() && ((mks) obj).V_() && hashCode() != obj.hashCode()) {
            return false;
        }
        return ba.m4586a((Set) this, obj);
    }

    public int hashCode() {
        return ba.m4527a((Set) this);
    }

    public mjq<E> mo3807f() {
        mjq<E> mjq_E = this.f27809a;
        if (mjq_E != null) {
            return mjq_E;
        }
        mjq_E = mo3868d();
        this.f27809a = mjq_E;
        return mjq_E;
    }

    mjq<E> mo3868d() {
        return new mmu((mjk) this, toArray());
    }

    Object writeReplace() {
        return new mkw(toArray());
    }
}
