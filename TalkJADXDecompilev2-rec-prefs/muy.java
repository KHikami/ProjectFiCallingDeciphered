package p000;

public final class muy extends nyx<muy> {
    public Float f28424a;
    public mvf f28425b;
    public Float f28426c;
    public Float f28427d;
    public mvf[] f28428e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33029b(nyt);
    }

    public muy() {
        this.f28424a = null;
        this.f28426c = null;
        this.f28427d = null;
        this.f28428e = mvf.m33064d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28424a != null) {
            nyu.a(1, this.f28424a.floatValue());
        }
        if (this.f28425b != null) {
            nyu.b(2, this.f28425b);
        }
        if (this.f28426c != null) {
            nyu.a(3, this.f28426c.floatValue());
        }
        if (this.f28427d != null) {
            nyu.a(4, this.f28427d.floatValue());
        }
        if (this.f28428e != null && this.f28428e.length > 0) {
            for (nzf nzf : this.f28428e) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28424a != null) {
            this.f28424a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.f28425b != null) {
            b += nyu.d(2, this.f28425b);
        }
        if (this.f28426c != null) {
            this.f28426c.floatValue();
            b += nyu.h(3) + 4;
        }
        if (this.f28427d != null) {
            this.f28427d.floatValue();
            b += nyu.h(4) + 4;
        }
        if (this.f28428e == null || this.f28428e.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f28428e) {
            if (nzf != null) {
                i += nyu.d(5, nzf);
            }
        }
        return i;
    }

    private muy m33029b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f28424a = Float.valueOf(nyt.c());
                    continue;
                case wi.dH /*18*/:
                    if (this.f28425b == null) {
                        this.f28425b = new mvf();
                    }
                    nyt.a(this.f28425b);
                    continue;
                case 29:
                    this.f28426c = Float.valueOf(nyt.c());
                    continue;
                case 37:
                    this.f28427d = Float.valueOf(nyt.c());
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    if (this.f28428e == null) {
                        a = 0;
                    } else {
                        a = this.f28428e.length;
                    }
                    Object obj = new mvf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28428e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mvf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mvf();
                    nyt.a(obj[a]);
                    this.f28428e = obj;
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
