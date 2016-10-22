package defpackage;

import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.android.incallui.NotificationBroadcastReceiver;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: bdn */
public class bdn implements azz, bcv {
    static final long[] a;
    final Context b;
    final bbc c;
    final NotificationManager d;
    final beu e;
    aic f;
    int g;
    int h;
    int i;
    String j;
    Bitmap k;
    String l;
    String m;
    Uri n;

    static {
        a = new long[]{0, 1000, 1000};
    }

    public bdn(Context context, bbc bbc) {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = null;
        this.m = null;
        Objects.requireNonNull(context);
        this.b = context;
        this.f = buf.M(this.b);
        this.c = bbc;
        this.d = (NotificationManager) this.b.getSystemService("notification");
        this.e = new beu(new bev(new bew(), new bdz()), azs.a);
        this.g = 0;
    }

    static void a(Context context) {
        bdf.c(bdn.class.getSimpleName(), "Something terrible happened. Clear all InCall notifications");
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        notificationManager.cancel(1);
        notificationManager.cancel(2);
    }

    static PendingIntent a(Context context, String str) {
        return PendingIntent.getBroadcast(context, 0, new Intent(str, null, context, NotificationBroadcastReceiver.class), 0);
    }

    public final void a(bcu bcu, bcu bcu2, azs azs) {
        boolean z = false;
        bdf.a((Object) this, "onStateChange");
        bdf.a((Object) this, "updateInCallNotification...");
        ayo b = bdn.b(azs);
        if (b != null) {
            if (b.c() == 4 || b.c() == 5) {
                z = true;
            }
            if (!TextUtils.isEmpty(this.m)) {
                azs.a.b(this.m, (azz) this);
            }
            this.m = b.d;
            azs.a.a(b.d, (azz) this);
            this.c.a(b, z, new bdo(this));
            return;
        }
        if (!TextUtils.isEmpty(this.m)) {
            azs.a.b(this.m, (azz) this);
            this.m = null;
        }
        if (this.g != 0) {
            bdf.a((Object) this, "cancelInCall()...");
            this.d.cancel(this.g);
        }
        this.g = 0;
    }

    public final void a(azs azs) {
        boolean z = false;
        bdf.a((Object) this, "updateInCallNotification...");
        ayo b = bdn.b(azs);
        if (b != null) {
            if (b.c() == 4 || b.c() == 5) {
                z = true;
            }
            if (!TextUtils.isEmpty(this.m)) {
                azs.a.b(this.m, (azz) this);
            }
            this.m = b.d;
            azs.a.a(b.d, (azz) this);
            this.c.a(b, z, new bdo(this));
            return;
        }
        if (!TextUtils.isEmpty(this.m)) {
            azs.a.b(this.m, (azz) this);
            this.m = null;
        }
        if (this.g != 0) {
            bdf.a((Object) this, "cancelInCall()...");
            this.d.cancel(this.g);
        }
        this.g = 0;
    }

    static void a(ayo ayo, int i, Builder builder) {
        if (i == 3) {
            builder.setUsesChronometer(true);
            builder.setWhen(ayo.g());
            return;
        }
        builder.setUsesChronometer(false);
    }

    final String a(ayo ayo, long j) {
        int i = (ayo.c() == 4 || ayo.c() == 5) ? 1 : 0;
        if (i != 0 && ayo.d() == 1) {
            if (!TextUtils.isEmpty(ayo.k)) {
                return this.b.getString(aq.ck, new Object[]{ayo.k});
            } else if (!TextUtils.isEmpty(ayo.m) && ayo.t) {
                return ayo.m;
            }
        }
        int i2 = aq.cR;
        if (ayo.c(8)) {
            i2 = aq.cS;
        }
        if (i != 0) {
            if (ayo.c(8)) {
                i2 = aq.cL;
            } else if (ayo.o) {
                i2 = aq.cM;
            } else {
                i2 = aq.cK;
            }
        } else if (ayo.c() == 8) {
            i2 = aq.cQ;
        } else if (buf.f(ayo.c())) {
            i2 = aq.cI;
        } else if (ayo.i == 3) {
            i2 = aq.cV;
        }
        boolean c = ayo.c(32);
        if (j == 1 || c) {
            if (i2 == aq.cR) {
                i2 = aq.cT;
            } else if (i2 == aq.cS) {
                i2 = aq.cU;
            } else if (i2 == aq.cL) {
                i2 = aq.cP;
            } else if (i2 == aq.cK) {
                i2 = aq.cO;
            }
        }
        return this.b.getString(i2);
    }

    static ayo b(azs azs) {
        if (azs == null) {
            return null;
        }
        ayo j = azs.j();
        if (j == null) {
            j = azs.d();
        }
        if (j == null) {
            j = azs.l();
        }
        if (j == null) {
            return azs.i();
        }
        return j;
    }

    final PendingIntent a(boolean z) {
        int i = 1;
        Intent b = bcj.b().b(false, false);
        if (z) {
            b.putExtra("InCallActivity.for_full_screen_intent", true);
        } else {
            i = 0;
        }
        return PendingIntent.getActivity(this.b, i, b, 0);
    }

    public final void a(int i) {
        if (i == 0) {
            if (this.m != null) {
                azs.a.b(this.m, (azz) this);
            }
            a(azs.a);
        }
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void d(ayo ayo) {
        if (azs.a.j() == null) {
            beu beu = this.e;
            buf.c();
        }
    }
}
