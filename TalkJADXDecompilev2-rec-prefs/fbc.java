package p000;

import java.io.Serializable;
import java.util.EnumMap;
import java.util.concurrent.TimeUnit;

public final class fbc implements Serializable {
    private static final long serialVersionUID = 2;
    public final long f12616a;
    public final String f12617b;
    private final EnumMap<etx, Object> f12618c = new EnumMap(etx.class);

    public fbc(ltv ltv, String str, long j) {
        Object a;
        lpq lpq;
        lso lso;
        EnumMap enumMap;
        Enum enumR;
        lpp[] lppArr;
        Object obj = null;
        this.f12616a = j;
        this.f12617b = str;
        this.f12618c.put(etx.REACHABLE, ltv.f26414a);
        this.f12618c.put(etx.AVAILABLE, ltv.f26415b);
        EnumMap enumMap2 = this.f12618c;
        Enum enumR2 = etx.STATUS_MESSAGE;
        lwg lwg = ltv.f26422i;
        if (lwg != null) {
            ltb[] ltbArr = lwg.f26677a;
            if (ltbArr != null && ltbArr.length > 0) {
                ofu[] ofuArr = ltbArr[0].f26363a;
                if (ofuArr != null && ofuArr.length > 0) {
                    a = gwb.m1668a(fpd.m15868a(ofuArr), null);
                    enumMap2.put(enumR2, a);
                    this.f12618c.put(etx.CALL_TYPE, ltv.f26418e == null ? ltv.f26418e.f26291a : null);
                    enumMap2 = this.f12618c;
                    enumR2 = etx.DEVICE_STATUS;
                    lpq = ltv.f26419f;
                    a = lpq == null ? gwb.m2061b(lpq.f26020a) ? Integer.valueOf(1) : gwb.m2061b(lpq.f26022c) ? Integer.valueOf(2) : gwb.m2061b(lpq.f26021b) ? Integer.valueOf(3) : Integer.valueOf(0) : null;
                    enumMap2.put(enumR2, a);
                    enumMap2 = this.f12618c;
                    enumR2 = etx.LAST_SEEN;
                    lso = ltv.f26423j;
                    if (lso != null || lso.f26333a == null) {
                        a = null;
                    } else {
                        a = Long.valueOf(TimeUnit.MICROSECONDS.toMillis(gwb.m1524a(lso.f26333a, 0)));
                    }
                    enumMap2.put(enumR2, a);
                    enumMap = this.f12618c;
                    enumR = etx.LOCATION;
                    lppArr = ltv.f26416c;
                    if (lppArr != null && lppArr.length > 0) {
                        obj = new ety(lppArr[0]);
                    }
                    enumMap.put(enumR, obj);
                }
            }
        }
        a = null;
        enumMap2.put(enumR2, a);
        if (ltv.f26418e == null) {
        }
        this.f12618c.put(etx.CALL_TYPE, ltv.f26418e == null ? ltv.f26418e.f26291a : null);
        enumMap2 = this.f12618c;
        enumR2 = etx.DEVICE_STATUS;
        lpq = ltv.f26419f;
        if (lpq == null) {
        }
        enumMap2.put(enumR2, a);
        enumMap2 = this.f12618c;
        enumR2 = etx.LAST_SEEN;
        lso = ltv.f26423j;
        if (lso != null) {
        }
        a = null;
        enumMap2.put(enumR2, a);
        enumMap = this.f12618c;
        enumR = etx.LOCATION;
        lppArr = ltv.f26416c;
        obj = new ety(lppArr[0]);
        enumMap.put(enumR, obj);
    }

    public Object m14879a(etx etx) {
        return this.f12618c.get(etx);
    }
}
