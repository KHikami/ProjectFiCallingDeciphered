package p000;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

final class bwt extends aei implements jza, kcd, kcn, kcq {
    private final Context f4676a;
    private final acx f4677b;
    private jca f4678c;
    private iih f4679d;
    private boolean f4680e;
    private boolean f4681f;

    public bwt(Context context, kbu kbu, acx acx) {
        this.f4676a = context;
        this.f4677b = acx;
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4678c = (jca) jyn.m25443a(jca.class);
        this.f4679d = (iih) jyn.m25443a(iih.class);
    }

    public void mo643a(Bundle bundle) {
        if (bundle != null) {
            this.f4680e = bundle.getBoolean("user_scrolled");
            this.f4681f = bundle.getBoolean("scroll_bug_reported");
        }
    }

    public void mo645b(Bundle bundle) {
        bundle.putBoolean("user_scrolled", this.f4680e);
        bundle.putBoolean("scroll_bug_reported", this.f4681f);
    }

    public void mo306a(RecyclerView recyclerView, int i, int i2) {
        boolean z = false;
        if (gwb.m1906a(this.f4676a, "babel_log_scroll_error_impressions", true) && !this.f4680e && !this.f4681f) {
            int p = this.f4677b.m567p();
            int q = this.f4677b.m568q();
            boolean z2 = p > 0;
            if (p != q) {
                z = true;
            }
            if (z2 || r0) {
                if (z2) {
                    this.f4679d.mo1979a(this.f4678c.mo2317a()).mo1693b().mo1698a(Integer.valueOf(p)).mo1714c(3223);
                } else {
                    this.f4679d.mo1979a(this.f4678c.mo2317a()).mo1693b().mo1698a(Integer.valueOf(q)).mo1714c(3224);
                }
                this.f4681f = true;
                recyclerView.m3076c((aei) this);
            }
        }
    }

    public void mo305a(RecyclerView recyclerView, int i) {
        this.f4680e = true;
        recyclerView.m3076c((aei) this);
    }
}
