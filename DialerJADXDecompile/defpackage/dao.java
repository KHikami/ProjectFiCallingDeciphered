package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dao */
public abstract class dao extends czp implements Set {
    public abstract dbn b();

    public /* synthetic */ Iterator iterator() {
        return b();
    }

    public static dao a(Object obj) {
        return new dbl(obj);
    }

    private static dao a(int i, Object... objArr) {
        while (true) {
            switch (i) {
                case rl.c /*0*/:
                    return dbi.a;
                case rq.b /*1*/:
                    return dao.a(objArr[0]);
                default:
                    int a = dao.a(i);
                    Object[] objArr2 = new Object[a];
                    int i2 = a - 1;
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    while (i3 < i) {
                        Object a2 = daz.a(objArr[i3], i3);
                        int hashCode = a2.hashCode();
                        int C = buf.C(hashCode);
                        while (true) {
                            int i6 = C & i2;
                            Object obj = objArr2[i6];
                            if (obj == null) {
                                C = i4 + 1;
                                objArr[i4] = a2;
                                objArr2[i6] = a2;
                                i4 = i5 + hashCode;
                            } else if (obj.equals(a2)) {
                                C = i4;
                                i4 = i5;
                            } else {
                                C++;
                            }
                            i3++;
                            i5 = i4;
                            i4 = C;
                        }
                    }
                    Arrays.fill(objArr, i4, i, null);
                    if (i4 == 1) {
                        return new dbl(objArr[0], i5);
                    }
                    if (a != dao.a(i4)) {
                        i = i4;
                    } else {
                        if (i4 < objArr.length) {
                            objArr = daz.a(objArr, i4);
                        }
                        return new dbi(objArr, i5, objArr2, i2);
                    }
            }
        }
    }

    private static int a(int i) {
        if (i < 751619276) {
            int highestOneBit = Integer.highestOneBit(i - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) i)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        cob.a(i < 1073741824, (Object) "collection too large");
        return 1073741824;
    }

    public static dao a(Object[] objArr) {
        switch (objArr.length) {
            case rl.c /*0*/:
                return dbi.a;
            case rq.b /*1*/:
                return dao.a(objArr[0]);
            default:
                return dao.a(objArr.length, (Object[]) objArr.clone());
        }
    }

    dao() {
    }

    boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof dao) && e() && ((dao) obj).e() && hashCode() != obj.hashCode()) {
            return false;
        }
        return buf.a((Set) this, obj);
    }

    public int hashCode() {
        return buf.a((Set) this);
    }

    Object writeReplace() {
        return new dar(toArray());
    }
}
