package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.apps.hangouts.content.EsProvider;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import wt;

/* renamed from: bwe */
public final class bwe implements jza, kco, kcp, kcq {
    final Context a;
    final wt<btf> b;
    final bwl c;
    final BlockingQueue<Uri> d;
    jgg e;
    bwj f;
    boolean g;
    private final gln h;
    private final lc<btf> i;
    private final ContentObserver j;
    private int k;
    private btt l;
    private bwi m;
    private final Observer n;

    bwe(Context context, gln gln, wt<btf> wtVar, bwl bwl) {
        this.n = new bwf(this);
        this.a = context;
        this.h = gln;
        this.b = wtVar;
        this.c = bwl;
        this.i = new lc();
        this.j = new bwm(this);
        this.d = new LinkedBlockingQueue();
        gln.addObserver(this.n);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.k = ((jca) jyn.a(jca.class)).a();
        this.e = (jgg) jyn.a(jgg.class);
        this.l = (btt) jyn.a(btt.class);
    }

    public void z_() {
        this.g = true;
        b();
    }

    void b() {
        this.a.getContentResolver().registerContentObserver(f(), true, this.j);
        this.m = new bwi(this, this.a, e(), bny.a, "type!=? AND (expiration_timestamp>? OR expiration_timestamp IS NULL)", bny.a(), bny.b, new bwg(this));
        this.m.b(new Void[0]);
    }

    public void A_() {
        this.g = false;
        d();
    }

    void d() {
        this.a.getContentResolver().unregisterContentObserver(this.j);
        this.m.cancel(true);
        this.m = null;
        if (this.f != null) {
            this.f.q_();
        }
        this.f = null;
    }

    void a(bub bub, Set<String> set, bwl bwl) {
        synchronized (this.i) {
            bwn bwn = new bwn();
            set.removeAll(bub.b());
            for (String ad : set) {
                btf btf = (btf) this.i.a(gwb.ad(ad));
                if (btf != null) {
                    bwn.a.add(btf);
                }
            }
            btf[] a = bub.a();
            for (btf btf2 : a) {
                btf = (btf) this.i.a(btf2.a);
                if (btf == null || btf.a(btf, btf2) == 0) {
                    bwn.c.add(btf2);
                } else {
                    bwn.b.add(new Pair(btf, btf2));
                }
            }
            for (btf btf3 : bwn.a) {
                this.i.c(btf3.a);
            }
            for (Pair pair : bwn.b) {
                btf3 = (btf) pair.second;
                this.i.b(btf3.a, btf3);
            }
            for (btf btf32 : bwn.c) {
                this.i.b(btf32.a, btf32);
            }
            gwb.a(new bwh(this, bwn, bwl));
        }
    }

    Uri e() {
        return EsProvider.a(this.k, this.h.a()).buildUpon().appendQueryParameter("limit", "500").build();
    }

    Uri f() {
        return EsProvider.b(this.k, this.h.a());
    }

    public void a(long j, bwl bwl) {
        new bwi(this, this.a, e(), bny.a, "type!=? AND (expiration_timestamp>? OR expiration_timestamp IS NULL) AND timestamp <?", bny.a(j), bny.b, bwl).b(new Void[0]);
    }
}
