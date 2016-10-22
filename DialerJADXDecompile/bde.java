import android.os.Bundle;
import android.os.SystemClock;
import android.telecom.Call;

/* compiled from: PG */
public final class bde {
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public long f;
    public long g;
    public long h;
    public boolean i;

    public bde() {
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.a = false;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = SystemClock.elapsedRealtime();
    }

    public bde(Call call) {
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.a = call.getState() == 2;
        Bundle intentExtras = call.getDetails().getIntentExtras();
        if (intentExtras == null) {
            this.b = -1;
            this.c = -1;
            this.d = -1;
        } else {
            this.b = intentExtras.getLong("android.telecom.extra.CALL_CREATED_TIME_MILLIS", -1);
            this.c = intentExtras.getLong("android.telecom.extra.CALL_TELECOM_ROUTING_START_TIME_MILLIS", -1);
            this.d = intentExtras.getLong("android.telecom.extra.CALL_TELECOM_ROUTING_END_TIME_MILLIS", -1);
        }
        this.e = SystemClock.elapsedRealtime();
    }

    public final void a() {
        if (this.f == -1) {
            this.f = SystemClock.elapsedRealtime();
        }
    }
}
