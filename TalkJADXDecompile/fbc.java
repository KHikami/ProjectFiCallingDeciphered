import java.io.Serializable;
import java.util.EnumMap;
import java.util.concurrent.TimeUnit;

public final class fbc implements Serializable {
    private static final long serialVersionUID = 2;
    public final long a;
    public final String b;
    private final EnumMap<etx, Object> c;

    public fbc(ltv ltv, String str, long j) {
        Object a;
        lpq lpq;
        lso lso;
        EnumMap enumMap;
        Enum enumR;
        lpp[] lppArr;
        Object obj = null;
        this.c = new EnumMap(etx.class);
        this.a = j;
        this.b = str;
        this.c.put(etx.REACHABLE, ltv.a);
        this.c.put(etx.AVAILABLE, ltv.b);
        EnumMap enumMap2 = this.c;
        Enum enumR2 = etx.STATUS_MESSAGE;
        lwg lwg = ltv.i;
        if (lwg != null) {
            ltb[] ltbArr = lwg.a;
            if (ltbArr != null && ltbArr.length > 0) {
                ofu[] ofuArr = ltbArr[0].a;
                if (ofuArr != null && ofuArr.length > 0) {
                    a = gwb.a(fpd.a(ofuArr), null);
                    enumMap2.put(enumR2, a);
                    this.c.put(etx.CALL_TYPE, ltv.e == null ? ltv.e.a : null);
                    enumMap2 = this.c;
                    enumR2 = etx.DEVICE_STATUS;
                    lpq = ltv.f;
                    a = lpq == null ? gwb.b(lpq.a) ? Integer.valueOf(1) : gwb.b(lpq.c) ? Integer.valueOf(2) : gwb.b(lpq.b) ? Integer.valueOf(3) : Integer.valueOf(0) : null;
                    enumMap2.put(enumR2, a);
                    enumMap2 = this.c;
                    enumR2 = etx.LAST_SEEN;
                    lso = ltv.j;
                    if (lso != null || lso.a == null) {
                        a = null;
                    } else {
                        a = Long.valueOf(TimeUnit.MICROSECONDS.toMillis(gwb.a(lso.a, 0)));
                    }
                    enumMap2.put(enumR2, a);
                    enumMap = this.c;
                    enumR = etx.LOCATION;
                    lppArr = ltv.c;
                    if (lppArr != null && lppArr.length > 0) {
                        obj = new ety(lppArr[0]);
                    }
                    enumMap.put(enumR, obj);
                }
            }
        }
        a = null;
        enumMap2.put(enumR2, a);
        if (ltv.e == null) {
        }
        this.c.put(etx.CALL_TYPE, ltv.e == null ? ltv.e.a : null);
        enumMap2 = this.c;
        enumR2 = etx.DEVICE_STATUS;
        lpq = ltv.f;
        if (lpq == null) {
        }
        enumMap2.put(enumR2, a);
        enumMap2 = this.c;
        enumR2 = etx.LAST_SEEN;
        lso = ltv.j;
        if (lso != null) {
        }
        a = null;
        enumMap2.put(enumR2, a);
        enumMap = this.c;
        enumR = etx.LOCATION;
        lppArr = ltv.c;
        obj = new ety(lppArr[0]);
        enumMap.put(enumR, obj);
    }

    public Object a(etx etx) {
        return this.c.get(etx);
    }
}
