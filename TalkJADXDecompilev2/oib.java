package defpackage;

public final class oib extends nyx<oib> {
    public ohq a;
    public Integer b;
    public oic c;
    public Integer d;
    public ohv[] e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oib() {
        d();
    }

    private oib d() {
        this.a = null;
        this.c = null;
        this.d = null;
        this.e = ohv.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(2, this.a);
        }
        if (this.b != null) {
            nyu.a(5, this.b.intValue());
        }
        if (this.c != null) {
            nyu.b(6, this.c);
        }
        if (this.d != null) {
            nyu.a(7, this.d.intValue());
        }
        if (this.e != null && this.e.length > 0) {
            for (nzf nzf : this.e) {
                if (nzf != null) {
                    nyu.b(8, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(2, this.a);
        }
        if (this.b != null) {
            b += nyu.f(5, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.d(6, this.c);
        }
        if (this.d != null) {
            b += nyu.f(7, this.d.intValue());
        }
        if (this.e == null || this.e.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.e) {
            if (nzf != null) {
                i += nyu.d(8, nzf);
            }
        }
        return i;
    }

    private oib b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.a == null) {
                        this.a = new ohq();
                    }
                    nyt.a(this.a);
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 50:
                    if (this.c == null) {
                        this.c = new oic();
                    }
                    nyt.a(this.c);
                    continue;
                case 56:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 66:
                    int b = nzl.b(nyt, 66);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    Object obj = new ohv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ohv();
                    nyt.a(obj[a]);
                    this.e = obj;
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
