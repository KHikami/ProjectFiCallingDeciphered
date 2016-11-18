package p000;

public final class ohw extends nyx<ohw> {
    public Boolean f32943a;
    public ohx[] f32944b;

    public /* synthetic */ nzf m38415a(nyt nyt) {
        return m38413b(nyt);
    }

    public ohw() {
        m38414d();
    }

    private ohw m38414d() {
        this.f32943a = null;
        this.f32944b = ohx.m38419d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38416a(nyu nyu) {
        if (this.f32943a != null) {
            nyu.m37172a(1, this.f32943a.booleanValue());
        }
        if (this.f32944b != null && this.f32944b.length > 0) {
            for (nzf nzf : this.f32944b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m38417b() {
        int b = super.b();
        if (this.f32943a != null) {
            this.f32943a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f32944b == null || this.f32944b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f32944b) {
            if (nzf != null) {
                i += nyu.m37145d(2, nzf);
            }
        }
        return i;
    }

    private ohw m38413b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32943a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f32944b == null) {
                        a = 0;
                    } else {
                        a = this.f32944b.length;
                    }
                    Object obj = new ohx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32944b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohx();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ohx();
                    nyt.m37101a(obj[a]);
                    this.f32944b = obj;
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
