package p000;

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

public final class bwe implements jza, kco, kcp, kcq {
    final Context f4625a;
    final wt<btf> f4626b;
    final bwl f4627c;
    final BlockingQueue<Uri> f4628d;
    jgg f4629e;
    bwj f4630f;
    boolean f4631g;
    private final gln f4632h;
    private final lc<btf> f4633i;
    private final ContentObserver f4634j;
    private int f4635k;
    private btt f4636l;
    private bwi f4637m;
    private final Observer f4638n = new bwf(this);

    bwe(Context context, gln gln, wt<btf> wtVar, bwl bwl) {
        this.f4625a = context;
        this.f4632h = gln;
        this.f4626b = wtVar;
        this.f4627c = bwl;
        this.f4633i = new lc();
        this.f4634j = new bwm(this);
        this.f4628d = new LinkedBlockingQueue();
        gln.addObserver(this.f4638n);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4635k = ((jca) jyn.m25443a(jca.class)).mo2317a();
        this.f4629e = (jgg) jyn.m25443a(jgg.class);
        this.f4636l = (btt) jyn.m25443a(btt.class);
    }

    public void z_() {
        this.f4631g = true;
        m6817b();
    }

    void m6817b() {
        this.f4625a.getContentResolver().registerContentObserver(m6820f(), true, this.f4634j);
        this.f4637m = new bwi(this, this.f4625a, m6819e(), bny.f4074a, "type!=? AND (expiration_timestamp>? OR expiration_timestamp IS NULL)", bny.m6265a(), bny.f4075b, new bwg(this));
        this.f4637m.m4950b(new Void[0]);
    }

    public void A_() {
        this.f4631g = false;
        m6818d();
    }

    void m6818d() {
        this.f4625a.getContentResolver().unregisterContentObserver(this.f4634j);
        this.f4637m.cancel(true);
        this.f4637m = null;
        if (this.f4630f != null) {
            this.f4630f.q_();
        }
        this.f4630f = null;
    }

    void m6816a(bub bub, Set<String> set, bwl bwl) {
        synchronized (this.f4633i) {
            bwn bwn = new bwn();
            set.removeAll(bub.m6674b());
            for (String ad : set) {
                btf btf = (btf) this.f4633i.m28551a(gwb.ad(ad));
                if (btf != null) {
                    bwn.f4658a.add(btf);
                }
            }
            btf[] a = bub.m6673a();
            for (btf btf2 : a) {
                btf = (btf) this.f4633i.m28551a(btf2.f4388a);
                if (btf == null || btf.m6582a(btf, btf2) == 0) {
                    bwn.f4660c.add(btf2);
                } else {
                    bwn.f4659b.add(new Pair(btf, btf2));
                }
            }
            for (btf btf3 : bwn.f4658a) {
                this.f4633i.m28558c(btf3.f4388a);
            }
            for (Pair pair : bwn.f4659b) {
                btf3 = (btf) pair.second;
                this.f4633i.m28557b(btf3.f4388a, btf3);
            }
            for (btf btf32 : bwn.f4660c) {
                this.f4633i.m28557b(btf32.f4388a, btf32);
            }
            gwb.m1863a(new bwh(this, bwn, bwl));
        }
    }

    Uri m6819e() {
        return EsProvider.m8249a(this.f4635k, this.f4632h.m17986a()).buildUpon().appendQueryParameter("limit", "500").build();
    }

    Uri m6820f() {
        return EsProvider.m8264b(this.f4635k, this.f4632h.m17986a());
    }

    public void m6814a(long j, bwl bwl) {
        new bwi(this, this.f4625a, m6819e(), bny.f4074a, "type!=? AND (expiration_timestamp>? OR expiration_timestamp IS NULL) AND timestamp <?", bny.m6266a(j), bny.f4075b, bwl).m4950b(new Void[0]);
    }
}
