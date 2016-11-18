package p000;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Formattable;
import java.util.Map;

public final class mqb extends mpz {
    private static final Map<mof, mqb[]> f28103a;
    private final mof f28104d;
    private final String f28105e;

    static {
        Map enumMap = new EnumMap(mof.class);
        for (mof mof : mof.values()) {
            enumMap.put(mof, mqb.m32688a(mof));
        }
        f28103a = Collections.unmodifiableMap(enumMap);
    }

    private static mqb[] m32688a(mof mof) {
        mqb[] mqbArr = new mqb[10];
        for (int i = 0; i < 10; i++) {
            mqbArr[i] = new mqb(i, mof, mog.f28005a);
        }
        return mqbArr;
    }

    public static mqb m32687a(int i, mof mof, mog mog) {
        if (i >= 10 || !mog.m32618a()) {
            return new mqb(i, mof, mog);
        }
        return ((mqb[]) f28103a.get(mof))[i];
    }

    private mqb(int i, mof mof, mog mog) {
        String d;
        super(mog, i);
        this.f28104d = (mof) ba.m4538a((Object) mof, "format char");
        if (mog == mog.f28005a) {
            d = mof.m32612d();
        } else {
            d = mog.m32617a(new StringBuilder("%")).append(mof.m32609a()).toString();
        }
        this.f28105e = d;
    }

    public Object mo3910a(Object obj, mon mon) {
        if (!this.f28104d.m32610b().mo3903a(obj)) {
            return mon.m32632a((mpz) this, obj);
        }
        if (this.f28059c != mog.f28005a) {
            return mpz.m32670a(this.f28105e, obj, mon);
        }
        mof mof = this.f28104d;
        switch (mqg.f28110a[mof.ordinal()]) {
            case 1:
                if (!(obj instanceof Formattable)) {
                    if (obj.getClass().isArray()) {
                        return mqb.m32689b(obj, mon);
                    }
                    return obj;
                }
                break;
            case 2:
                if (obj.getClass().isArray()) {
                    obj = mqb.m32689b(obj, mon);
                    break;
                }
                break;
            case 3:
            case 6:
                return obj;
            case 4:
                return mqb.m32686a(obj, false);
            case 5:
                return mqb.m32686a(obj, true);
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
        return mpz.m32670a(mof.m32612d(), obj, mon);
    }

    public String mo3911a() {
        return this.f28105e;
    }

    private static mps<?> m32689b(Object obj, mon mon) {
        return new mqe(obj, mon);
    }

    private static mps<Number> m32686a(Object obj, boolean z) {
        return new mqf((Number) obj, z);
    }

    static String m32685a(long j, char[] cArr, boolean z) {
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
