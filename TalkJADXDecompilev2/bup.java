package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class bup extends jzn {
    jek a;
    private final jej aj = new buq(this);
    private iih ak;
    private cgr b;
    private jca c;
    private buc d;
    private wt<btf> e;
    private acx f;
    private bwu g;
    private bue h;
    private bxb i;

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.binder.a(kbu.class, this.lifecycle);
        this.i = new bxb(this.context);
        this.binder.a(bto.class, this.i);
        this.b = (cgr) this.binder.a(cgr.class);
        this.ak = (iih) this.binder.a(iih.class);
        this.c = (jca) this.binder.a(jca.class);
        ((eia) this.binder.a(eia.class)).a(bm.x, new bur(this));
        ((dut) this.binder.a(dut.class)).a(this.context, bm.v, new bus(this));
        this.a = ((jek) this.binder.a(jek.class)).a(bm.y, this.aj);
    }

    public void onCreate(Bundle bundle) {
        boolean z = true;
        super.onCreate(bundle);
        gln d = this.b.d();
        ba.b(d.a() != null, (Object) "Creating at the wrong time?");
        this.ak.a(this.c.a()).b().c(3225);
        this.d = new buc(this);
        this.f = new but(this, this.context, 1, true);
        this.f.b(true);
        buc buc = this.d;
        acx acx = this.f;
        if (this.b.e() != 1) {
            z = false;
        }
        Object bvb = new bvb(buc, acx, z);
        this.e = new wt(btf.class, bvb);
        this.d.a(this.e);
        bvb.a(this.e);
        this.h = new bue(this.context);
        this.g = new bwu(this.context);
        kcq bwe = new bwe(this.context, d, this.e, new buu(this.e, this.h, this.d, this.g, this.b));
        this.g.a(d, this.e, this.d, bwe, this.f, getLoaderManager());
        this.i.a(this.e, this.d, d);
        this.lifecycle.a((kcq) bvb);
        this.lifecycle.a(bwe);
        this.lifecycle.a(this.g);
        this.lifecycle.a(new bwo(this.d));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView = (RecyclerView) layoutInflater.inflate(ba.hw, null);
        this.h.a(recyclerView);
        recyclerView.a(this.h);
        recyclerView.a(true);
        recyclerView.a(this.f);
        recyclerView.a(this.d);
        recyclerView.a(new buv());
        recyclerView.b(new bwt(this.context, this.lifecycle, this.f));
        recyclerView.b(this.g);
        amu amu = (amu) jyn.a(this.context, amu.class);
        Object bts = new bts(getContext(), this.e, this.b);
        recyclerView.b(new anp(amu, bts, bts, 5));
        bts = new btp(getContext(), this.e);
        recyclerView.b(new anp(amu, bts, bts, 5));
        return recyclerView;
    }
}
