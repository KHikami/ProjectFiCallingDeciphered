package p000;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class izz extends jah {
    final Runnable f19504a;
    final ieb f19505c;
    final iea f19506d;
    final iee<ied> f19507e;
    private final Object f19508f;
    private final Context f19509g;
    private final idd f19510h;
    private final idz f19511i;
    private final ida f19512j;
    private final String f19513k;
    private final iyr<ScheduledExecutorService> f19514l;
    private final AtomicReference<ScheduledFuture<?>> f19515m;
    private idy f19516n;
    private idx f19517o;
    private volatile idc f19518p;

    private izz(Context context, idd idd, idz idz, ida ida, String str, iyr<ScheduledExecutorService> iyr_java_util_concurrent_ScheduledExecutorService) {
        this.f19508f = new Object();
        this.f19515m = new AtomicReference();
        this.f19504a = new jaa(this);
        this.f19505c = new jab(this);
        this.f19506d = new jac(this);
        this.f19507e = new jad(this);
        this.f19509g = context.getApplicationContext();
        this.f19510h = (idd) ba.m4536a((Object) idd);
        this.f19511i = (idz) ba.m4536a((Object) idz);
        this.f19512j = (ida) ba.m4536a((Object) ida);
        this.f19513k = (String) ba.m4536a((Object) str);
        this.f19514l = (iyr) ba.m4536a((Object) iyr_java_util_concurrent_ScheduledExecutorService);
    }

    protected void mo3427b(ook ook) {
        if (Log.isLoggable("ClearcutTransmitter", 2)) {
            ook.toString();
        }
        m23619b().mo3146a(nzf.m1029a((nzf) ook)).mo3151a(m23620c()).m21645a(this.f19507e);
    }

    private idc m23619b() {
        if (this.f19518p == null) {
            synchronized (this.f19508f) {
                if (this.f19518p == null) {
                    this.f19518p = this.f19510h.mo3145a(this.f19509g, this.f19513k, null);
                }
            }
        }
        return this.f19518p;
    }

    private idx m23620c() {
        idx idx;
        synchronized (this.f19508f) {
            if (this.f19517o == null) {
                if (this.f19516n == null) {
                    this.f19516n = this.f19511i.newBuilder(this.f19509g);
                }
                this.f19517o = this.f19516n.mo3153a(this.f19512j.mo3150a()).mo3152a();
                this.f19517o.mo3167a(this.f19505c);
                this.f19517o.mo3166a(this.f19506d);
                this.f19517o.mo3165a();
            }
            ScheduledFuture scheduledFuture = (ScheduledFuture) this.f19515m.getAndSet(null);
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            idx = this.f19517o;
        }
        return idx;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m23621a() {
        synchronized (this.f19508f) {
            if (Thread.interrupted()) {
            } else if (this.f19517o != null) {
                this.f19517o.mo3168b();
                this.f19517o.mo3169b(this.f19506d);
                this.f19517o.mo3170b(this.f19505c);
                this.f19517o = null;
            }
        }
    }

    void m23622a(idr idr) {
        if (Log.isLoggable("ClearcutTransmitter", 3)) {
            String valueOf = String.valueOf(idr);
            new StringBuilder(String.valueOf(valueOf).length() + 28).append("onConnectionFailed, result: ").append(valueOf);
        }
        synchronized (this.f19508f) {
            if (this.f19517o != null) {
                this.f19517o.mo3170b(this.f19505c);
                this.f19517o.mo3169b(this.f19506d);
                this.f19517o = null;
            }
        }
    }

    static void m23617a(int i) {
        if (Log.isLoggable("ClearcutTransmitter", 3)) {
            new StringBuilder(41).append("onConnectionSuspended, cause: ").append(i);
        }
    }

    public izz(Context context, idd idd, idz idz, ida ida, String str) {
        this(context, idd, idz, ida, str, ixx.f19383c);
    }

    static /* synthetic */ void m23618a(izz izz, ied ied) {
        if (Log.isLoggable("ClearcutTransmitter", 3)) {
            new StringBuilder(24).append("onResult, success: ").append(ied.mo3158a());
        }
        ScheduledFuture scheduledFuture = (ScheduledFuture) izz.f19515m.getAndSet(((ScheduledExecutorService) izz.f19514l.mo3325a()).schedule(izz.f19504a, 15000, TimeUnit.MILLISECONDS));
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
