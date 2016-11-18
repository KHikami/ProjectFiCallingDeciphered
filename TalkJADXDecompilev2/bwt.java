package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

final class bwt extends aei implements jza, kcd, kcn, kcq {
    private final Context a;
    private final acx b;
    private jca c;
    private iih d;
    private boolean e;
    private boolean f;

    public bwt(Context context, kbu kbu, acx acx) {
        this.a = context;
        this.b = acx;
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.c = (jca) jyn.a(jca.class);
        this.d = (iih) jyn.a(iih.class);
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            this.e = bundle.getBoolean("user_scrolled");
            this.f = bundle.getBoolean("scroll_bug_reported");
        }
    }

    public void b(Bundle bundle) {
        bundle.putBoolean("user_scrolled", this.e);
        bundle.putBoolean("scroll_bug_reported", this.f);
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        boolean z = false;
        if (gwb.a(this.a, "babel_log_scroll_error_impressions", true) && !this.e && !this.f) {
            int p = this.b.p();
            int q = this.b.q();
            boolean z2 = p > 0;
            if (p != q) {
                z = true;
            }
            if (z2 || r0) {
                if (z2) {
                    this.d.a(this.c.a()).b().a(Integer.valueOf(p)).c(3223);
                } else {
                    this.d.a(this.c.a()).b().a(Integer.valueOf(q)).c(3224);
                }
                this.f = true;
                recyclerView.c((aei) this);
            }
        }
    }

    public void a(RecyclerView recyclerView, int i) {
        this.e = true;
        recyclerView.c((aei) this);
    }
}
