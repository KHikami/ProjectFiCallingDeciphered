package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Field;

public final class jvr {
    private static final lo<Class<? extends nzf>, Field> f21144a = new lo();

    private static <M extends nzf> Field m25325a(M m) {
        Field field;
        Class cls = m.getClass();
        synchronized (f21144a) {
            field = (Field) f21144a.get(cls);
            if (field == null) {
                field = cls.getField("apiHeader");
                f21144a.put(cls, field);
            }
        }
        return field;
    }

    public static <RQ extends nzf> void m25326a(Context context, RQ rq, String str, boolean z, int i) {
        String str2 = null;
        oxq oxq = new oxq();
        oxz oxz = new oxz();
        oxz.a = Integer.valueOf(gwb.au(context));
        oxz.b = Integer.valueOf(gwb.av(context));
        oxz.c = Integer.valueOf(gwb.aw(context));
        oxq.j = Integer.valueOf(gwb.at(context));
        oxq.p = oxz;
        oxq.i = str;
        if (null != null) {
            oxq.s = new ofj();
            oxq.s.a(ofi.a, null);
        }
        jvb jvb = (jvb) jyn.m25433b(context, jvb.class);
        Object f = jvb != null ? jvb.mo2057f() : null;
        if (!TextUtils.isEmpty(f)) {
            oxq.m = f;
        }
        ofg ofg = new ofg();
        ofg.f28731b = gwb.ae(context);
        if (gwb.az(context)) {
            ofg.f28730a = 3;
        } else {
            ofg.f28730a = 2;
        }
        ofg.f28732c = 2;
        ofg.f28733d = i;
        oxq.n = ofg;
        try {
            Field a = jvr.m25325a(rq);
            kmr kmr = new kmr();
            kmr.f22388b = oxq;
            if (context != null) {
                jhy jhy = (jhy) jyn.m25433b(context, jhy.class);
                if (jhy != null) {
                    str2 = jhy.m24292a();
                }
            }
            kmr.f22390d = str2;
            a.set(rq, kmr);
        } catch (Throwable e) {
            Log.e("PlusiUtils", "Failed to find apiHeader field on an http request, this should not happen", e);
        } catch (Throwable e2) {
            Log.e("PlusiUtils", "apiHeader field on http request was not accessible, this should not happen", e2);
        }
    }
}
