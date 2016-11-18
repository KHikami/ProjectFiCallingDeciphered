package p000;

public final class ohh extends nyx<ohh> {
    public ohj[] f32861a;
    public ohi[] f32862b;

    public /* synthetic */ nzf m38339a(nyt nyt) {
        return m38338b(nyt);
    }

    public ohh() {
        this.f32861a = ohj.m38348d();
        this.f32862b = ohi.m38343d();
        this.cachedSize = -1;
    }

    public void m38340a(nyu nyu) {
        int i = 0;
        if (this.f32861a != null && this.f32861a.length > 0) {
            for (nzf nzf : this.f32861a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f32862b != null && this.f32862b.length > 0) {
            while (i < this.f32862b.length) {
                nzf nzf2 = this.f32862b[i];
                if (nzf2 != null) {
                    nyu.m37182b(2, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m38341b() {
        int i = 0;
        int b = super.b();
        if (this.f32861a != null && this.f32861a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f32861a) {
                if (nzf != null) {
                    i2 += nyu.m37145d(1, nzf);
                }
            }
            b = i2;
        }
        if (this.f32862b != null && this.f32862b.length > 0) {
            while (i < this.f32862b.length) {
                nzf nzf2 = this.f32862b[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(2, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private ohh m38338b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f32861a == null) {
                        a = 0;
                    } else {
                        a = this.f32861a.length;
                    }
                    obj = new ohj[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32861a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohj();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ohj();
                    nyt.m37101a(obj[a]);
                    this.f32861a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f32862b == null) {
                        a = 0;
                    } else {
                        a = this.f32862b.length;
                    }
                    obj = new ohi[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32862b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohi();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ohi();
                    nyt.m37101a(obj[a]);
                    this.f32862b = obj;
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
