package p000;

public final class mwk extends nyx<mwk> {
    public mwm[] f28593a;
    public mwj f28594b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33213b(nyt);
    }

    public mwk() {
        this.f28593a = mwm.m33223d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28593a != null && this.f28593a.length > 0) {
            for (nzf nzf : this.f28593a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f28594b != null) {
            nyu.b(2, this.f28594b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28593a != null && this.f28593a.length > 0) {
            for (nzf nzf : this.f28593a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f28594b != null) {
            return b + nyu.d(2, this.f28594b);
        }
        return b;
    }

    private mwk m33213b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f28593a == null) {
                        a = 0;
                    } else {
                        a = this.f28593a.length;
                    }
                    Object obj = new mwm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28593a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mwm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mwm();
                    nyt.a(obj[a]);
                    this.f28593a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.f28594b == null) {
                        this.f28594b = new mwj();
                    }
                    nyt.a(this.f28594b);
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
