import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Field;

public final class jvr {
    private static final lo<Class<? extends nzf>, Field> a;

    static {
        a = new lo();
    }

    private static <M extends nzf> Field a(M m) {
        Field field;
        Class cls = m.getClass();
        synchronized (a) {
            field = (Field) a.get(cls);
            if (field == null) {
                field = cls.getField("apiHeader");
                a.put(cls, field);
            }
        }
        return field;
    }

    public static <RQ extends nzf> void a(Context context, RQ rq, String str, boolean z, int i) {
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
        jvb jvb = (jvb) jyn.b(context, jvb.class);
        Object f = jvb != null ? jvb.f() : null;
        if (!TextUtils.isEmpty(f)) {
            oxq.m = f;
        }
        ofg ofg = new ofg();
        ofg.b = gwb.ae(context);
        if (gwb.az(context)) {
            ofg.a = 3;
        } else {
            ofg.a = 2;
        }
        ofg.c = 2;
        ofg.d = i;
        oxq.n = ofg;
        try {
            Field a = a(rq);
            kmr kmr = new kmr();
            kmr.b = oxq;
            if (context != null) {
                jhy jhy = (jhy) jyn.b(context, jhy.class);
                if (jhy != null) {
                    str2 = jhy.a();
                }
            }
            kmr.d = str2;
            a.set(rq, kmr);
        } catch (Throwable e) {
            Log.e("PlusiUtils", "Failed to find apiHeader field on an http request, this should not happen", e);
        } catch (Throwable e2) {
            Log.e("PlusiUtils", "apiHeader field on http request was not accessible, this should not happen", e2);
        }
    }
}
