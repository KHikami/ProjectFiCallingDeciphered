package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bni */
public final class bni extends bpb {
    final bob a;

    public bni(bnp bnp, bnr bnr) {
        super(bnp);
        buf.A((Object) bnr);
        this.a = new bob(bnp, bnr);
    }

    public final long a(bns bns) {
        o();
        buf.A((Object) bns);
        cqn.b();
        long a = this.a.a(bns, true);
        if (a == 0) {
            bno bno = this.a;
            cqn.b();
            bno.b("Sending first hit to property", bns.c);
            bnp bnp = bno.f;
            bnp.a(bnp.g);
            if (!bnp.g.c().a(bom.l())) {
                bnp = bno.f;
                bnp.a(bnp.g);
                String m = bnp.g.m();
                if (!TextUtils.isEmpty(m)) {
                    cqv a2 = bpq.a(bno.f.a(), m);
                    bno.b("Found relevant installation campaign", a2);
                    bno.a(bns, a2);
                }
            }
        }
        return a;
    }

    protected final void a() {
        this.a.p();
    }

    public final void a(bop bop) {
        o();
        this.f.b().a(new bnn(this, bop));
    }

    public final void a(bos bos) {
        buf.A((Object) bos);
        o();
        b("Hit delivery requested", bos);
        this.f.b().a(new bnm(this, bos));
    }

    public final void b() {
        o();
        Context context = this.f.a;
        if (bmc.a(context) && bmd.a(context)) {
            Intent intent = new Intent(context, bmd.class);
            intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            context.startService(intent);
            return;
        }
        a(null);
    }

    public final boolean c() {
        o();
        try {
            this.f.b().a(new bnj(this)).get(4, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e) {
            d("syncDispatchLocalHits interrupted", e);
            return false;
        } catch (ExecutionException e2) {
            e("syncDispatchLocalHits failed", e2);
            return false;
        } catch (TimeoutException e3) {
            d("syncDispatchLocalHits timed out", e3);
            return false;
        }
    }

    final void d() {
        cqn.b();
        bno bno = this.a;
        cqn.b();
        bno.g = bno.f.c.a();
    }
}
