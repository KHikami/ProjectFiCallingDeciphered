package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import android.util.Log;

public final class hkc extends hjk {
    private final hjz f17056f;

    public hkc(Context context, Looper looper, guk guk, gul gul, String str) {
        this(context, looper, guk, gul, str, gwa.m18753a(context));
    }

    private hkc(Context context, Looper looper, guk guk, gul gul, String str, gwa gwa) {
        super(context, looper, guk, gul, str, gwa);
        this.f17056f = new hjz(context, this.e);
    }

    public void mo2600a() {
        synchronized (this.f17056f) {
            if (m18702b()) {
                try {
                    this.f17056f.m19985a();
                    this.f17056f.m19986b();
                } catch (Throwable e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.mo2600a();
        }
    }

    public void m19997a(long j, PendingIntent pendingIntent) {
        m18712n();
        gwb.m1419L((Object) pendingIntent);
        gwb.m2048b(j >= 0, (Object) "detectionIntervalMillis must be >= 0");
        ((hjt) m18714p()).mo2567a(j, true, pendingIntent);
    }

    public void m19998a(PendingIntent pendingIntent) {
        m18712n();
        gwb.m1419L((Object) pendingIntent);
        ((hjt) m18714p()).mo2568a(pendingIntent);
    }
}
