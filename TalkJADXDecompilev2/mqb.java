package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Formattable;
import java.util.Map;

public final class mqb extends mpz {
    private static final Map<mof, mqb[]> a;
    private final mof d;
    private final String e;

    static {
        Map enumMap = new EnumMap(mof.class);
        for (mof mof : mof.values()) {
            enumMap.put(mof, mqb.a(mof));
        }
        a = Collections.unmodifiableMap(enumMap);
    }

    private static mqb[] a(mof mof) {
        mqb[] mqbArr = new mqb[10];
        for (int i = 0; i < 10; i++) {
            mqbArr[i] = new mqb(i, mof, mog.a);
        }
        return mqbArr;
    }

    public static mqb a(int i, mof mof, mog mog) {
        if (i >= 10 || !mog.a()) {
            return new mqb(i, mof, mog);
        }
        return ((mqb[]) a.get(mof))[i];
    }

    private mqb(int i, mof mof, mog mog) {
        String d;
        super(mog, i);
        this.d = (mof) ba.a((Object) mof, "format char");
        if (mog == mog.a) {
            d = mof.d();
        } else {
            d = mog.a(new StringBuilder("%")).append(mof.a()).toString();
        }
        this.e = d;
    }

    public Object a(Object obj, mon mon) {
        if (!this.d.b().a(obj)) {
            return mon.a((mpz) this, obj);
        }
        if (this.c != mog.a) {
            return mpz.a(this.e, obj, mon);
        }
        mof mof = this.d;
        switch (mqg.a[mof.ordinal()]) {
            case 1:
                if (!(obj instanceof Formattable)) {
                    if (obj.getClass().isArray()) {
                        return mqb.b(obj, mon);
                    }
                    return obj;
                }
                break;
            case 2:
                if (obj.getClass().isArray()) {
                    obj = mqb.b(obj, mon);
                    break;
                }
                break;
            case 3:
            case 6:
                return obj;
            case 4:
                return mqb.a(obj, false);
            case 5:
                return mqb.a(obj, true);
            case 7:
                return new mqc(this, (Boolean) obj);
            case 8:
                if (obj instanceof Character) {
                    return obj;
                }
                if (Character.isBmpCodePoint(((Number) obj).intValue())) {
                    return new mqd(this, (Number) obj);
                }
                break;
        }
        return mpz.a(mof.d(), obj, mon);
    }

    public String a() {
        return this.e;
    }

    private static mps<?> b(Object obj, mon mon) {
        return new mqe(obj, mon);
    }

    private static mps<Number> a(Object obj, boolean z) {
        return new mqf((Number) obj, z);
    }

    static String a(long j, char[] cArr, boolean z) {
        if (j == 0) {
            return "0";
        }
        String str = z ? "0123456789ABCDEF" : "0123456789abcdef";
        int length = cArr.length;
        do {
            length--;
            cArr[length] = str.charAt((int) (15 & j));
            j >>>= 4;
        } while (j != 0);
        return new String(cArr, length, cArr.length - length);
    }
}
