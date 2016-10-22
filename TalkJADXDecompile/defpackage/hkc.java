package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import android.util.Log;

/* renamed from: hkc */
public final class hkc extends hjk {
    private final hjz f;

    public hkc(Context context, Looper looper, guk guk, gul gul, String str) {
        this(context, looper, guk, gul, str, gwa.a(context));
    }

    private hkc(Context context, Looper looper, guk guk, gul gul, String str, gwa gwa) {
        super(context, looper, guk, gul, str, gwa);
        this.f = new hjz(context, this.e);
    }

    public void a() {
        synchronized (this.f) {
            if (b()) {
                try {
                    this.f.a();
                    this.f.b();
                } catch (Throwable e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.a();
        }
    }

    public void a(long j, PendingIntent pendingIntent) {
        n();
        gwb.L((Object) pendingIntent);
        gwb.b(j >= 0, (Object) "detectionIntervalMillis must be >= 0");
        ((hjt) p()).a(j, true, pendingIntent);
    }

    public void a(PendingIntent pendingIntent) {
        n();
        gwb.L((Object) pendingIntent);
        ((hjt) p()).a(pendingIntent);
    }
}
