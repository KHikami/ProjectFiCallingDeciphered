package p000;

public final class myv extends nyx<myv> {
    public myx[] f29187a;
    public myx[] f29188b;

    public /* synthetic */ nzf m33870a(nyt nyt) {
        return m33869b(nyt);
    }

    public myv() {
        this.f29187a = myx.m33879d();
        this.f29188b = myx.m33879d();
        this.cachedSize = -1;
    }

    public void m33871a(nyu nyu) {
        int i = 0;
        if (this.f29187a != null && this.f29187a.length > 0) {
            for (nzf nzf : this.f29187a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f29188b != null && this.f29188b.length > 0) {
            while (i < this.f29188b.length) {
                nzf nzf2 = this.f29188b[i];
                if (nzf2 != null) {
                    nyu.m37182b(2, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m33872b() {
        int i = 0;
        int b = super.b();
        if (this.f29187a != null && this.f29187a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f29187a) {
                if (nzf != null) {
                    i2 += nyu.m37145d(1, nzf);
                }
            }
            b = i2;
        }
        if (this.f29188b != null && this.f29188b.length > 0) {
            while (i < this.f29188b.length) {
                nzf nzf2 = this.f29188b[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(2, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private myv m33869b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f29187a == null) {
                        a = 0;
                    } else {
                        a = this.f29187a.length;
                    }
                    obj = new myx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29187a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myx();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new myx();
                    nyt.m37101a(obj[a]);
                    this.f29187a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f29188b == null) {
                        a = 0;
                    } else {
                        a = this.f29188b.length;
                    }
                    obj = new myx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29188b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myx();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new myx();
                    nyt.m37101a(obj[a]);
                    this.f29188b = obj;
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
