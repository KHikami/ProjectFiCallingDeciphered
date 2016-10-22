package defpackage;

import android.telecom.Call;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bco */
public final class bco implements Runnable {
    private /* synthetic */ AtomicBoolean a;
    private /* synthetic */ bde b;
    private /* synthetic */ Call c;
    private /* synthetic */ bcj d;

    public bco(bcj bcj, AtomicBoolean atomicBoolean, bde bde, Call call) {
        this.d = bcj;
        this.a = atomicBoolean;
        this.b = bde;
        this.c = call;
    }

    public final void run() {
        this.a.set(true);
        this.b.a();
        this.d.k.a(this.d.i, this.c, this.b);
    }
}
