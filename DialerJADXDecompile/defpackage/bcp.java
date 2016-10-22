package defpackage;

import android.content.ContentUris;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.CallLog;
import android.telecom.Call;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bcp */
public final class bcp implements aux {
    private /* synthetic */ AtomicBoolean a;
    private /* synthetic */ Handler b;
    private /* synthetic */ Runnable c;
    private /* synthetic */ bde d;
    private /* synthetic */ Call e;
    private /* synthetic */ String f;
    private /* synthetic */ long g;
    private /* synthetic */ bcj h;

    public bcp(bcj bcj, AtomicBoolean atomicBoolean, Handler handler, Runnable runnable, bde bde, Call call, String str, long j) {
        this.h = bcj;
        this.a = atomicBoolean;
        this.b = handler;
        this.c = runnable;
        this.d = bde;
        this.e = call;
        this.f = str;
        this.g = j;
    }

    public final void a(Integer num) {
        if (!this.a.get()) {
            this.b.removeCallbacks(this.c);
        }
        if (num == null) {
            if (!this.a.get()) {
                this.d.a();
                this.h.k.a(this.h.i, this.e, this.d);
            }
        } else if (num.intValue() == -1) {
            bdf.a((Object) this, "checkForBlockedCall: invalid number, skipping block checking");
            if (!this.a.get()) {
                this.b.removeCallbacks(this.c);
                this.d.a();
                this.h.k.a(this.h.i, this.e, this.d);
            }
        } else {
            bdf.d(this, "Rejecting incoming call from blocked number");
            this.e.reject(false, null);
            buf.H(this.h.i).b(15);
            aup aup = this.h.t;
            if (!buf.w(aup.b)) {
                aup.startUpdate(0, null, ContentUris.withAppendedId(awe.b, (long) num.intValue()), null, null, null);
            }
            if (this.h.i != null) {
                ContentObserver bep = new bep(this.h.i, new Handler(), this.f, this.g);
                buf.a("BlockedNumberContentObserver.register", new Object[0]);
                bep.a.getContentResolver().registerContentObserver(CallLog.CONTENT_URI, true, bep);
                bep.b.postDelayed(bep.c, 5000);
            }
        }
    }
}
