package p000;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class bup extends jzn {
    jek f4527a;
    private final jej aj = new buq(this);
    private iih ak;
    private cgr f4528b;
    private jca f4529c;
    private buc f4530d;
    private wt<btf> f4531e;
    private acx f4532f;
    private bwu f4533g;
    private bue f4534h;
    private bxb f4535i;

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.binder.m25444a(kbu.class, this.lifecycle);
        this.f4535i = new bxb(this.context);
        this.binder.m25444a(bto.class, this.f4535i);
        this.f4528b = (cgr) this.binder.m25443a(cgr.class);
        this.ak = (iih) this.binder.m25443a(iih.class);
        this.f4529c = (jca) this.binder.m25443a(jca.class);
        ((eia) this.binder.m25443a(eia.class)).mo1884a(bm.f3848x, new bur(this));
        ((dut) this.binder.m25443a(dut.class)).mo1687a(this.context, bm.f3846v, new bus(this));
        this.f4527a = ((jek) this.binder.m25443a(jek.class)).m24033a(bm.f3849y, this.aj);
    }

    public void onCreate(Bundle bundle) {
        boolean z = true;
        super.onCreate(bundle);
        gln d = this.f4528b.mo945d();
        ba.m4610b(d.m17986a() != null, (Object) "Creating at the wrong time?");
        this.ak.mo1979a(this.f4529c.mo2317a()).mo1693b().mo1714c(3225);
        this.f4530d = new buc(this);
        this.f4532f = new but(this, this.context, 1, true);
        this.f4532f.m545b(true);
        buc buc = this.f4530d;
        acx acx = this.f4532f;
        if (this.f4528b.mo947e() != 1) {
            z = false;
        }
        Object bvb = new bvb(buc, acx, z);
        this.f4531e = new wt(btf.class, bvb);
        this.f4530d.m6684a(this.f4531e);
        bvb.m6756a(this.f4531e);
        this.f4534h = new bue(this.context);
        this.f4533g = new bwu(this.context);
        kcq bwe = new bwe(this.context, d, this.f4531e, new buu(this.f4531e, this.f4534h, this.f4530d, this.f4533g, this.f4528b));
        this.f4533g.m6842a(d, this.f4531e, this.f4530d, bwe, this.f4532f, getLoaderManager());
        this.f4535i.m6867a(this.f4531e, this.f4530d, d);
        this.lifecycle.m25514a((kcq) bvb);
        this.lifecycle.m25514a(bwe);
        this.lifecycle.m25514a(this.f4533g);
        this.lifecycle.m25514a(new bwo(this.f4530d));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView = (RecyclerView) layoutInflater.inflate(ba.hw, null);
        this.f4534h.m6700a(recyclerView);
        recyclerView.m3051a(this.f4534h);
        recyclerView.m3061a(true);
        recyclerView.m3054a(this.f4532f);
        recyclerView.m3050a(this.f4530d);
        recyclerView.m3052a(new buv());
        recyclerView.m3068b(new bwt(this.context, this.lifecycle, this.f4532f));
        recyclerView.m3068b(this.f4533g);
        amu amu = (amu) jyn.m25426a(this.context, amu.class);
        Object bts = new bts(getContext(), this.f4531e, this.f4528b);
        recyclerView.m3068b(new anp(amu, bts, bts, 5));
        bts = new btp(getContext(), this.f4531e);
        recyclerView.m3068b(new anp(amu, bts, bts, 5));
        return recyclerView;
    }
}
