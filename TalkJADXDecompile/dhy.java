import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.hangouts.R$drawable;

public final class dhy {
    private final did a;
    private final Context b;

    public dhy(Context context, did did) {
        iil.b("Expected non-null", (Object) did);
        this.a = did;
        this.b = context;
    }

    public Notification a() {
        int i;
        long a = glj.a();
        String l = this.a.l();
        Resources resources = this.b.getResources();
        PendingIntent broadcast = PendingIntent.getBroadcast(this.b, gks.a(4), gwb.w(l), 134217728);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this.b, gks.a(101), gwb.x(l), 134217728);
        fx a2 = new fx(this.b).a(a);
        if (b() || this.a.K()) {
            i = R$drawable.cu;
        } else {
            i = R$drawable.cq;
        }
        return a2.a(i).a(resources.getString(c())).b(resources.getString(d())).b(true).a(broadcast).d(2).e(ia.c(this.b, gwb.dU)).a(R$drawable.ba, resources.getString(e()), broadcast2).b();
    }

    private boolean b() {
        return this.a.J() == 1;
    }

    private int c() {
        if (b()) {
            return bc.uf;
        }
        if (this.a.K()) {
            return bc.ut;
        }
        return bc.ej;
    }

    private int d() {
        if (b()) {
            return bc.ue;
        }
        return bc.ei;
    }

    private int e() {
        if (b()) {
            return bc.ud;
        }
        return bc.dn;
    }
}
