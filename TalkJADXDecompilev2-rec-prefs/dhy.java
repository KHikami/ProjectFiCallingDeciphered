package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.hangouts.R$drawable;

public final class dhy {
    private final did f9782a;
    private final Context f9783b;

    public dhy(Context context, did did) {
        iil.m21875b("Expected non-null", (Object) did);
        this.f9782a = did;
        this.f9783b = context;
    }

    public Notification m11882a() {
        int i;
        long a = glj.m17956a();
        String l = this.f9782a.m11990l();
        Resources resources = this.f9783b.getResources();
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f9783b, gks.m17890a(4), gwb.m2376w(l), 134217728);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this.f9783b, gks.m17890a(101), gwb.m2383x(l), 134217728);
        fx a2 = new fx(this.f9783b).m16419a(a);
        if (m11878b() || this.f9782a.m11946K()) {
            i = R$drawable.cu;
        } else {
            i = R$drawable.cq;
        }
        return a2.m16417a(i).m16429a(resources.getString(m11879c())).m16436b(resources.getString(m11880d())).m16438b(true).m16421a(broadcast).m16444d(2).m16447e(ia.m10680c(this.f9783b, gwb.dU)).m16418a(R$drawable.ba, resources.getString(m11881e()), broadcast2).m16433b();
    }

    private boolean m11878b() {
        return this.f9782a.m11945J() == 1;
    }

    private int m11879c() {
        if (m11878b()) {
            return bc.uf;
        }
        if (this.f9782a.m11946K()) {
            return bc.ut;
        }
        return bc.ej;
    }

    private int m11880d() {
        if (m11878b()) {
            return bc.ue;
        }
        return bc.ei;
    }

    private int m11881e() {
        if (m11878b()) {
            return bc.ud;
        }
        return bc.dn;
    }
}
