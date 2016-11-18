package p000;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Observer;

final class bwu extends aei implements kcd, kco, kcp, kcq {
    final Context f4682a;
    final int f4683b;
    final bwx f4684c;
    gln f4685d;
    buc f4686e;
    fg f4687f;
    boolean f4688g;
    boolean f4689h;
    boolean f4690i;
    boolean f4691j;
    private wt<btf> f4692k;
    private bwe f4693l;
    private acx f4694m;
    private fip f4695n;
    private boolean f4696o;
    private final Observer f4697p = new bwv(this);

    public bwu(Context context) {
        this.f4682a = context;
        this.f4683b = ((jca) jyn.m25426a(context, jca.class)).mo2317a();
        this.f4684c = new bwx(this);
    }

    public void m6842a(gln gln, wt<btf> wtVar, buc buc, bwe bwe, acx acx, fg fgVar) {
        this.f4685d = gln;
        this.f4692k = wtVar;
        this.f4686e = buc;
        this.f4693l = bwe;
        this.f4694m = acx;
        this.f4687f = fgVar;
        gln.addObserver(this.f4697p);
    }

    public void m6843b() {
        this.f4696o = true;
        m6845e();
    }

    void m6844d() {
        if (this.f4696o) {
            String a = this.f4685d.m17986a();
            if (!this.f4688g && !blo.m5871a(a) && this.f4690i && !this.f4691j) {
                this.f4688g = true;
                RealTimeChatService.m9045a(((fmf) jyn.m25426a(this.f4682a, fmf.class)).mo2035a(), this.f4683b, a);
            } else if (!this.f4688g) {
                blo.m5871a(a);
            }
            if (!this.f4689h && !this.f4690i) {
                long j;
                if (this.f4692k.a() > 0) {
                    j = ((btf) this.f4692k.a(this.f4692k.a() - 1)).f4394g;
                } else {
                    j = Long.MAX_VALUE;
                }
                this.f4689h = true;
                this.f4693l.m6814a(j, new bww(this));
            }
        }
    }

    public void mo643a(Bundle bundle) {
        this.f4687f.mo1994a(bm.f3838n, null, this.f4684c);
        this.f4695n = new bwy(this);
    }

    public void z_() {
        RealTimeChatService.m9040a(this.f4695n);
    }

    public void A_() {
        RealTimeChatService.m9077b(this.f4695n);
    }

    public void mo306a(RecyclerView recyclerView, int i, int i2) {
        m6845e();
    }

    public void mo305a(RecyclerView recyclerView, int i) {
    }

    void m6845e() {
        if (this.f4694m.m570s() >= this.f4694m.m404G() - 9) {
            m6844d();
        }
    }
}
