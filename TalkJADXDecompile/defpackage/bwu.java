package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Observer;
import wt;

/* renamed from: bwu */
final class bwu extends aei implements kcd, kco, kcp, kcq {
    final Context a;
    final int b;
    final bwx c;
    gln d;
    buc e;
    fg f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    private wt<btf> k;
    private bwe l;
    private acx m;
    private fip n;
    private boolean o;
    private final Observer p;

    public bwu(Context context) {
        this.p = new bwv(this);
        this.a = context;
        this.b = ((jca) jyn.a(context, jca.class)).a();
        this.c = new bwx(this);
    }

    public void a(gln gln, wt<btf> wtVar, buc buc, bwe bwe, acx acx, fg fgVar) {
        this.d = gln;
        this.k = wtVar;
        this.e = buc;
        this.l = bwe;
        this.m = acx;
        this.f = fgVar;
        gln.addObserver(this.p);
    }

    public void b() {
        this.o = true;
        e();
    }

    void d() {
        if (this.o) {
            String a = this.d.a();
            if (!this.g && !blo.a(a) && this.i && !this.j) {
                this.g = true;
                RealTimeChatService.a(((fmf) jyn.a(this.a, fmf.class)).a(), this.b, a);
            } else if (!this.g) {
                blo.a(a);
            }
            if (!this.h && !this.i) {
                long j;
                if (this.k.a() > 0) {
                    j = ((btf) this.k.a(this.k.a() - 1)).g;
                } else {
                    j = Long.MAX_VALUE;
                }
                this.h = true;
                this.l.a(j, new bww(this));
            }
        }
    }

    public void a(Bundle bundle) {
        this.f.a(bm.n, null, this.c);
        this.n = new bwy(this);
    }

    public void z_() {
        RealTimeChatService.a(this.n);
    }

    public void A_() {
        RealTimeChatService.b(this.n);
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        e();
    }

    public void a(RecyclerView recyclerView, int i) {
    }

    void e() {
        if (this.m.s() >= this.m.G() - 9) {
            d();
        }
    }
}
