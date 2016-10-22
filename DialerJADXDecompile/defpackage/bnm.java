package defpackage;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bnm */
final class bnm implements Runnable {
    private /* synthetic */ bos a;
    private /* synthetic */ bni b;

    bnm(bni bni, bos bos) {
        this.b = bni;
        this.a = bos;
    }

    public final void run() {
        bos bos;
        bno bno = this.b.a;
        bos bos2 = this.a;
        buf.A((Object) bos2);
        cqn.b();
        bno.o();
        if (bno.h) {
            bno.c("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            bno.a("Delivering hit", bos2);
        }
        if (TextUtils.isEmpty(bos2.a("_m", ""))) {
            Pair pair;
            bnp bnp = bno.f;
            bnp.a(bnp.g);
            boy boy = bnp.g.b;
            long b = boy.b();
            b = b == 0 ? 0 : Math.abs(b - boy.b.f.c.a());
            if (b < boy.a) {
                pair = null;
            } else if (b > (boy.a << 1)) {
                boy.a();
                pair = null;
            } else {
                String string = boy.b.a.getString(boy.d(), null);
                long j = boy.b.a.getLong(boy.c(), 0);
                boy.a();
                pair = (string == null || j <= 0) ? null : new Pair(string, Long.valueOf(j));
            }
            if (pair == null) {
                bos = bos2;
            } else {
                String str = ((Long) pair.second) + ":" + ((String) pair.first);
                Map hashMap = new HashMap(bos2.a);
                hashMap.put("_m", str);
                bos = new bos(bno, hashMap, bos2.d, bos2.f, bos2.c, bos2.e, bos2.b);
            }
        } else {
            bos = bos2;
        }
        bno.c();
        if (bno.d.a(bos)) {
            bno.c("Hit sent to the device AnalyticsService for delivery");
        } else if (btq.a) {
            bno.f.a().a(bos, "Service unavailable on package side");
        } else {
            try {
                bno.b.a(bos);
                bno.l();
            } catch (SQLiteException e) {
                bno.e("Delivery failed to save hit to a database", e);
                bno.f.a().a(bos, "deliver: failed to insert hit to database");
            }
        }
    }
}
