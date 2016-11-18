package p000;

import android.content.Context;

final class iit implements iid {
    final /* synthetic */ iis f17745a;
    private iid f17746b;
    private Context f17747c;

    public iit(iis iis, Context context) {
        this.f17745a = iis;
        this.f17747c = context;
    }

    public void mo1690a() {
        m21895d();
        if (this.f17746b != null) {
            this.f17746b.mo1690a();
        }
    }

    public void mo1691a(mdg mdg) {
        m21895d();
        if (this.f17746b != null) {
            this.f17746b.mo1691a(mdg);
        }
    }

    public void mo1692a(pbm pbm) {
        m21895d();
        if (this.f17746b != null) {
            this.f17746b.mo1692a(pbm);
        }
    }

    public iie mo1693b() {
        m21895d();
        return this.f17746b == null ? null : this.f17746b.mo1693b();
    }

    public iii mo1694c() {
        m21895d();
        return this.f17746b == null ? null : this.f17746b.mo1694c();
    }

    private void m21895d() {
        if (this.f17746b == null) {
            iih iih = (iih) jyn.m25433b(this.f17747c, iih.class);
            if (iih != null) {
                this.f17746b = iih.mo1978a();
            }
        }
    }
}
